package modelo.bd;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Properties;

public class Archivo {

    private String nombreArchivo;
    private InputStream archivo;

    public Archivo() {
        this.nombreArchivo = "bd.properties";
    }

    public void leerArchivo() {
        try {
            Properties prop = new Properties();
            String ruta = System.getProperty("user.dir");
            this.archivo = new FileInputStream(ruta+"\\resources\\"+this.nombreArchivo);
            System.out.println(this.archivo);
            if (this.archivo != null) {
                prop.load(this.archivo);
            }
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("[error] - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Archivo archivo = new Archivo();
        archivo.leerArchivo();
    }
}
