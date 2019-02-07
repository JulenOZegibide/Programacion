/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados3;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaDos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        int ca = 0;
        int ce = 0;
        int ci = 0;
        int co = 0;
        int cu = 0;
        mensaje = JOptionPane.showInputDialog("Introduce tu mensaje");
        for(int letra = 0; letra<mensaje.length();letra++)
        {
             if(mensaje.charAt(letra)=='a')
                     {
                     ca++;
                     
                     }
             else
                     {
             if(mensaje.charAt(letra)=='e')
                     {
                    ce++; 
                    
                    }
             else
                    {
             if(mensaje.charAt(letra)=='i')
                    {
                    ci++;
                    
                    }
             else
                    {
             if(mensaje.charAt(letra)=='o')
                    {
                    co++;
                    
                    }
             else
                    {
             if(mensaje.charAt(letra)=='u')
                    {
                     cu++;
                    
                    }
    }
    
}}}}
    JOptionPane.showMessageDialog(null, "En el mensaje " + mensaje +" la letra 'a' se repite " + ca + " veces");
    JOptionPane.showMessageDialog(null, "En el mensaje " + mensaje +" la letra 'e' se repite " + ce + " vezes");
    JOptionPane.showMessageDialog(null, "En el mensaje " + mensaje +" la letra 'i' se repite " + ci + " vezes");
    JOptionPane.showMessageDialog(null, "En el mensaje " + mensaje +" la letra 'o' se repite " + co + " vezes");
    JOptionPane.showMessageDialog(null, "En el mensaje " + mensaje +" la letra 'u' se repite " + cu + " vezes");
    }}
             
