/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosAltaBien;
import Datos.DatosArea;
import static Vista.BajaBienes.comboAreas;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayra
 */
public class ConsultaBienesSeleccionar extends javax.swing.JInternalFrame {

    Controlador c = new Controlador();
    DatosAltaBien datBienes = new DatosAltaBien();
    DatosArea datArea = new DatosArea();
    String seleccion = "";

    /**
     * Creates new form ConsultaBienes
     */
    public ConsultaBienesSeleccionar(String select) throws SQLException {
        initComponents();
        seleccion = select;
    }

    public void mostrar(String buscar) {
        try {
            if (seleccion.equals("Activo")) {
                String area = ValeActivo.txtArea.getText();
                if (cbCondicion.getSelectedItem() == "Nombre") {
                    DefaultTableModel tb = c.cargar_tabla_Altabienes_nombre(area, buscar);
                    tbDatos.setModel(tb);

                    tbDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
                    tbDatos.getColumnModel().getColumn(1).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(2).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(4).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(6).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(7).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(8).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(9).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(10).setPreferredWidth(160);
                } else if (cbCondicion.getSelectedItem() == "Forma o Causa") {
                    DefaultTableModel tb = c.cargar_tabla_Altabienes_tipo(area, buscar);
                    tbDatos.setModel(tb);

                    tbDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
                    tbDatos.getColumnModel().getColumn(1).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(2).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(4).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(6).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(7).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(8).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(9).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(10).setPreferredWidth(160);
                }
            } else if (seleccion.equals("BajaBienes")) {
                String area = BajaBienes.comboAreas.getItemAt(comboAreas.getSelectedIndex()).getNombre();

                if (cbCondicion.getSelectedItem() == "Nombre") {
                    DefaultTableModel tb = c.cargar_tabla_Altabienes_nombre(area, buscar);
                    tbDatos.setModel(tb);

                    tbDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
                    tbDatos.getColumnModel().getColumn(1).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(2).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(4).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(6).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(7).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(8).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(9).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(10).setPreferredWidth(160);
                } else if (cbCondicion.getSelectedItem() == "Forma o Causa") {
                    DefaultTableModel tb = c.cargar_tabla_Altabienes_tipo(area, buscar);
                    tbDatos.setModel(tb);

                    tbDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
                    tbDatos.getColumnModel().getColumn(1).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(2).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(4).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(6).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(7).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(8).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(9).setPreferredWidth(160);
                    tbDatos.getColumnModel().getColumn(10).setPreferredWidth(160);
                }
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
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
        txtBuscar = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbCondicion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de bienes");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1072, 521));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        btnBuscar.setBackground(new java.awt.Color(41, 55, 61));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Search_24px.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(null);
        btnBuscar.setBorderPainted(false);
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.setOpaque(true);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Dato: ");

        cbCondicion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona uno...", "Nombre", "Forma o Causa" }));
        cbCondicion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCondicionItemStateChanged(evt);
            }
        });
        cbCondicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCondicionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Buscar por:");

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
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbDatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbDatos);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 216, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(41, 55, 61));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Consulta de Bienes");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jLabel10)
                .addContainerGap(414, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String filtro;
        filtro = txtBuscar.getText();
        mostrar(filtro);

    }//GEN-LAST:event_txtBuscarKeyReleased

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed

        String filtro;
        filtro = txtBuscar.getText();
        mostrar(filtro);
        txtBuscar.setText("");

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void cbCondicionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCondicionItemStateChanged
        mostrar("");
        txtBuscar.setText("");
    }//GEN-LAST:event_cbCondicionItemStateChanged

    private void cbCondicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCondicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCondicionActionPerformed

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked

        if (seleccion.equals("Activo")) {
            if (evt.getClickCount() == 2) {
                int fila = tbDatos.getSelectedRow();
                String idbien, nombre, ninventario, marca, serie, valor, modelo, cantidad;

                idbien = tbDatos.getValueAt(fila, 0).toString();
                nombre = tbDatos.getValueAt(fila, 5).toString();
                cantidad = tbDatos.getValueAt(fila, 6).toString();
                ninventario = tbDatos.getValueAt(fila, 1).toString();
                marca = tbDatos.getValueAt(fila, 7).toString();
                modelo = tbDatos.getValueAt(fila, 8).toString();
                serie = tbDatos.getValueAt(fila, 9).toString();
                valor = tbDatos.getValueAt(fila, 10).toString();

                ValeActivo.txtIdBien.setText(idbien);
                ValeActivo.txtNomBien.setText(nombre);
                ValeActivo.txtNInventario.setText(ninventario);
                ValeActivo.txtMarca.setText(marca);
                ValeActivo.txtModelo.setText(modelo);
                ValeActivo.txtSerie.setText(serie);
                ValeActivo.txtValor.setText(valor);
                ValeActivo.txtCantB.setText(cantidad);
                this.dispose();
            }
        } else if (seleccion.equals("BajaBienes")) {
            if (evt.getClickCount() == 2) {
                int fila = tbDatos.getSelectedRow();
                String nombre, valor, idbien, cantidad, fecha;
                nombre = tbDatos.getValueAt(fila, 5).toString();
                fecha = tbDatos.getValueAt(fila, 3).toString();
                valor = tbDatos.getValueAt(fila, 10).toString();
                idbien = tbDatos.getValueAt(fila, 0).toString();
                cantidad = tbDatos.getValueAt(fila, 6).toString();

                BajaBienes.txtDescripcion.setText(nombre);
                BajaBienes.dcFechaAlta.setText(fecha);
                BajaBienes.txtValor.setText(valor);
                BajaBienes.txtIdbien.setText(idbien);
                BajaBienes.txtCantAlta.setText(cantidad);
                this.dispose();
            }
        }

    }//GEN-LAST:event_tbDatosMouseClicked

    private void tbDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMousePressed

    }//GEN-LAST:event_tbDatosMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbCondicion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
