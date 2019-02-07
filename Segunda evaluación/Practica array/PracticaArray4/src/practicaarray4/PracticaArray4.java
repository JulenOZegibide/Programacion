/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarray4;

/**
 *
 * @author 1gdaw08
 */
import java.util.Arrays;
import javax.swing.JOptionPane;
public class PracticaArray4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        String mensaje;
        String[]letras={"a","b","c","d","e","f","g","h","i","j","k","l","m","n","ñ","o","p","q","r","s","t","u","v","w","x","y","z"};
        for(int x=0;x<letras.length;x++)
            mensaje = JOptionPane.showInputDialog("Introduce un mensaje");
            x=Arrays.binarySearch(letras, mensaje.CharAt(x));
        
        // TODO code application logic here
    }
    
}
