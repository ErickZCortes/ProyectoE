/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosAltaBien;
import Datos.DatosArea;
import Datos.DatosDetalleResguardo;
import Datos.DatosResguardo;
import Documentos.ValeResguardo;
import Modelo.Conexion;
import static Vista.Principal.Escritorio;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    DatosAltaBien AltaB = new DatosAltaBien();
    String accion = "", seleccion = "";
    int contador = 0;
    int ValorT = 0;

    /**
     * Creates new form ValeActivo
     */
    public ValeActivo(String select, String valor) throws SQLException {
        initComponents();
        txtActivo.setVisible(false);
        txtCantB.setVisible(false);
        txtIdDetalle.setVisible(false);
        txtIdBien.setVisible(false);
        txtIdValeR.setVisible(false);
        Calendar c2 = new GregorianCalendar();
        dcfechaRes.setCalendar(c2);
        seleccion = select;
        if (seleccion.equals("cambioAsig")) {
            accion = "A";
            btnCrear.setVisible(false);
            btnCancelar.setVisible(false);
            desbloquear();
            editar();
            dcfechaRes.setVisible(false);
            lbFechaAc.setVisible(false);
            cargar_tabla(valor);
        } else if (seleccion.equals("AgregarAsig")) {
            bloquear();
        }
    }

    void editar() {
        txtName.setEditable(false);
        txtCTT.setEditable(false);
        txtArea.setEditable(false);
        txtclave.setEditable(false);
        txtcurp.setEditable(false);
        btnBuscarPersona.setEnabled(false);

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
        txtCanTotal.setEnabled(false);
        txtValTotal.setEnabled(false);

        btnAgregar.setEnabled(false);
        btnEliminarD.setEnabled(false);

        btnBuscarPersona.setEnabled(false);
        btnBuscarBien.setEnabled(false);
        btnCrear.setEnabled(true);
        btnGenerar.setEnabled(false);
        btnCancelar.setEnabled(false);
    }

    void bloqueardos() {
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
        txtCanTotal.setEnabled(false);
        txtValTotal.setEnabled(false);

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
        txtCanTotal.setEnabled(true);
        txtValTotal.setEnabled(true);

        btnAgregar.setEnabled(true);
        btnEliminarD.setEnabled(true);
        btnBuscarPersona.setEnabled(true);
        btnBuscarBien.setEnabled(true);
        btnCrear.setEnabled(false);
        btnGenerar.setEnabled(true);
        btnCancelar.setEnabled(true);
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
        txtCanTotal.setText("");
        txtValTotal.setText("");
        txtIdDetalle.setText("");
        txtIdBien.setText("");
        txtIdValeR.setText("");
    }

    void vaciardos() {
        txtNomBien.setText("");
        txtNInventario.setText("");
        txtValor.setText("");
        txtSerie.setText("");
        txtModelo.setText("");
        txtMarca.setText("");
        txtIdDetalle.setText("");
        txtIdBien.setText("");
        txtCantB.setText("");
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

        tbDatos.getColumnModel().getColumn(2).setMaxWidth(0);
        tbDatos.getColumnModel().getColumn(2).setMinWidth(0);
        tbDatos.getTableHeader().getColumnModel().getColumn(2).setMaxWidth(0);
        tbDatos.getTableHeader().getColumnModel().getColumn(2).setMinWidth(0);

        tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(4).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(6).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(7).setPreferredWidth(160);
        tbDatos.getColumnModel().getColumn(8).setPreferredWidth(160);
    }

    void actualizarDatos() {
        int filasel = tbDatos.getSelectedRow();
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar Registro");
            } else {
                String iddetalleA = (String) tbDatos.getValueAt(filasel, 0);
                String Nombre = (String) tbDatos.getValueAt(filasel, 3);
                String inventario = (String) tbDatos.getValueAt(filasel, 4);
                String valor = (String) tbDatos.getValueAt(filasel, 8);
                String modelo = (String) tbDatos.getValueAt(filasel, 6);
                String marca = (String) tbDatos.getValueAt(filasel, 5);
                String serie = (String) tbDatos.getValueAt(filasel, 7);
                String idBien = (String) tbDatos.getValueAt(filasel, 2);

                txtIdDetalle.setText(iddetalleA);
                txtNomBien.setText(Nombre);
                txtNInventario.setText(inventario);
                txtValor.setText(valor);
                txtModelo.setText(modelo);
                txtMarca.setText(marca);
                txtSerie.setText(serie);
                txtIdBien.setText(idBien);

            }
        } catch (Exception e) {
        }
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
        lbFechaAc = new javax.swing.JLabel();
        dcfechaRes = new com.toedter.calendar.JDateChooser();
        txtArea = new javax.swing.JTextField();
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
        txtIdValeR = new javax.swing.JTextField();
        txtIdBien = new javax.swing.JTextField();
        txtIdDetalle = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        btnEliminarD = new javax.swing.JButton();
        txtCantB = new javax.swing.JTextField();
        txtActivo = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        txtCanTotal = new javax.swing.JTextField();
        txtValTotal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setIconifiable(true);
        setTitle("Asignación de bienes");
        setFrameIcon(null);

        jPanel27.setBackground(new java.awt.Color(41, 55, 61));

        jLTitulo24.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLTitulo24.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo24.setText("Asignación de bienes");

        javax.swing.GroupLayout jPanel27Layout = new javax.swing.GroupLayout(jPanel27);
        jPanel27.setLayout(jPanel27Layout);
        jPanel27Layout.setHorizontalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel27Layout.createSequentialGroup()
                .addGap(378, 378, 378)
                .addComponent(jLTitulo24, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel27Layout.setVerticalGroup(
            jPanel27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel27Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLTitulo24)
                .addGap(373, 373, 373))
        );

        jTabbedPane1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Clave: ");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Plantel o área: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("C.T.T. :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("CURP:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Nombre del personal:");

        txtclave.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtclave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtclaveActionPerformed(evt);
            }
        });
        txtclave.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtclaveKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtclaveKeyTyped(evt);
            }
        });

        txtCTT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtCTTKeyPressed(evt);
            }
        });

        txtcurp.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtcurp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcurpKeyTyped(evt);
            }
        });

        btnBuscarPersona.setBackground(new java.awt.Color(41, 55, 61));
        btnBuscarPersona.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarPersona.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarPersona.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Search_24px.png"))); // NOI18N
        btnBuscarPersona.setBorder(null);
        btnBuscarPersona.setBorderPainted(false);
        btnBuscarPersona.setContentAreaFilled(false);
        btnBuscarPersona.setOpaque(true);
        btnBuscarPersona.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPersonaActionPerformed(evt);
            }
        });

        lbFechaAc.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbFechaAc.setText("Fecha de elaboración:");

        dcfechaRes.setDateFormatString("yyyy/MM/dd");

        txtArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtArea.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAreaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAreaKeyTyped(evt);
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
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(btnBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCTT, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtclave, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(txtcurp)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(lbFechaAc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcfechaRes, javax.swing.GroupLayout.DEFAULT_SIZE, 172, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
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
                    .addComponent(btnBuscarPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(lbFechaAc)
                        .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcfechaRes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(76, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos de institución y personal", jPanel2);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        txtNomBien.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNomBienKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNomBienKeyTyped(evt);
            }
        });

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtModelo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtModeloKeyTyped(evt);
            }
        });

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtMarca.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMarcaKeyTyped(evt);
            }
        });

        txtSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSerie.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSerieKeyTyped(evt);
            }
        });

        btnBuscarBien.setBackground(new java.awt.Color(41, 55, 61));
        btnBuscarBien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarBien.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarBien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Search_24px.png"))); // NOI18N
        btnBuscarBien.setBorder(null);
        btnBuscarBien.setBorderPainted(false);
        btnBuscarBien.setContentAreaFilled(false);
        btnBuscarBien.setOpaque(true);
        btnBuscarBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBienActionPerformed(evt);
            }
        });

        txtNInventario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNInventarioKeyTyped(evt);
            }
        });

        btnAgregar.setBackground(new java.awt.Color(41, 55, 61));
        btnAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Add_24px.png"))); // NOI18N
        btnAgregar.setText("Agregar Bien");
        btnAgregar.setBorder(null);
        btnAgregar.setBorderPainted(false);
        btnAgregar.setContentAreaFilled(false);
        btnAgregar.setOpaque(true);
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminarD.setBackground(new java.awt.Color(41, 55, 61));
        btnEliminarD.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEliminarD.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Trash_24px.png"))); // NOI18N
        btnEliminarD.setText("Eliminar");
        btnEliminarD.setBorder(null);
        btnEliminarD.setBorderPainted(false);
        btnEliminarD.setContentAreaFilled(false);
        btnEliminarD.setOpaque(true);
        btnEliminarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarDActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 116, Short.MAX_VALUE)
                        .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminarD, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(btnBuscarBien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel13)
                                        .addGap(29, 29, 29))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addGap(18, 18, 18)))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addGap(24, 24, 24)
                                .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdValeR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdBien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdDetalle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCantB, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBuscarBien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel8)
                                .addComponent(txtNomBien, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtNInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel12))
                                .addGap(18, 18, 18))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(txtActivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtCantB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(11, 11, 11)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(txtIdBien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel13)
                                    .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIdValeR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarD, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos del bien", jPanel1);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        txtCanTotal.setEditable(false);
        txtCanTotal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        txtValTotal.setEditable(false);
        txtValTotal.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Cantidad Total:");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
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
                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(txtCanTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtValTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        btnCrear.setBackground(new java.awt.Color(41, 55, 61));
        btnCrear.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_New_Copy_24px.png"))); // NOI18N
        btnCrear.setText("Ingresar datos");
        btnCrear.setBorder(null);
        btnCrear.setBorderPainted(false);
        btnCrear.setContentAreaFilled(false);
        btnCrear.setOpaque(true);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(41, 55, 61));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Unavailable_24px.png"))); // NOI18N
        btnCancelar.setText("Cancelar ");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setOpaque(true);
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGenerar.setBackground(new java.awt.Color(41, 55, 61));
        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Resume_24px.png"))); // NOI18N
        btnGenerar.setText("Generar Vale");
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.setOpaque(true);
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

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
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDatos);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(147, 147, 147)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 817, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel27, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPersonaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPersonaActionPerformed
        ConsultaPersonal form = null;
        try {
            form = new ConsultaPersonal("Activo");
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
        ConsultaBienesSeleccionar form = null;
        try {
            form = new ConsultaBienesSeleccionar("Activo");
            Escritorio.add(form);

            form.setClosable(true);
            form.setIconifiable(true);

        } catch (SQLException ex) {
            Logger.getLogger(ValesAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.toFront();
        form.setVisible(true);

    }//GEN-LAST:event_btnBuscarBienActionPerformed

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

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
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
        try {
            cargar_tabla(idRes);
        } catch (SQLException ex) {
            Logger.getLogger(ValeActivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        datRes.setId_valeres(Integer.parseInt(txtIdValeR.getText()));

        int fila = tbDatos.getRowCount();
        for (int i = 0; i < fila; i++) {
            String idBien = (String) (tbDatos.getValueAt(i, 3));
            int idb = Integer.parseInt(idBien);

            int existencia = c.seleccionar_ex_Bien(idBien);
            existencia = existencia + 1;
            c.editar_AltaBienes_xBaja(idBien, existencia);
            c.eliminar_detalle_res(datRes);
        }
        c.eliminar_vale_res(datRes);
        bloquear();
        vaciar();
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        try {
            if (txtCantB.getText().length() == 0) {
                JOptionPane.showMessageDialog(null, "No puedes realizar esta acción");
                vaciardos();
                desbloquear();
            } else {
                if (txtNomBien.getText().length() == 0) {

                    JOptionPane.showMessageDialog(null, "Debes ingresar el Nombre del Bien");
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
                
                if (seleccion.equals("cambioAsig")) {
                int ct = Integer.parseInt(txtCanTotal.getText());
                ct = ct + 1;
                txtCanTotal.setText(String.valueOf(ct));
                }else if (seleccion.equals("AgregarAsig")){
                contador = contador + 1;      
                txtCanTotal.setText(String.valueOf(contador));
                }
                
                datDet.setId_valer(Integer.parseInt(txtIdValeR.getText()));
                datDet.setId_bien(Integer.parseInt(txtIdBien.getText()));
                datDet.setNombre_b(txtNomBien.getText());
                datDet.setN_inventario(txtNInventario.getText());
                datDet.setMarca_b(txtMarca.getText());
                datDet.setModelo_b(txtModelo.getText());
                datDet.setSerie_b(txtSerie.getText());
                datDet.setValor_b(Integer.parseInt(txtValor.getText()));
                int cantidadB = Integer.parseInt(txtCantB.getText());
                cantidadB = cantidadB - 1;
                
                
                int valorB = Integer.parseInt(txtValor.getText());
                ValorT = ValorT + valorB;
                txtValTotal.setText(String.valueOf(ValorT));

                int CantB = Integer.parseInt(txtCantB.getText());

                if (CantB == 0) {
                    JOptionPane.showMessageDialog(null, "No existen bienes disponibles");
                } else {
                    c.Guardar_detalle_res(accion, datDet);
                    if (accion == "A") {
                        c.editar_AltaBienes_xBaja(txtIdBien.getText(), cantidadB);
                        //       JOptionPane.showMessageDialog(null, "El bien ha sido Agregado.");
                        vaciardos();
                    } else if (accion == "M") {
                        c.editar_AltaBienes_xBaja(txtIdBien.getText(), cantidadB);
                        JOptionPane.showMessageDialog(null, "El bien ha sido Actualizado.");
                    }

                    try {
                        cargar_tabla(txtIdValeR.getText());
                    } catch (SQLException ex) {
                        Logger.getLogger(ValeActivo.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }

            }
        } catch (Exception e) {
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
            JOptionPane.showMessageDialog(null, "Debes ingresar la Clave");
            txtclave.requestFocus();
            return;
        }

        if (txtName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Nombre");
            txtName.requestFocus();
            return;
        }
        if (txtcurp.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el CURP");
            txtcurp.requestFocus();
            return;
        }

        Calendar cal;
        int d, m, a;
        cal = dcfechaRes.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        datRes.setFecha(new Date(a, m, d));

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

                JasperReport jr = (JasperReport) JRLoader.loadObject(ValeResguardo.class.getResource("/Documentos/ValeResguardoActivo.jasper"));

                Map parametro = new HashMap<String, Integer>();
                parametro.put("id_vale_resguardo", Integer.parseInt(txtIdValeR.getText()));

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();

                //JasperPrintManager.printReport( jp, true);
                vaciar();
                bloquear();
                this.dispose();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "error" + e);
            }

        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void btnEliminarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarDActionPerformed
        int filasel = tbDatos.getSelectedRow();
        
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione Registro");
            } else {
                if (seleccion.equals("cambioAsig")) {
                int ct = Integer.parseInt(txtCanTotal.getText());
                ct = ct - 1;
                txtCanTotal.setText(String.valueOf(ct));
                }else if (seleccion.equals("AgregarAsig")){
                contador = contador - 1;    
                txtCanTotal.setText(String.valueOf(contador));
                }
                int valorT = Integer.parseInt(txtValTotal.getText());
                int ValP = Integer.parseInt(txtValor.getText());
                int Res = valorT - ValP;
                int exisB = c.seleccionar_ex_Bien(txtIdBien.getText());
                exisB = exisB + 1;
                c.editar_AltaBienes_xBaja(txtIdBien.getText(), exisB);
                c.eliminar_xregistro_detalle_res(Integer.parseInt(txtIdDetalle.getText()));
                txtValTotal.setText(String.valueOf(Res));
                cargar_tabla(txtIdValeR.getText());
                desbloquear();
                vaciardos();
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ValeActivo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnEliminarDActionPerformed

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
        actualizarDatos();
        bloqueardos();
    }//GEN-LAST:event_tbDatosMouseClicked

    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtCTT.requestFocus();
        }
    }//GEN-LAST:event_txtNameKeyPressed

    private void txtCTTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCTTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtArea.requestFocus();
        }
    }//GEN-LAST:event_txtCTTKeyPressed

    private void txtAreaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtclave.requestFocus();
        }
    }//GEN-LAST:event_txtAreaKeyPressed

    private void txtclaveKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclaveKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtcurp.requestFocus();
        }
    }//GEN-LAST:event_txtclaveKeyPressed

    private void txtNomBienKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomBienKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtNInventario.requestFocus();
        }
    }//GEN-LAST:event_txtNomBienKeyPressed

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        char a = evt.getKeyChar();
        if (Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtAreaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAreaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        char a = evt.getKeyChar();
        if (Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtAreaKeyTyped

    private void txtNomBienKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNomBienKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        char a = evt.getKeyChar();
        if (Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNomBienKeyTyped

    private void txtNInventarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNInventarioKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

    }//GEN-LAST:event_txtNInventarioKeyTyped

    private void txtModeloKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtModeloKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

    }//GEN-LAST:event_txtModeloKeyTyped

    private void txtMarcaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMarcaKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

    }//GEN-LAST:event_txtMarcaKeyTyped

    private void txtSerieKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSerieKeyTyped
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }

    }//GEN-LAST:event_txtSerieKeyTyped

    private void txtclaveKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtclaveKeyTyped
        char a = evt.getKeyChar();
        if (!Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtclaveKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        char a = evt.getKeyChar();
        if (!Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtclaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtclaveActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtclaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBuscarBien;
    private javax.swing.JButton btnBuscarPersona;
    private javax.swing.JButton btnCancelar;
    public static javax.swing.JButton btnCrear;
    private javax.swing.JButton btnEliminarD;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel27;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lbFechaAc;
    private javax.swing.JTable tbDatos;
    public static javax.swing.JTextField txtActivo;
    public static javax.swing.JTextField txtArea;
    public static javax.swing.JTextField txtCTT;
    public static javax.swing.JTextField txtCanTotal;
    public static javax.swing.JTextField txtCantB;
    public static javax.swing.JTextField txtIdBien;
    public static javax.swing.JTextField txtIdDetalle;
    public static javax.swing.JTextField txtIdValeR;
    public static javax.swing.JTextField txtMarca;
    public static javax.swing.JTextField txtModelo;
    public static javax.swing.JTextField txtNInventario;
    public static javax.swing.JTextField txtName;
    public static javax.swing.JTextField txtNomBien;
    public static javax.swing.JTextField txtSerie;
    public static javax.swing.JTextField txtValTotal;
    public static javax.swing.JTextField txtValor;
    public static javax.swing.JTextField txtclave;
    public static javax.swing.JTextField txtcurp;
    // End of variables declaration//GEN-END:variables
}
