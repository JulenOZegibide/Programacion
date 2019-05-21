

package repaso19;

import UML.Persona;
import Ventana.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;


 
public class Repaso19 {

  private static Persona p;
  private static Persona min;  
  private static int pos;
  private static String todos;
  private static ArrayList<Persona> listapersonas;
  private static Ventana v;
  private static Menu m;
    public static void main(String[] args) {
        m=new Menu();
        m.setVisible(true);
    }
    public static void Añadirpersona(String dni,String apellidos,String nombre,String sexo,String edad,String peso){
        listapersonas=new ArrayList();
        p=new Persona();
        listapersonas.add(p);
    }
    public static void Buscarpersonapordni(String dni){
        for(int x=0;x<listapersonas.size();x++){
            if(dni.equals(listapersonas.get(x).getDni()))
                JOptionPane.showMessageDialog(null, "Estos son los datos de la persona que buscas \n" +listapersonas.get(x).getDni() + "\n" +listapersonas.get(x).getApellidos() + "\n" +listapersonas.get(x).getNombre() + "\n" +listapersonas.get(x).getSexo() + "\n" +listapersonas.get(x).getEdad() + "\n" +listapersonas.get(x).getPeso());
            else
                JOptionPane.showMessageDialog(null, "El dni es incorrecto");
        }
    }
    public static void eliminarpersona(String dni){
        for(int x=0;x<listapersonas.size();x++){
            if(dni.equals(listapersonas.get(x).getDni())){
                JOptionPane.showMessageDialog(null, "Estos son los datos de la persona que vas a eliminar \n" +listapersonas.get(x).getDni() + "\n" +listapersonas.get(x).getApellidos() + "\n" +listapersonas.get(x).getNombre() + "\n" +listapersonas.get(x).getSexo() + "\n" +listapersonas.get(x).getEdad() + "\n" +listapersonas.get(x).getPeso());
                listapersonas.remove((listapersonas.get(x)));
            }
            else
                JOptionPane.showMessageDialog(null, "El dni es incorrecto");
        }  
    }
    public static void ordenarporapellidos(){
        
        /*No esta bien por que no se me ocurre como hacerlo*/
        min=new Persona();
        min.setApellidos("Zzzzz");

        for(int y=0;y<listapersonas.size();y++){
            for(int x=y;x<listapersonas.size();x++){
                if(listapersonas.get(x).getApellidos().compareTo(min.getApellidos())<0)
                {
                    min.setApellidos(listapersonas.get(x).getApellidos());
                    pos=x;
                
                }
            }
        /*
            falta esta parte por que no entiendo muy bien como tengo que hacerlo
            
            */
        }
    }   
    public static void mostrartodos(){
         for(int x=0;x<listapersonas.size();x++){
            JOptionPane.showMessageDialog(null, "Estos son los datos de la persona que vas a eliminar \n" +listapersonas.get(x).getDni() + "\n" +listapersonas.get(x).getApellidos() + "\n" +listapersonas.get(x).getNombre() + "\n" +listapersonas.get(x).getSexo() + "\n" +listapersonas.get(x).getEdad() + "\n" +listapersonas.get(x).getPeso()); 
            todos = todos + "\n" + listapersonas.get(x).getDni() + "\n" +listapersonas.get(x).getApellidos() + "\n" +listapersonas.get(x).getNombre() + "\n" +listapersonas.get(x).getSexo() + "\n" +listapersonas.get(x).getEdad() + "\n" +listapersonas.get(x).getPeso(); 
         }
    }       

    public static void cambio() {
        m.setVisible(false);
        
        v=new Ventana();
        v.setVisible(true);
    }

    public static void salir() {
        System.exit(0);
    }
}
