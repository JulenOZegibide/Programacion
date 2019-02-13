/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UML;

import java.time.LocalDate;

/**
 *
 * @author 1gdaw02
 */
public class Empleado {
    private String DNI;
    private String NSS;
    private String Nombre;
    private String Apellidos;
    private String Direccion;
    private String Telefono;
    private Character sexo;
    private Character estadocivil;
    private String fechaalta;
    private String numeroempleado;
    private Contrato c;
    private Departamento d;
    private Usuario u;

    public Empleado() {
    }

    public Empleado(String DNI, String NNS, String Nombre, String Apellidos, String Direccion, String Telefono, Character sexo, Character estadocivil, String fechaalta, String numeroemlpeado, Contrato c, Departamento d, Usuario u) {
        this.DNI = DNI;
        this.NSS = NSS;
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.sexo = sexo;
        this.estadocivil = estadocivil;
        this.fechaalta = fechaalta;
        this.numeroempleado = numeroemlpeado;
        this.c = c;
        this.d = d;
        this.u = u;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNSS() {
        return NSS;
    }

    public void setNSS(String NSS) {
        this.NSS = NSS;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public Character getSexo() {
        return sexo;
    }

    public void setSexo(Character sexo) {
        this.sexo = sexo;
    }

    public Character getEstadocivil() {
        return estadocivil;
    }

    public void setEstadocivil(Character estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getFechaalta() {
        return fechaalta;
    }

    public void setFechaalta(String fechaalta) {
        this.fechaalta = fechaalta;
    }

    public String getNumeroemlpeado() {
        return numeroempleado;
    }

    public void setNumeroemlpeado(String numeroemlpeado) {
        this.numeroempleado = numeroemlpeado;
    }

    public Contrato getC() {
        return c;
    }

    public void setC(Contrato c) {
        this.c = c;
    }

    public Departamento getD() {
        return d;
    }

    public void setD(Departamento d) {
        this.d = d;
    }

    public Usuario getU() {
        return u;
    }

    public void setU(Usuario u) {
        this.u = u;
    }
    
}
