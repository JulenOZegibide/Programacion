

package repaso20;

import UML.*;
import Ventanas.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;


 
public class Repaso20 {

    private static Menu m;
    private static VentanaJugador vj;
    private static VentanaEquipo ve;
    private static Jugador j;
    private static Equipo e;
    private static ArrayList<Jugador>listajugadores;
    private static ArrayList<Equipo>listaequipos;
    private static int x;
    
    public static void main(String[] args) {
        m=new Menu();
        m.setVisible(true);
        
        listajugadores=new ArrayList();
        listaequipos=new ArrayList();
    }

    public static void añadirpersona(String nombre, String posicion) {
        String equipo=JOptionPane.showInputDialog("Introduce el nombre del equipo en el que jugara este jugador");
        for(x=0;x<listaequipos.size() && equipo.equals(listaequipos.get(x).getNombre())== false;x++){}
        if (x == listaequipos.size()){
            // EQUIPO NO EXISTE
            JOptionPane.showMessageDialog(null, "El nombre del equipo introducido no existe");
          }
        else{
            j=new Jugador(nombre,posicion,listaequipos.get(x));
            listajugadores.add(j);
        }
        vj.setVisible(false);
        
        m=new Menu();
        m.setVisible(true);
    }

    public static void cambio() {
        m.setVisible(false);
        
        vj = new VentanaJugador();
        vj.setVisible(true);
    }

    public static void añadirEquipo(String nombre, String puesto) {
        e=new Equipo(nombre,puesto);
        listaequipos.add(e);
        
        ve.setVisible(false);
    }

    public static void cambioequipo() {
        m.setVisible(false);
        
        ve = new VentanaEquipo();
        ve.setVisible(true);
    }

    public static void modificarpersona(String nombre) {   
        for(x=0;x<listajugadores.size() && nombre.equals(listajugadores.get(x).getNombre())== false;x++ ){
            JOptionPane.showMessageDialog(null, "El nombre introducido no coincide con ninguno de la lista");
        } 
        if(nombre.equals(listajugadores.get(x).getNombre())== true){
        vj=new VentanaJugador(listajugadores.get(x).getNombre(),listajugadores.get(x).getPuesto());
        vj.setVisible(true);       
        }
    }
    
    public static void modificarpersona2(String nombre, String puesto) {
        listajugadores.get(x).setNombre(nombre);
        listajugadores.get(x).setPuesto(puesto);
        
        vj.setVisible(false);
    }
    
    public static void borrarpersona(String nombre) {
        for(x=0;x<listajugadores.size() && nombre.equals(listajugadores.get(x).getNombre())== true;x++ ){
            listajugadores.remove(x);
        }
    }

    public static void modificarequipo(String nombre) {
        for(x=0;x<listaequipos.size() && nombre.equals(listaequipos.get(x).getNombre())== false;x++ ){
            JOptionPane.showMessageDialog(null, "El nombre introducido no coincide con ninguno de la lista");            
        }
        if(nombre.equals(listaequipos.get(x).getNombre())== true){
           ve=new VentanaEquipo(listaequipos.get(x).getNombre(),listaequipos.get(x).getPuesto());
           ve.setVisible(true); 
        }
    }

    public static void modificarequipo2(String nombre,String puesto) {
        listaequipos.get(x).setNombre(nombre);
        listaequipos.get(x).setPuesto(puesto);
        
        ve.setVisible(false);
        
        m=new Menu();
        m.setVisible(true);
    }
        
    public static void borrarequipo(String nombre) {
        for(x=0;x<listaequipos.size() && nombre.equals(listaequipos.get(x).getNombre())== true;x++ ){
            listaequipos.remove(x);
        }
    }
}
