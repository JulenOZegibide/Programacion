/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso6;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw02
 */
public class Repaso6 {

    /**
     * @param args the command line arguments
     */
    private static ArrayList textos;
    private static int salir;
    public static void main(String[] args) {
        textos=new ArrayList();
        
        do{
            String caracter=JOptionPane.showInputDialog(null, "Introduce el caracter que quieras");
            textos.add(caracter);
            salir=JOptionPane.showConfirmDialog(null, "Desea continuar");
        }while(salir==0);
        
        Collections.reverse(textos);
        JOptionPane.showMessageDialog(null, "El ArrayList invertido es este"+ textos.toString());
        
    }
    
}
