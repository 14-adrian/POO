
        
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Leoni
 */
public class Conexion {
    Connection con;
    
    public Conexion(){
        try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/hospitaldb","admin","1234");
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null ,"ERROR"+e);
           
        }
    }
    public static void close(ResultSet rs) {
        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar ResultSet: " + e.getMessage());
        }
    }
    public static void close(PreparedStatement ps) {
        try {
            if (ps != null) {
                ps.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar PreparedStatement: " + e.getMessage());
        }
    }
    public static void close(Connection c) {
        try {
            if (c != null) {
                c.close();
            }
        } catch (SQLException e) {
            System.err.println("Error al cerrar Connection: " + e.getMessage());
        }
    }
    public Connection getConnection(){
    return con;
    }
}
