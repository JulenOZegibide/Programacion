/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarray1;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaArray1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    float[] elementos = new float[10];
    
        float max;
        float min;
 
		min=max=elementos[0];
                
		for(int x = 0; x < elementos.length; x++)
		{
                    elementos[x] = Float.parseFloat(JOptionPane.showInputDialog("Introduce la posicion del elemento x"));
			if(min>elementos[x])
			{
				min=elementos[x];
			}
			if(max<elementos[x])
			{
				max=elementos[x];
			}
		}
 
		JOptionPane.showMessageDialog(null ,"El máximo es " + max + " y el minimo es " + min);
	}
}
        // TODO code application logic here
    
    

