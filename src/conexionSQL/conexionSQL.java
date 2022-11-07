/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexionSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author gonza
 */
public class conexionSQL {
    
    Connection conectar=null;
    String url="jdbc:mysql://localhost:3306/escuela";
    String user="root";
    String password="";
    
    public Connection conexion(){
        try{
            
            conectar= DriverManager.getConnection(url, user, password);
            
            JOptionPane.showMessageDialog(null, "Conexion Exitosa");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "error conexion "+e.getMessage());
        }
        
        return conectar;
    }
    
    
}
