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
   private String IdConsumible;
   private String Codigo;
   private String Nombre;
   private Date FechaC;
   private String Existencia;
   private String stockM;
   private String ValorT;

    public DatosConsumible() {
    }

    public DatosConsumible(String IdConsumible, String Codigo, String Nombre, Date FechaC, String Existencia, String stockM, String ValorT) {
        this.IdConsumible = IdConsumible;
        this.Codigo = Codigo;
        this.Nombre = Nombre;
        this.FechaC = FechaC;
        this.Existencia = Existencia;
        this.stockM = stockM;
        this.ValorT = ValorT;
    }
   
   

    public String getIdConsumible() {
        return IdConsumible;
    }

    public String getCodigo() {
        return Codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public Date getFechaC() {
        return FechaC;
    }

    public String getExistencia() {
        return Existencia;
    }

    public String getStockM() {
        return stockM;
    }
    
    public String getValorT() {
        return ValorT;
    }

    public void setIdConsumible(String IdConsumible) {
        this.IdConsumible = IdConsumible;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setFechaC(Date FechaC) {
        this.FechaC = FechaC;
    }

    public void setExistencia(String Existencia) {
        this.Existencia = Existencia;
    }

    public void setStockM(String stockM) {
        this.stockM = stockM;
    }
    
    public void setValorT(String ValorT) {
        this.ValorT = ValorT;
    }
    
}
