/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosArea;
import Modelo.Modelo;
import static Vista.Principal.Escritorio;
import java.awt.event.KeyEvent;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayra
 */
public class Areas extends javax.swing.JInternalFrame {
    DatosArea datAreas = new DatosArea();
    Controlador c = new Controlador();
    Modelo m = new Modelo();
    String accion = "";

    /**
     * Creates new form Areas
     */
    public Areas() throws SQLException {
        initComponents();
        bloquear();
        cargar_tabla_areas("");
    }

    void bloquear() {
        txtId.setVisible(false);
        txtNombreA.setEnabled(false);
        txtClaveCTT.setEnabled(false);
        txtClaveI.setEnabled(false);

        btnAdd.setEnabled(true);
        btnMod.setEnabled(true);
        btnElim.setEnabled(true);
        btnsave.setEnabled(false);
        btncancel.setEnabled(false);

    }

    void desbloquear() {
        txtNombreA.setEnabled(true);
        txtClaveCTT.setEnabled(true);
        txtClaveI.setEnabled(true);

        btnAdd.setEnabled(false);
        btnMod.setEnabled(false);
        btnElim.setEnabled(false);
        btnsave.setEnabled(true);
        btncancel.setEnabled(true);
    }

    void limpiar() {
        txtClaveCTT.setText("");
        txtNombreA.setText("");
        txtClaveI.setText("");
    }

    void cargar_tabla_areas(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_Areas(valor);
        tbDatos.setModel(tb);

        tbDatos.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(3).setPreferredWidth(150);

    }

    void actualizarDatos() {
        int filasel = tbDatos.getSelectedRow();
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar Registro");

            } else {
                String idarea = (String) tbDatos.getValueAt(filasel, 0);
                String nombre = (String) tbDatos.getValueAt(filasel, 1);
                String clavectt = (String) tbDatos.getValueAt(filasel, 2);
                String claveinst = (String) tbDatos.getValueAt(filasel, 3);

                txtId.setText(idarea);
                txtNombreA.setText(nombre);
                txtClaveCTT.setText(clavectt);
                txtClaveI.setText(claveinst);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreA = new javax.swing.JTextField();
        txtClaveI = new javax.swing.JTextField();
        txtClaveCTT = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Areas");
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(41, 55, 61));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Areas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(467, 467, 467))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nombre del Área :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Clave Insitucional:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Clave del CCT:");

        txtNombreA.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtNombreA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNombreAKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreAKeyTyped(evt);
            }
        });

        txtClaveI.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClaveI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveIKeyTyped(evt);
            }
        });

        txtClaveCTT.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtClaveCTT.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtClaveCTTKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtClaveCTTKeyTyped(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(41, 55, 61));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Add_24px.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setOpaque(true);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnMod.setBackground(new java.awt.Color(41, 55, 61));
        btnMod.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnMod.setForeground(new java.awt.Color(255, 255, 255));
        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Edit_24px.png"))); // NOI18N
        btnMod.setText("Modificar");
        btnMod.setBorder(null);
        btnMod.setBorderPainted(false);
        btnMod.setContentAreaFilled(false);
        btnMod.setDefaultCapable(false);
        btnMod.setOpaque(true);
        btnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModMouseClicked(evt);
            }
        });

        btnElim.setBackground(new java.awt.Color(41, 55, 61));
        btnElim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnElim.setForeground(new java.awt.Color(255, 255, 255));
        btnElim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Trash_24px.png"))); // NOI18N
        btnElim.setText("Eliminar");
        btnElim.setBorder(null);
        btnElim.setBorderPainted(false);
        btnElim.setContentAreaFilled(false);
        btnElim.setDefaultCapable(false);
        btnElim.setOpaque(true);
        btnElim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElimMouseClicked(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(41, 55, 61));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Save_24px.png"))); // NOI18N
        btnsave.setText("Guardar");
        btnsave.setBorder(null);
        btnsave.setBorderPainted(false);
        btnsave.setContentAreaFilled(false);
        btnsave.setDefaultCapable(false);
        btnsave.setOpaque(true);
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(41, 55, 61));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btncancel.setForeground(new java.awt.Color(255, 255, 255));
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Unavailable_24px.png"))); // NOI18N
        btncancel.setText("Cancelar");
        btncancel.setBorder(null);
        btncancel.setBorderPainted(false);
        btncancel.setContentAreaFilled(false);
        btncancel.setDefaultCapable(false);
        btncancel.setMaximumSize(new java.awt.Dimension(45, 21));
        btncancel.setMinimumSize(new java.awt.Dimension(45, 21));
        btncancel.setOpaque(true);
        btncancel.setPreferredSize(new java.awt.Dimension(45, 21));
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });

        jScrollPane2.setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane2.setForeground(new java.awt.Color(255, 255, 255));

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
        tbDatos.setGridColor(new java.awt.Color(255, 255, 255));
        tbDatos.getTableHeader().setReorderingAllowed(false);
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDatos);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtClaveCTT, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(146, 146, 146)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(txtClaveI, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addGap(117, 117, 117))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1052, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel3))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel5)
                                    .addComponent(txtClaveI, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNombreA, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtClaveCTT, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        desbloquear();
        limpiar();
        accion = "A";
        txtNombreA.requestFocus();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseClicked
        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccionar Registro");
        } else {
            desbloquear();
            accion = "M";
            txtNombreA.requestFocus();
        }
    }//GEN-LAST:event_btnModMouseClicked

    private void btnElimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimMouseClicked

        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro de la Tabla");
            return;
        }
        String firma = JOptionPane.showInputDialog("Ingrese su Firma Digital");

        if (firma.equals(c.obtenerFirma())) {

            if (!txtId.getText().equals("")) {
                datAreas.setIdArea(Integer.parseInt(txtId.getText()));
                c.eliminar_area(datAreas);
                try {
                    cargar_tabla_areas("");
                } catch (SQLException ex) {
                    Logger.getLogger(Areas.class.getName()).log(Level.SEVERE, null, ex);
                }
                limpiar();
                bloquear();
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino el área.");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Firma incorrecta");
        }
        //        if (txtId.getText().length() == 0) {
        //            JOptionPane.showConfirmDialog(null, "Seleccione un registro de la tabla");
        //            return;
        //        }

    }//GEN-LAST:event_btnElimMouseClicked

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        if (txtNombreA.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre de área");
            txtNombreA.requestFocus();
            return;
        }
        if (txtClaveI.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una clave institucional");
            txtClaveI.requestFocus();
            return;
        }
        if (txtClaveCTT.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Clave de trabajo");
            txtClaveCTT.requestFocus();
            return;
        }

        String firma = JOptionPane.showInputDialog("Ingrese su Firma Digital");
        String verificar = c.obtenerFirma();
        if (firma.equals(c.obtenerFirma())) {
            String idArea = txtId.getText();
            datAreas.setNombre(txtNombreA.getText());
            datAreas.setClave_ctt(txtClaveCTT.getText());
            datAreas.setClave_inst(txtClaveI.getText());

            if (c.Guardar_area(accion, datAreas, idArea)) {
                if (accion == "A") {
                    JOptionPane.showMessageDialog(null, "Área Agregada.");
                } else if (accion == "M") {
                    JOptionPane.showMessageDialog(null, "Área Actualizada.");
                }
                limpiar();
                bloquear();
                try {
                    cargar_tabla_areas("");
                } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Firma incorrecta");
        }

    }//GEN-LAST:event_btnsaveMouseClicked

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        bloquear();
        limpiar();
        try {
            cargar_tabla_areas("");
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncancelMouseClicked

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
        actualizarDatos();
        bloquear();
    }//GEN-LAST:event_tbDatosMouseClicked

    private void txtNombreAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAKeyTyped
        if (txtNombreA.getText().length() == 60) {
            evt.consume();
        }
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
    }//GEN-LAST:event_txtNombreAKeyTyped

    private void txtClaveCTTKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveCTTKeyTyped
        if (txtClaveCTT.getText().length() == 10) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
        
    }//GEN-LAST:event_txtClaveCTTKeyTyped

    private void txtClaveIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveIKeyTyped
        if (txtClaveI.getText().length() == 5) {
            evt.consume();
        }
        char a = evt.getKeyChar();
        if (!Character.isDigit(a)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtClaveIKeyTyped

    private void txtNombreAKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreAKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtClaveCTT.requestFocus();
        }
    }//GEN-LAST:event_txtNombreAKeyPressed

    private void txtClaveCTTKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtClaveCTTKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            txtClaveI.requestFocus();
        }
    }//GEN-LAST:event_txtClaveCTTKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtClaveCTT;
    private javax.swing.JTextField txtClaveI;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreA;
    // End of variables declaration//GEN-END:variables
}
