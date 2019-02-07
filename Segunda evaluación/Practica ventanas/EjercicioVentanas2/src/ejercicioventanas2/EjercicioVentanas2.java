/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioventanas2;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class EjercicioVentanas2 {

    /**
     * @param args the command line arguments
     */
    private static Ventana1 v1;
    private static Ventana2 v2;
    private static ArrayList<Persona>listapersonas = new ArrayList();
    public static void main(String[] args) {
        v1 = new Ventana1();
        v1.setVisible(true);
        
        v2 = new Ventana2(listapersonas);
    }
    public static void salir(){
        v1.dispose();
        System.exit(0);
    }
    public static void cogerdatos(String nombre,String apellidos,String DNI){
        Persona p = new Persona(nombre,apellidos,DNI);    
        listapersonas.add(p);   
    }
    
     public static void limpiarventana(){
         tfnombre.setText("");
     }
}
