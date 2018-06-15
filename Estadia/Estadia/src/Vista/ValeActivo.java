/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosArea;
import Datos.DatosDetalleResguardo;
import Datos.DatosResguardo;
import Documentos.ValeResguardo;
import Modelo.Conexion;
import static Vista.Principal.Escritorio;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Mayra
 */
public class ValeActivo extends javax.swing.JInternalFrame {
    Conexion cc = new Conexion();
    Connection cn = cc.GetConnection();
    Controlador c = new Controlador();
    DatosResguardo datRes = new DatosResguardo();
    DatosDetalleResguardo datDet = new DatosDetalleResguardo();
    String accion ="";
    int contador = 0;
    int ValorT = 0;
    /**
     * Creates new form ValeActivo
     */
    public ValeActivo() throws SQLException {
        initComponents();
        bloquear();
        Calendar c2 = new GregorianCalendar();
        dcfechaRes.setCalendar(c2);
    }

    void bloquear() {
        txtName.setEnabled(false);
        txtCTT.setEnabled(false);
        txtArea.setEnabled(false);
        txtcurp.setEnabled(false);
        txtclave.setEnabled(false);
        dcfechaRes.setEnabled(false);

        txtNomBien.setEnabled(false);
        txtNInventario.setEnabled(false);
        txtValor.setEnabled(false);
        txtSerie.setEnabled(false);
        txtModelo.setEnabled(false);
        txtMarca.setEnabled(false);

        btnBuscarPersona.setEnabled(false);
        btnBuscarBien.setEnabled(false);
        btnAdd.setEnabled(true);
        btnCancelar.setEnabled(false);
        btnGenerar.setEnabled(false);
        btnCancelar1.setEnabled(false);
    }

    void desbloquear() {
        txtName.setEnabled(true);
        txtCTT.setEnabled(true);
        txtArea.setEnabled(true);
        txtcurp.setEnabled(true);
        txtclave.setEnabled(true);
        dcfechaRes.setEnabled(true);

        txtNomBien.setEnabled(true);
        txtNInventario.setEnabled(true);
        txtValor.setEnabled(true);
        txtSerie.setEnabled(true);
        txtModelo.setEnabled(true);
        txtMarca.setEnabled(true);

        btnBuscarPersona.setEnabled(true);
        btnBuscarBien.setEnabled(true);
        btnAdd.setEnabled(false);
        btnCancelar.setEnabled(true);
        btnGenerar.setEnabled(true);
        btnCancelar1.setEnabled(true);
    }

    void vaciar() {
        txtName.setText("");
        txtCTT.setText("");
        txtcurp.setText("");
        txtclave.setText("");
        txtArea.setText("");

        txtNomBien.setText("");
        txtNInventario.setText("");
        txtValor.setText("");
        txtSerie.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
    }
    
    void cargar_tabla(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_detalle_Res(valor);
        tbDatos.setModel(tb);
        
        tbDatos.getColumnModel().getColumn(0).setMaxWidth(0);
        tbDatos.getColumnModel().getColumn(0).setMinWidth(0);
        tbDatos.getTableHeader().getColumnModel().getColumn(0).setMaxWidth(0);
        tbDatos.getTableHeader().getColumnModel().getColumn(0).setMinWidth(0);
        
        tbDatos.getColumnModel().getColumn(1).setMaxWidth(0);
        tbDatos.getColumnModel().getColumn(1).setMinWidth(0);
        tbDatos.getTableHeader().getColumnModel().getColumn(1).setMaxWidth(0);
        tbDatos.getTableHeader().getColumnModel().getColumn(1).setMinWidth(0);
        
        tbDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        
        tbDatos.getColumnModel().getColumn(3).setMaxWidth(0);
        tbDatos.getColumnModel().getColumn(3).setMinWidth(0);
        tbDatos.getTableHeader().getColumnModel().getColumn(3).setMaxWidth(0);
        tbDatos.getTableHeader().getColumnModel().getColumn(3).setMinWidth(0);
        
        tbDatos.getColumnModel().getColumn(4).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(6).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(7).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(8).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(9).setPreferredWidth(160);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel27 = new javax.swing.JPanel();
        jLTitulo24 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtclave = new javax.swing.JTextField();
        txtCTT = new javax.swing.JTextField();
        txtcurp = new javax.swing.JTextField();
        btnBuscarPersona = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        dcfechaRes = new com.toedter.calendar.JDateChooser();
        txtArea = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnCancelar1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtNomBien = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        btnBuscarBien = new javax.swing.JButton();
        txtNInventario = new javax.swing.JTextField();
        btnGenerar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        txtIdValeR = new javax.swing.JTextField();
        txtIdBien = new javax.swing.JTextField();
        txtIdDetalle = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        txtCanTotal = new javax.swing.JTextField();
        txtValTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel27.setBackground(new java.awt.Color(41, 55, 61));

        jLTitulo24.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLTitulo24.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo24.setText("Asignación de bienes");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLTitulo24, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(471, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitulo24)
                .addGap(373, 373, 373))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Clave: ");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Plantel o área: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("C.T.T. :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("CURP:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Nombre del personal:");

        txtclave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCTT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtcurp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcurpKeyTyped(evt);
            }
        });

        btnBuscarPersona.setBackground(new java.awt.Color(41, 55, 61));
        btnBuscarPersona.setForeground(new java.awt.Color(41, 55, 61));
        btnBuscarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314689-24 (1).png"))); // NOI18N
        btnBuscarPersona.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscarPersona.setContentAreaFilled(false);
        btnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPersonaActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Fecha de elaboración:");

        txtArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(64, 74, 83));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_199_CircledPlus_183316.png"))); // NOI18N
        btnAdd.setText("Ingresar datos");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCancelar1.setBackground(new java.awt.Color(64, 74, 83));
        btnCancelar1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_cancel_216128.png"))); // NOI18N
        btnCancelar1.setText("Cancelar ");
        btnCancelar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnCancelar1.setContentAreaFilled(false);
        btnCancelar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel3))
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(btnBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtCTT, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtcurp, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dcfechaRes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174)
                        .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2)
                        .addComponent(txtclave, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBuscarPersona))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCTT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtcurp, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcfechaRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos de institución y personal", jPanel2);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("No. de Inventario:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Nombre del bien:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel12.setText("Modelo:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Marca:");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel14.setText("Valor:");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel13.setText("Serie:");

        txtNomBien.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnBuscarBien.setBackground(new java.awt.Color(41, 55, 61));
        btnBuscarBien.setForeground(new java.awt.Color(41, 55, 61));
        btnBuscarBien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314689-24 (1).png"))); // NOI18N
        btnBuscarBien.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscarBien.setContentAreaFilled(false);
        btnBuscarBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBienActionPerformed(evt);
            }
        });

        txtNInventario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnGenerar.setBackground(new java.awt.Color(64, 74, 83));
        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314776-24.png"))); // NOI18N
        btnGenerar.setText("Generar Vale");
        btnGenerar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(64, 74, 83));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_cancel_216128.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtIdValeR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdValeRActionPerformed(evt);
            }
        });

        txtIdBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdBienActionPerformed(evt);
            }
        });

        txtIdDetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdDetalleActionPerformed(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(64, 74, 83));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_199_CircledPlus_183316.png"))); // NOI18N
        btnAgregar.setText("Agregar Bien");
        btnAgregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtIdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdBien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdValeR, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtNInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNomBien, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(48, 48, 48)
                        .addComponent(btnBuscarBien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(157, 157, 157))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(139, 139, 139))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdBien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIdValeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtNomBien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscarBien))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13)
                            .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Datos del bien", jPanel1);

        tbDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return false;
            }
        };
        tbDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbDatos.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbDatos);

        jLabel1.setText("Cantidad Total:");

        jLabel10.setText("Valor Total:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel1)
                    .addComponent(txtValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCanTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCanTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPersonaActionPerformed
        ConsultaPersonal form = null;
        try {
            form = new ConsultaPersonal();
            Escritorio.add(form);

            form.setClosable(true);
            form.setIconifiable(true);

        } catch (SQLException ex) {
            Logger.getLogger(ValesAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnBuscarPersonaActionPerformed

    private void btnBuscarBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBienActionPerformed
        ConsultaBienes form = null;
        try {
            form = new ConsultaBienes();
            Escritorio.add(form);

            form.setClosable(true);
            form.setIconifiable(true);

        } catch (SQLException ex) {
            Logger.getLogger(ValesAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnBuscarBienActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        bloquear();
        vaciar();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtcurpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcurpKeyTyped
      if (txtcurp.getText().length() == 18) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtcurpKeyTyped

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        desbloquear();
        accion = "A";
        Calendar cal;
        int d, m, a;
        cal = dcfechaRes.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        datRes.setFecha(new Date(a, m, d));
        
        String update = "update";
        int up = 0;
        datRes.setPlantel(update);
        datRes.setCtt(update);
        datRes.setClave(up);
        datRes.setNombre_per(update);
        datRes.setCurp_pers(update);
        datRes.setCant_total(up);
        datRes.setValor_total(up);
        
        c.agregar_vale_resguardo(datRes);
                
        String idRes = (String.valueOf(c.select_id_vale_res()));
        txtIdValeR.setText(idRes);
        c.cargar_tabla_detalle_Res(idRes);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnCancelar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelar1ActionPerformed
        bloquear();
        vaciar();
        datRes.setId_valeres(Integer.parseInt(txtIdValeR.getText()));
        c.eliminar_vale_res(datRes);
        c.eliminar_detalle_res(datRes);
    }//GEN-LAST:event_btnCancelar1ActionPerformed

    private void txtIdValeRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdValeRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdValeRActionPerformed

    private void txtIdBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdBienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdBienActionPerformed

    private void txtIdDetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdDetalleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdDetalleActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
            
        if (txtNomBien.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Nombre del Bien ");
            txtNomBien.requestFocus();
            return;
        }
        
        if (txtNInventario.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Numero de Inventario");
            txtNInventario.requestFocus();
            return;
        }
        
        if (txtValor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Valor ");
            txtValor.requestFocus();
            return;
        }
        
        if (txtModelo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Modelo");
            txtModelo.requestFocus();
            return;
        }
        if (txtMarca.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la Marca ");
            txtMarca.requestFocus();
            return;
        }
        
        if (txtSerie.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Número de Serie");
            txtSerie.requestFocus();
            return;
        }
        datDet.setId_valer(Integer.parseInt(txtIdValeR.getText()));
        datDet.setId_bien(Integer.parseInt(txtIdBien.getText()));
        datDet.setNombre_b(txtNomBien.getText());
        datDet.setN_inventario(txtNInventario.getText());
        datDet.setMarca_b(txtMarca.getText());
        datDet.setModelo_b(txtModelo.getText());
        datDet.setSerie_b(txtSerie.getText());
        datDet.setValor_b(Integer.parseInt(txtValor.getText()));
        contador = contador +1;
        datDet.setNum_ref(contador);
        
        txtCanTotal.setText(String.valueOf(contador));
        int valorB = Integer.parseInt(txtValor.getText());
        ValorT = ValorT + valorB;
        txtValTotal.setText(String.valueOf(ValorT));
        if (c.Guardar_detalle_res(accion, datDet)) {
            if (accion == "A") {
                
         //       JOptionPane.showMessageDialog(null, "El bien ha sido Agregado.");
            } else if (accion == "M") {
                JOptionPane.showMessageDialog(null, "El bien ha sido Actualizado.");
            }
            
            try {
                cargar_tabla(txtIdValeR.getText());
            } catch (SQLException ex) {
                Logger.getLogger(ValeActivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
       if (txtArea.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Área");
            txtArea.requestFocus();
            return;
        }
        
        if (txtCTT.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Centro de trabajo");
            txtCTT.requestFocus();
            return;
        }
        
        if (txtclave.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la Clave ");
            txtclave.requestFocus();
            return;
        }
        
        if (txtName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Nombre");
            txtName.requestFocus();
            return;
        }
        if (txtcurp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar  ");
            txtcurp.requestFocus();
            return;
        }
        
        datRes.setNombre_per(txtName.getText());
        datRes.setCtt(txtCTT.getText());
        datRes.setPlantel(txtArea.getText());
        datRes.setClave(Integer.parseInt(txtclave.getText()));
        datRes.setCurp_pers(txtcurp.getText());
        datRes.setCant_total(Integer.parseInt(txtCanTotal.getText()));
        datRes.setValor_total(Integer.parseInt(txtValTotal.getText()));
        
        if (c.modificar_vale_res(datRes)) {
           JOptionPane.showMessageDialog(null, "Vale generado.");
           
           try {
                int codigo = Integer.parseInt(txtIdValeR.getText());
                System.out.println(codigo);
                JasperReport jr = (JasperReport) JRLoader.loadObject(ValeResguardo.class.getResource("/Documentos/ValeResguardoActivo.jasper"));

                Map parametro = new HashMap<String, Integer>();
                parametro.put("id_vale_resguardo", Integer.parseInt(txtIdValeR.getText()));

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();

                //JasperPrintManager.printReport( jp, true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "error" + e);
            }
            try {
                cargar_tabla(txtIdValeR.getText());
            } catch (SQLException ex) {
                Logger.getLogger(ValeActivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarBien;
    private javax.swing.JButton btnBuscarPersona;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnCancelar1;
    private javax.swing.JButton btnGenerar;
    private com.toedter.calendar.JDateChooser dcfechaRes;
    private javax.swing.JLabel jLTitulo24;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbDatos;
    public static javax.swing.JTextField txtArea;
    public static javax.swing.JTextField txtCTT;
    private javax.swing.JTextField txtCanTotal;
    public static javax.swing.JTextField txtIdBien;
    public static javax.swing.JTextField txtIdDetalle;
    public static javax.swing.JTextField txtIdValeR;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtModelo;
    public static javax.swing.JTextField txtNInventario;
    public static javax.swing.JTextField txtName;
    public static javax.swing.JTextField txtNomBien;
    public static javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtValTotal;
    public static javax.swing.JTextField txtValor;
    public static javax.swing.JTextField txtclave;
    public static javax.swing.JTextField txtcurp;
    // End of variables declaration//GEN-END:variables
}
