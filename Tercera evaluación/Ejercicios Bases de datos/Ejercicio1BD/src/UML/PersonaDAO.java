/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.sql.Statement;

/**
 *
 * @author 1gdaw02
 */
public class PersonaDAO {
    private connection con;

    public PersonaDAO(connection con) {
        this.con = con;
    }
    
    
    
    public void insertarpersona(Persona opersona)
    {
        try{
        Statement sentencia =con. createStatement ();
        sentencia.executeUpdate ("INSERT INTO datosPersonales VALUES (4,’Pepe ’,40,’c/ Cuchilleria ’)");
    }
        catch(Exception e){
            
        }
    }}
