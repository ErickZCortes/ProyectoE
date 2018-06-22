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
    private int idAltaBien;
    private String nInventario;
    private String area;
    private Date FechaAd;
    private String FormaAd;
    private String descripcion;
    private int cantidad;
    private String marca;
    private String modelo;
    private String serie;
    private int valor;

    public DatosAltaBien() {
    }

    public DatosAltaBien(int idAltaBien, String nInventario, String area, Date FechaAd, String FormaAd, String descripcion, int cantidad, String marca, String modelo, String serie, int valor) {
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

    public int getIdAltaBien() {
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

    public int getCantidad() {
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

    public int getValor() {
        return valor;
    }

    public void setIdAltaBien(int idAltaBien) {
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

    public void setCantidad(int cantidad) {
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

    public void setValor(int valor) {
        this.valor = valor;
    }

}