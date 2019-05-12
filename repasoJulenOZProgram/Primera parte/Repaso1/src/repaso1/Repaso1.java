/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class Repaso1 {

    /**
     * @param args the command line arguments
     */
    private static int []lista;
    private static String cadenanums=" ";
    private static int suma;
    private static int media;
    private static int min;
    private static int max;    
    public static void main(String[] args) {
        crearArray();
        
        menu();
    }
    public static void menu(){    
        String opcion=JOptionPane.showInputDialog(null, "Introduce la operacion que deseas realizar\n  1.-Mostrar el contenido de todas las posiciones\n  2.-Mostrar el contenido de una posiciÃ³n concreta\n  3.-Modificar el contenido de una posiciÃ³n concreta\n  4.-Vaciar el contenido de una posiciÃ³n concreta\n  5.-Calcular la suma y la media de todos los nÃºmeros\n  6.-Ordenar los nÃºmeros de mayor a menor");
        
        switch(opcion){
            case "1" : Mostrartodos();
            break;
            case "2" : Mostrarposicion();
            break;
            case "3" : Modificarposicion();
            break;
            case "4" : Borrarposicion();
            break;
            case "5" : Sumaymedia();
            break;
            case "6" : Ordenarnumeros();
            break;
        }
    }
    public static void crearArray(){
        lista=new int[10];
    
        for(int x=0; x<lista.length;x++)
            lista[x]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion" +" "+ x));
    }

    private static void Mostrartodos() {
        int x;
        for(x=0; x<lista.length;x++){    
            cadenanums += lista[x];
            cadenanums+=" ";
        }            
        JOptionPane.showMessageDialog(null,"Estos son los numeros" + cadenanums);
        
        int continuar=JOptionPane.showConfirmDialog(null, "Quieres continuar");
        if(continuar==0)
            menu();
    }

    private static void Mostrarposicion() {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que desea conocer"));
        JOptionPane.showMessageDialog(null,lista[x]);
        
        int continuar=JOptionPane.showConfirmDialog(null, "Quieres continuar");
        if(continuar==0)
            menu();
    }

    private static void Modificarposicion() {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que desea modificar"));
        
        int y= Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero por el que desea remplazarlo"));
        lista[x]=y;
        
        int continuar=JOptionPane.showConfirmDialog(null, "Quieres continuar");
        if(continuar==0)
            menu();        
    }

    private static void Borrarposicion() {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que desea borrar"));
        
        lista[x]=-1;
        
        int continuar=JOptionPane.showConfirmDialog(null, "Quieres continuar");
        if(continuar==0)
            menu();   
    }

    private static void Sumaymedia() {
        int x;
        for(x=0; x<lista.length;x++){    
            suma=suma +lista[x];
            
            media=suma/10;
        }            
        JOptionPane.showMessageDialog(null,"La suma de todos los numeros es " + suma + " y la media " + media);
        
        int continuar=JOptionPane.showConfirmDialog(null, "Quieres continuar");
        if(continuar==0)
            menu();
    }

    private static void Ordenarnumeros() {
       // Collections.reverseOrder(Arrays.sort(lista));
		
    }

}
