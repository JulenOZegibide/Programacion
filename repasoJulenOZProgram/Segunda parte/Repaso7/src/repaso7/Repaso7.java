/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso7;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw02
 */
public class Repaso7 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Integer> numeros;
    public static void main(String[] args) {
        numeros=new ArrayList();
        
        menu();
    }
    public static void menu(){    
        String opcion=JOptionPane.showInputDialog(null, "Introduce la operacion que deseas realizar\n  1.-Mostrar el contenido de todas las posiciones\n  2.-Mostrar el contenido de una posiciÃ³n concreta\n  3.-Modificar el contenido de una posiciÃ³n concreta\n  4.-Vaciar el contenido de una posiciÃ³n concreta\n  5.-Calcular la suma y la media de todos los nÃºmeros\n  6.-Ordenar los nÃºmeros de mayor a menor");
        
        switch(opcion){
            case "1" : Agregarnumero();
            break;
            case "2" : Buscarnumero();
            break;
            case "3" : Modificarnumero();
            break;
            case "4" : Borrarnumero();
            break;
            case "5" : Insertarnumeroenposicion();
            break;
        }
    }
    public static void Agregarnumero(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quieres añadir a la lista"));
        numeros.add(num);
    }
    public static void Buscarnumero(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quieres buscar en la lista"));
        JOptionPane.showMessageDialog(null, "El num de la posicion que buscas es" + numeros.get(num));
    }
    public static void Modificarnumero(){
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres cambiar de la lista"));
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numeropor el que quieres cambiarlo"));
        numeros.set(pos, num);
    }
    public static void Borrarnumero(){
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quieres borrar de la lista"));
        numeros.remove(Integer.valueOf(num));
    }
    public static void Insertarnumeroenposicion(){
        int pos=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres cambiar de la lista"));
        int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numeropor el que quieres cambiarlo"));
        numeros.set(pos, num);
    }
}
