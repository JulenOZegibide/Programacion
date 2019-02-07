/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg6;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String radio = JOptionPane.showInputDialog("Introduce el radio");
    float r = Float.parseFloat(radio);
    float resultado = (float)Math.PI*r*r;
    JOptionPane.showMessageDialog(null, resultado);
    
        



// TODO code application logic here
    }
    
}
