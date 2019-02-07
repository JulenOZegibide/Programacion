/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarray2;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaArray2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String [] meses = new String [12];
    
        meses [0] = "enero";
        meses [1] = "febrero";
        meses [2] = "marzo";
        meses [3] = "abril";
        meses [4] = "mayo";
        meses [5] = "junio";
        meses [6] = "julio";
        meses [7] = "agosto";
        meses [8] = "septiembre";
        meses [9] = "octubre";
        meses [10] = "noviembre";
        meses [11] = "diciembre";
        
        
       
        String dato = JOptionPane.showInputDialog("Introduce un mes");
        for(int x = 0; x < meses.length; x++)
        {
        if(dato.compareToIgnoreCase(meses[x])== 0)
        {
            JOptionPane.showMessageDialog(null, "El dato del mes es correcto");
            System.exit(0);
        }
        }
            JOptionPane.showMessageDialog(null, "El dato del mes es incorrecto");
    
       
    }
            
        //String[] meses = {"Enero", "febrero","marzo","abril" ,"mayo" ,"junio" ,"julio" ,"agosto" ,"septiembre","octubre" ,"noviembre" ,"diciembre"};  
        
        // TODO code application logic here
    }
    

