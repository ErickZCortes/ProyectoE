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
public class DatosResguardo {

    private int id_valeres;
    private String fecha;
    private String plantel;
    private String ctt;
    private int clave;
    private String nombre_per;
    private String curp_pers;
    private int cant_total;
    private int valor_total;

    public DatosResguardo() {
    }

    public DatosResguardo(int id_valeres, String fecha, String plantel, String ctt, int clave, String nombre_per, String curp_pers, int cant_total, int valor_total) {
        this.id_valeres = id_valeres;
        this.fecha = fecha;
        this.plantel = plantel;
        this.ctt = ctt;
        this.clave = clave;
        this.nombre_per = nombre_per;
        this.curp_pers = curp_pers;
        this.cant_total = cant_total;
        this.valor_total = valor_total;
    }

    public int getId_valeres() {
        return id_valeres;
    }

    public String getFecha() {
        return fecha;
    }

    public String getPlantel() {
        return plantel;
    }

    public String getCtt() {
        return ctt;
    }

    public int getClave() {
        return clave;
    }

    public String getNombre_per() {
        return nombre_per;
    }

    public String getCurp_pers() {
        return curp_pers;
    }

    public int getCant_total() {
        return cant_total;
    }

    public int getValor_total() {
        return valor_total;
    }

    public void setId_valeres(int id_valeres) {
        this.id_valeres = id_valeres;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public void setPlantel(String plantel) {
        this.plantel = plantel;
    }

    public void setCtt(String ctt) {
        this.ctt = ctt;
    }

    public void setClave(int clave) {
        this.clave = clave;
    }

    public void setNombre_per(String nombre_per) {
        this.nombre_per = nombre_per;
    }

    public void setCurp_pers(String curp_pers) {
        this.curp_pers = curp_pers;
    }

    public void setCant_total(int cant_total) {
        this.cant_total = cant_total;
    }

    public void setValor_total(int valor_total) {
        this.valor_total = valor_total;
    } 
}