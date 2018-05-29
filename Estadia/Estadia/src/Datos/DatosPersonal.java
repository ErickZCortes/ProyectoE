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
    private String Nombre;
    private String CURP;
    private String Area;

    public DatosPersonal() {
    }

    public DatosPersonal(String idPersonal, String Nombre, String CURP, String Area) {
        this.idPersonal = idPersonal;
        this.Nombre = Nombre;
        this.CURP = CURP;
        this.Area = Area;
    }

    

    public String getIdPersonal() {
        return idPersonal;
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

    
    public void setIdPersonal(String idPersonal) {
        this.idPersonal = idPersonal;
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

}
