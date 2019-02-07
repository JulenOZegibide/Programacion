/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarray6;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaArray6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c = 0;
        String nombre = JOptionPane.showInputDialog("introduce el nombre del alumno");
        String falta = JOptionPane.showInputDialog("Introduce si a faltado hoy a clase");
        do
        {
           c++; 
        }
        while(falta.equalsIgnoreCase("si"));
        JOptionPane.showMessageDialog(null, "El alumno " + nombre + " ha faltado " + falta +" vezes a clase en Noviembre");
        
        
    }
    
}
