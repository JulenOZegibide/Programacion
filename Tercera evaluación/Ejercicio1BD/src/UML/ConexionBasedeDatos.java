/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;
//importar la clasepara BD
import java.sql.*;
public class ConexionBasedeDatos {
    public Connection conectar()
    {
        try{
        // tipo de bas de datos
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3307/"+"bdpersonas";
            String login="root";
            String password= "usbw";
            
            Connection con = DriverManager.getConnection(url,login,password);
            return con;
           }
        catch( Exception e){
        return null;}
        

    }   
}
