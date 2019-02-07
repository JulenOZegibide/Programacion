/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatres1;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaTres1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try  
            }    
            int horastrabajadas = Integer.parseInt(JOptionPane.showInputDialog("Teclea el numero de horas"));
            char estadocivil;
            char nivelestudios;
            float sueldo;
            do
            {
            estadocivil = JOptionPane.showInputDialog("Teclea el estado civil").charAt(0);
            estadocivil = Character.toUpperCase(estadocivil);
            }
            while(estadocivil !='S' && estadocivil !='C'&& estadocivil !='V' && estadocivil !='D');
            do
            {
            nivelestudios = JOptionPane.showInputDialog("Teclea el nivel de estudios").charAt(0);
            nivelestudios = Character.toUpperCase(nivelestudios);
            }
            while(nivelestudios !='M' && nivelestudios  !='S' && nivelestudios !='P');
            if(horastrabajadas>40)
            {
            sueldo = (horastrabajadas-40)*15 + 40*10;
            }
            else
            {
            sueldo = horastrabajadas * 10;
            }   
            {
        catch(Exception e) 
                }
                    
            if(nivelestudios == 'S');
                }
                sueldo = sueldo + 100;
                {
            if(estadocivil == 'S' && nivelestudios == 'P');
                }
                sueldo = sueldo + 100;
                {
            if(estadocivil == 'V' && nivelestudios == 'S');
                }
                sueldo = sueldo + 100;
                {        
            if(estadocivil == 'S' && nivelestudios == 'M');
                }
                sueldo = sueldo + 100;
                {    
            if(estadocivil == 'C' && nivelestudios == 'S');
                }
                sueldo = sueldo + 100;
                {
            if(estadocivil == 'V' && nivelestudios == 'P');
                }
                sueldo = sueldo + 100;
                {
            if(estadocivil == 'S' && nivelestudios == 'S');
                }
                sueldo = sueldo + 100;
                {  
            if(estadocivil == 'D' && nivelestudios == 'S');
                }
                sueldo = sueldo + 100;
                {        
            }
                    
                    
                                
        // TODO code application logic here
    }
    
}