/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author 1gdaw02
 */
public class estudio {
private String nombre;
private String ciudad;
private String direccion;
private String dirweb;
private Date fechafundacion;
private String pais;
private ArrayList<String>telefonos;

    public estudio(String nombre, String ciudad, String direccion, String dirweb, Date fechafundacion, String pais) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.direccion = direccion;
        this.dirweb = dirweb;
        this.fechafundacion = fechafundacion;
        this.pais = pais;
    }
    public estudio(){}
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDirweb() {
        return dirweb;
    }

    public void setDirweb(String dirweb) {
        this.dirweb = dirweb;
    }

    public Date getFechafundacion() {
        return fechafundacion;
    }

    public void setFechafundacion(Date fechafundacion) {
        this.fechafundacion = fechafundacion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public ArrayList<String> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(ArrayList<String> telefonos) {
        this.telefonos = telefonos;
    }
}