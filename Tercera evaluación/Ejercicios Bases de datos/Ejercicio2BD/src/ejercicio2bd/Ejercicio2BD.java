/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2bd;

import UML.*;
import Ventanas.*;
import java.util.ArrayList;

/**
 *
 * @author MARTA
 */
public class Ejercicio2BD {

    public static Menu vm;
    public static VentanaEventos ve;
    public static Evento oevento;
    public static ArrayList<Evento>listaeventos;
    public static void main(String[] args) {
        vm=new Menu();
        vm.setVisible(true);
    }
    public static void cambioAñadir(){
        vm.setVisible(false);
        
        ve=new VentanaEventos();
        ve.setVisible(true);
    }    
    public static void salir(){
        System.exit(0);
    }    
}
