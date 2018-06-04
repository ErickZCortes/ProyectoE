/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

/**
 *
 * @author Mayra
 */
public class DatosDetalleVale {

    private String id_detalle;
    private String id_vale;
    private String id_persona;
    private String id_consumible;
    private int num_referencia;
    private String nombre_consumible;
    private String cantidad_solici;
    private String unidad_consumible;
    private String cantidad_entregada;

    public DatosDetalleVale() {
    }

    
    public DatosDetalleVale(String id_detalle, String id_vale, String id_persona, String id_consumible, int num_referencia, String nombre_consumible, String cantidad_solici, String unidad_consumible, String cantidad_entregada) {
        this.id_detalle = id_detalle;
        this.id_vale = id_vale;
        this.id_persona = id_persona;
        this.id_consumible = id_consumible;
        this.num_referencia = num_referencia;
        this.nombre_consumible = nombre_consumible;
        this.cantidad_solici = cantidad_solici;
        this.unidad_consumible = unidad_consumible;
        this.cantidad_entregada = cantidad_entregada;
    }

    public String getId_detalle() {
        return id_detalle;
    }

    public String getId_vale() {
        return id_vale;
    }

    public String getId_persona() {
        return id_persona;
    }

    public String getId_consumible() {
        return id_consumible;
    }

    public int getNum_referencia() {
        return num_referencia;
    }

    public String getNombre_consumible() {
        return nombre_consumible;
    }

    public String getCantidad_solici() {
        return cantidad_solici;
    }

    public String getUnidad_consumible() {
        return unidad_consumible;
    }

    public String getCantidad_entregada() {
        return cantidad_entregada;
    }

    public void setId_detalle(String id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setId_vale(String id_vale) {
        this.id_vale = id_vale;
    }

    public void setId_persona(String id_persona) {
        this.id_persona = id_persona;
    }

    public void setId_consumible(String id_consumible) {
        this.id_consumible = id_consumible;
    }

    public void setNum_referencia(int num_referencia) {
        this.num_referencia = num_referencia;
    }

    public void setNombre_consumible(String nombre_consumible) {
        this.nombre_consumible = nombre_consumible;
    }

    public void setCantidad_solici(String cantidad_solici) {
        this.cantidad_solici = cantidad_solici;
    }

    public void setUnidad_consumible(String unidad_consumible) {
        this.unidad_consumible = unidad_consumible;
    }

    public void setCantidad_entregada(String cantidad_entregada) {
        this.cantidad_entregada = cantidad_entregada;
    }

    

}
