/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.Abogado;
import UML.Cliente;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTA
 */
public class AbogadoDAO {
    private static Connection con;
    private static ObjectContainer oc;
    public static Cliente c;
    public static Abogado a;

    public AbogadoDAO(Connection con) {
        this.con = con;
    }
    public static java.sql.Date conversionDate(LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time conversiontime(LocalTime hora){
        return java.sql.Time.valueOf(hora);
    }
    public static Abogado altaabogado(Abogado a) {
        try{  
        String plantilla="INSERT INTO Abogados VALUES (?,?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,a.getDni());
        ps.setString(2,a.getNombre());
        ps.setString(3,a.getApellidos());
        ps.setString(4,a.getDireccion());
        
        int n = ps.executeUpdate();
        
        if (n == 0)
            System.out.println("Cero filas insertadas");
        }
        catch(Exception e){   
      }
    
        oc.store(c);
        return null;
    }    
    public static Abogado modificarcliente(Abogado a){
        try
    {
    String plantilla = "UPDATE Abogados SET dni=?,nombre=?,apellidos=?,direccion=?";
    PreparedStatement ps = con.prepareStatement(plantilla);
    
    ps.setString(1,a.getDni());
    ps.setString(2,a.getNombre());
    ps.setString(3,a.getApellidos());
    ps.setString(4,a.getDireccion());

       
    ps.executeUpdate();
     
    ps.close();
    
    oc.store(a);  
       return a;

    }
        
    catch(Exception e)
    {
        return null;
    }
    } 
    public static Abogado consultarabogado(Abogado a) {
        oc=GenericoBD_db4o.getConexion();
        ObjectSet resultado = oc.queryByExample(a);
        if (resultado.hasNext())
            return (Abogado) resultado.next();
        else
            return null;        
    }

    public static void borrarabogado(Abogado a) {
        try
        {
        String plantilla = "DELETE FROM Abogados WHERE nombre = ?;";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1,c.getNombre());
        ps.executeUpdate();

        ps.close();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Error con el borrado");
        }       

        
        oc=GenericoBD_db4o.getConexion();
        oc.delete(a);
    }    
    
}
