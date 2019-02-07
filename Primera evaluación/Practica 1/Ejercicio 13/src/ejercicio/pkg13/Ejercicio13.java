/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg13;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    int c = 0;
    int c1 = 0;
    int c2 = 0;
    do
    {
        JOptionPane.showMessageDialog(null, "Teclea los datos del alumno");
        String nombre = JOptionPane.showInputDialog("introduce el nombre");
        String sexo = JOptionPane.showInputDialog("introduce el sexo(masculino o femenino)");        
        String edad = JOptionPane.showInputDialog("introduce la edad");
        int e = Integer.parseInt(edad);
        String peso = JOptionPane.showInputDialog("introduce el peso");
        float p = Float.parseFloat(peso);
        String estatura = JOptionPane.showInputDialog("introduce la estatura");
        float a = Float.parseFloat(estatura);
            
        if(sexo.equals("masculino"))
        {     
            if(a > 1.7)
             if(p>70)
                c1 = c1+1;
                    c = c+1;
        }
        else
            
            if(sexo.equals("femenino"))
            {
                if(a >1.6)
                    if(p > 70)    
                        c2 = c2 + 1;
                            c = c+1;
            }
            else
                //error
                System.out.println("Dato no valido");
    }         
    while(c!=30);
     System.out.println(c1 + " son los chicos que pueden jugar " + c2 + " son las chicas que pueden jugar");
    }
}
    
        
        
        // TODO code application logic here
    
    

