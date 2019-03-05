/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTA
 */
public class EventoDAO {
        private Connection con;

    public EventoDAO(Connection con) {
        this.con = con;
    }
    public static java.sql.Date conversionDate(LocalDate fecha){
        return java.sql.Date.valueOf(fecha);
    }
    public static java.sql.Time conversiontime(LocalTime hora){
        return java.sql.Time.valueOf(hora);
    }
    public void daralta(Evento oevento){
      try{  
        String plantilla="INSERT INTO personas VALUES (?,?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,oevento.getNombre());
        ps.setString(2,oevento.getLugar());
        ps.setDate(3,conversionDate(oevento.getFecha()));
        ps.setTime(4,conversiontime(oevento.getFechainicio()));
        ps.setTime(5,conversiontime(oevento.getFechafin()));
        ps.setInt(6,oevento.getAforomax());
        
        int n = ps.executeUpdate();
        
        if (n == 0)
            System.out.println("Cero filas insertadas");
        }
        catch(Exception e){
          
      }
    }
}
