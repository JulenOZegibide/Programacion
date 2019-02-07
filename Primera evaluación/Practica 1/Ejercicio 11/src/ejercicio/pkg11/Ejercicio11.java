/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg11;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String numero1 = JOptionPane.showInputDialog("introduce un primer numero");
    int n1 = Integer.parseInt(numero1);
    String numero2 = JOptionPane.showInputDialog("Introduce un segundo numero");
    int n2 = Integer.parseInt(numero2);
    String numero3 = JOptionPane.showInputDialog("Introduce un tercer numero");
    int n3 = Integer.parseInt(numero3);
    if(n1>n2 && n1>n3)
    {
        JOptionPane.showMessageDialog(null, n1 + " es el mas grande");
        if (n2>n3)
            JOptionPane.showMessageDialog(null, n2 + " es el mas grande");
        else
            JOptionPane.showMessageDialog(null, n3 + " es el mas pequeño");
    }
    else
    {
    if (n1<n2 && n2<n3)
        JOptionPane.showMessageDialog(null, n1 + " es el mas pequeño");   
        JOptionPane.showMessageDialog(null, n3 + " es el mas grande");
    // TODO code application logic here
    }
    
}}
