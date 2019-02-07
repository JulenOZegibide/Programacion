/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioventanas3;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class EjercicioVentanas3 {

    /**
     * @param args the command line arguments
     */
    private static Ventana v;
    private static ArrayList<Persona>listapersonas = new ArrayList();
    public static void main(String[] args) {
        v = new Ventana();
        v.setVisible(true);
    }
    public static void salir(){
        v.dispose();
        System.exit(0);
    }
    public static void cogerdatos(String nombre,String apellidos,String DNI,String Curso){
        Persona p = new Persona(nombre,apellidos,DNI,Curso);   
        listapersonas.add(p);   
    }  
    public static void verificar(String DNI){
        for(int x=0; x<listapersonas.size();x++){
            if(listapersonas.get(x).getDNI().compareTo(DNI)==0){
              v.mostrardatos
            }
        }
    }
}
