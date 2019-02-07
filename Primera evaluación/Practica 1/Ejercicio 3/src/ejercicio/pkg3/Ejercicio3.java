/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3;

/**
 *
 * @author 1gdaw08
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String base = javax.swing.JOptionPane.showInputDialog("introduce la base");
    int n1 = Integer.parseInt(base);
    String altura = javax.swing.JOptionPane.showInputDialog("Introduce la altura");
    int n2 = Integer.parseInt(altura);    
    int resultado = 2*n1+2*n2;
    javax.swing.JOptionPane.showMessageDialog(null,resultado);
    }
   
    
    
            
    
}
