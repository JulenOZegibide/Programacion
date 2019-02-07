/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class Producto {
    private String nombre;
    private Integer numUnidadesDisponibles;
    private float precio;
    private ArrayList<proveedor>listaproveedores;
    
    public Producto(String nombre, int numUnidadesDisponbles, int precio) {
        this.nombre = nombre;
        this.numUnidadesDisponibles = numUnidadesDisponbles;
        this.precio = precio;
    }

    public Producto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumUnidadesDisponbles() {
        return numUnidadesDisponibles;
    }

    public void setNumUnidadesDisponbles(int numUnidadesDisponbles) {
        this.numUnidadesDisponibles = numUnidadesDisponbles;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
