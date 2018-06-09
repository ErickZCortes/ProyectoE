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
public class DatosBajaBien {
    private String idBajaBien;
    private String nInventario;
    private String area;
    private Date FechaAd;
    private String idBien;
    private String valor;
    private String descripcion;
    private String cantidad;
    private Date fechaBaja;
    private String causa;

    public DatosBajaBien() {
    }

    public DatosBajaBien(String idBajaBien, String nInventario, String area, Date FechaAd, String idBien, String valor, String descripcion, String cantidad, Date fechaBaja, String causa) {
        this.idBajaBien = idBajaBien;
        this.nInventario = nInventario;
        this.area = area;
        this.FechaAd = FechaAd;
        this.idBien = idBien;
        this.valor = valor;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.fechaBaja = fechaBaja;
        this.causa = causa;
    }
    
    public String getIdBajaBien() {
        return idBajaBien;
    }

    public String getnInventario() {
        return nInventario;
    }

    public String getArea() {
        return area;
    }

    public Date getFechaAd() {
        return FechaAd;
    }

    public String getIdBien() {
        return idBien;
    }
    
    public String getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }
    
    public Date getFechaBaja() {
        return fechaBaja;
    }

    public String getCausa() {
        return causa;
    }

    public void setIdBajaBien(String idBajaBien) {
        this.idBajaBien = idBajaBien;
    }

    public void setnInventario(String nInventario) {
        this.nInventario = nInventario;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setFechaAd(Date FechaAd) {
        this.FechaAd = FechaAd;
    }

    public void setIdBien(String idBien) {
        this.idBien = idBien;
    }
    
    public void setValor(String valor) {
        this.valor = valor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }
    
    public void setFechaBaja(Date fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
    
}
