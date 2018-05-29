/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.DatosArea;
import Datos.DatosBien;
import Datos.DatosConsumible;
import Datos.DatosPersonal;
import Datos.DatosUsuario;
import Modelo.Modelo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayra
 */
public class Controlador {

    Modelo m = new Modelo();
//----------------------------LOGIN----------------//    

    public int ContarUsuarios() {
        return m.ContarUsuarios();
    }

    public DefaultTableModel login(String user, String password) {
        return m.login(user, password);
    }
    
    public String obtenerFirma() {
     return m.obtenerFirma();
    }
//    public void validar_usuario(String usuario, String contrasena) {
//        m.validar_usuario(usuario, contrasena);
//    }

//-----------------------USUARIOS---------------------//
    public DefaultTableModel cargar_tabla_usuarios(String valor) {
        DefaultTableModel tb = m.cargar_tabla_usuarios(valor);
        return tb;
    }

    public boolean Guardar_usuario(String accion, DatosUsuario datos, String idUsuario) {
        if (accion == "A") {
            return m.insertar_usuario(datos);
        }
        if (accion == "M") {
            return m.editar_usuario(datos, idUsuario);
        }
        return false;
    }

    public boolean eliminar_usuario(DatosUsuario datos) {
        return m.eliminar_usuario(datos);
    }

    //-----------------------CONSUMIBLES---------------------//
    public DefaultTableModel cargar_tabla_consumibles(String valor) {
        DefaultTableModel tb = m.cargar_tabla_consumibles(valor);
        return tb;
    }

    public boolean Guardar_consumible(String accion, DatosConsumible datos, String idConsum) {
        if (accion == "A") {
            return m.insertar_consumible(datos);
        }
        if (accion == "M") {
            return m.editar_consumible(datos, idConsum);
        }
        return false;
    }

    public boolean eliminar_consumible(DatosConsumible datos) {
        return m.eliminar_consumible(datos);
    }
    
    //-------------------------AREAS--------------------------------------------//
    
    public DefaultTableModel cargar_tabla_Areas(String valor) {
        return m.cargar_tabla_Areas(valor);
    }
     
    public boolean Guardar_area(String accion, DatosArea datos, String idArea) {
        if (accion == "A") {
        return m.insertar_area(datos);
        }
        if (accion == "M") {
        return m.editar_areas(datos, idArea);
        }
        return false;
    }

    public boolean eliminar_area(DatosArea datos) {
        return m.eliminar_area(datos);
    }
     //-------------------------PERSONAL---------------------------------------//
    public DefaultTableModel cargar_tabla_Personal(String valor) {
        return m.cargar_tabla_Personal(valor);
    }
     
    public boolean Guardar_personal(String accion, DatosPersonal datos, String idPersonal) {
        if (accion == "A") {
        return m.insertar_personal(datos);
        }
        if (accion == "M") {
        return m.editar_personal(datos, idPersonal);
        }
        return false;
    }

    public boolean eliminar_personal(DatosPersonal datos) {
        return m.eliminar_personal(datos);
    }
    
    //-------------------------BIENES--------------------------------------------//
    
    public DefaultTableModel cargar_tabla_bienes(String valor) {
        return m.cargar_tabla_Bienes(valor);
    }
     
    public boolean Guardar_bienes(String accion, DatosBien datos, String idBien) {
        if (accion == "A") {
        return m.insertar_bienes(datos);
        }
        if (accion == "M") {
        return m.editar_bienes(datos, idBien);
        }
        return false;
    }

    public boolean eliminar_bienes(DatosBien datos) {
        return m.eliminar_bienes(datos);
    }
}
