/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import static ejercicio1bd.Ejercicio1BD.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class PersonaDAO {
    private Connection con;

    public PersonaDAO(Connection con) {
        this.con = con;
    }
    
    
    
    public void daralta(Persona opersona)
    {
        try
        {
        //Statement sentencia =con.createStatement();
        
        String plantilla = "INSERT INTO personas VALUES (?,?,?,?);";
        PreparedStatement ps = con.prepareStatement(plantilla);
        ps.setString(1,opersona.getNombre());
        ps.setInt(2,opersona.getEdad());
        ps.setString(3,opersona.getProfesion());
        ps.setInt(4,opersona.getTelefono()); 
        
        int n = ps.executeUpdate();
        
        if (n == 0)
            System.out.println("Cero filas");
        }
        catch(Exception e)
        {
            System.out.println(e.getClass() + e.getMessage());
        }
    
    }
    public Persona consultar(String nombre)
    {
    try
    {
     String plantilla = "SELECT * FROM personas WHERE nombre = ?;";
     PreparedStatement ps = con.prepareStatement(plantilla);
     ps.setString(1,nombre);
     ResultSet resultado = ps.executeQuery();
     if (resultado.next())
       {
           Persona opersona= new Persona();
           opersona.setNombre(resultado.getString("nombre"));
           opersona.setEdad(Integer.parseInt(resultado.getString("edad")));
           opersona.setProfesion(resultado.getString("profesion"));
           opersona.setTelefono(resultado.getInt("telefono"));
       }
     else
       resultado.close();
       ps.close();
     
       return opersona;
    }
    catch(Exception e)
    {
        return null;
    }
} 
    public ArrayList<Persona> listaDePersonas() throws Exception
    {
        ArrayList<Persona> listaPersonas = new ArrayList();

        Statement consulta = con.createStatement();
        ResultSet resultado = consulta.executeQuery("SELECT * FROM personas ");
        while(resultado.next())
        {
          Persona opersona= new Persona();
          opersona.setNombre(resultado.getString("nombre"));
          opersona.setEdad(Integer.parseInt(resultado.getString("edad")));
          opersona.setProfesion(resultado.getString("profesion"));
          opersona.setTelefono(resultado.getInt("telefono"));
          listaPersonas.add(opersona);
        }
        resultado.close();
        consulta.close();
   
        return listaPersonas;
 }    
    }
