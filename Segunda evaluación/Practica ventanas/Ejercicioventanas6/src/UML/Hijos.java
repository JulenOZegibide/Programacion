/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author 1gdaw02
 */
public class Hijos {
    public String nombre;
    public String fecha;
    
    public Hijos(String nombre, String fecha) {
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public Hijos() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
