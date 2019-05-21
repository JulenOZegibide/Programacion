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
public class Equipo {
    private String nombre;
    private String puesto;
    private ArrayList<Jugador>listajugadores;

    public Equipo(String nombre, String puesto) {
        this.nombre = nombre;
        this.puesto = puesto;
    }

    public Equipo() {
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

    public ArrayList<Jugador> getListajugadores() {
        return listajugadores;
    }

    public void setListajugadores(ArrayList<Jugador> listajugadores) {
        this.listajugadores = listajugadores;
    }
}
