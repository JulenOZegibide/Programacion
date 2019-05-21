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
public class Unidades {
    private String idunid;
    private String objetivo;
    private String criterios;
    private String valorunidad;
    private ArrayList<Criterios> listacriterios;

    public Unidades() {
    }

    public Unidades(String idunid, String objetivo, String criterios, String valorunidad, ArrayList<Criterios> listacriterios) {
        this.idunid = idunid;
        this.objetivo = objetivo;
        this.criterios = criterios;
        this.valorunidad = valorunidad;
        this.listacriterios = listacriterios;
    }

    public String getIdunid() {
        return idunid;
    }

    public void setIdunid(String idunid) {
        this.idunid = idunid;
    }

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getCriterios() {
        return criterios;
    }

    public void setCriterios(String criterios) {
        this.criterios = criterios;
    }

    public String getValorunidad() {
        return valorunidad;
    }

    public void setValorunidad(String valorunidad) {
        this.valorunidad = valorunidad;
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
