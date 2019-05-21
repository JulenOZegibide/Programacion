

package repaso16;

import UML.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;


 
public class Repaso16 {

  private static Persona p; 
  private static int colapersonas;
  private static ArrayList<Persona> listacola;
  private static double total;
    public static void main(String[] args) {
        colapersonas=(int) (Math.random()*(50-0));
        
        listacola=new ArrayList();
        
        for(int x=0; x<colapersonas;x++){
            p=new Persona();
            p.setEdad((int) (Math.random()*(60-5)));
            listacola.add(p);
        }
        
        for(int x=0; x<listacola.size();x++){
            if(listacola.get(x).getEdad()<=10){
                total=total+1;
                listacola.remove(listacola.get(x));
            }
            else
                if(listacola.get(x).getEdad()<=17){
                    total=total+2.5;
                    listacola.remove(listacola.get(x));
                }
            else
                if(listacola.get(x).getEdad()>=18){
                    total=total+5;
                    listacola.remove(listacola.get(x));
                }
        }
        JOptionPane.showMessageDialog(null, "El total de dinero recaudado es de "+total);
    }
    
}
