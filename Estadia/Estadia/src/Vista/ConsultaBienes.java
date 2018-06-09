/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosAltaBien;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Mayra
 */
public class ConsultaBienes extends javax.swing.JInternalFrame {
    
    Controlador c = new Controlador();
    DatosAltaBien datBienes = new DatosAltaBien();
    /**
     * Creates new form ConsultaBienes
     */
    public ConsultaBienes() throws SQLException {
        initComponents();
    }
    
    
    public void mostrar(String buscar) {
        
        try {
            
            //DefaultTableModel modelo = null;

            if (cbTablas.getSelectedItem() == "Alta de Bienes") {
                if (cbCond.getSelectedItem() == "Area") {
                    DefaultTableModel tb = c.cargar_tabla_Altabienes_area(buscar);
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
                } else if (cbCond.getSelectedItem() == "Nombre") {
                    DefaultTableModel tb = c.cargar_tabla_Altabienes_nombre(buscar);
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
                
            } else if (cbTablas.getSelectedItem() == "Baja de Bienes") {
                if (cbCond.getSelectedItem() == "Area") {
                    DefaultTableModel tb = c.cargar_tabla_Bajabienes_area(buscar);
                tbDatos.setModel(tb);

                tbDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
                tbDatos.getColumnModel().getColumn(1).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(2).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(4).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(6).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(7).setPreferredWidth(160);
                } else if (cbCond.getSelectedItem() == "Nombre") {
                    DefaultTableModel tb = c.cargar_tabla_Bajabienes_nombre(buscar);
                tbDatos.setModel(tb);

                tbDatos.getColumnModel().getColumn(0).setPreferredWidth(40);
                tbDatos.getColumnModel().getColumn(1).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(2).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(4).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(5).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(6).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(7).setPreferredWidth(160);
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbTablas = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbCond = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

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
        jScrollPane1.setViewportView(tbDatos);

        jPanel3.setBackground(new java.awt.Color(41, 55, 61));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consulta de Bienes");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        btnBuscar.setBackground(new java.awt.Color(64, 74, 83));
        btnBuscar.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314689-24 (1).png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnBuscar.setContentAreaFilled(false);
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Dato: ");

        cbTablas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbTablas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una Tabla...", "Alta de Bienes", "Baja de Bienes" }));
        cbTablas.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbTablasItemStateChanged(evt);
            }
        });
        cbTablas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbTablasActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Tabla");

        cbCond.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbCond.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Buscar por...", "Area", "Nombre" }));
        cbCond.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCondItemStateChanged(evt);
            }
        });
        cbCond.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCondActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Buscar por:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 578, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(cbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbCond, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(71, 71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbCond, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbTablas, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(27, 27, 27))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
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

    private void cbTablasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbTablasActionPerformed
        
    }//GEN-LAST:event_cbTablasActionPerformed

    private void cbTablasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbTablasItemStateChanged
        
        
    }//GEN-LAST:event_cbTablasItemStateChanged

    private void cbCondItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCondItemStateChanged
        mostrar("");
        txtBuscar.setText("");
    }//GEN-LAST:event_cbCondItemStateChanged

    private void cbCondActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCondActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCondActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbCond;
    private javax.swing.JComboBox<String> cbTablas;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
