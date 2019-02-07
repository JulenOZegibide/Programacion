/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg2;

/**
 *
 * @author 1gdaw08
 */
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String numerouno = javax.swing.JOptionPane.showInputDialog("Introduce un primer numero");
    int n1 = Integer.parseInt(numerouno);
    String numerodos=javax.swing.JOptionPane.showInputDialog("introduce un segundo numero");
    int n2 = Integer.parseInt(numerodos);
    
    int resultado = n1*n2;
    javax.swing.JOptionPane.showMessageDialog(null,resultado);
    
    }
    
}
