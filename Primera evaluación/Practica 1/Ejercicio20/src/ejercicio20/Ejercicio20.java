/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio20;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int nrogenerado = (int) Math.random()*100;
        int num = 101;
        int n =  Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        while(num != 101)
        {
            if(num != nrogenerado)
            {
                if(num<nrogenerado)
                    {
                        JOptionPane.showMessageDialog(null, "introduce un numero mas grande");
                    }
                else
                {
                    JOptionPane.showMessageDialog(null,"intentalo con un numero mas pequeño");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"enhorabuena");
            }
        }
             
        Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
        
        
        
        
        // TODO code application logic here
    }
    
}
