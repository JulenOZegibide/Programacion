/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author MARTA
 */
public class GenericoBD_relacional {
        private Connection con;
    
    public Connection conectar()
    {
        try{
        // tipo de bas de datos
            Class.forName("com.mysql.jdbc.Driver");
            
            String url="jdbc:mysql://localhost:3307/"+"bdeventos";
            String login="root";
            String password= "usbw";
            
            Connection con = DriverManager.getConnection(url,login,password);
            return con;
           }
        catch( Exception e){
        return null;}
    }  
    public void cerrar()
    {
        try{
        con.close();
        }
        catch(Exception e){}
    }
}
