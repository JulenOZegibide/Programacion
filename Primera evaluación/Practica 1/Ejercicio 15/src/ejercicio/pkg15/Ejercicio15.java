/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg15;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int c = 0;
        String respuesta;
        do
        {
            int nota = Integer.parseInt(JOptionPane.showInputDialog("introduce tu nota"));
            if(nota >= 6)
                c = c+1;
            respuesta = JOptionPane.showInputDialog(null, "¿Quieres continuar?");
        }
        while(respuesta.equalsIgnoreCase("si"));
        JOptionPane.showMessageDialog(null, "el numero de aprobados es " + c);
        // TODO code application logic here
    }
    
}
