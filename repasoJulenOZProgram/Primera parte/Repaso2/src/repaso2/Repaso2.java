/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw03
 */
public class Repaso2 {

    /**
     * @param args the command line arguments
     */
    private static Integer []lista;
    private static String cadenanums=" ";    
    private static ArrayList lfinal;
    public static void main(String[] args) {
        int x=Integer.parseInt(JOptionPane.showInputDialog("Introduce el tamaño que quieres que tenga el array"));
        lista=new Integer[x];
        lfinal=new ArrayList();
        int y;
        for(y=0;y<lista.length;y++){
            lista[y]=(int) (Math.random()*300+0);
        }     
        Mostrartodos();
        
        for(int z=0;z<lista.length;z++){          
            String n=lista[z].toString();
            
            int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el ultimo digito que quieres buscar")); 
            
            if(n.charAt(z)==(num))
                lfinal.add(n);
            else
                JOptionPane.showMessageDialog(null, "El numero introducido no coincide con ningun numero de ninguna posicion del array");         
        }
        String ultimo=lfinal.toArray().toString();
        
        JOptionPane.showMessageDialog(null, "Los numeros que coinciden son estos"+ultimo);
    }
    private static void Mostrartodos() {
        int x;
        for(x=0; x<lista.length;x++){    
            cadenanums += lista[x];
            cadenanums+=" ";
        }            
        JOptionPane.showMessageDialog(null,"Estos son los numeros" + cadenanums);
    }    
}
