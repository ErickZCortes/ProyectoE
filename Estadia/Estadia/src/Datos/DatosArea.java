/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Mayra
 */
public class DatosArea {
    private String idArea;
    private String Nombre;
    private String Clave_pres;
    private String domicilio;
    private String Telefono;

    public DatosArea() {
    }

    public DatosArea(String idArea, String Nombre, String Clave_pres, String domicilio, String Telefono) {
        this.idArea = idArea;
        this.Nombre = Nombre;
        this.Clave_pres = Clave_pres;
        this.domicilio = domicilio;
        this.Telefono = Telefono;
    }

    public String getIdArea() {
        return idArea;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getClave_pres() {
        return Clave_pres;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setClave_pres(String Clave_pres) {
        this.Clave_pres = Clave_pres;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }
    
    
}
