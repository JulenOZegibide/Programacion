/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioventanas1;

import ventanas.Ventana1;

/**
 *
 * @author 1gdaw02
 */

public class EjercicioVentanas1 {

    /**
     * @param args the command line arguments
     */
    private static Ventana1 v;
    public static void main(String[] args) {
        // TODO code application logic here
        v = new Ventana1();
        v.setVisible(true);
    }
    public static void salir(){
        v.dispose();
        System.exit(0);
        
}
}
