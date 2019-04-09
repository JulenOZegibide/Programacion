/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import UML.CasoJudicial;
import com.db4o.ObjectContainer;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author 1gdaw02
 */
public class CasoClienteDAO {
    private static Connection con;
    private static ObjectContainer oc;
    
    public CasoClienteDAO(Connection con) {
        this.con = con;
    }
    public static java.sql.Date conversionDate(LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time conversiontime(LocalTime hora){
        return java.sql.Time.valueOf(hora);
    }
    public static CasoJudicial altacasocliente(CasoJudicial cj) {
    try{  
        String plantilla="INSERT INTO Casosclientes VALUES (?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setInt(1,cj.getNumexpediente());
        ps.setDate(2,conversionDate(cj.getFechaini()));
        ps.setString(3,cj.getEstado());
        ps.setString(3,cj.getCliente().toString());
        
        int n = ps.executeUpdate();
        
        if (n == 0)
            System.out.println("Cero filas insertadas");
        }
        catch(Exception e){   
      }
    
        oc.store(cj);
        return null;
    }
}
