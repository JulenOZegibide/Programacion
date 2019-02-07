/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatres5;

/**
 *
 * @author 1gdaw08
 */
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
public class PracticaTres5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        boolean fin = true;
        int c = 0;
        Integer numaleat = ThreadLocalRandom.current().nextInt(100,999);
        String numgenerado = numaleat.toString();
        while( c != 3)
        {
            String tunum = JOptionPane.showInputDialog("introduce un numero de tres cifras");
              if(numgenerado.equals(tunum))
                 {
                    JOptionPane.showMessageDialog(null, "Todos muertos");
                    fin = true;
                 }
              else
              {
                  for(int num = 0; num<tunum.length();num++)
                    if(tunum.charAt(num)==numgenerado.charAt(num))
                    {
                        c++;
                        fin = true;
                    }
                  JOptionPane.showMessageDialog(null,c + " es el número de muertos"); 
              }
        }          
                  
        // TODO code application logic here
    }
    
    }
