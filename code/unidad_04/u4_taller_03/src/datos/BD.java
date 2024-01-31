package datos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class BD {

    private Connection conexion;
    private Archivo datos;
    
    private PreparedStatement ps;
    private ResultSet rs;

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
    
    public ResultSet ejecutar(String sql) {
        try {
            this.ps = this.conexion.prepareStatement(sql);
            this.rs = this.ps.executeQuery();
            
            return this.rs;
        } catch (SQLException ex) {
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    } 

    public void cerrar() {
        try {
            if (this.ps != null) {
                this.ps.close();
            }
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
