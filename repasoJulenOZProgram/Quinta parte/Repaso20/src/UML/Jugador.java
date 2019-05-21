/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

/**
 *
 * @author 1gdaw01
 */
public class Jugador {
   private String nombre;
   private String puesto;
   private Equipo equipo;

    public Jugador(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public Jugador(String nombre, String puesto, Equipo equipo) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.equipo = equipo;
    }

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
