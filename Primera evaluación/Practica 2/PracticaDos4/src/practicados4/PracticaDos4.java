/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicados4;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
public class PracticaDos4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Date fechaUno = new Date();
    System.out.println("La primera fecha es: " + fechaUno ); 
    //El año empieza por el 1900, y los meses van del 0 al 11/
    Date fechaDos = new Date(118,9,10);
    System.out.println("La segunda fecha es: " + fechaDos );
    Long milisegundos = fechaUno.getTime() - fechaDos.getTime();
    Long dias = milisegundos / 86400000;
    JOptionPane.showMessageDialog(null, "La diferencia es de " + dias + " dias" );
    
    
 
        
        
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}
