

package repaso11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


 
public class Repaso11 {

  
    public static void main(String[] args) throws Exception {
        String fecha = JOptionPane.showInputDialog("Introduce la fecha");
        validarfecha(fecha);
    }
    public static void validarfecha(String fecha)throws Exception{
        Pattern pat=Pattern.compile("[0-9]{1,2}[/]{1}[0-9]{1,2}[/]{1}(2010|2011|2012|2013|2014|2015|2016|2017|2018|2019)");
        Matcher mat=pat.matcher(fecha);
        if(mat.matches()){
        JOptionPane.showMessageDialog(null, "La fecha " + fecha +" es valida.");
        }
        else{
        JOptionPane.showMessageDialog(null, "La fecha " + fecha +" no es valida.");
        throw new fechanovalida(); 
        }
    }
}