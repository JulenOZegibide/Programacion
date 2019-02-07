/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poop2e3;
import javax.swing.JOptionPane;
import clases.estudio;
import clases.pelicula;
import java.text.SimpleDateFormat;
import java.util.ArrayList;


public class POOp2e3 {

    /**
     * @param args the command line arguments
     */
    public static estudio[]listaestudio=new estudio[5];
    
    public static ArrayList<pelicula>listapeliculas;
    
    public static void main(String[] args) {
        crearestudios();
        crearpeliculas();
    }
    public static void crearestudios(){
    SimpleDateFormat sdf = new SimpleDateFormat ("YYYY/MM/DD");
        
    ArrayList<String>telefonos=new ArrayList();
    telefonos = new ArrayList();
    telefonos.add("111111111");
    telefonos.add("111111112");
    listaestudios[0] = new estudio ("universal","Toronto","calle a","www.noseque.com");
    
    }
    public static void crearpeliculas(){
    ArrayList<estudio> lista = new ArrayList();     
    lista.add(listaestudios[0]);
    lista.add(listaestudios[2]);     
    pelicula p = new pelicula ("ET");     
    }
    
}

