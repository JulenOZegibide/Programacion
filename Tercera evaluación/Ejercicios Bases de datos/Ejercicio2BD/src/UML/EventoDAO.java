/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;


import static ejercicio2bd.Ejercicio2BD.*;
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

    public Evento borrarevento(String nombre) {
    try
    {
    String plantilla = "DELETE FROM Eventos WHERE nombre = ?;";
    PreparedStatement ps = con.prepareStatement(plantilla);
    ps.setString(1,nombre);
    ps.executeUpdate();
     
    ps.close();
    }
    catch(Exception e)
    {
        return null;
    }
    return oevento;
    }
    public Evento modificarevento(Evento oevento){
     try
    {
    String plantilla = "UPDATE Eventos SET nombre=?,lugar=?,fecha=?,fechainicio=?,fechafin=?,aforomaximo=?,";
    PreparedStatement ps = con.prepareStatement(plantilla);
    
    ps.setString(1,oevento.getNombre());
    ps.setString(2,oevento.getLugar());
    ps.setDate(3,conversionDate(oevento.getFecha()));
    ps.setTime(4,conversiontime(oevento.getFechainicio()));
    ps.setTime(5,conversiontime(oevento.getFechafin()));
    ps.setInt(6,oevento.getAforomax());
          
    ps.executeUpdate();
     
    ps.close();
     
       return oevento;
    }
    catch(Exception e)
    {
        return null;
    }
    } 
    public Evento buscarevento(String nombreevento) throws Exception
    {

        Statement consulta = con.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM eventos WHERE nombre=" + nombreevento + "\";");
        if(resultado.next())
        {
        oevento= new Evento();
        oevento.setNombre(resultado.getString("nombre"));
        oevento.setLugar(resultado.getString("lugar"));
        oevento.setFecha(resultado.getDate("fecha").toLocalDate());
        oevento.setFechainicio(resultado.getTime("fechainicio").toLocalTime());
        oevento.setFechafin(resultado.getTime("fechafin").toLocalTime());
        oevento.setAforomax(Integer.parseInt(resultado.getString("aforomax")));
        }
        resultado.close();
        consulta.close();
   
        return oevento;
 }        
        
    }

