/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio16;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 0;
        int sumaedades = 0;
        String respuesta;
        do
        {
            int edad= Integer.parseInt(JOptionPane.showInputDialog(null, "introduce tu edad"));
            c = c+1;
            sumaedades = sumaedades + edad;
            respuesta = JOptionPane.showInputDialog(null, "¿Quieres continuar?");
        }
        while(respuesta.equalsIgnoreCase("si"));
        int media= sumaedades/c;
        JOptionPane.showMessageDialog(null, "la media es: "+ media);
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
