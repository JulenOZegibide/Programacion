/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg10;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 
        String día = JOptionPane.showInputDialog("Introduce el día");
        int n = Integer.parseInt(día);
        if(n>7||n<1)
        {
            JOptionPane.showMessageDialog(null, " El numero no esta entre 1 y 7");
        }
        else
        {
            if(n==1)
            { 
            JOptionPane.showMessageDialog(null, "Lunes");
            }
        else       
        {  
            if(n==2)
            {
            JOptionPane.showMessageDialog(null, "Martes");
            }
        else
            {
            if(n==3)
            {
            JOptionPane.showMessageDialog(null, "Miercoles");
            }    
        else
            {
            if(n==4)
            {
            JOptionPane.showMessageDialog(null, "Jueves");
            }
        else
            {
            if(n==5)
            {
            JOptionPane.showMessageDialog(null, "Viernes");
            }  
        else    
            {
            if(n==6)
            {
            JOptionPane.showMessageDialog(null, "Sabado");
            }  
        else    
            {
            if(n==7)
            {
            JOptionPane.showMessageDialog(null, "Domingo");
        }// TODO code application logic here
    }
    
}}}}}}}}
        // TODO code application logic here
    
    

