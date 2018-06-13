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
public class DatosDetalleResguardo {

    private int id_detaller;
    private int id_valer;
    private int id_bien;
    private int num_ref;
    private String nombre_b;
    private String n_inventario;
    private String marca_b;
    private String modelo_b;
    private String serie_b;
    private int valor_b;

    public DatosDetalleResguardo() {
    }

    public DatosDetalleResguardo(int id_detaller, int id_valer, int id_bien, int num_ref, String nombre_b, String n_inventario, String marca_b, String modelo_b, String serie_b, int valor_b) {
        this.id_detaller = id_detaller;
        this.id_valer = id_valer;
        this.id_bien = id_bien;
        this.num_ref = num_ref;
        this.nombre_b = nombre_b;
        this.n_inventario = n_inventario;
        this.marca_b = marca_b;
        this.modelo_b = modelo_b;
        this.serie_b = serie_b;
        this.valor_b = valor_b;
    }

    public int getId_detaller() {
        return id_detaller;
    }

    public int getId_valer() {
        return id_valer;
    }

    public int getId_bien() {
        return id_bien;
    }

    public int getNum_ref() {
        return num_ref;
    }

    public String getNombre_b() {
        return nombre_b;
    }

    public String getN_inventario() {
        return n_inventario;
    }

    public String getMarca_b() {
        return marca_b;
    }

    public String getModelo_b() {
        return modelo_b;
    }

    public String getSerie_b() {
        return serie_b;
    }

    public int getValor_b() {
        return valor_b;
    }

    public void setId_detaller(int id_detaller) {
        this.id_detaller = id_detaller;
    }

    public void setId_valer(int id_valer) {
        this.id_valer = id_valer;
    }

    public void setId_bien(int id_bien) {
        this.id_bien = id_bien;
    }

    public void setNum_ref(int num_ref) {
        this.num_ref = num_ref;
    }

    public void setNombre_b(String nombre_b) {
        this.nombre_b = nombre_b;
    }

    public void setN_inventario(String n_inventario) {
        this.n_inventario = n_inventario;
    }
    
    public void setMarca_b(String marca_b) {
        this.marca_b = marca_b;
    }

    public void setModelo_b(String modelo_b) {
        this.modelo_b = modelo_b;
    }

    public void setSerie_b(String serie_b) {
        this.serie_b = serie_b;
    }

    public void setValor_b(int valor_b) {
        this.valor_b = valor_b;
    }

    
}
