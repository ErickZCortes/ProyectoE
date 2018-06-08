package Datos;

import java.sql.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Mayra
 */
public class DatosAltaBien {
    private String idAltaBien;
    private String nInventario;
    private String area;
    private Date FechaAd;
    private String FormaAd;
    private String descripcion;
    private String cantidad;
    private String marca;
    private String modelo;
    private String serie;
    private String valor;

    public DatosAltaBien() {
    }

    public DatosAltaBien(String idAltaBien, String nInventario, String area, Date FechaAd, String FormaAd, String descripcion, String cantidad, String marca, String modelo, String serie, String valor) {
        this.idAltaBien = idAltaBien;
        this.nInventario = nInventario;
        this.area = area;
        this.FechaAd = FechaAd;
        this.FormaAd = FormaAd;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.valor = valor;
    }

    public String getIdAltaBien() {
        return idAltaBien;
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

    public String getFormaAd() {
        return FormaAd;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCantidad() {
        return cantidad;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getSerie() {
        return serie;
    }

    public String getValor() {
        return valor;
    }

    public void setIdAltaBien(String idAltaBien) {
        this.idAltaBien = idAltaBien;
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

    public void setFormaAd(String FormaAd) {
        this.FormaAd = FormaAd;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
    
    
    
}