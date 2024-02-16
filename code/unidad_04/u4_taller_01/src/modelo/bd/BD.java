package modelo.bd;

import java.sql.*;

public class BD {

    private Connection conexion;
    private Archivo datos;

    public BD() {
        this.datos = new Archivo();
        this.datos.leerArchivo();
    }
    
    public void conectar() {
        try {
            Class.forName(this.datos.getConexion().getDriverClass());
            this.conexion = DriverManager.getConnection(this.datos.getConexion().urlConexion(),
                                                        this.datos.getConexion().getUsuario(),
                                                        this.datos.getConexion().getClave());
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
            System.out.println("[error] - " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        BD conexion = new BD();
        conexion.conectar();
        conexion.cerrar();
    }
}

