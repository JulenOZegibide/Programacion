/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaventanasopcional;
import java.util.ArrayList;
import static practicaventanasopcional.Practicaventanasopcional.aequipos;
import practicaventanasopcional.UML.*;
import ventanas.ventana;
/**
 *
 * @author 1gdaw02
 */

public class Practicaventanasopcional {

    /**
     * @param args the command line arguments
     */
    public static ventana v;
    public static ArrayList<Equipo>aequipos;
    public static Equipo oequipo;
    public static ArrayList<jugador>ajugadores;
    public static jugador ojugador;
    public static void main(String[] args) {
       ventana v =new ventana();
       v.setVisible(true);
    }
    public static void salir(){
        System.exit(0);
    }
    public static void grabarequipo(String Nomequipo,String escudo,String jugador,String puesto,String dorsal){
        aequipos = new ArrayList<Equipo>();
        
        oequipo  = new Equipo();
        oequipo.setNomequipo(Nomequipo);
        oequipo.setEscudo(escudo);
        
        aequipos.add(oequipo);
    } 
        public static void grabarJugador(String jugador,String puesto,String dorsal){
        ajugadores=new ArrayList<jugador>();
        
        ojugador=new jugador();
        ojugador.setNombre(jugador);
        ojugador.setPosicion(puesto);
        ojugador.setNumero(dorsal);
        
        }
}
