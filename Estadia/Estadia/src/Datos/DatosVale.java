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
public class DatosVale {
   private String idVale;
   private Date Fecha;
   private String AreaSoli;
   private String ResponsableArea;

    public DatosVale() {
    }

    public DatosVale(String idVale, Date Fecha, String AreaSoli, String ResponsableArea) {
        this.idVale = idVale;
        this.Fecha = Fecha;
        this.AreaSoli = AreaSoli;
        this.ResponsableArea = ResponsableArea;
    }

    public String getIdVale() {
        return idVale;
    }

    public Date getFecha() {
        return Fecha;
    }

    public String getAreaSoli() {
        return AreaSoli;
    }

    public String getResponsableArea() {
        return ResponsableArea;
    }

    public void setIdVale(String idVale) {
        this.idVale = idVale;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public void setAreaSoli(String AreaSoli) {
        this.AreaSoli = AreaSoli;
    }

    public void setResponsableArea(String ResponsableArea) {
        this.ResponsableArea = ResponsableArea;
    }
   
   
}
