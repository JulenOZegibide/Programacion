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
public class Asignaturas {
    private String idasig;
    private String nombres;
    private String creditos;
    private String objetivo;
    private String unidades;
    private Grupos grupo;
    private Alumnos alumno;
    private ArrayList<Unidades> listaunidades;

    public Asignaturas() {
    }

    public Asignaturas(String idasig, String nombres, String creditos, String objetivo, String unidades, Grupos grupo, Alumnos alumno, ArrayList<Unidades> listaunidades) {
        this.idasig = idasig;
        this.nombres = nombres;
        this.creditos = creditos;
        this.objetivo = objetivo;
        this.unidades = unidades;
        this.grupo = grupo;
        this.alumno = alumno;
        this.listaunidades = listaunidades;
    }

    public String getIdasig() {
        return idasig;
    }

    public void setIdasig(String idasig) {
        this.idasig = idasig;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getCreditos() {
        return creditos;
    }

    public void setCreditos(String creditos) {
        this.creditos = creditos;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getUnidades() {
        return unidades;
    }

    public void setUnidades(String unidades) {
        this.unidades = unidades;
    }

    public Grupos getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupos grupo) {
        this.grupo = grupo;
    }

    public Alumnos getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumnos alumno) {
        this.alumno = alumno;
    }

    public ArrayList<Unidades> getListaunidades() {
        return listaunidades;
    }

    public void setListaunidades(ArrayList<Unidades> listaunidades) {
        this.listaunidades = listaunidades;
    }
    
    public void altas(){
        
    }
    
    public void modificacion(){
        
    }
    
    public void bajas(){
        
    }      
}
