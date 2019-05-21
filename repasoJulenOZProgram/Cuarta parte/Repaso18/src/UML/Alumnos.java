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
public class Alumnos {
    private String idalum;
    private String matricula;
    private String nombre;
    private String apepat;
    private String apemat;
    private String direccion;
    private String edad;
    private String email;
    private ArrayList<Asignaturas> listaasignaturas;
    private Unidades unidad;
    private ArrayList<Criterios> listacriterios;

    public Alumnos() {
    }

    public Alumnos(String idalum, String matricula, String nombre, String apepat, String apemat, String direccion, String edad, String email, ArrayList<Asignaturas> listaasignaturas, Unidades unidad, ArrayList<Criterios> listacriterios) {
        this.idalum = idalum;
        this.matricula = matricula;
        this.nombre = nombre;
        this.apepat = apepat;
        this.apemat = apemat;
        this.direccion = direccion;
        this.edad = edad;
        this.email = email;
        this.listaasignaturas = listaasignaturas;
        this.unidad = unidad;
        this.listacriterios = listacriterios;
    }

    public String getIdalum() {
        return idalum;
    }

    public void setIdalum(String idalum) {
        this.idalum = idalum;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApepat() {
        return apepat;
    }

    public void setApepat(String apepat) {
        this.apepat = apepat;
    }

    public String getApemat() {
        return apemat;
    }

    public void setApemat(String apemat) {
        this.apemat = apemat;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Asignaturas> getListaasignaturas() {
        return listaasignaturas;
    }

    public void setListaasignaturas(ArrayList<Asignaturas> listaasignaturas) {
        this.listaasignaturas = listaasignaturas;
    }

    public Unidades getUnidad() {
        return unidad;
    }

    public void setUnidad(Unidades unidad) {
        this.unidad = unidad;
    }

    public ArrayList<Criterios> getListacriterios() {
        return listacriterios;
    }

    public void setListacriterios(ArrayList<Criterios> listacriterios) {
        this.listacriterios = listacriterios;
    }
    
    public void altas(){
        
    }
    
    public void modificacion(){
        
    }
    
    public void bajas(){
        
    }       
}
