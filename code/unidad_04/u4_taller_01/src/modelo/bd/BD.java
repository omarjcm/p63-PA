package modelo.bd;

import java.sql.*;

public class BD {

    private Connection conexion;
    private Conexion datos;
    private String url_conexion;

    public BD() {
        this.datos = new Conexion();
        this.url_conexion =  this.datos.getDriver()+"://" + this.datos.getHost() + ":" + this.datos.getPuerto() + "/" + this.datos.getNombre();
    }
    
    public void conectar() {
        try {
            Class.forName("org.postgresql.Driver");
            this.conexion = DriverManager.getConnection(this.url_conexion, this.datos.getUsuario(), this.datos.getClave());
            System.out.println("[db] - Conexion exitosa.");
        } catch (ClassNotFoundException e) {
            System.out.println("[error] - " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[error] - " + e.getMessage());
        }
    }

    public void cerrar() {
        try {
            if (this.conexion != null) {
                this.conexion.close();
            }
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            System.out.println("[error] - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        BD conexion = new BD();
        conexion.conectar();
        conexion.cerrar();
    }
}
