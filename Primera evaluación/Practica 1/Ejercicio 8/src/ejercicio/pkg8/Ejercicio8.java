/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg8;

/**
 *
 * @author 1gdaw08
*/
import javax.swing.JOptionPane;
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String nota = JOptionPane.showInputDialog("Introduce la nota");
    int n = Integer.parseInt(nota);
    if (n>10||n<0)
    {
    JOptionPane.showMessageDialog(null, n + " no esta entre 0 y 10");
    }
    else
    {
            if (n>=5)
            {
                JOptionPane.showMessageDialog(null, "Aprobado");
            }
            else
            {    
                JOptionPane.showMessageDialog(null, "Suspendido");
            }
    }
    }
}
     
       
        
        
    
        // TODO code application logic here
    
    
