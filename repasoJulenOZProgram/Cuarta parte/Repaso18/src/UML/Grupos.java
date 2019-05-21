/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw01
 */
public class Grupos {
    private String idgrupo;
    private String nombre;
    private String nointegrantes;
    private Docente docente;
    private ArrayList<Alumnos> listaalumnos;
    private ArrayList<Asignaturas> listaasignaturas; 

    public Grupos() {
    }

    public Grupos(String idgrupo, String nombre, String nointegrantes, Docente docente, ArrayList<Alumnos> listaalumnos, ArrayList<Asignaturas> listaasignaturas) {
        this.idgrupo = idgrupo;
        this.nombre = nombre;
        this.nointegrantes = nointegrantes;
        this.docente = docente;
        this.listaalumnos = listaalumnos;
        this.listaasignaturas = listaasignaturas;
    }

    public String getIdgrupo() {
        return idgrupo;
    }

    public void setIdgrupo(String idgrupo) {
        this.idgrupo = idgrupo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNointegrantes() {
        return nointegrantes;
    }

    public void setNointegrantes(String nointegrantes) {
        this.nointegrantes = nointegrantes;
    }

    public Docente getDocente() {
        return docente;
    }

    public void setDocente(Docente docente) {
        this.docente = docente;
    }

    public ArrayList<Alumnos> getListaalumnos() {
        return listaalumnos;
    }

    public void setListaalumnos(ArrayList<Alumnos> listaalumnos) {
        this.listaalumnos = listaalumnos;
    }

    public ArrayList<Asignaturas> getListaasignaturas() {
        return listaasignaturas;
    }

    public void setListaasignaturas(ArrayList<Asignaturas> listaasignaturas) {
        this.listaasignaturas = listaasignaturas;
    }
    
    public void altas(){
        
    }
    
    public void modificacion(){
        
    }
    
    public void bajas(){
        
    }   
}
