/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1bd;

import UML.*;
import Ventanas.*;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class Ejercicio1BD {

    /**
     * @param args the command line arguments
     */
    public static Principal v;
    public static Personas vp;
    public static Persona opersona;
    private static ConexionBasedeDatos cbd;
    public static PersonaDAO opersonaDAO;
    public static Connection con;
    private static ArrayList<Persona> listaPersonas;
    private static int posicion;
    public static void main(String[] args) {
        cbd = new ConexionBasedeDatos();
        con = cbd.conectar();
        if(con==null)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Problemas con la Base de Datos");
            System.exit(-1);
        }
       opersonaDAO = new PersonaDAO(con);
                
        v=new Principal();
        v.setVisible(true);
    }
    public static void alta() 
    {
        v.setVisible(false);
        
        vp = new Personas();
        vp.setVisible(true);
    }    
    public static void daralta(String nombre, int edad, String profesion, int telefono){
        opersona= new Persona(nombre,edad,profesion,telefono);

        opersonaDAO.daralta(opersona);
        
        listaPersonas=new ArrayList<Persona>();
        listaPersonas.add(opersona);
    }
    public static void cambio(){
        vp.setVisible(false);
        
        v = new Principal();
        v.setVisible(true);
    }
    public static void buscarPersona(String nombre) throws Exception
    {
        opersona = opersonaDAO.consultar(nombre);
    }
    public static void obtenerDatos() throws Exception
    {
        listaPersonas = opersonaDAO.listaDePersonas();
        if (listaPersonas.size()>0) 
        {
            posicion = 0;
            vp = new Personas(listaPersonas.get(posicion).getNombre(),listaPersonas.get(posicion).getEdad(),listaPersonas.get(posicion).getProfesion(),listaPersonas.get(posicion).getTelefono());
            vp.setVisible(true);
        }
        else
            throw new Exception("No hay personas");
 }        
    public static void salir(){
        
        cbd.cerrar();
        System.exit(0);
    }
}

