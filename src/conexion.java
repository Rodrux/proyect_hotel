/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
import javax.swing.JOptionPane;
/**
 *
 * @author ORLANDO
 */
public class conexion {
    Connection con=null;
   public Connection conexion(){
       try {
           //cargar nuestro driver
           Class.forName("com.mysql.jdbc.Driver");
           
           con=DriverManager.getConnection("jdbc:mysql://localhost/hotel","root","12345");
           System.out.println("conexion establecida");
           //JOptionPane.showMessageDialog(null, "conexion establecida");
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println("error de conexion" + e);
           //JOptionPane.showMessageDialog(null, "error de conexion "+e);
       }
       return con;
   }
}
