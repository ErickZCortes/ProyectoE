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
public class DatosDetalleValeAlmacen {

    private int id_detalle;
    private int id_vale;
    private int id_consumible;
    private String nombre_consumible;
    private int cantidad_solici;
    private String unidad_consumible;
    private int cantidad_entregada;

    public DatosDetalleValeAlmacen() {
    }

    public DatosDetalleValeAlmacen(int id_detalle, int id_vale, int id_consumible, String nombre_consumible, int cantidad_solici, String unidad_consumible, int cantidad_entregada) {
        this.id_detalle = id_detalle;
        this.id_vale = id_vale;
        this.id_consumible = id_consumible;
        this.nombre_consumible = nombre_consumible;
        this.cantidad_solici = cantidad_solici;
        this.unidad_consumible = unidad_consumible;
        this.cantidad_entregada = cantidad_entregada;
    }

    public int getId_detalle() {
        return id_detalle;
    }

    public int getId_vale() {
        return id_vale;
    }

    public int getId_consumible() {
        return id_consumible;
    }

    public String getNombre_consumible() {
        return nombre_consumible;
    }

    public int getCantidad_solici() {
        return cantidad_solici;
    }

    public String getUnidad_consumible() {
        return unidad_consumible;
    }

    public int getCantidad_entregada() {
        return cantidad_entregada;
    }

    public void setId_detalle(int id_detalle) {
        this.id_detalle = id_detalle;
    }

    public void setId_vale(int id_vale) {
        this.id_vale = id_vale;
    }

    public void setId_consumible(int id_consumible) {
        this.id_consumible = id_consumible;
    }

    public void setNombre_consumible(String nombre_consumible) {
        this.nombre_consumible = nombre_consumible;
    }

    public void setCantidad_solici(int cantidad_solici) {
        this.cantidad_solici = cantidad_solici;
    }

    public void setUnidad_consumible(String unidad_consumible) {
        this.unidad_consumible = unidad_consumible;
    }

    public void setCantidad_entregada(int cantidad_entregada) {
        this.cantidad_entregada = cantidad_entregada;
    }
}
