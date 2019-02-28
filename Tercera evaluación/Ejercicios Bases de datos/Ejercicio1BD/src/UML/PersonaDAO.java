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
        try{
        Statement sentencia =con.createStatement();
        String s="INSERT INTO personas VALUES ('" + opersona.getNombre() + "'," + opersona.getEdad()+ "'," + opersona.getProfesion()+ "'," + opersona.getTelefono()+ ");";
        int n= sentencia.executeUpdate(s);
    }
        catch(Exception e){
            
        }
    }    
    public String consultar(String nombre, int edad, String profesion, int telefono)
    {
    try
    {
     String plantilla = "SELECT * FROM personas WHERE nombre = ?;";
     PreparedStatement ps = con.prepareStatement(plantilla);
     ps.setString(1,nombre);
     ResultSet resultado = ps.executeQuery();
     if (resultado.next())
         // Hay datos
         return resultado.getString("nombre") + resultado.getInt(2);
         // return resultado.getString(1) + resultado.getInt("edad");
     else
         // Cero filas seleccionadas
         return "No hay datos";
    }
    catch(Exception e)
    {
        return null;
    }
}        
    }
