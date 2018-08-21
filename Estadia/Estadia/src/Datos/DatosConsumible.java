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
public class DatosConsumible {
   private int IdConsumible;
   private String Categoria;
   private String Nombre;
   private String FechaC;
   private int Existencia;
   private int stockM;
   private int Valor;
   private String unidad;

    public DatosConsumible() {
    }

    public DatosConsumible(int IdConsumible, String Categoria, String Nombre, String FechaC, int Existencia, int stockM, int Valor, String unidad) {
        this.IdConsumible = IdConsumible;
        this.Categoria = Categoria;
        this.Nombre = Nombre;
        this.FechaC = FechaC;
        this.Existencia = Existencia;
        this.stockM = stockM;
        this.Valor = Valor;
        this.unidad = unidad;
    }

    public int getIdConsumible() {
        return IdConsumible;
    }

    public String getCategoria() {
        return Categoria;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public String getFechaC() {
        return FechaC;
    }

    public int getExistencia() {
        return Existencia;
    }

    public int getStockM() {
        return stockM;
    }

    public int getValor() {
        return Valor;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setIdConsumible(int IdConsumible) {
        this.IdConsumible = IdConsumible;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFechaC(String FechaC) {
        this.FechaC = FechaC;
    }

    public void setExistencia(int Existencia) {
        this.Existencia = Existencia;
    }

    public void setStockM(int stockM) {
        this.stockM = stockM;
    }

    public void setValor(int Valor) {
        this.Valor = Valor;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }   
}