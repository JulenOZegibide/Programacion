/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1bd;

import UML.*;
import Ventanas.*;
import java.sql.*;

/**
 *
 * @author 1gdaw02
 */
public class Ejercicio1BD {

    /**
     * @param args the command line arguments
     */
    public static Principal v;
    public static Persona opersona;
    private static ConexionBasedeDatos bd;
    public static PersonaDAO opersonaDAO;
    public static Connection con;
    public static void main(String[] args) {
        ConexionBasedeDatos cbd = new ConexionBasedeDatos();
        Connection con = cbd.conectar();
        if(con==null)
        {
            javax.swing.JOptionPane.showMessageDialog(null,"Problemas con la Base de Datos");
            System.exit(-1);
        }
       opersonaDAO = new PersonaDAO(con);
                
        v=new Principal();
        v.setVisible(true);
    }
    public static void daralta(String nombre, int edad, String profesion, int telefono){
        opersona= new Persona(nombre,edad,profesion,telefono);
        //insertar

        opersonaDAO.daralta(opersona);
    }
        public static String consultar(String nombre, int edad, String profesion, int telefono)
    {
        return opersonaDAO.consultar(nombre,edad,profesion,telefono);
    }
    public static void salir(){
        bd.cerrar();
        System.exit(0);
    }
}

