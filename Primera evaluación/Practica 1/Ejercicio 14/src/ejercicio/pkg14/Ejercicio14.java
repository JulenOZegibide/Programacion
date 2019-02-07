/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg14;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 0;
        int suma = 0;
        int n;
        do
        {
            n = Integer.parseInt(JOptionPane.showInputDialog(null,"introduce un numero"));
            suma = suma + n;
            c = c + 1;
        }
        while(c!=10);
        JOptionPane.showMessageDialog(null, suma + " es la suma");
        
        
        
        
        // TODO code application logic here
    }
    
}
