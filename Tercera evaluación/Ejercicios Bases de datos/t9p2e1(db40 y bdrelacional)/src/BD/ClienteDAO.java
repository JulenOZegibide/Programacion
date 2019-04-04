/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Cliente;
import com.db4o.ObjectContainer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;


/**
 *
 * @author MARTA
 */
public class ClienteDAO {

    private Connection con;
    private static ObjectContainer oc;
    
    public ClienteDAO(Connection con) {
        this.con = con;
    }
    public static java.sql.Date conversionDate(LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time conversiontime(LocalTime hora){
        return java.sql.Time.valueOf(hora);
    }
    public void daralta(Cliente c) {
    try{  
        String plantilla="INSERT INTO clientes VALUES (?,?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,c.getDni());
        ps.setString(2,c.getNombre());
        ps.setString(3,c.getApellidos());
        ps.setString(4,c.getDireccion());
        ps.setString(5,c.getTelefono());
        
        int n = ps.executeUpdate();
        
        if (n == 0)
            System.out.println("Cero filas insertadas");
        }
        catch(Exception e){   
      }
    
        oc.store(c);
    }    
    public void modificarcliente(Cliente c){
        try
    {
    String plantilla = "UPDATE Eventos SET dni=?,nombre=?,apellidos=?,direccion=?,telefono=?";
    PreparedStatement ps = con.prepareStatement(plantilla);
    
    ps.setString(1,c.getDni());
    ps.setString(2,c.getNombre());
    ps.setString(3,c.getApellidos());
    ps.setString(4,c.getDireccion());
    ps.setString(5,c.getTelefono());
       
    ps.executeUpdate();
     
    ps.close();
     
       return c;
    }
    catch(Exception e)
    {
        return null;
    }
    } 
}
