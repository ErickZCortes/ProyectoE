/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import java.sql.Date;

/**
 *
 * @author Mayra
 */
public class DatosValeAlmacen {
    private int idVale;
   private String Fecha;
   private int idPersona;
   private String nombrePersona;
   private String AreaSoli;
   private String ResponsableArea;

    public DatosValeAlmacen() {
    }

    public DatosValeAlmacen(int idVale, String Fecha, int idPersona, String nombrePersona, String AreaSoli, String ResponsableArea) {
        this.idVale = idVale;
        this.Fecha = Fecha;
        this.idPersona = idPersona;
        this.nombrePersona = nombrePersona;
        this.AreaSoli = AreaSoli;
        this.ResponsableArea = ResponsableArea;
    }

    public int getIdVale() {
        return idVale;
    }

    public String getFecha() {
        return Fecha;
    }

    public int getIdPersona() {
        return idPersona;
    }

    public String getNombrePersona() {
        return nombrePersona;
    }

    public String getAreaSoli() {
        return AreaSoli;
    }

    public String getResponsableArea() {
        return ResponsableArea;
    }

    public void setIdVale(int idVale) {
        this.idVale = idVale;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    public void setNombrePersona(String nombrePersona) {
        this.nombrePersona = nombrePersona;
    }

    public void setAreaSoli(String AreaSoli) {
        this.AreaSoli = AreaSoli;
    }

    public void setResponsableArea(String ResponsableArea) {
        this.ResponsableArea = ResponsableArea;
    }

}
