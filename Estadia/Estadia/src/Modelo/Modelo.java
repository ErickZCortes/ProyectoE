/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Datos.DatosUsuario;
import Datos.DatosConsumible;
import java.sql.Connection;
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

        String[] titulos = {"Id", "Codigo", "Nombre", "Fecha", "Forma", "ValorTotal"};

        String[] registros = new String[6];
        totalRegistros = 0;
        modelo = new DefaultTableModel(null, titulos);

        cons = "select id_consum ,codigo , nombre , fechaAd , formaAd , valorTot from consumibles WHERE nombre LIKE '%" + valor + "%' order by id_consum desc";

        try {

            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(cons);

            while (rs.next()) {

                registros[0] = rs.getString("id_consum");
                registros[1] = rs.getString("codigo");
                registros[2] = rs.getString("nombre");
                registros[3] = rs.getString("fechaAd");
                registros[4] = rs.getString("formaAd");
                registros[5] = rs.getString("valorTot");

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
        cons = "INSERT into consumibles(codigo,nombre,fechaAd,formaAd,valorTot) VALUES (?,?,?,?,?)";

        try {
            PreparedStatement pst = cn.prepareStatement(cons);
            pst.setString(1, datos.getCodigo());
            pst.setString(2, datos.getNombre());
            pst.setDate(3, datos.getFechaC());
            pst.setString(4, datos.getFormaC());
            pst.setString(5, datos.getValorT());

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

        cons = "update consumibles set codigo = ? ,nombre = ?, formaAd = ? , valorTot = ? where id_consum ='" + IdConsumible + "' ";

        try {

            PreparedStatement pst = cn.prepareStatement(cons);

            pst.setString(1, datos.getCodigo());
            pst.setString(2, datos.getNombre());
            pst.setString(3, datos.getFormaC());
            pst.setString(4, datos.getValorT());
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
}
