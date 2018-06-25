/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosDetalleValeAlmacen;
import Datos.DatosValeAlmacen;
import Documentos.ValeAlmacen;
import Modelo.Conexion;
import static Vista.Principal.Escritorio;
import static Vista.ValeActivo.txtIdValeR;
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
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Mayra
 */
public class ValesAlmacen extends javax.swing.JInternalFrame {

    Conexion cc = new Conexion();
    Connection cn = cc.GetConnection();
    Controlador c = new Controlador();
    DatosValeAlmacen dVale = new DatosValeAlmacen();
    DatosDetalleValeAlmacen dDetalle = new DatosDetalleValeAlmacen();
    String accion = "";
    int contador = 0;

    /**
     * Creates new form ValeAlmacen
     */
    public ValesAlmacen() throws SQLException {
        initComponents();
        bloquear();

        Calendar c2 = new GregorianCalendar();
        dcFecha.setCalendar(c2);

    }

    void bloquear() {
        txtResA.setEnabled(false);
        dcFecha.setEnabled(false);
        txtPerSol.setEnabled(false);
        txtArea.setEnabled(false);
        txtMaterial.setEnabled(false);
        txtCantidadS.setEnabled(false);
        txtCantidadE.setEnabled(false);
        txtUnidad.setEnabled(false);

        btnBuscarPe.setEnabled(false);
        btnBuscarCon.setEnabled(false);
        btnAdd.setEnabled(false);
        btnElim.setEnabled(false);
        btnGenerarR.setEnabled(false);
    }

    void desbloquear() {
        txtResA.setEnabled(true);
        dcFecha.setEnabled(true);
        txtPerSol.setEnabled(true);
        txtArea.setEnabled(true);
        txtMaterial.setEnabled(true);
        txtCantidadS.setEnabled(true);
        txtCantidadE.setEnabled(true);
        txtUnidad.setEnabled(true);

        btnBuscarPe.setEnabled(true);
        btnBuscarCon.setEnabled(true);
        btnAdd.setEnabled(true);
        btnElim.setEnabled(true);
        btnGenerarR.setEnabled(true);
    }

    void vaciar() {
        txtResA.setText("");
        txtPerSol.setText("");
        txtArea.setText("");
        txtMaterial.setText("");
        txtCantidadS.setText("");
        txtCantidadE.setText("");
        txtUnidad.setText("");
        txtidDetalle.setText("");
        txtidVale.setText("");
        txtidPersona.setText("");
        txtidConsumible.setText("");
    }
    
    void vaciardos(){
     txtMaterial.setText("");
        txtCantidadS.setText("");
        txtCantidadE.setText("");
        txtUnidad.setText("");   
        txtidConsumible.setText("");
    }
    void cargar_tabla(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_detalleV(valor);
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

        tbDatos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(6).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(7).setPreferredWidth(150);
    }
    
    void actualizarDatos() {
        int filasel = tbDatos.getSelectedRow();
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar Registro");
            } else {
                String iddetalle = (String) tbDatos.getValueAt(filasel, 0);           
                txtidDetalle.setText(iddetalle);
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

        jPanel2 = new javax.swing.JPanel();
        jLTitulo = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jLNombre1 = new javax.swing.JLabel();
        txtResA = new javax.swing.JTextField();
        txtArea = new javax.swing.JTextField();
        txtPerSol = new javax.swing.JTextField();
        btnBuscarPe = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        jLabel9 = new javax.swing.JLabel();
        txtidDetalle = new javax.swing.JTextField();
        txtidVale = new javax.swing.JTextField();
        txtidPersona = new javax.swing.JTextField();
        txtidConsumible = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jLMaterial = new javax.swing.JLabel();
        txtMaterial = new javax.swing.JTextField();
        btnBuscarCon = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        jLCantidadSolicitada = new javax.swing.JLabel();
        txtCantidadS = new javax.swing.JTextField();
        jLCURP5 = new javax.swing.JLabel();
        txtCantidadE = new javax.swing.JTextField();
        txtUnidad = new javax.swing.JTextField();
        jLCURP6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnCrear = new javax.swing.JButton();
        btnCancelV = new javax.swing.JButton();
        btnGenerarR = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jPanel2.setBackground(new java.awt.Color(41, 55, 61));

        jLTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLTitulo.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo.setText("Vales de Almacen");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(322, 322, 322)
                .addComponent(jLTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLTitulo)
                .addContainerGap())
        );

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
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbDatos);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLNombre1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLNombre1.setText("Responsable del Área:");

        txtResA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtArea.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtPerSol.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnBuscarPe.setBackground(new java.awt.Color(41, 55, 61));
        btnBuscarPe.setForeground(new java.awt.Color(41, 55, 61));
        btnBuscarPe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314689-24 (1).png"))); // NOI18N
        btnBuscarPe.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscarPe.setContentAreaFilled(false);
        btnBuscarPe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarPeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Área :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Persona que solicita:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Fecha:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLNombre1)
                    .addComponent(jLabel8))
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPerSol, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtResA, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addComponent(btnBuscarPe, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtArea, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(614, 614, 614)
                .addComponent(txtidDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtidVale, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtidPersona, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtidConsumible, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 113, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtidDetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidVale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidPersona, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtidConsumible, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtPerSol, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8))
                            .addComponent(btnBuscarPe)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtArea, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(txtResA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 35, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos del Solicitante ", jPanel3);

        jLMaterial.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLMaterial.setText("Material a agregar:");

        txtMaterial.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnBuscarCon.setBackground(new java.awt.Color(41, 55, 61));
        btnBuscarCon.setForeground(new java.awt.Color(41, 5, 61));
        btnBuscarCon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314689-24 (1).png"))); // NOI18N
        btnBuscarCon.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnBuscarCon.setContentAreaFilled(false);
        btnBuscarCon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarConActionPerformed(evt);
            }
        });

        btnElim.setBackground(new java.awt.Color(64, 74, 83));
        btnElim.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnElim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/315224-24.png"))); // NOI18N
        btnElim.setText("Eliminar");
        btnElim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnElim.setContentAreaFilled(false);
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(64, 74, 83));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_199_CircledPlus_183316.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnAdd.setContentAreaFilled(false);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        jLCantidadSolicitada.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLCantidadSolicitada.setText("Cantidad Solicitada:");

        txtCantidadS.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLCURP5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLCURP5.setText("Cantidad Entregada:");

        txtCantidadE.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtUnidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLCURP6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLCURP6.setText("Unidad:");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLCURP6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLMaterial)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLCantidadSolicitada)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidadS, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLCURP5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantidadE, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(btnBuscarCon, javax.swing.GroupLayout.DEFAULT_SIZE, 36, Short.MAX_VALUE)
                .addGap(82, 82, 82)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(250, 250, 250))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCon)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLMaterial)
                        .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantidadS, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCantidadSolicitada))
                .addGap(10, 10, 10)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCantidadE, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCURP5))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUnidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLCURP6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Datos del Material", jPanel4);

        btnCrear.setBackground(new java.awt.Color(64, 74, 83));
        btnCrear.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_199_CircledPlus_183316.png"))); // NOI18N
        btnCrear.setText("Crear vale");
        btnCrear.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnCrear.setContentAreaFilled(false);
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });

        btnCancelV.setBackground(new java.awt.Color(64, 74, 83));
        btnCancelV.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelV.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_cancel_216128.png"))); // NOI18N
        btnCancelV.setText("Cancelar vale");
        btnCancelV.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnCancelV.setContentAreaFilled(false);
        btnCancelV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelVActionPerformed(evt);
            }
        });

        btnGenerarR.setBackground(new java.awt.Color(64, 74, 83));
        btnGenerarR.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGenerarR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314776-24.png"))); // NOI18N
        btnGenerarR.setText("Generar Reporte");
        btnGenerarR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnGenerarR.setContentAreaFilled(false);
        btnGenerarR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarRActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(btnCancelV, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(btnGenerarR, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCrear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelV, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerarR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addComponent(jTabbedPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(14, 14, 14))
                    .addComponent(jSeparator2))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarPeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarPeActionPerformed
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
    }//GEN-LAST:event_btnBuscarPeActionPerformed

    private void btnBuscarConActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarConActionPerformed
        ConsultaConsumibles form = null;
        try {
            form = new ConsultaConsumibles();
            Escritorio.add(form);

            form.setClosable(true);
            form.setIconifiable(true);

        } catch (SQLException ex) {
            Logger.getLogger(ValesAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.toFront();
        form.setVisible(true);


    }//GEN-LAST:event_btnBuscarConActionPerformed

    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearActionPerformed
        desbloquear();
        accion = "A";
        Calendar c2 = new GregorianCalendar();
        dcFecha.setCalendar(c2);
        Calendar cal;
        int d, m, a;
        cal = dcFecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        dVale.setFecha(new Date(a, m, d));

        int num = 0;
        String up = "up";
        dVale.setIdPersona(num);
        dVale.setNombrePersona(up);
        dVale.setAreaSoli(up);
        dVale.setResponsableArea(up);
        c.agregar_vale(dVale);
        String idvale = (String.valueOf(c.selectIdVale()));
        try {
            cargar_tabla(idvale);
        } catch (SQLException ex) {
            Logger.getLogger(ValesAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        txtidVale.setText(idvale);
    }//GEN-LAST:event_btnCrearActionPerformed

    private void btnCancelVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelVActionPerformed
        dVale.setIdVale(Integer.parseInt(txtidVale.getText()));
        dDetalle.setId_vale(Integer.parseInt(txtidVale.getText()));
        c.eliminar_detalle_almacen(dDetalle);
        c.eliminarVale(dVale);
        bloquear();
        vaciar();
        this.dispose();
    }//GEN-LAST:event_btnCancelVActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed

        if (txtMaterial.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Nombre del material");
            txtMaterial.requestFocus();
            return;
        }
        if (txtCantidadS.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la cantidad solicitada del material");
            txtCantidadS.requestFocus();
            return;
        }
        if (txtCantidadE.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la cantidad entregada del material");
            txtCantidadE.requestFocus();
            return;
        }
        if (txtUnidad.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar la unidad del material");
            txtUnidad.requestFocus();
            return;
        }
        dDetalle.setId_vale(Integer.parseInt(txtidVale.getText()));
        dDetalle.setNombre_consumible(txtMaterial.getText());
        dDetalle.setId_consumible(Integer.parseInt(txtidConsumible.getText()));
        contador = contador + 1;
        dDetalle.setNum_referencia(contador);
        dDetalle.setCantidad_solici(Integer.parseInt(txtCantidadS.getText()));
        dDetalle.setCantidad_entregada(Integer.parseInt(txtCantidadE.getText()));
        dDetalle.setUnidad_consumible(txtUnidad.getText());

        if (c.Guardar_detalle_almacen(accion, dDetalle)) {
            if (accion == "A") {
                vaciardos();
             //   JOptionPane.showMessageDialog(null, "Información Agregada");
            } else if (accion == "M") {
                JOptionPane.showMessageDialog(null, "Información Modificada");
            }

            try {
                cargar_tabla(txtidVale.getText());
            } catch (SQLException ex) {
                Logger.getLogger(ValeActivo.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnGenerarRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarRActionPerformed

        if (txtPerSol.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el nombre del solicitante");
            txtPerSol.requestFocus();
            return;
        }
        if (txtArea.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el Área ");
            txtArea.requestFocus();
            return;
        }
        if (txtResA.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar el nombre del responsable de área");
            txtResA.requestFocus();
            return;
        }
        
      
        dVale.setAreaSoli(txtArea.getText());
        dVale.setResponsableArea(txtResA.getText());
        dVale.setIdPersona(Integer.parseInt(txtidPersona.getText()));
        dVale.setNombrePersona(txtPerSol.getText());
        
        if (c.modificar_vale(dVale)) {
            JOptionPane.showMessageDialog(null, "Vale generado.");
            try {

                JasperReport jr = (JasperReport) JRLoader.loadObject(ValeAlmacen.class.getResource("/Documentos/ValeConsumible.jasper"));

                Map parametro = new HashMap<String, Integer>();
                parametro.put("id_vale_almacen", Integer.parseInt(txtidVale.getText()));

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();
                vaciar();
                bloquear();
                this.dispose();
                //JasperPrintManager.printReport( jp, true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "error" + e);
            }
            
        }
        
    }//GEN-LAST:event_btnGenerarRActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
         int filasel = tbDatos.getSelectedRow();

        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccione Registro");
            } else {
                int idDetalle = (Integer.parseInt(txtidDetalle.getText()));
                c.eliminar_xregistro_detalle_almacen(idDetalle);
                cargar_tabla(txtidVale.getText());
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(ValesAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnElimActionPerformed

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
      actualizarDatos();
      
    }//GEN-LAST:event_tbDatosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBuscarCon;
    private javax.swing.JButton btnBuscarPe;
    private javax.swing.JButton btnCancelV;
    private javax.swing.JButton btnCrear;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnGenerarR;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLCURP5;
    private javax.swing.JLabel jLCURP6;
    private javax.swing.JLabel jLCantidadSolicitada;
    private javax.swing.JLabel jLMaterial;
    private javax.swing.JLabel jLNombre1;
    private javax.swing.JLabel jLTitulo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable tbDatos;
    public static javax.swing.JTextField txtArea;
    public static javax.swing.JTextField txtCantidadE;
    private javax.swing.JTextField txtCantidadS;
    public static javax.swing.JTextField txtMaterial;
    public static javax.swing.JTextField txtPerSol;
    public static javax.swing.JTextField txtResA;
    public static javax.swing.JTextField txtUnidad;
    public static javax.swing.JTextField txtidConsumible;
    public static javax.swing.JTextField txtidDetalle;
    public static javax.swing.JTextField txtidPersona;
    public static javax.swing.JTextField txtidVale;
    // End of variables declaration//GEN-END:variables
}
