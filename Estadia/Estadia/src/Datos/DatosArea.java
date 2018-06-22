/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Datos;

import Modelo.Conexion;
import Modelo.Modelo;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

/**
 *
 * @author Mayra
 */
public class DatosArea {
    private int idArea;
    private String Nombre;
    private String Clave_inst;
    private String Clave_ctt;

    public DatosArea() {
    }

    public DatosArea(int idArea, String Nombre, String Clave_inst, String Clave_ctt) {
        this.idArea = idArea;
        this.Nombre = Nombre;
        this.Clave_inst = Clave_inst;
        this.Clave_ctt = Clave_ctt;
    }

    

    public int getIdArea() {
        return idArea;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getClave_inst() {
        return Clave_inst;
    }

    public String getClave_ctt() {
        return Clave_ctt;
    }

    public void setIdArea(int idArea) {
        this.idArea = idArea;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setClave_inst(String Clave_inst) {
        this.Clave_inst = Clave_inst;
    }

    public void setClave_ctt(String Clave_ctt) {
        this.Clave_ctt = Clave_ctt;
    }

    
    public void mostrarComboAreas(JComboBox<DatosArea> comboArea ){
        Conexion cc = new Conexion();
    Connection cn = cc.GetConnection();
    
        String cons= "select id_area, nombre, ctt_area, clave_institu from areas";
        try {    
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            
            while (rs.next()) {
                comboArea.addItem(
                new DatosArea(
                rs.getInt("id_area"),
                rs.getString("nombre"),
                rs.getString("ctt_area"),
                rs.getString("clave_institu")
                )
                );
            }
        } catch (SQLException ex) {
            Logger.getLogger(Modelo.class.getName()).log(Level.SEVERE, null, ex);
          
        }
    }
    
    @Override
    public String  toString(){
    return Nombre;
            }
}