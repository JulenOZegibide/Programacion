/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaArray5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double vueltas;
        double[]dinero = {500,200,100,50,20,10,5,2,1,0.50,0.20,0.10,0.05,0.02,0.01};
        double importe = Double.parseDouble(JOptionPane.showInputDialog("Introduce el precio"));
        double pagado = Double.parseDouble(JOptionPane.showInputDialog("introduce con cuanto vas a pagar"));
        for(int x=0;x<dinero.length;x++)
        {
            if(importe>pagado)
            {
            JOptionPane.showMessageDialog(null, );
            }
            else
                if(pagado>importe)
                {
                    vueltas = pagado - importe;
            
                }   


        // TODO code application logic here
    }
    
}}
