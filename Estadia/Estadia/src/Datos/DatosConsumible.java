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
   private String FormaC;
   private String ValorT;
   
   public DatosConsumible(){
   }
   
   public DatosConsumible(String IdConsumible,String Codigo,String Nombre,Date FechaC, String FormaC, String ValorT){
   this.IdConsumible = IdConsumible;
   this.Codigo = Codigo;
   this.Nombre = Nombre;
   this.FechaC = FechaC;
   this.FormaC = FormaC;
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

    public String getFormaC() {
        return FormaC;
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

    public void setFormaC(String FormaC) {
        this.FormaC = FormaC;
    }

    public void setValorT(String ValorT) {
        this.ValorT = ValorT;
    }
    
}
