/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Datos.DatosArea;
import Datos.DatosAltaBien;
import Datos.DatosBajaBien;
import Datos.DatosConsumible;
import Datos.DatosDetalleResguardo;
import Datos.DatosDetalleValeAlmacen;
import Datos.DatosPersonal;
import Datos.DatosResguardo;
import Datos.DatosUsuario;
import Datos.DatosValeAlmacen;
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

    public int ContarAdmin() {
        return m.ContarAdmin();
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
    public DefaultTableModel cargar_tabla_consumibles_xcategoria(String valor) {
        DefaultTableModel tb = m.cargar_tabla_consumibles_xcategoria(valor);
        return tb;
    }

    public DefaultTableModel cargar_tabla_consumibles_xnombre(String valor) {
        DefaultTableModel tb = m.cargar_tabla_consumibles_xnombre(valor);
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

    public int seleccionarStock_Con() {
        return m.seleccionarStock_Con();
    }

    public int seleccionar_ex_Cons(String idCons) {
        return m.seleccionar_ex_Cons(idCons);
    }

    public void editar_Consumible_x_existencia(String idConsumible, int cantidad) {
        m.editar_Consumible_x_existencia(idConsumible, cantidad);
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

    public String obtenerctt(String area) {
        return m.obtenerctt(area);
    }

    public String obteneclaveins(String area) {
        return m.obteneclaveins(area);
    }

    //-------------------------PERSONAL---------------------------------------//
    public DefaultTableModel cargar_tabla_Personal_xarea(String valor) {
        return m.cargar_tabla_Personal_xarea(valor);
    }

    public DefaultTableModel cargar_tabla_Personal_xnombre(String valor) {
        return m.cargar_tabla_Personal_xnombre(valor);
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
    public DefaultTableModel cargar_tabla_Altabienes_area(String valor) {
        return m.cargar_tabla_AltaBienes_area(valor);
    }

    public DefaultTableModel cargar_tabla_Altabienes_nombre(String area, String valor) {
        return m.cargar_tabla_AltaBienes_nombre(area, valor);
    }

    public DefaultTableModel cargar_tabla_Altabienes_NInventario(String area, String valor) {
        return m.cargar_tabla_AltaBienes_NInventario(area, valor);
    }

    public DefaultTableModel cargar_tabla_Altabienes_tipo(String area, String valor) {
        return m.cargar_tabla_AltaBienes_tipo(area, valor);
    }

    public DefaultTableModel cargar_tabla_Bajabienes_area(String valor) {
        return m.cargar_tabla_BajaBienes_area(valor);
    }

    public DefaultTableModel cargar_tabla_Bajabienes_nombre(String area, String valor) {
        return m.cargar_tabla_BajaBienes_nombre(area, valor);
    }

    public DefaultTableModel cargar_tabla_Bajabienes_tipo(String area, String valor) {
        return m.cargar_tabla_BajaBienes_tipo(area, valor);
    }

    public boolean Guardar_Altabienes(String accion, DatosAltaBien datos, String idAlta) {
        if (accion == "A") {
            return m.insertar_AltaBienes(datos);
        }
        if (accion == "M") {
            return m.editar_AltaBienes(datos, idAlta);
        }
        return false;
    }

    public int seleccionar_ex_Bien(String idAlta) {
        return m.seleccionar_ex_Bien(idAlta);
    }

    public void editar_AltaBienes_xBaja(String idAlta, int cantidad) {
        m.editar_AltaBienes_xBaja(idAlta, cantidad);
    }

    public void eliminar_AltaBienes_xBaja(String idalta) {
        m.eliminar_AltaBienes_xBaja(idalta);
    }

    public boolean Guardar_Bajabienes(DatosBajaBien datos) {

        return m.insertar_BajaBienes(datos);

    }

    public boolean eliminar_bienes(DatosBajaBien datos) {
        return m.eliminar_BajaBienes(datos);
    }

    public DefaultTableModel cargar_tabla_AsignacionBienes_nombre(String area, String valor) {
        return m.cargar_tabla_AsignacionBienes_nombre(area, valor);
    }

    //-----------------------------------------VALE ALMACEN-------------------//
    public String DevolverCtt() {
        return m.DevolverCtt();
    }

    public DefaultTableModel cargar_tabla_detalleV(String valor) {
        return m.cargar_tabla_detalleV(valor);
    }

    public int selectIdVale() {
        return m.selectIdVale();
    }

    public boolean agregar_vale(DatosValeAlmacen datos) {
        return m.agregar_vale(datos);
    }

    public boolean eliminarVale(DatosValeAlmacen datos) {
        return m.eliminarVale(datos);
    }

    public boolean modificar_vale(DatosValeAlmacen datos) {
        return m.modificar_vale(datos);
    }

    public boolean Guardar_detalle_almacen(String accion, DatosDetalleValeAlmacen datos) {
        if (accion == "A") {
            return m.agregar_detalle_almacen(datos);
        }
        if (accion == "M") {
            return m.modificar_detalle_almacen(datos);
        }
        return false;
    }

    public boolean eliminar_detalle_almacen(DatosDetalleValeAlmacen datos) {
        return m.eliminar_detalle_almacen(datos);
    }

    public void eliminar_xregistro_detalle_almacen(Integer idDetalle) throws SQLException {
        m.eliminar_xregistro_detalle_almacen(idDetalle);
    }

    //-----------------------------------------VALE RESGUARDO-------------------//
    public DefaultTableModel cargar_tabla_detalle_Res(String valor) {
        return m.cargar_tabla_detalle_Res(valor);
    }

    public boolean agregar_vale_resguardo(DatosResguardo datos) {
        return m.agregar_vale_resguardo(datos);
    }

    public int select_id_vale_res() {
        return m.select_id_vale_res();
    }

    public boolean modificar_vale_res(DatosResguardo datos) {
        return m.modificar_vale_res(datos);
    }

    public boolean eliminar_vale_res(DatosResguardo datos) {
        return m.eliminar_vale_res(datos);
    }

    public boolean Guardar_detalle_res(String accion, DatosDetalleResguardo datos) {
        if (accion == "A") {
            return m.agregar_detalle_resguardo(datos);
        }
        if (accion == "M") {
            return m.modificar_detalle_res(datos);
        }
        return false;
    }

    public boolean eliminar_detalle_res(DatosResguardo datos) {
        return m.eliminar_detalle_res(datos);
    }

    public void eliminar_xregistro_detalle_res(Integer idResguardo) throws SQLException {
        m.eliminar_xregistro_detalle_res(idResguardo);
    }
}
