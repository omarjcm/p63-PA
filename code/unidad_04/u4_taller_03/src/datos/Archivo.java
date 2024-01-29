package datos;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class Archivo {

    private Conexion conexion;
    private String nombreArchivo;
    private InputStream archivo;

    public Archivo() {
        this.nombreArchivo = "bd.properties";
        this.conexion = new Conexion();
    }

    public void setConexion(Conexion conexion) {
        this.conexion = conexion;
    }
    public Conexion getConexion() {
        return conexion;
    }

    public void leerArchivo() {
        try {
            Properties prop = new Properties();
            //String ruta = System.getProperty("user.dir");
            //this.archivo = new FileInputStream(ruta+"\\resources\\"+this.nombreArchivo);
            this.archivo = getClass().getClassLoader().getResourceAsStream(this.nombreArchivo);
            if (this.archivo != null) {
                prop.load(this.archivo);

                this.conexion.setDriver( prop.getProperty("bd.driver") );
                this.conexion.setDriverClass( prop.getProperty("bd.driverclass") );
                this.conexion.setHost( prop.getProperty("bd.host") );
                this.conexion.setPuerto( prop.getProperty("bd.puerto") );
                this.conexion.setUsuario( prop.getProperty("bd.usuario") );
                this.conexion.setClave( prop.getProperty("bd.clave") );
                this.conexion.setNombre( prop.getProperty("bd.nombrebd") );

                this.archivo.close();
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
