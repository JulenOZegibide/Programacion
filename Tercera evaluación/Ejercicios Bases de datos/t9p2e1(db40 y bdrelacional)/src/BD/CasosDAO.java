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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MARTA
 */
public class CasosDAO {
    private static Connection con;
    private static ObjectContainer oc;
    public static int numexp;
    public static CasoJudicial cj;
    public static Integer n;

    public static int buscarNumexpediente(int numexp) throws SQLException {

        Statement consulta = con.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT MAX(NumExpediente)FROM Casos;");
        if(resultado.next())
        {
        n = resultado.getInt("numexp");
        }   
        if( n==null){
            return 0;
        }
        else    
            return numexp; 
//        resultado.close();
//        consulta.close();
 


    }
    
    public CasosDAO(Connection con) {
        this.con = con;
    }
    public static java.sql.Date conversionDate(LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time conversiontime(LocalTime hora){
        return java.sql.Time.valueOf(hora);
    }
    public static CasoJudicial altacaso(CasoJudicial cj) {
    try{  
        String plantilla="INSERT INTO clientes VALUES (?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setInt(1,cj.getNumexpediente());
        ps.setDate(2,conversionDate(cj.getFechaini()));
        ps.setString(3,cj.getEstado());

        
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
