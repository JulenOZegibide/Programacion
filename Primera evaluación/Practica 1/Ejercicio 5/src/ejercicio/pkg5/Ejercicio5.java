/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    String grados = JOptionPane.showInputDialog("Introduce los grados celsius");
    float C = Float.parseFloat(grados);
    float resultado = 1.8f*(C)+32;
    JOptionPane.showMessageDialog(null,C +" ºc son " + resultado + " ºF ");    
        // TODO code application logic here
    }
    
}
