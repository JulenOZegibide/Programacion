/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw02
 */
public class Repaso8 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList<Integer>numeros;
    private static ArrayList<Integer>mayores;    
    private static Integer suma=0;    
    private static Integer media;
    public static void main(String[] args) {
        numeros=new ArrayList();
        mayores=new ArrayList();        
        int num;
        do{
            num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quieres añadir a la lista"));
        numeros.add(num);
        }while(num!=-99);
        for(int x=0;x<numeros.size();x++){
            suma=suma+numeros.get(x);
        }
        media=suma/numeros.size();

        for(int x=0;x<numeros.size();x++){        
        if(numeros.get(x)>media)
            mayores.add(numeros.get(x));
            }
        Integer.parseInt(JOptionPane.showInputDialog(" Estos son los valores introducidos"+numeros.toString()+"\n La suma de todos los numeros es"+suma+"\n La media es"+media+"\n "+mayores+" son los numeros que son mayores que la media"));

    }
    
}
