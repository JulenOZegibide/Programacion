/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatres4;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaTres4 {

    /**
     * @param args the command line arguments
     */
    public static float suma;
    public static void main(String[] args) {
        String nombre;
        do
        {
        nombre = JOptionPane.showInputDialog("introduce el nombre del alumno");
        float nota = 0;
        for(int x = 0; x<6;x++)
        nota = Float.parseFloat(JOptionPane.showInputDialog("introduce una nota del alumno"));
        suma = suma + nota;
        }
        while(nombre.compareToIgnoreCase("fin")!=0);
        float notamedia = suma/6;
        
       
        
        
        
        
        // TODO code application logic here
    }
    
}
