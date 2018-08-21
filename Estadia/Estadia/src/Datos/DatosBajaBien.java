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
    private int idBajaBien;
    private String nInventario;
    private String area;
    private String FechaAd;
    private int idBien;
    private int valor;
    private String descripcion;
    private int cantidad;
    private String fechaBaja;
    private String causa;

    public DatosBajaBien() {
    }

    public DatosBajaBien(int idBajaBien, String nInventario, String area, String FechaAd, int idBien, int valor, String descripcion, int cantidad, String fechaBaja, String causa) {
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

    public int getIdBajaBien() {
        return idBajaBien;
    }

    public String getnInventario() {
        return nInventario;
    }

    public String getArea() {
        return area;
    }

    public String getFechaAd() {
        return FechaAd;
    }

    public int getIdBien() {
        return idBien;
    }

    public int getValor() {
        return valor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getFechaBaja() {
        return fechaBaja;
    }

    public String getCausa() {
        return causa;
    }

    public void setIdBajaBien(int idBajaBien) {
        this.idBajaBien = idBajaBien;
    }

    public void setnInventario(String nInventario) {
        this.nInventario = nInventario;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public void setFechaAd(String FechaAd) {
        this.FechaAd = FechaAd;
    }

    public void setIdBien(int idBien) {
        this.idBien = idBien;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setFechaBaja(String fechaBaja) {
        this.fechaBaja = fechaBaja;
    }

    public void setCausa(String causa) {
        this.causa = causa;
    }
    
}
