/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio18;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Teclea un numero"));
        int c = 0;
        int nroimpar = 1;
        int resultado = 0;
        while(c < numero)
        {
            resultado = resultado + nroimpar;
            nroimpar = nroimpar + 2;
            c = c + 1;
        }
        JOptionPane.showMessageDialog(null, "el resultado es "+ resultado);
        
        
        // TODO code application logic here
    }
    
}
