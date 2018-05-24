/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosArea;
import Modelo.Modelo;
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
        txtNombreC.setEnabled(false);
        txtClaveP.setEnabled(false);
        txtDomicilioC.setEnabled(false);
        txtTelefonoC.setEnabled(false);

        btnAdd.setEnabled(true);
        btnMod.setEnabled(true);
        btnElim.setEnabled(true);
        btnsave.setEnabled(false);
        btncancel.setEnabled(false);

    }

    void desbloquear() {
        txtNombreC.setEnabled(true);
        txtClaveP.setEnabled(true);
        txtDomicilioC.setEnabled(true);
        txtTelefonoC.setEnabled(true);

        btnAdd.setEnabled(false);
        btnMod.setEnabled(false);
        btnElim.setEnabled(false);
        btnsave.setEnabled(true);
        btncancel.setEnabled(true);
    }

    void limpiar() {
        txtClaveP.setText("");
        txtNombreC.setText("");
        txtDomicilioC.setText("");
        txtTelefonoC.setText("");
    }
    
    void cargar_tabla_areas(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_Areas(valor);
        tbDatos.setModel(tb);

        tbDatos.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(4).setPreferredWidth(150);

    }

    void actualizarDatos() {
        int filasel = tbDatos.getSelectedRow();
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar Registro");

            } else {
                String idarea = (String) tbDatos.getValueAt(filasel, 0);
                String nombre = (String) tbDatos.getValueAt(filasel, 1);
                String claveP = (String) tbDatos.getValueAt(filasel, 2);
                String domicilio = (String) tbDatos.getValueAt(filasel, 3);
                String telefono = (String) tbDatos.getValueAt(filasel, 4);

                txtId.setText(idarea);
                txtNombreC.setText(nombre);
                txtClaveP.setText(claveP);
                txtDomicilioC.setText(domicilio);
                txtTelefonoC.setText(telefono);

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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreC = new javax.swing.JTextField();
        txtTelefonoC = new javax.swing.JTextField();
        txtDomicilioC = new javax.swing.JTextField();
        txtClaveP = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nombre del centro de Trabajo :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Teléfono(s) o Extenció(es): ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Domicilio: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Clave presupuestal del CCT:");

        txtNombreC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTelefonoC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtDomicilioC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtClaveP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(64, 74, 83));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_199_CircledPlus_183316.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnAdd.setContentAreaFilled(false);
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnMod.setBackground(new java.awt.Color(64, 74, 83));
        btnMod.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314502-24.png"))); // NOI18N
        btnMod.setText("Modificar");
        btnMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnMod.setContentAreaFilled(false);
        btnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModMouseClicked(evt);
            }
        });

        btnElim.setBackground(new java.awt.Color(64, 74, 83));
        btnElim.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnElim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/315224-24.png"))); // NOI18N
        btnElim.setText("Eliminar");
        btnElim.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnElim.setContentAreaFilled(false);
        btnElim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElimMouseClicked(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(64, 74, 83));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_save_2639912.png"))); // NOI18N
        btnsave.setText("Guardar");
        btnsave.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnsave.setContentAreaFilled(false);
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });

        btncancel.setBackground(new java.awt.Color(64, 74, 83));
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_cancel_216128.png"))); // NOI18N
        btncancel.setText("Cancelar");
        btncancel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btncancel.setContentAreaFilled(false);
        btncancel.setMaximumSize(new java.awt.Dimension(45, 21));
        btncancel.setMinimumSize(new java.awt.Dimension(45, 21));
        btncancel.setPreferredSize(new java.awt.Dimension(45, 21));
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addComponent(txtClaveP, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtTelefonoC)
                            .addComponent(txtDomicilioC, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(117, 117, 117))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDomicilioC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTelefonoC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(txtClaveP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addGap(5, 5, 5)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(41, 55, 61));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Areas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel10)
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
        tbDatos.getTableHeader().setReorderingAllowed(false);
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbDatosMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbDatos);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        desbloquear();
        limpiar();
        accion = "A";
        txtNombreC.requestFocus();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseClicked
        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccionar Registro");
        } else {
            desbloquear();
            accion = "M";
            txtNombreC.requestFocus();
        }
    }//GEN-LAST:event_btnModMouseClicked

    private void btnElimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimMouseClicked
        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro de la Tabla");
            return;
        }
        //        if (txtId.getText().length() == 0) {
            //            JOptionPane.showConfirmDialog(null, "Seleccione un registro de la tabla");
            //            return;
            //        }
        int i = JOptionPane.showConfirmDialog(this, "Si elimina el usuario lo borrara de las ventas asociadas a el ¿Desea Eliminar?", "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            if (!txtId.getText().equals("")) {
                datAreas.setIdArea(txtId.getText());
                c.eliminar_area(datAreas);
                try {
                    cargar_tabla_areas("");
                } catch (SQLException ex) {
                    Logger.getLogger(Areas.class.getName()).log(Level.SEVERE, null, ex);
                }
                limpiar();
                bloquear();
            } else {
                JOptionPane.showMessageDialog(null, "No se elimino el usuario.");
            }
        }
    }//GEN-LAST:event_btnElimMouseClicked

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        if (txtNombreC.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Nombre Válido");
            txtNombreC.requestFocus();
            return;
        }
        if (txtDomicilioC.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Domicilio");
            txtDomicilioC.requestFocus();
            return;
        }
        if (txtClaveP.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Clave Presupuestal");
            txtClaveP.requestFocus();
            return;
        }
        if (txtTelefonoC.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar Telefono");
            txtTelefonoC.requestFocus();
            return;
        }

        String idArea = txtId.getText();
        datAreas.setNombre(txtNombreC.getText());
        datAreas.setTelefono(txtTelefonoC.getText());
        datAreas.setClave_pres(txtClaveP.getText());
        datAreas.setDomicilio(txtDomicilioC.getText());

        if (c.Guardar_area(accion, datAreas, idArea)) {
            if (accion == "A") {
                JOptionPane.showMessageDialog(null, "Usuario Agregado.");
            } else if (accion == "M") {
                JOptionPane.showMessageDialog(null, "Usuario Actualizado.");
            }
            limpiar();
            bloquear();
            try {
                cargar_tabla_areas("");
            } catch (SQLException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
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
    private javax.swing.JTextField txtClaveP;
    private javax.swing.JTextField txtDomicilioC;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtNombreC;
    private javax.swing.JTextField txtTelefonoC;
    // End of variables declaration//GEN-END:variables
}