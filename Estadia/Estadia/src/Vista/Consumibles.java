/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosConsumible;
import Modelo.Modelo;
import java.sql.Date;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayra
 */
public class Consumibles extends javax.swing.JInternalFrame {

    DatosConsumible datCons = new DatosConsumible();
    Controlador c = new Controlador();
    Modelo m = new Modelo();
    String accion = "";

    /**
     * Creates new form Consumibles
     */
    public Consumibles() throws SQLException {
        initComponents();
        txtidConsum.setVisible(false);
        bloquear();
        cargar_tabla_consumibles("");

    }

    void bloquear() {
        txtCod.setEnabled(false);
        txtNombre.setEnabled(false);
        dcFecha.setEnabled(false);
        txtStock.setEnabled(false);
        txtValor.setEnabled(false);

        btnAdd.setEnabled(true);
        btneditar.setEnabled(true);
        btnEliminar.setEnabled(true);
        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);

    }

    void desbloquear() {
        txtCod.setEnabled(true);
        txtNombre.setEnabled(true);
        dcFecha.setEnabled(true);
        txtStock.setEnabled(true);
        txtValor.setEnabled(true);

        btnAdd.setEnabled(false);
        btneditar.setEnabled(false);
        btnEliminar.setEnabled(false);
        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
    }

    void limpiar() {
        txtCod.setText("");
        txtNombre.setText("");
        txtStock.setText("");
        txtValor.setText("");
    }

    void cargar_tabla_consumibles(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_consumibles(valor);
        tbDatos.setModel(tb);

        tbDatos.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(5).setPreferredWidth(150);

    }

    void actualizarDatos() {
        int filasel = tbDatos.getSelectedRow();
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar Registro");

            } else {
                String idCon = (String) tbDatos.getValueAt(filasel, 0);
                String codigo = (String) tbDatos.getValueAt(filasel, 1);
                String nombre = (String) tbDatos.getValueAt(filasel, 2);
                String stock = (String) tbDatos.getValueAt(filasel, 4);
                String valor = (String) tbDatos.getValueAt(filasel, 5);

                txtidConsum.setText(idCon);
                txtCod.setText(codigo);
                txtNombre.setText(nombre);
                txtStock.setText(stock);
                txtValor.setText(valor);

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCod = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtStock = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btneditar = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        dcFecha = new com.toedter.calendar.JDateChooser();
        txtidConsum = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setPreferredSize(new java.awt.Dimension(1000, 500));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Codigo: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Nombre: ");

        jLFecha.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLFecha.setText("Fecha de adquisición:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Valor total: ");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Stock:");

        txtCod.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtStock.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btneditar.setBackground(new java.awt.Color(64, 74, 83));
        btneditar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btneditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314502-24.png"))); // NOI18N
        btneditar.setText("Modificar");
        btneditar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btneditar.setContentAreaFilled(false);
        btneditar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btneditarMouseClicked(evt);
            }
        });

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

        btnEliminar.setBackground(new java.awt.Color(64, 74, 83));
        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/315224-24.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnEliminar.setContentAreaFilled(false);
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(64, 74, 83));
        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_save_2639912.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnGuardar.setContentAreaFilled(false);
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(64, 74, 83));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/if_cancel_216128.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        dcFecha.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tbDatos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex,int columnIndex){
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
        jScrollPane1.setViewportView(tbDatos);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel5))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtValor)
                                        .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLFecha))
                                .addGap(47, 47, 47)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtStock, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(txtidConsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(187, 187, 187)
                                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(132, 132, 132)
                                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(228, 228, 228))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtidConsum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jLFecha)))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtStock, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCod, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btneditar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );

        jPanel3.setBackground(new java.awt.Color(41, 55, 61));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Bienes Consumibles ");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(361, 361, 361)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 629, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        desbloquear();
        limpiar();
        accion = "A";
        txtCod.requestFocus();
        dcFecha.setVisible(true);
        dcFecha.setEnabled(true);
        jLFecha.setVisible(true);

        Calendar c2 = new GregorianCalendar();
        dcFecha.setCalendar(c2);
    }//GEN-LAST:event_btnAddMouseClicked

    private void btneditarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btneditarMouseClicked
        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccionar Registro");
        } else {

            desbloquear();
            accion = "M";
            dcFecha.setVisible(false);
            dcFecha.setEnabled(false);
            jLFecha.setVisible(false);
            txtCod.requestFocus();
        }
    }//GEN-LAST:event_btneditarMouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro de la Tabla");
            return;
        }

//        if (txtidConsum.getText().length() == 0) {
//            JOptionPane.showMessageDialog(null, "Seleccione un Registro de la Tabla");
//            return;
//        }
        int i = JOptionPane.showConfirmDialog(this, "Si elimina el Consumible lo borrara de las ventas asociadas a el ¿Desea Eliminar?", "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION);
        if (i == 0) {
            if (!txtidConsum.getText().equals("")) {
                datCons.setIdConsumible(txtidConsum.getText());
                c.eliminar_consumible(datCons);
                try {
                    cargar_tabla_consumibles("");
                } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
                limpiar();
                bloquear();
            } else {

                JOptionPane.showMessageDialog(null, "No se elimino el consumible.");
            }
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if (txtCod.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Codigo");
            txtCod.requestFocus();
            return;
        }

        if (txtNombre.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un nombre de consumible");
            txtNombre.requestFocus();
            return;
        }
          if (txtStock.getText().length() == 0) {
            JOptionPane.showMessageDialog(null,"Debes ingresar un Stock");
            txtStock.requestFocus();
            return;
        }

        if (txtValor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar valor total");
            txtValor.requestFocus();
            return;
        }
        Calendar cal;
        int d, m, a;
        cal = dcFecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        datCons.setFechaC(new Date(a, m, d));
        Date fecha = datCons.getFechaC();

        String idConsumible = txtidConsum.getText();
        datCons.setCodigo(txtCod.getText());
        datCons.setNombre(txtNombre.getText());
        datCons.setStock(txtStock.getText());
        datCons.setValorT(txtValor.getText());

        if (c.Guardar_consumible(accion, datCons, idConsumible)) {
            if (accion == "A") {
                JOptionPane.showMessageDialog(null, "Consumible Agregado.");
            } else if (accion == "M") {
                JOptionPane.showMessageDialog(null, "Consumible Actualizado.");
            }
            limpiar();
            bloquear();
            try {
                cargar_tabla_consumibles("");
            } catch (SQLException ex) {
                Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        bloquear();
        limpiar();
        try {
            cargar_tabla_consumibles("");
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked

    }//GEN-LAST:event_tbDatosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btneditar;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtCod;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtStock;
    private javax.swing.JTextField txtValor;
    private javax.swing.JTextField txtidConsum;
    // End of variables declaration//GEN-END:variables
}
