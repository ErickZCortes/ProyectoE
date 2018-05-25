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
public class DatosBien {
    private String idBien;
    private String nombre;
    private String caracteristica;
    private String marca;
    private String modelo;
    private String serie;
    private String valor;
    private String stock;
    private Date fechaAd;
    private String formaAd;

    public DatosBien() {
    }

    public DatosBien(String idBien, String nombre, String caracteristica, String marca, String modelo, String serie, String valor, String stock, Date fechaAd, String formaAd) {
        this.idBien = idBien;
        this.nombre = nombre;
        this.caracteristica = caracteristica;
        this.marca = marca;
        this.modelo = modelo;
        this.serie = serie;
        this.valor = valor;
        this.stock = stock;
        this.fechaAd = fechaAd;
        this.formaAd = formaAd;
    }

    public String getIdBien() {
        return idBien;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCaracteristica() {
        return caracteristica;
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

    public String getStock() {
        return stock;
    }

    public void setIdBien(String idBien) {
        this.idBien = idBien;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCaracteristica(String caracteristica) {
        this.caracteristica = caracteristica;
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

    public void setStock(String stock) {
        this.stock = stock;
    }

    public void setFechaAd(Date fechaAd) {
        this.fechaAd = fechaAd;
    }

    public void setFormaAd(String formaAd) {
        this.formaAd = formaAd;
    }

    public Date getFechaAd() {
        return fechaAd;
    }

    public String getFormaAd() {
        return formaAd;
    }
    
    
}