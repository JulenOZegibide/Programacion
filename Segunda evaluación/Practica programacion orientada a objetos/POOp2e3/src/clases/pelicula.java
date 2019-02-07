/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class pelicula {
    private String titulo;
    private char año;
    private float duracion;
    private String tipo;
    private ArrayList<estudio>listaestudios;
    
    public pelicula(String titulo,char año,float duracion,String tipo){
        this.titulo = titulo;
        this.año = año;
        this.duracion = duracion;
        this.tipo = tipo;
        
    }
    public pelicula(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public char getAño() {
        return año;
    }

    public void setAño(char año) {
        this.año = año;
    }

    public float getDuracion() {
        return duracion;
    }

    public void setDuracion(float duracion) {
        this.duracion = duracion;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public ArrayList<estudio> getlistaestudios() {
    return listaestudios;
    }

    public void setTelefonos(ArrayList<estudio>listaestudios) {
        this.listaestudios = listaestudios;
    }
}
