/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioventanas7;

import UML.*;
import com.sun.glass.ui.Cursor;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JComboBox;
import ventanas.*;


/**
 *
 * @author 1gdaw02
 */
public class Ejercicioventanas7 {

    private static Departamento aDepartamento[];
    private static Contrato aContrato[];
    private static ArrayList<Empleado>aEmpleado;
    private static Empleado oEmpleado;
    private static String operacion;
    private static Usuario administrador;
    public static Ventanainicio v;  
    public static ventana vmenu;
    public static Ventanaalta valta;
    private static int cfallos=0;
    public static void main(String[] args) {
        generardatos();
        v=new Ventanainicio();
        v.setVisible(true);
        
    }
public static void generardatos(){
    aDepartamento=new Departamento[3];
    aDepartamento[0]=new Departamento();
    aDepartamento[0].setNombre("Informatica");
    aDepartamento[1]=new Departamento();
    aDepartamento[1].setNombre("Electronica"); 
    aDepartamento[2]=new Departamento();
    aDepartamento[2].setNombre("Mecanica");

    aContrato=new Contrato[3];
    aContrato[0]=new Contrato();
    aContrato[0].setDescripcion("Indefinido ordinario");
    aContrato[1]=new Contrato();
    aContrato[1].setDescripcion("Practicas"); 
    aContrato[2]=new Contrato();
    aContrato[2].setDescripcion("Formacion");

    aEmpleado=new ArrayList<Empleado>();
    oEmpleado=new Empleado();
    oEmpleado.setDNI("11111111A");
    oEmpleado=new Empleado();
    oEmpleado.setDNI("22222222B");
    
    administrador=new Usuario();
    administrador.setNombre("a");
    administrador.setContraseña("a");
}    
public static void salir(){
    System.exit(0);
    javax.swing.JOptionPane.showMessageDialog(null, "Has terminado");
}
public static void comprobardatos(String Nombre,String Contraseña){
    vmenu=new ventana();
    
    if(Nombre.equals(administrador.getNombre()) && Contraseña.equals(administrador.getContraseña())){
    
    v.setVisible(false);
    vmenu.setVisible(true);
}
else{
    cfallos++;
    
    javax.swing.JOptionPane.showMessageDialog(null,"La contraseña o el usuario son incorrectos vas "+cfallos+" intentos de 3");
    
    if(cfallos==3){
    javax.swing.JOptionPane.showMessageDialog(null,"La has liado");
    v.setVisible(false);}    
}}
public static void limpiarventana(){
    valta=new Ventanaalta();
    
    vmenu.setVisible(false);
    valta.setVisible(true);
}
public static void cancelar(){
    valta.setVisible(false);
    vmenu.setVisible(true);
}
/*public static void llenarContratos(JComboBox contratos){
    for
}  */
public static void darAlta(String DNI,String NSS,String Nombre,String Apellidos, String Direccion,String Telefono,Character sexo,Character estadocivil,String fechaalta,String numeroemlpeado,Contrato c,Departamento d,Usuario u) {

       
   oEmpleado=new Empleado();
   
   oEmpleado.setDNI(DNI);
   oEmpleado.setNSS(NSS);
   oEmpleado.setNombre(Nombre);
   oEmpleado.setApellidos(Apellidos);
   oEmpleado.setDireccion(Direccion);
   oEmpleado.setTelefono(Telefono);
   oEmpleado.setSexo(sexo);
   oEmpleado.setEstadocivil(estadocivil);
   oEmpleado.setFechaalta(fechaalta);   
   oEmpleado.setNumeroemlpeado(numeroempleado);  
   oEmpleado.setC(c);
   oEmpleado.setD(d);
   oEmpleado.setU(u);   
   
   aEmpleado.add(oEmpleado);
     
}

}
