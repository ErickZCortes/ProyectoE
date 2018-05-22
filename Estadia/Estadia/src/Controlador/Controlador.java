/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.DatosConsumible;
import Datos.DatosUsuario;
import Modelo.Modelo;
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
}
