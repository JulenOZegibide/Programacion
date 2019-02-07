/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados7;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw08
 */
public class PracticaDos7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    try
    {
        Date fechaUno = new Date();
        System.out.println("La primera fecha es: " + fechaUno ); 
        String fechaDos = JOptionPane.showInputDialog("Teclea una fecha");
        Calendar cal = Calendar.getInstance ();
        SimpleDateFormat sdf = new SimpleDateFormat ("dd/MM/yyyy");
        cal.setTime(sdf.parse(fechaDos));
        System.out.println(cal.getTime ());
        int c = 0;
        while(cal.get(Calendar.DAY_OF_WEEK) == 0)
            c++;
        JOptionPane.showMessageDialog(null, "La cantidad de sabados entre las dos fechas es " + c);
    }
    catch(Exception e)
            {
        // TODO code application logic here
    }
    
}}
