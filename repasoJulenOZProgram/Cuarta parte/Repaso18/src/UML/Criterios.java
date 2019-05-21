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
public class Criterios {
    private String idcrit;
    private String descripcion;
    private String valor;

    public Criterios() {
    }

    public Criterios(String idcrit, String descripcion, String valor) {
        this.idcrit = idcrit;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    public String getIdcrit() {
        return idcrit;
    }

    public void setIdcrit(String idcrit) {
        this.idcrit = idcrit;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    public void altas(){
        
    }
    
    public void modificacion(){
        
    }
    
    public void bajas(){
        
    }       
}
