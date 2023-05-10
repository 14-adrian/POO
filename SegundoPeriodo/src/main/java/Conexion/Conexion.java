
        
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
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
}
