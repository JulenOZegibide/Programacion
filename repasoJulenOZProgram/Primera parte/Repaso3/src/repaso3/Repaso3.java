/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso3;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw02
 */
public class Repaso3 {

    /**
     * @param args the command line arguments
     */
    private static String[]mayus;
    private static ArrayList salida;
    public static void main(String[] args) {
        mayus=new String[27];
        String[]mayus={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        
        salida=new ArrayList();
        
        for(int x=0;x<mayus.length;x++){
             int posicion=Integer.parseInt(JOptionPane.showInputDialog("Introduce la posicion que quieres añadir"));
           
             if ( posicion != -1)
             {
                     salida.add(mayus[posicion]);
                     JOptionPane.showMessageDialog(null, salida.toString());
             }
             else
                 JOptionPane.showMessageDialog(null, "se acabo");
        }
    }
    
}
