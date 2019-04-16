/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9p2e1.db40.y.bdrelacional;

import GUI.*;
import UML.*;
import BD.*;
import java.sql.SQLException;
import java.time.LocalDate;
import javax.swing.JOptionPane;

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
    public static CasoJudicial cj;
    public static int numexp;
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
        a = new Abogado(dni,nombre,apellidos,direccion);
        a = AbogadoDAO.altaabogado(a);
    }

    public static void altaclientes(String dni,String nombre,String apellidos,String direccion,String telefono) {
        c = new Cliente(dni,nombre,apellidos,direccion,telefono);
        c = ClienteDAO.daralta(c);
    }

    public static void bajaabogado(String nombre) {
       a = new Abogado(nombre);

       a= AbogadoDAO.consultarabogado(a);
       if (a != null)
            if (va.mostrar(a.toString()) == true)
                 AbogadoDAO.borrarabogado(a);
            else
                System.out.println("No se ha podido borrar");
       else
            System.out.println("Problemas");
    }
    public static void bajacliente(String nombre) {
       c = new Cliente(nombre);

       c= ClienteDAO.consultar(c);
       if (c != null)
            if (vc.mostrar(c.toString()) == true)
                 ClienteDAO.borrar(c);
            else
                System.out.println("No se ha podido borrar");
       else
            System.out.println("Problemas");
    }

    public static void modificacionclienteparte1(String nombre) throws Exception
   {
       // Primero consultamos y mostramos sus datos
       c = ClienteDAO.consultar(new Cliente(nombre));
       vc = new VentanaClientes(c);
       vc.setVisible(true);
   }
    
   public static void modificacionclienteparte2(String dni,String nombre,String apellidos,String direccion,String telefono) throws Exception
   {
       // actualizamos objeto en memoria
       c.setDni(dni);
       c.setNombre(nombre);
       c.setApellidos(apellidos);
       c.setDireccion(direccion);
       c.setTelefono(telefono);
       ClienteDAO.modificarcliente(c);
   }

    public static void cosultarpersona(String nombre) {
       c = ClienteDAO.consultar(new Cliente(nombre));
       vc = new VentanaClientes(c);
       vc.setVisible(true);
    }
    public static void modificacionabogadoparte1(String nombre) {
       a = AbogadoDAO.consultarabogado(new Abogado(nombre));
       va = new VentanaAbogados(a);
       va.setVisible(true);
    }
    public static void modificacionabogadosparte2(String dni,String nombre,String apellidos,String direccion) {
       c.setDni(dni);
       c.setNombre(nombre);
       c.setApellidos(apellidos);
       c.setDireccion(direccion);
       AbogadoDAO.modificarabogado(a);
    }
    public static void cosultarabogado(String nombre) {
       a = AbogadoDAO.consultarabogado(new Abogado(nombre));
       va = new VentanaAbogados(a);
       va.setVisible(true);
    }

    public static void altacasos(int numexp,LocalDate fechaini,String estado,String dni) {
        cj = new CasoJudicial(numexp,fechaini,estado);
        cj=CasosDAO.altacaso(cj);
        
        c = ClienteDAO.consultar(new Cliente(dni));   
        
        cj = new CasoJudicial(numexp,fechaini,estado,c);
        cj=CasoClienteDAO.altacasocliente(cj);
    }
    public static void buscarNumexpediente() throws SQLException{
        numexp = CasosDAO.buscarNumexpediente(numexp);
        if(numexp==0)
            vcj.asignar1(); 
        else
            vcj.asignarnumexp(numexp);            
    }

    public static void modificacioncasoparte1(int num) {
       cj = CasosDAO.consultarcaso(new CasoJudicial(num));
       vcj = new VentanaCasos(cj);
       va.setVisible(true);
    }
    public static void modificacioncasoparte2(int numexp,LocalDate fechaini,String estado,String dni){
       c = ClienteDAO.consultar(new Cliente(dni));   
        
       cj.setNumexpediente(numexp);
       cj.setFechaini(fechaini);
       cj.setEstado(estado);
       cj.setCliente(c);
       AbogadoDAO.modificarabogado(a);
    }
    public static void bajacaso(int num) {
       cj = new CasoJudicial(num);

       c= ClienteDAO.consultar(c);
       if (c != null)
            if (vc.mostrar(c.toString()) == true)
                 ClienteDAO.borrar(c);
            else
                System.out.println("No se ha podido borrar");
       else
            System.out.println("Problemas");
    }

}
