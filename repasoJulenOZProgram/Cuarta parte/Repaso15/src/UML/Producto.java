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
public class Producto {
    private String codigodebarras;
    private String nombre;
    private int cantidad;
    private int precio;

    public Producto() {
    }

    public Producto(String codigodebarras, String nombre, int cantidad, int precio) {
        this.codigodebarras = codigodebarras;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public String getCodigodebarras() {
        return codigodebarras;
    }

    public void setCodigodebarras(String codigodebarras) {
        this.codigodebarras = codigodebarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
