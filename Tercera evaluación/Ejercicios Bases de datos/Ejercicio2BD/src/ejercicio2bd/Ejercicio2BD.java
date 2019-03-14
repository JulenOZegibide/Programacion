/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2bd;

import UML.*;
import Ventanas.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MARTA
 */
public class Ejercicio2BD {

    public static Menu vm;
    public static VentanaEventos ve;
    public static VentanaPersonas vp;
    public static Evento oevento;
    public static Persona opersona;
    public static EventoDAO oeventoDAO;
    public static EventoPersonaDAO oeventopersonaDAO;
    public static ArrayList<Evento>listaeventos;
    public static ArrayList<Persona>listapersonas;
    public static void main(String[] args) {
        vm=new Menu();
        vm.setVisible(true);
    }
    public static void cambioAñadir(){
        vm.setVisible(false);
        
        ve=new VentanaEventos();
        ve.setVisible(true);
    }   
    public static void daralta(String nombre,String lugar,LocalDate fecha,LocalTime fechaini,LocalTime fechafin,int aforomax){
        oevento=new Evento(nombre,lugar,fecha,fechaini,fechafin,aforomax);
        oeventoDAO.daralta(oevento);
        
        listaeventos=new ArrayList<Evento>();
        listaeventos.add(oevento);
    }
    public static void modificarevento(String nombre,String lugar,LocalDate fecha,LocalTime fechaini,LocalTime fechafin,int aforomax){
        oevento=new Evento(nombre,lugar,fecha,fechaini,fechafin,aforomax);
        oeventoDAO.modificarevento(oevento);
    }
    public static void cambio(){
        ve.setVisible(false);
        
        vm=new Menu();
        vm.setVisible(true);        
    }
    public static void cambiomodificar()throws Exception{
            vm.setVisible(false);
            ve = new VentanaEventos();
            ve.setVisible(true);
        }   
    public static void salir(){
        System.exit(0);
    }    

    public static void borrarEvento(String nombre) {
        int borrar=JOptionPane.showConfirmDialog(null,"Estas seguro de que quieres borrar este evento");
                if(borrar==1)
        oevento=oeventoDAO.borrarevento(nombre);
    }
    public static void modificarevento(String nombreevento){
       try{
        oevento=oeventoDAO.buscarevento(nombreevento);
        ve.mostrarmodificacion(oevento);
       }catch(Exception e){}
    }

    public static void cambiopersona() {
        vm.setVisible(false);
        vp = new VentanaPersonas();
        vp.setVisible(true);
    }

    public static void altapersona(Evento evento,String dni, String nombre, String apellidos, Empresa empresa) {
      opersona=new Persona(dni,nombre,apellidos,evento,empresa);
      oeventopersonaDAO.daralta(opersona);      
      
      listapersonas=new ArrayList<Persona>();
      listapersonas.add(opersona);
   }
   public static void listinpersonas(){
       int x;
       for(x=0;x<listapersonas.size();x++){}
       String listinpersonas = new Persona(listapersonas.get(0).getDni(),listapersonas.get(0).getNombre(),listapersonas.get(0).getApellidos(),listapersonas.get(0).getEvento(),listapersonas.get(0).getEmpresa()).toString();
       JOptionPane.showMessageDialog(null, listinpersonas);
   } 



}
