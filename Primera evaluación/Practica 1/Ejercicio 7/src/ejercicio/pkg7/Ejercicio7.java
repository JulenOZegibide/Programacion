/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg7;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String cateto1 = JOptionPane.showInputDialog("Introduce un primer cateto");
    int c1 = Integer.parseInt(cateto1);
    String cateto2 = JOptionPane.showInputDialog("Introduce un segundo cateto");
    int c2 = Integer.parseInt(cateto2);
    int resultado = (int) Math.sqrt (Math.pow(c1,2)+ Math.pow(c2,2));
    JOptionPane.showMessageDialog(null, resultado);
            
        


// TODO code application logic here
    }
    
}
