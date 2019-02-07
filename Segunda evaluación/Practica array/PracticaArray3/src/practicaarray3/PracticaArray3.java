/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaarray3;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaArray3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int sumaenero = 0;
        int sumafebrero = 0;
        int sumamarzo = 0;
        int sumaabril = 0;
        int sumamayo = 0;
        int sumajunio = 0;
        int sumajulio = 0;
        int sumaagosto = 0;
        int sumaseptiembre = 0;
        int sumaoctubre = 0;
        int sumanoviembre = 0;
        int sumadiciembre = 0;
        String [] meses = {"enero", "febrero","marzo","abril" ,"mayo" ,"junio" ,"julio" ,"agosto" ,"septiembre","octubre" ,"noviembre" ,"diciembre"};  
        int [] dias = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31};
        int litros;
        String continuar;
        String mes = JOptionPane.showInputDialog("introduce un mes");
        do{
        if(mes=="enero")
        {
            litros = Integer.parseInt(JOptionPane.showInputDialog("Introduce los litros"));
            sumaenero = sumaenero + litros;
        }
        continuar = JOptionPane.showInputDialog("Quieres continuar");
        
           
        while(continuar=="si")
        
        
        
        
        
       // TODO code application logic here
    
    

