/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author Mayra
 */
public class Conexion {
public static Connection GetConnection(){
        Connection conexion=null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            String servidor = "jdbc:mysql://localhost/activo_fijo";
            String usuarioDB= "root";
            String passwordDB= "";
            conexion = DriverManager.getConnection(servidor,usuarioDB,passwordDB);
        }
        catch (ClassNotFoundException ex){
            JOptionPane.showMessageDialog(null, ex, "Error 1 en la conexión con la BD" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            
        }
        catch (SQLException ex){
            JOptionPane.showMessageDialog(null, ex, "Error 2 en la Conexion con la BD" + ex.getMessage(), JOptionPane.ERROR_MESSAGE);
            conexion= null;
        }
        finally {
            return conexion;
        }
    }    
}
