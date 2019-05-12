/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso5;

import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw02
 */
public class Repaso5 {

    /**
     * @param args the command line arguments
     */
    private static int []lista;
    private static String cadenanums=" ";
    public static void main(String[] args) {
        lista=new int[10];
    
        for(int x=0; x<lista.length;x++)
            lista[x]=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion" +" "+ x));
        
        menu();
    }
    public static void menu(){    
        String opcion=JOptionPane.showInputDialog(null, "Introduce la operacion que deseas realizar\n  1.-Mostrar el contenido de todas las posiciones\n  2.-Mostrar el contenido de una posiciÃ³n concreta\n  3.-Modificar el contenido de una posiciÃ³n concreta\n  4.-Vaciar el contenido de una posiciÃ³n concreta\n  5.-Calcular la suma y la media de todos los nÃºmeros\n  6.-Ordenar los nÃºmeros de mayor a menor");
        
        switch(opcion){
            case "1" : Buscarposicion();
            break;
            case "2" : Mostrarposicion();
            break;
            case "3" : Modificarposicion();
            break;
            case "4" : Borrarposicion();
            break;
            case "5" : ordenar();
            break;
        }            
        JOptionPane.showMessageDialog(null,"Estos son los numeros" + cadenanums);
        
        int continuar=JOptionPane.showConfirmDialog(null, "Quieres continuar");
        if(continuar==0)
            menu();
    }
    private static void Buscarposicion(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero de la posicion que quieres conocer"));
        Arrays.binarySearch(lista, num);
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

    private static void ordenar() {
       Arrays.sort(lista);
		
    }

}
