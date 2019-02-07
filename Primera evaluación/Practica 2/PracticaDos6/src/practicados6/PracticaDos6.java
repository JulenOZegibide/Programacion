/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package practicados6;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class PracticaDos6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try
        {
            
        String fechaString = JOptionPane . showInputDialog ("Teclea una fecha dd/MM/yyyy");
        SimpleDateFormat formatter = new SimpleDateFormat ("dd/MM/yyyy");
        Date fechaString1 = formatter.parse( fechaString );
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaString1);
        }
        catch(Exception e)
                {
        
        
        
        
        // TODO code application logic here
    }
    
}}
