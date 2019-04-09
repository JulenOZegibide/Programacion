/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author 1gdaw02
 */
public class CasoJudicial {
    private int numexpediente;
    private LocalDate fechaini;
    private LocalDate fechafin;
    private String estado;
    private ArrayList<Abogado>abogados;
    private Cliente cliente;

    public CasoJudicial() {
    }

    public CasoJudicial(int numexpediente, LocalDate fechaini, LocalDate fechafin, String estado, ArrayList<Abogado> abogados, Cliente cliente) {
        this.numexpediente = numexpediente;
        this.fechaini = fechaini;
        this.fechafin = fechafin;
        this.estado = estado;
        this.abogados = abogados;
        this.cliente = cliente;
    }

    public CasoJudicial(int numexpediente, LocalDate fechaini, String estado, Cliente cliente) {
        this.numexpediente = numexpediente;
        this.fechaini = fechaini;
        this.estado = estado;
        this.cliente = cliente;
    }

    public CasoJudicial(int numexpediente, LocalDate fechaini, String estado) {
        this.numexpediente = numexpediente;
        this.fechaini = fechaini;
        this.estado = estado;
    }

    public int getNumexpediente() {
        return numexpediente;
    }

    public void setNumexpediente(int numexpediente) {
        this.numexpediente = numexpediente;
    }

    public LocalDate getFechaini() {
        return fechaini;
    }

    public void setFechaini(LocalDate fechaini) {
        this.fechaini = fechaini;
    }

    public LocalDate getFechafin() {
        return fechafin;
    }

    public void setFechafin(LocalDate fechafin) {
        this.fechafin = fechafin;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public ArrayList<Abogado> getAbogados() {
        return abogados;
    }

    public void setAbogados(ArrayList<Abogado> abogados) {
        this.abogados = abogados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
