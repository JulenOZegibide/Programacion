/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaventanasopcional;
import UML.jugador;
import UML.Equipo;
import java.util.ArrayList;
import static practicaventanasopcional.Practicaventanasopcional.aequipos;
import ventanas.ventana;
/**
 *
 * @author 1gdaw02
 */

public class Practicaventanasopcional {

    /**
 
     */
    public static ventana v;
    public static ArrayList<Equipo>aequipos;
    public static Equipo oequipo;
    public static ArrayList<jugador>ajugadores;
    public static jugador ojugador;
    public static void main(String[] args) {
       generardatos(); 
       ventana ve =new ventana();
       ve.setVisible(true);
    }
    public static void generardatos(){
        aequipos = new ArrayList();
        
        aequipos.add(oequipo);
        oequipo  = new Equipo();        
        oequipo.setNomequipo("alaves");
        oequipo.setEscudo("el del alaves");
        
        ajugadores=new ArrayList();
        
        ajugadores.add(ojugador);
        ojugador=new jugador();
        ojugador.setNombre("calleri");
        ojugador.setPosicion("delantero");
        ojugador.setNumero("12");
    }
    public static void salir(){
        System.exit(0);
    }
    public static void grabarequipo(String Nomequipo,String escudo,Character genero){
        
        oequipo  = new Equipo();
        oequipo.setNomequipo(Nomequipo);
        oequipo.setEscudo(escudo);
        oequipo.setGenero(genero);
        
        aequipos.add(oequipo);
    } 
        public static void grabarJugador(String jugador,String puesto,String dorsal){

        ojugador=new jugador();
        ojugador.setNombre(jugador);
        ojugador.setPosicion(puesto);
        ojugador.setNumero(dorsal);
        
        }

}
