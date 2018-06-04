/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Datos.DatosArea;
import Datos.DatosBien;
import Datos.DatosUsuario;
import Datos.DatosConsumible;
import Datos.DatosPersonal;
import Datos.DatosDetalleVale;
import Datos.DatosVale;
import Vista.Principal;
import Vista.ValesAlmacen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayra
 */
public class Modelo {

    Conexion cc = new Conexion();
    Connection cn = cc.GetConnection();

    String cons = "";
    DefaultTableModel model;
    Statement estado;
    public Integer totalRegistros; // Obtener los registros
    //--------------------------------LOGIN-------------------------------------------//

    public int ContarUsuarios() {

        cons = "select count(*)AS cantidadUsuarios from usuarios";

        try {
            int cantidadU = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while (rs.next()) {
                cantidadU = rs.getInt("cantidadUsuarios");
            }

            return cantidadU;

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }

    }

    public DefaultTableModel login(String user, String password) {

        String[] titulos = {"COD", "NOMBRE", "USER", "PASS", "FIRMA", "RFC", "CURP", "ACCESO"};

        String[] registro = new String[8];

        totalRegistros = 0;
        model = new DefaultTableModel(null, titulos);

        cons = "select id_user,nombre,user,password,firma_dig,rfc,curp,acceso from usuarios where user = '" + user + "' AND password = '" + password + "'";

        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);

            while (rs.next()) {
                registro[0] = rs.getString("id_user");
                registro[1] = rs.getString("nombre");
                registro[2] = rs.getString("user");
                registro[3] = rs.getString("password");
                registro[4] = rs.getString("firma_dig");
                registro[5] = rs.getString("rfc");
                registro[6] = rs.getString("curp");
                registro[7] = rs.getString("acceso");
                totalRegistros = totalRegistros + 1;
                model.addRow(registro);

            }
            return model;

        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }
    
    public String obtenerFirma() {
        String acceso = Principal.lblAcceso.getText();
        cons = "SELECT firma_dig FROM usuarios WHERE acceso = '" + acceso + "'";
        try {
            String firma = "";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while (rs.next()) {
                firma = rs.getString("firma_dig");
            }
            return firma;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return "";
        }

    }
//    public void validar_usuario(String usuario, String contrasena) {
//        cons = "Select user,password VALUES (?,?)";
//
//        try {
//            PreparedStatement pst = cn.prepareStatement(cons);
//
//            pst.setString(1, usuario);
//            pst.setString(2, contrasena);
//            
//            int n = pst.executeUpdate();
//            if (n > 0) {
//                JOptionPane.showMessageDialog(null, "Acceso");
//            }
//        } catch (SQLException e) {
//            JOptionPane.showMessageDialog(null, e);
//        }
//    }
    //----------------------------------USUARIOS--------------------------//
    public DefaultTableModel cargar_tabla_usuarios(String valor) {

        DefaultTableModel modelo;

        String[] titulos = {"IdUsuario", "Nombre", "Usuario", "Contraseña", "RFC", "CURP", "Acceso"};

        String[] registros = new String[7];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        cons = "select id_user , nombre , user , password , rfc , curp , acceso from usuarios WHERE id_user LIKE '%" + valor + "%' order by id_user desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);

            while (rs.next()) {

                registros[0] = rs.getString("id_user");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("user");
                registros[3] = rs.getString("password");
                registros[4] = rs.getString("rfc");
                registros[5] = rs.getString("curp");
                registros[6] = rs.getString("acceso");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar_usuario(DatosUsuario datos) {
        cons = "INSERT into  usuarios(nombre,user,password, firma_dig, rfc,curp,acceso) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getUser());
            pst.setString(3, datos.getPassword());
            pst.setString(4, datos.getFirmaD());
            pst.setString(5, datos.getRFC());
            pst.setString(6, datos.getCURP());
            pst.setString(7, datos.getAcceso());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean editar_usuario(DatosUsuario datos, String idUsuario) {

        cons = "update usuarios set nombre = ? , user = ?  , password = ? , rfc = ? ,curp=?  where id_user ='" + idUsuario + "' ";

        try {

            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getUser());
            pst.setString(3, datos.getPassword());
            pst.setString(4, datos.getRFC());
            pst.setString(5, datos.getCURP());

            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean eliminar_usuario(DatosUsuario datos) {
         
        cons = "delete from usuarios where id_user = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getIdUsuario());
            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }//cierre funcion

    //----------------------------------CONSUMIBLES--------------------------//
    public DefaultTableModel cargar_tabla_consumibles(String valor) {

        DefaultTableModel modelo;

        String[] titulos = {"Id", " Codigo", "Nombre", "Fecha", "Existencia","Unidad", "Stock Mínimo", "ValorTotal"};

        String[] registros = new String[8];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        cons = "select id_consum ,codigo , nombre , fechaAd , existencia , unidad, stock_minimo, valorTot from consumibles WHERE nombre LIKE '%" + valor + "%' order by id_consum desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);

            while (rs.next()) {

                registros[0] = rs.getString("id_consum");
                registros[1] = rs.getString("codigo");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fechaAd");
                registros[4] = rs.getString("existencia");
                registros[5] = rs.getString("unidad");
                registros[6] = rs.getString("stock_minimo");
                registros[7] = rs.getString("valorTot");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar_consumible(DatosConsumible datos) {
        cons = "INSERT into consumibles(codigo,nombre,fechaAd,existencia,unidad,stock_minimo,valorTot) VALUES (?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.setString(1, datos.getCodigo());
            pst.setString(2, datos.getNombre());
            pst.setDate(3, datos.getFechaC());
            pst.setString(4, datos.getExistencia());
            pst.setString(5, datos.getUnidad());
            pst.setString(6, datos.getStockM());
            pst.setString(7, datos.getValor());
            

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean editar_consumible(DatosConsumible datos, String IdConsumible) {

        cons = "update consumibles set codigo = ? ,nombre = ?, existencia = ?, unidad = ?, stock_minimo = ?, valorTot = ? where id_consum ='" + IdConsumible + "' ";

        try {

            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getCodigo());
            pst.setString(2, datos.getNombre());
            pst.setString(3, datos.getExistencia());
            pst.setString(4, datos.getUnidad());
            pst.setString(5, datos.getStockM());
            pst.setString(6, datos.getValor());
            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public boolean eliminar_consumible(DatosConsumible datos) {
        cons = "delete from consumibles where id_consum = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getIdConsumible());
            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }//cierre funcion
    
    //----------------------------------AREA--------------------------//
    
    public DefaultTableModel cargar_tabla_Areas(String valor) {

        DefaultTableModel modelo;

        String[] titulos = {"Id_area", "Nombre", "Clave del CTT ", "Clave Institucional"};

        String[] registros = new String[5];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        cons = "select id_area ,nombre , ctt_area , clave_institu from areas WHERE nombre LIKE '%" + valor + "%' order by id_area desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);

            while (rs.next()) {

                registros[0] = rs.getString("id_area");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("ctt_area");
                registros[3] = rs.getString("clave_institu");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar_area(DatosArea datos) {
        cons = "INSERT into areas(nombre,ctt_area,clave_institu) VALUES (?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getClave_ctt());
            pst.setString(3, datos.getClave_inst());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean editar_areas(DatosArea datos, String IdArea) {

        cons = "update areas set nombre = ? ,ctt_area = ?, clave_institu = ?  where id_area ='" + IdArea + "' ";

        try {

            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getClave_ctt());
            pst.setString(3, datos.getClave_inst());
            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public boolean eliminar_area(DatosArea datos) {
        cons = "delete from areas where id_area = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getIdArea());
            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }//cierre funcion
    
    //----------------------------------PERSONAL--------------------------//
    
    public DefaultTableModel cargar_tabla_Personal(String valor) {

        DefaultTableModel modelo;

        String[] titulos = {"id_persona", "Nombre", "CURP", "Area"};

        String[] registros = new String[4];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        cons = "select id_persona  , nombre_persona , curp_persona , area_persona  from personal WHERE nombre_persona LIKE '%" + valor + "%' order by id_persona desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);

            while (rs.next()) {

                registros[0] = rs.getString("id_persona");
                registros[1] = rs.getString("nombre_persona");
                registros[2] = rs.getString("curp_persona");
                registros[3] = rs.getString("area_persona");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar_personal(DatosPersonal datos) {
        cons = "INSERT into personal(nombre_persona,curp_persona,area_persona) VALUES (?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getCURP());
            pst.setString(3, datos.getArea());

            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean editar_personal(DatosPersonal datos, String IdPersonal) {

        cons = "update personal set nombre_persona = ?, curp_persona = ? , area_persona = ? where id_persona ='" + IdPersonal + "' ";

        try {

            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getCURP());
            pst.setString(3, datos.getArea());
            
            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public boolean eliminar_personal(DatosPersonal datos) {
        cons = "delete from personal where id_persona = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getIdPersonal());
            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }//cierre funcion
    
    //--------------------------------------------BIENES-----------------------------------------------------//
    
    public DefaultTableModel cargar_tabla_Bienes(String valor) {

        DefaultTableModel modelo;

        String[] titulos = {"Id_bien", "Nombre", "Característica", "Marca", "Modelo", "Serie", "Valor", "Cantidad", "Fecha-Ad", "Forma - Ad"};

        String[] registros = new String[10];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        cons = "select id_bien ,nombre_bien , caract_bien , marca_bien , modelo_bien, serie_bien, valor_bien, stock_bien, fechaAd, formaAd from bienes WHERE nombre_bien LIKE '%" + valor + "%' order by id_bien desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);

            while (rs.next()) {

                registros[0] = rs.getString("id_bien");
                registros[1] = rs.getString("nombre_bien");
                registros[2] = rs.getString("caract_bien");
                registros[3] = rs.getString("marca_bien");
                registros[4] = rs.getString("modelo_bien");
                registros[5] = rs.getString("serie_bien");
                registros[6] = rs.getString("valor_bien");
                registros[7] = rs.getString("stock_bien");
                registros[8] = rs.getString("fechaAd");
                registros[9] = rs.getString("formaAd");

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }

    }

    public boolean insertar_bienes(DatosBien datos) {
        cons = "INSERT into bienes(nombre_bien,caract_bien,marca_bien,modelo_bien, serie_bien, valor_bien, stock_bien, fechaAd, formaAd) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getCaracteristica());
            pst.setString(3, datos.getMarca());
            pst.setString(4, datos.getModelo());
            pst.setString(5, datos.getSerie());
            pst.setString(6, datos.getValor());
            pst.setString(7, datos.getStock());
            pst.setDate(8, datos.getFechaAd());
            pst.setString(9, datos.getFormaAd());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }

    public boolean editar_bienes(DatosBien datos, String Idbien) {

        cons = "update bienes set nombre_bien = ? ,caract_bien = ?, marca_bien = ? , modelo_bien = ?, serie_bien = ?, valor_bien = ?, stock_bien = ?, fechaAd = ?, formaAd = ? where id_bien ='" + Idbien + "' ";

        try {

            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getNombre());
            pst.setString(2, datos.getCaracteristica());
            pst.setString(3, datos.getMarca());
            pst.setString(4, datos.getModelo());
            pst.setString(5, datos.getSerie());
            pst.setString(6, datos.getValor());
            pst.setString(7, datos.getStock());
            pst.setDate(8, datos.getFechaAd());
            pst.setString(9, datos.getFormaAd());           
            
            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }

    }

    public boolean eliminar_bienes(DatosBien datos) {
        cons = "delete from bienes where id_bien = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getIdBien());
            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }//cierre funcion
    
    //-----------------------------------------VALE ALMACEN-------------------//
    
    public String DevolverCtt(){
        String area = ValesAlmacen.txtArea.getText();
        cons = "SELECT ctt_area FROM areas WHERE nombre = '" + area + "'";
        try {
            String ctt_area = "";
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while (rs.next()) {
                ctt_area = rs.getString("ctt_area");
            }
            return ctt_area;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return "";
        }
    }
    
    public DefaultTableModel cargar_tabla_detalleV(String valor) {

        DefaultTableModel modelo;

        String[] titulos = {"id_detalle","id_vale","id_personal","consumible","No." ,"Descripción del artículo", "Cantidad solicitada", "Unidad", "Cantidad Entregada"};

        String[] registros = new String[9];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        cons = "select id_detalle ,id_valeA , id_person , id_consumibles , num_referencia, nombre_consumible, cantidad_solic, unidad_consumible, cantidad_entregada from detalle_vale WHERE id_detalle LIKE '%" + valor + "%' order by id_detalle desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);

            while (rs.next()) {

                registros[0] = rs.getString("id_detalle");
                registros[1] = rs.getString("id_valeA");
                registros[2] = rs.getString("id_person");
                registros[3] = rs.getString("id_consumibles");
                registros[4] = rs.getString("nom_referencia");
                registros[5] = rs.getString("nombre_consumible");
                registros[6] = rs.getString("cantidad_solic");
                registros[7] = rs.getString("unidad_consumible");
                registros[8] = rs.getString("cantidad_entregada");
                

                totalRegistros = totalRegistros + 1;
                modelo.addRow(registros);
            }
            return modelo;

        } catch (Exception e) {
            JOptionPane.showConfirmDialog(null, e);
            return null;
        }
    }
    public boolean agregar_vale(DatosVale datos){
        cons = "INSERT into vale_almacen(fecha , area_sol , responsable_area) VALUES (?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(cons);
            
            pst.setDate(1, datos.getFecha());
            pst.setString(2, datos.getAreaSoli());
            pst.setString(3, datos.getResponsableArea());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    public boolean eliminarVale(DatosVale datos){
        cons = "delete from vale_almacen where id_vale = ?";
        try {
            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getIdVale());
            int N = pst.executeUpdate();

            if (N != 0) {
                return true;
            } else {
                return false;
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    public int selectIdVale() {
        cons = "SELECT id_vale FROM vale_almacen WHERE fecha order by id_vale DESC limit 1";
        try {
            int idvale = 0;
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);
            while (rs.next()) {
                idvale = rs.getInt("id_vale");
            }
            return idvale;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return 0;
        }
    }
    
    public boolean modificar_vale(DatosVale datos){
        String idVale = ValesAlmacen.txtidVale.getText();
        cons = "update bienes set area_sol = ? ,responsable_area = ? where id_vale ='" + idVale + "' ";

        try {

            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getAreaSoli());
            pst.setString(2, datos.getResponsableArea());
         
            
            int N = pst.executeUpdate();
            if (N != 0) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
    public boolean agregar_detalleV (DatosDetalleVale datos) {
        cons = "INSERT into detalle_vale(id_detalle ,id_valeA , id_person , id_consumibles , num_referencia, nombre_consumible, cantidad_solic, unidad_consumible, cantidad_entregada) VALUES (?,?,?,?,?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.setString(1, datos.getId_detalle());
            pst.setString(2, datos.getId_vale());
            pst.setString(3, datos.getId_persona());
            pst.setString(4, datos.getId_consumible());
            pst.setInt(5, datos.getNum_referencia());
            pst.setString(6, datos.getNombre_consumible());
            pst.setString(7, datos.getCantidad_solici());
            pst.setString(8, datos.getUnidad_consumible());
            pst.setString(9, datos.getCantidad_entregada());
            int n = pst.executeUpdate();
            if (n != 0) {
                return true;
            } else {
                return false;
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return false;
        }
    }
    
}
