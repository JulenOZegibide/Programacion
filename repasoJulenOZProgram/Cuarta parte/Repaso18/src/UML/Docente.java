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
public class Docente {
    private String iddoc;
    private String nombre;
    private String profesion;
    private String cedula;
    private String email;
    private ArrayList<Grupos> listagrupos;

    public Docente() {
    }

    public Docente(String iddoc, String nombre, String profesion, String cedula, String email,ArrayList<Grupos> listagrupos) {
        this.iddoc = iddoc;
        this.nombre = nombre;
        this.profesion = profesion;
        this.cedula = cedula;
        this.email = email;
        this.listagrupos = listagrupos;
    }

    public String getIddoc() {
        return iddoc;
    }

    public void setIddoc(String iddoc) {
        this.iddoc = iddoc;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Grupos> getListagrupos() {
        return listagrupos;
    }

    public void setListagrupos(ArrayList<Grupos> listagrupo) {
        this.listagrupos = listagrupo;
    }
    
    public void altas(){
        
    }
    
    public void modificacion(){
        
    }
    
    public void bajas(){
        
    }    
}
