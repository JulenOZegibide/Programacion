

package repaso15;

import UML.Producto;
import java.util.ArrayList;
import javax.swing.JOptionPane;


 
public class Repaso15 {

  private static ArrayList<Producto> compra;
  private static Producto p;
  private static String nomprodcompra;
  private static int precio;
    public static void main(String[] args) {
        compra=new ArrayList();
        p=new Producto();
        compra.add(p);
        for(int x = 0;x<compra.size();x++){
            nomprodcompra=nomprodcompra + "\n" + p.getNombre();
            precio=precio + (p.getPrecio()*p.getCantidad());            
        }
        JOptionPane.showMessageDialog(null,nomprodcompra + "\n" + "                        " + precio );
    }

}
