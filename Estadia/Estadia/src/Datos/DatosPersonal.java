/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Erick
 */
public class DatosPersonal {

    private String idPersonal;
    private String Clave;
    private String Nombre;
    private String CURP;
    private String Area;
    private String Cct;

    public DatosPersonal() {
    }

    public DatosPersonal(String idPersonal, String Clave, String Nombre, String CURP, String Area, String Cct) {
        this.idPersonal = idPersonal;
        this.Clave = Clave;
        this.Nombre = Nombre;
        this.CURP = CURP;
        this.Area = Area;
        this.Cct = Cct;
    }

    public String getIdPersonal() {
        return idPersonal;
    }

    public String getClave() {
        return Clave;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getCURP() {
        return CURP;
    }

    public String getArea() {
        return Area;
    }

    public String getCct() {
        return Cct;
    }

    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setCURP(String CURP) {
        this.CURP = CURP;
    }

    public void setArea(String Area) {
        this.Area = Area;
    }

    public void setCct(String Cct) {
        this.Cct = Cct;
    }
    
}
