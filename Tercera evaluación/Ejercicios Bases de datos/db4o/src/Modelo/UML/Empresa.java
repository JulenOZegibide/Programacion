package Modelo.UML;

public class Empresa {
    
    private String nif;
    private String nombre;
    private String razonSocial;
    private String cnae;
    
    // No hago la relación bidireccional
    // private ArrayList<Persona> listaTrabajadores;

    public Empresa(String nif, String nombre, String razonSocial, String cnae) {
        this.nif = nif;
        this.nombre = nombre;
        this.razonSocial = razonSocial;
        this.cnae = cnae;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCnae() {
        return cnae;
    }

    public void setCnae(String cnae) {
        this.cnae = cnae;
    } 
    public Empresa() {
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

  
}
