/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosPersonal;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Erick
 * @author Mayra
 */
public class ConsultaPersonal extends javax.swing.JInternalFrame {

    Controlador c = new Controlador();
    String seleccion = "";
    DatosPersonal datosPersonal = new DatosPersonal();

    /**
     * Creates new form ConsultaConsumibles
     */
    public ConsultaPersonal(String accion) throws SQLException {
        initComponents();
        seleccion = accion;
    }

    void mostrar(String valor) {
        try {
            if (cbCondicion.getSelectedItem() == "Área") {
                DefaultTableModel tb = c.cargar_tabla_Personal_xarea(valor);
                tbDatos.setModel(tb);

                tbDatos.getColumnModel().getColumn(0).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(1).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(2).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
            } else if (cbCondicion.getSelectedItem() == "Nombre") {
                DefaultTableModel tb = c.cargar_tabla_Personal_xnombre(valor);
                tbDatos.setModel(tb);

                tbDatos.getColumnModel().getColumn(0).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(1).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(2).setPreferredWidth(160);
                tbDatos.getColumnModel().getColumn(3).setPreferredWidth(160);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Seleccionar una opción válida");
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
        cbCondicion = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("Consulta de Personal");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1072, 521));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

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
        tbDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tbDatosMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(tbDatos);

        jPanel3.setBackground(new java.awt.Color(41, 55, 61));

        jLabel9.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Consulta de Personal");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(333, 333, 333)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel3.setText("Dato: ");

        cbCondicion.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbCondicion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona uno...", "Área", "Nombre" }));
        cbCondicion.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCondicionItemStateChanged(evt);
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1048, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(cbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(34, 34, 34)
                        .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 681, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbCondicion, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String filtro;
        filtro = txtBuscar.getText();
        mostrar(filtro);
        txtBuscar.setText("");
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        String filtro;
        filtro = txtBuscar.getText();
        mostrar(filtro);
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void tbDatosMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMousePressed
        if (seleccion.equals("Almacen")) {
            if (evt.getClickCount() == 2) {
                int fila = tbDatos.getSelectedRow();
                String nombre, curp, area, idpersona;
                nombre = tbDatos.getValueAt(fila, 1).toString();
                curp = tbDatos.getValueAt(fila, 2).toString();
                area = tbDatos.getValueAt(fila, 3).toString();
                idpersona = tbDatos.getValueAt(fila, 0).toString();

                ValesAlmacen.txtPerSol.setText(nombre);
                ValesAlmacen.txtArea.setText(area);
                ValesAlmacen.txtidPersona.setText(idpersona);

                this.dispose();
            }
        } else if (seleccion.equals("Activo")) {
            if (evt.getClickCount() == 2) {
                int fila = tbDatos.getSelectedRow();
                String nombre, curp, area, idpersona;
                nombre = tbDatos.getValueAt(fila, 1).toString();
                curp = tbDatos.getValueAt(fila, 2).toString();
                area = tbDatos.getValueAt(fila, 3).toString();
                idpersona = tbDatos.getValueAt(fila, 0).toString();
                ValeActivo.txtName.setText(nombre);
                ValeActivo.txtArea.setText(area);
                ValeActivo.txtcurp.setText(curp);
                ValeActivo.txtCTT.setText(c.obtenerctt(area));
                ValeActivo.txtclave.setText(c.obteneclaveins(area));
                this.dispose();
            }
        } else if (seleccion.equals("Etiqueta")) {
            if (evt.getClickCount() == 2) {
                int fila = tbDatos.getSelectedRow();
                String nombre;
                nombre = tbDatos.getValueAt(fila, 1).toString();
                EtiquetasPersonal.txtNomPersonal.setText(nombre);
                this.dispose();
            }
        }else if (seleccion.equals("Reporte")) {
            if (evt.getClickCount() == 2) {
                int fila = tbDatos.getSelectedRow();
                String nombre;
                nombre = tbDatos.getValueAt(fila, 1).toString();
                ReportesPersona.txtNomPersonal.setText(nombre);
                this.dispose();
            }
        }
    }//GEN-LAST:event_tbDatosMousePressed

    private void cbCondicionItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCondicionItemStateChanged
        mostrar("");
        txtBuscar.setText("");
    }//GEN-LAST:event_cbCondicionItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JComboBox<String> cbCondicion;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtBuscar;
    // End of variables declaration//GEN-END:variables
}
