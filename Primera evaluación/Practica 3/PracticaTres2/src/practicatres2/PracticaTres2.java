/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatres2;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaTres2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        boolean aptovisual = true;
        boolean aptocobol = true;
        boolean aptosql = true;
        boolean aptojava = true;
    try
    {    
        float notavisual = Float.parseFloat(JOptionPane.showInputDialog("Introduce tu nota de Visual.Net"));
        float notacobol = Float.parseFloat(JOptionPane.showInputDialog("Introduce tu nota de Cobol"));
        float notajava = Float.parseFloat(JOptionPane.showInputDialog("Introduce tu nota de Java"));
        float notasql = Float.parseFloat(JOptionPane.showInputDialog("Introduce tu nota de SQL"));
    
        if(notavisual <5)
        {
            aptovisual = false;
        }
        else
        {
            aptovisual = true;
        }
        if(notacobol <5)
        {
            aptocobol = false;
        }
        else
        {
            aptocobol = true;
        }
        if(notajava <5)
        {
            aptojava = false;
        }
        else
        {
            aptojava = true;
        }
        if(notasql <5)
        {
            aptosql = false;
        }
        else
        {
            aptosql = true;
        }
    }
        catch(Exception NumberFormatException)
                {
        
        if(aptovisual == true && aptosql == true && aptocobol == true && aptojava == true)
        {
            JOptionPane.showMessageDialog(null, "Sobresaliente");
        }
        else
            if (aptocobol == true && aptosql == true && (aptovisual == true || aptojava == true))
        {
            JOptionPane.showMessageDialog(null, "Notable");
        }
        else
            if(aptosql == true && aptocobol == true)
        {
            JOptionPane.showMessageDialog(null, "Bien");
        }
        else
            if(aptocobol == true &&( aptovisual == true || aptojava == true))
        {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }
        else
            if(aptosql == true &&( aptovisual == true || aptojava == true))
        {
            JOptionPane.showMessageDialog(null, "Suficiente");
        }
        else
            JOptionPane.showMessageDialog(null, "Insuficiente");
        
        
        // TODO code application logic here
    }
    
}}
