/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicatres3;

/**
 *
 * @author 1gdaw08
 */
import javax.swing.JOptionPane;
public class PracticaTres3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       boolean error = true;
       int opcion =  Integer.parseInt(JOptionPane.showInputDialog("1.- Sumar dos numeros \n2.- restar dos numeros\n3.- visualizar la tabla de multiplicar de un numero\n4.-Visualizar el cociente y el resto de una division\n5.-Salir del programa\nTeclea un opcion"));
       switch (opcion){
           case 1:
           {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
            int suma = num1 + num2;
            JOptionPane.showMessageDialog(null, "La suma de los dos numeros es " + suma );
            error = true;
           }
           break;
           
           case 2:
           {
            int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero"));
            int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce otro numero"));
            int resta = num1 - num2;
            JOptionPane.showMessageDialog(null, "La resta de los dos numeros es " + resta );
            error = true;
           }
           break;
           case 3:
           {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce el numero que quieres multiplicar"));
            int c=0;
            String serie = " ";
            int multi;
            while(c<11)
            {
                multi= numero * c;
                serie = serie + multi + " ";
                c++;
                error = true;
            }
            JOptionPane.showMessageDialog(null,serie);
            break;
           }
            case 4:
            
                int division, resto;
                int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero "));
                int divisor = Integer.parseInt(JOptionPane.showInputDialog("Introduce un divisor "));
                division = numero/divisor;
                resto = numero%divisor;
                JOptionPane.showMessageDialog(null,"la division es " + division + " y el resto es " + resto);
                error = true;
            
                break;
            
             case 5:
             {
             error = false;
             }
             break;
    
    
       
           }
                 
           
            
           
        
        
        // TODO code application logic here
    }
    
}
