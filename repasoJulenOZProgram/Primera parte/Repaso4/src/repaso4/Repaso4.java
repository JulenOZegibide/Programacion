/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso4;

import javax.swing.JOptionPane;

/**
 *
 * @author 1gdaw02
 */
public class Repaso4 {

    /**
     * @param args the command line arguments
     */
    private static int[]notas;
    private static String[]tiponotas;     
    private static String[]alumnos;    
    private static int pos;
    
    public static void main(String[] args) {
        notas=new int[10];
        alumnos=new String[10];
        
        tiponotas=new String[5];
        tiponotas[0]="Insuficiente";
        tiponotas[1]="Suficiente";
        tiponotas[2]="Bien";
        tiponotas[3]="Notable";
        tiponotas[4]="Sobresaliente";
        
        IntroducirDatos();
        
        SalidaDatos();
    }
    public static void IntroducirDatos(){
        for(int x=0;x<alumnos.length;x++){
            alumnos[x]=JOptionPane.showInputDialog(null, "Introduce el nombre del alumno");
            notas[x]=Integer.parseInt(JOptionPane.showInputDialog(null, "Introduce la nota del alumno"));
                
            }
        }
    
     public static void SalidaDatos(){
        for(int x=0;x<alumnos.length;x++){

            if (notas[x]< 5)
                pos = 0;
            else
                if (notas[x]< 7)
                pos = 1;
            else
                if (notas[x]< 9)
                pos = 2;    
            else
                if (notas[x]> 10)
                pos = 3;  
            
            JOptionPane.showMessageDialog(null, "Las notas de los alumnos son " + alumnos[x] +" "+ tiponotas[pos]);    
            }
        }
    
}
