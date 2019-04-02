/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package t9p2e1.db40.y.bdrelacional;

import GUI.*;

/**
 *
 * @author 1gdaw02
 */
public class controlador {

    public static VentanaPrincipal vp;    
    public static VentanaClientes vc;
    public static VentanaAbogados va;
    public static VentanaCasos vcj;    
    public static void main(String[] args) {
        vp=new VentanaPrincipal();
        vp.setVisible(true);
    }

    public static void visualizarventanaclientes() {
        vp.setVisible(false);
        
        vc=new VentanaClientes();
        vc.setVisible(true);
    }

    public static void visualizarventanaabogados() {
        vp.setVisible(false);
        
        va=new VentanaAbogados();
        va.setVisible(true);
    }
    public static void visualizarventanacasos() {
        vp.setVisible(false);
        
        vcj=new VentanaCasos();
        vcj.setVisible(true);
    }    

    public static void salir() {
        vp.setVisible(false);
        System.exit(0);
    }
}
