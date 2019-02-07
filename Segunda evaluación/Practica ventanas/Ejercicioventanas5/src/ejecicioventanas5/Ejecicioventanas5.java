/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejecicioventanas5;

/**
 *
 * @author 1gdaw02
 */
import javax.swing.JOptionPane;
import ventanas.ventana;
public class Ejecicioventanas5 {

    /**
     * @param args the command line arguments
     */
    public ventana v;
    public static void main(String[] args) {
        new ventana v;
        
    }
    public static void salir(){
        int opcion;
        opcion=Integer.parseInt(JOptionPane.showInputDialog("Que es lo que quieres hacer para terminar"+"\n1.-Limpiar pantalla" +"\n2.-Mostrar los datos de los productos,proveedores y clientes"));
        switch(opcion){
            case 1:limpiarpantalla();
            case 2:mostrardatos();
        }
    }
    public static void limpiarpantalla(){
        
    }
    public static void mostrardatos() {
        
    }
}
