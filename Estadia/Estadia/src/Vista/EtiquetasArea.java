/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.DatosArea;
import Etiquetas.Etiquetaarea;
import Modelo.Conexion;
import Modelo.Modelo;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Erick
 */
public class EtiquetasArea extends javax.swing.JInternalFrame {

    Conexion cc = new Conexion();
    Connection cn = cc.GetConnection();
    Controlador c = new Controlador();
    Modelo m = new Modelo();
    DatosArea datArea = new DatosArea();

    /**
     * Creates new form EtiquetasArea
     */
    public EtiquetasArea() {
        initComponents();
        datArea.mostrarComboAreas(comboAreas);
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
        comboAreas = new javax.swing.JComboBox<>();
        jLArea = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGenerar2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLTitulo24 = new javax.swing.JLabel();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("Etiquetas por area");
        setFrameIcon(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLArea.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLArea.setText("Area:");

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

        btnGenerar2.setBackground(new java.awt.Color(41, 55, 61));
        btnGenerar2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerar2.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_QR_Code_24px_2.png"))); // NOI18N
        btnGenerar2.setText("Generar Etiquetas");
        btnGenerar2.setBorder(null);
        btnGenerar2.setBorderPainted(false);
        btnGenerar2.setContentAreaFilled(false);
        btnGenerar2.setOpaque(true);
        btnGenerar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerar2MouseClicked(evt);
            }
        });
        btnGenerar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerar2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnGenerar2, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLArea)
                .addGap(18, 18, 18)
                .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(47, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLArea))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnGenerar2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        jPanel2.setBackground(new java.awt.Color(41, 55, 61));

        jLTitulo24.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLTitulo24.setForeground(new java.awt.Color(255, 255, 255));
        jLTitulo24.setText("Etiquetas por area");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(175, 175, 175)
                .addComponent(jLTitulo24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(170, 170, 170))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLTitulo24, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 190, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGenerar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerar2MouseClicked
        try { 
            
                JasperReport jr = (JasperReport) JRLoader.loadObject(Etiquetaarea.class.getResource("/Etiquetas/EtiquetaArea.jasper"));

                Map parametro = new HashMap<String, String>();
                parametro.put("CodeBar", comboAreas.getItemAt(comboAreas.getSelectedIndex()).getNombre());

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();

                //JasperPrintManager.printReport( jp, true);
               
                this.dispose();
        } catch (Exception e) { 
            JOptionPane.showMessageDialog(rootPane, "error" + e);
        }
    }//GEN-LAST:event_btnGenerar2MouseClicked

    private void btnGenerar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerar2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnGenerar2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar2;
    private javax.swing.JComboBox<DatosArea> comboAreas;
    private javax.swing.JLabel jLArea;
    private javax.swing.JLabel jLTitulo24;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
