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
    private String Clave_inst;
    private String Clave_ctt;

    public DatosArea() {
    }

    public DatosArea(String idArea, String Nombre, String Clave_inst, String Clave_ctt) {
        this.idArea = idArea;
        this.Nombre = Nombre;
        this.Clave_inst = Clave_inst;
        this.Clave_ctt = Clave_ctt;
    }

    public String getIdArea() {
        return idArea;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getClave_inst() {
        return Clave_inst;
    }

    public String getClave_ctt() {
        return Clave_ctt;
    }

    public void setIdArea(String idArea) {
        this.idArea = idArea;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setClave_inst(String Clave_inst) {
        this.Clave_inst = Clave_inst;
    }

    public void setClave_ctt(String Clave_ctt) {
        this.Clave_ctt = Clave_ctt;
    }
    
}