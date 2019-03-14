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
public class EventoPersonaDAO {
        private Connection con;

    public EventoPersonaDAO(Connection con) {
        this.con = con;
    }
    public void daralta(Persona opersona){
      try{  
        String plantilla="INSERT INTO personas VALUES (?,?,?,?,?);";
        PreparedStatement ps=con.prepareStatement(plantilla);
        ps.setString(1,opersona.getDni());
        ps.setString(2,opersona.getNombre());
        ps.setString(3,opersona.getApellidos());
        ps.setString(4,opersona.getEvento());
        ps.setString(5,opersona.getEmpresa());
        
        int n = ps.executeUpdate();
        
        if (n == 0)
            System.out.println("Cero filas insertadas");
        }
        catch(Exception e){   
      }
    }    


    
}
