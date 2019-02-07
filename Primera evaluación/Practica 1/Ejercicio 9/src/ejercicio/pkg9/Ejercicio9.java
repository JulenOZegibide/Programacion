/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg9;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nota = JOptionPane.showInputDialog("Introduce la nota");
        int n = Integer.parseInt(nota);
        if(n>10||n<0)
        {
            JOptionPane.showMessageDialog(null, " El numero no esta entre 0 y 10");
        }
        else
        {
            if(n>=0&&n<3 )
            { 
            JOptionPane.showMessageDialog(null, "muy deficiente");
            }
        else       
        {  
            if(n>=3 && n<5)
            {
            JOptionPane.showMessageDialog(null, "deficiente");
            }
        else
            {
            if(n>=5 && n<6)
            {
            JOptionPane.showMessageDialog(null, "suficiente");
            }    
        else
            {
            if(n>=6 && n<7)
            {
            JOptionPane.showMessageDialog(null, "Bien");
            }
        else
            {
            if(n>=7 && n<9)
            {
            JOptionPane.showMessageDialog(null, "Notable");
            }  
        else    
            {
            if(n>=9 && n<=10)
            {
            JOptionPane.showMessageDialog(null, "sobresaliente");
            }    
        }// TODO code application logic here
    }
    
}}}}}}
