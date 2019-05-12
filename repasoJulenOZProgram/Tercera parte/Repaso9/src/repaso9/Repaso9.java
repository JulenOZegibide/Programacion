

package repaso9;

import java.util.regex.*;
import javax.swing.JOptionPane;


 
public class Repaso9 {

  private static boolean correcto;
  private static boolean sonnumeros;
    public static void main(String[] args)throws Exception {
        String dni = JOptionPane.showInputDialog("Introduce tu dni");
        validardni(dni);
    }
    public static void validardni(String dni)throws Exception{
        if(dni.length()!=9||Character.isLetter(dni.charAt(8))==false||sonnumeros==true)
            correcto=false;
        else    
            correcto=true;
        
    for(int x=0;x<dni.length();x++){
        if(Character.isDigit(dni.charAt(x)))
            
    }    
        
        Pattern pat = Pattern.compile("[0-9]{8}[A-Z]{1}");
        Matcher mat=pat.matcher(dni);
        if(mat.matches()){
            JOptionPane.showMessageDialog(null, "El dni " + dni +" es valido.");
        }
        else
            JOptionPane.showMessageDialog(null, "El dni " + dni +" no es valido.");
            throw new dninovalido(); 
        }
    }

