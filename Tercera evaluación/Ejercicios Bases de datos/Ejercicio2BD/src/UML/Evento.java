/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author MARTA
 */
public class Evento {
    private String nombre;
    private String lugar;
    private LocalDate fecha;
    private LocalTime fechainicio;
    private LocalTime fechafin;
    private int aforomax;
    public int getAforomax;

    public Evento(String nombre, String lugar, LocalDate fecha, LocalTime fechainicio, LocalTime fechafin, int aforomax) {
        this.nombre = nombre;
        this.lugar = lugar;
        this.fecha = fecha;
        this.fechainicio = fechainicio;
        this.fechafin = fechafin;
        this.aforomax = aforomax;
    }

    public Evento() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalTime getFechainicio() {
        return fechainicio;
    }

    public void setFechainicio(LocalTime fechainicio) {
        this.fechainicio = fechainicio;
    }

    public LocalTime getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalTime fechafin) {
        this.fechafin = fechafin;
    }

    public int getAforomax() {
        return aforomax;
    }

    public void setAforomax(int aforomax) {
        this.aforomax = aforomax;
    }
    
}
