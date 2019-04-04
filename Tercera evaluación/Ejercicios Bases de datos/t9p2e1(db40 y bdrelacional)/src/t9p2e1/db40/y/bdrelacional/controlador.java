/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9p2e1.db40.y.bdrelacional;

import GUI.*;
import UML.*;
import BD.*;
import java.time.LocalDate;

/**
 *
 * @author 1gdaw02
 */
public class controlador {

    public static VentanaPrincipal vp;    
    public static VentanaClientes vc;
    public static VentanaAbogados va;
    public static VentanaCasos vcj;    
    public static Abogado a;  
    public static Cliente c;
    public static void main(String[] args) {
        vp=new VentanaPrincipal();
        vp.setVisible(true);
    }

    public static void visualizarventanaclientes() {
        vp.setVisible(false);
        
        vc=new VentanaClientes();
        vc.setVisible(true);
    }

    public static void visualizarventanaabogados() {
        vp.setVisible(false);
        
        va=new VentanaAbogados();
        va.setVisible(true);
    }
    public static void visualizarventanacasos() {
        vp.setVisible(false);
        
        vcj=new VentanaCasos();
        vcj.setVisible(true);
    }    

    public static void salir() {
        vp.setVisible(false);
        System.exit(0);
    }

    public static void cancelarabogados() {
        va.setVisible(false);
        
        vp=new VentanaPrincipal();
        vp.setVisible(true);
    }

    public static void cancelarcasos() {
        vcj.setVisible(false);
        
        vp=new VentanaPrincipal();
        vp.setVisible(true);
    }

    public static void cancelarclientes() {
        vc.setVisible(false);
        
        vp=new VentanaPrincipal();
        vp.setVisible(true);
    }

    public static void altaabogados(String dni,String nombre,String apellidos,String direccion) {
        
    }

    public static void altacasos(LocalDate fechaini, LocalDate fechafin, String estado) {

    }

    public static void altaclientes(String dni,String nombre,String apellidos,String direccion,String telefono) {
        c = new Cliente(dni,nombre,apellidos,direccion,telefono);
        c = ClienteDAO.daralta(c);
    }

    public static void bajaabogado(String nombre) {

    }

    public static void bajacliente(String nombre) {
        c = new Cliente(nombre);
    }

    public static void modificacioncliente(String nombre) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
