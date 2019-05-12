

package repaso12;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


 
public class Repaso12 {

  
    public static void main(String[] args) throws Exception {
        String nombre = JOptionPane.showInputDialog("Introduce el nombre");
        validarnombre(nombre);
    }
    public static void validarnombre(String nombre)throws Exception{
        Pattern pat=Pattern.compile("[A-Z]{1}[a-z]{2,10}");
        Matcher mat=pat.matcher(nombre);
        if(mat.matches()){
        JOptionPane.showMessageDialog(null, "El nombre " + nombre +" es valido.");
        }
        else{
        JOptionPane.showMessageDialog(null, "El nombre " + nombre +" no es valido.");
        throw new nombrenovalido(); 
        }
    }
}