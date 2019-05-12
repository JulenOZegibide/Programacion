

package repaso13;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


 
public class Repaso13 {

  
    public static void main(String[] args) throws Exception {
        String direccion = JOptionPane.showInputDialog("Introduce la direccion siguendo este orden:calle número piso letra ciudad código postal");
        validardireccion(direccion);
    }
    public static void validardireccion(String direccion)throws Exception{
        Pattern pat=Pattern.compile("[A-Z]{1}[a-z]{3,}[1-9]{1-3}[1-9]{1-2}[A-Z]{1}[A-Z]{1}[a-z]{3,}[1-9]{5}");
        Matcher mat=pat.matcher(direccion);
        if(mat.matches()){
        JOptionPane.showMessageDialog(null, "La direccion " + direccion +" es valida.");
        }
        else{
        JOptionPane.showMessageDialog(null, "La direccion " + direccion +" no es valida.");
        throw new direccionnovalida(); 
        }
    }
}