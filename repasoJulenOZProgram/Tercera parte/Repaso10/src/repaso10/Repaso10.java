

package repaso10;

import java.util.regex.*;
import javax.swing.JOptionPane;


 
public class Repaso10 {

  
    public static void main(String[] args) throws Exception {
        String email = JOptionPane.showInputDialog("Introduce tu email");
        validaremail(email);
    }
    public static void validaremail(String email)throws Exception{
        Pattern pat=Pattern.compile("[a-z0-9A-Z.]{4,15}[@]{1}(email|gmail|hotmail|yahoo)(.com|.es)");
        Matcher mat=pat.matcher(email);
        if(mat.matches()){
        JOptionPane.showMessageDialog(null, "El email " + email +" es valido.");
        }
        else{
        JOptionPane.showMessageDialog(null, "El email " + email +" no es valido.");
        throw new emailnovalido(); 
        }
    }
}
