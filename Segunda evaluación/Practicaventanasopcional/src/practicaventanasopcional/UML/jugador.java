/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicaventanasopcional.UML;
import practicaventanasopcional.*;
/**
 *
 * @author 1gdaw02
 */
public class jugador {
    private String Nombre;
    private String Posicion;
    private String numero;

    public jugador(String Nombre, String Posicion, String numero) {
        this.Nombre = Nombre;
        this.Posicion = Posicion;
        this.numero = numero;
    }

    public jugador() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPosicion() {
        return Posicion;
    }

    public void setPosicion(String Posicion) {
        this.Posicion = Posicion;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
}
