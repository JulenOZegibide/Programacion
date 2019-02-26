/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class Equipo {
    private String Nomequipo;
    private String escudo;
    private Character genero;
    private ArrayList<jugador>listajugadores;

    public String getNomequipo() {
        return Nomequipo;
    }

    public void setNomequipo(String Nomequipo) {
        this.Nomequipo = Nomequipo;
    }

    public String getEscudo() {
        return escudo;
    }

    public void setEscudo(String escudo) {
        this.escudo = escudo;
    }

    public ArrayList<jugador> getListajugadores() {
        return listajugadores;
    }

    public void setListajugadores(ArrayList<jugador> listajugadores) {
        this.listajugadores = listajugadores;
    }

    public Equipo(String Nomequipo, String escudo, ArrayList<jugador> listajugadores) {
        this.Nomequipo = Nomequipo;
        this.escudo = escudo;
        this.listajugadores = listajugadores;
        this.genero=genero;
    }

    public Character getGenero() {
        return genero;
    }

    public void setGenero(Character genero) {
        this.genero = genero;
    }

    public Equipo() {
    }
}
