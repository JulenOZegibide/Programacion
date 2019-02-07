/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados1;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaDos1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String mensaje;
        int c = 0;
        mensaje = JOptionPane.showInputDialog("introduce tu mensaje");
        for(int letra=0; letra<mensaje.length();letra++)
        {
            if((mensaje.charAt(letra)=='a') ||
            (mensaje.charAt(letra)=='e') ||   
            (mensaje.charAt(letra)=='i') ||
            (mensaje.charAt(letra)=='o') ||
            (mensaje.charAt(letra)=='u')) 
                c=c+1;
        }
        JOptionPane.showMessageDialog(null, "El mensaje " + mensaje +" tiene " + c + " vocales");
        
        
        
        
        // TODO code application logic here
    }
    
}
