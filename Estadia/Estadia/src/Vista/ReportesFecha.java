/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Modelo.Conexion;
import Reportes.AltaBienesR;
import Reportes.AsignacionBienesR;
import Reportes.ConsumiblesR;
import Reportes.SalidaConsumiblesR;
import java.sql.Connection;
import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
/**
 *
 * @author Mayra
 */
public class ReportesFecha extends javax.swing.JInternalFrame {

    Conexion cc = new Conexion();
    Connection cn = cc.GetConnection();
    String seleccion = "";
    /**
     * Creates new form ReportesFecha
     */
    public ReportesFecha(String select) {
        initComponents();
        Calendar c2 = new GregorianCalendar();
        dcFechaInicio.setCalendar(c2);
        dcFechaFin.setCalendar(c2);
        Calendar cal;
        int d, m, a;
        cal = dcFechaInicio.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        Calendar cale;
        int di, me, an;
        cale = dcFechaFin.getCalendar();
        di = cale.get(Calendar.DAY_OF_MONTH);
        me = cale.get(Calendar.MONTH);
        an = cale.get(Calendar.YEAR) - 1900;
        seleccion = select;
        if (seleccion.equals("AltaBienes")) {
            lbTitulo.setText("Reporte de Alta de Bienes por Fecha");
        } else if (seleccion.equals("BajaBienes")) {
            lbTitulo.setText("Reporte de Baja de Bienes por Fecha");
        } else if (seleccion.equals("AsigBienes")) {
            lbTitulo.setText("Reporte de Asignación de Bienes por Fecha");
        } else if (seleccion.equals("SalConsumibles")) {
            lbTitulo.setText("Reporte Salida de Almacén por Fecha");
        } else if (seleccion.equals("Consumibles")) {
            lbTitulo.setText("Reporte de Consumibles por Fecha");
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
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnGenerar = new javax.swing.JButton();
        dcFechaInicio = new com.toedter.calendar.JDateChooser();
        jLFecha = new javax.swing.JLabel();
        dcFechaFin = new com.toedter.calendar.JDateChooser();
        jLFecha1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lbTitulo = new javax.swing.JLabel();

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        btnCancelar.setBackground(new java.awt.Color(41, 55, 61));
        btnCancelar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Unavailable_24px.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(null);
        btnCancelar.setBorderPainted(false);
        btnCancelar.setContentAreaFilled(false);
        btnCancelar.setOpaque(true);
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGenerar.setBackground(new java.awt.Color(41, 55, 61));
        btnGenerar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerar.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Paid_24px_1.png"))); // NOI18N
        btnGenerar.setText("Generar");
        btnGenerar.setBorder(null);
        btnGenerar.setBorderPainted(false);
        btnGenerar.setContentAreaFilled(false);
        btnGenerar.setDefaultCapable(false);
        btnGenerar.setOpaque(true);
        btnGenerar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGenerarMouseClicked(evt);
            }
        });

        dcFechaInicio.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLFecha.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLFecha.setText("Fecha de inicio:");

        dcFechaFin.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLFecha1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLFecha1.setText("Fecha de término:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(60, 60, 60))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFecha)
                    .addComponent(jLFecha1))
                .addGap(21, 21, 21)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(dcFechaFin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addGap(13, 13, 13)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLFecha1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(dcFechaFin, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        jPanel1.setBackground(new java.awt.Color(41, 55, 61));

        lbTitulo.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbTitulo)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked

    }//GEN-LAST:event_btnCancelarMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGenerarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGenerarMouseClicked
        if (seleccion.equals("AltaBienes")) {
            try {

                JasperReport jr = (JasperReport) JRLoader.loadObject(AltaBienesR.class.getResource("/Reportes/AltaBienesFecha.jasper"));
                Map parametro = new HashMap<String, Date>();

                parametro.put("fecha_inicio", dcFechaInicio.getDate());
                parametro.put("fecha_termino", dcFechaFin.getDate());

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();

                //JasperPrintManager.printReport(jp, true);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "error" + e);
            }
        } else if (seleccion.equals("BajaBienes")) {
            try {

                JasperReport jr = (JasperReport) JRLoader.loadObject(BajaBienes.class.getResource("/Reportes/BajaBienesFecha.jasper"));
                Map parametro = new HashMap<String, Date>();

                parametro.put("fecha_inicio", dcFechaInicio.getDate());
                parametro.put("fecha_termino", dcFechaFin.getDate());

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();

                //JasperPrintManager.printReport(jp, true);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "error" + e);
            }
        } else if (seleccion.equals("AsigBienes")) {
            try {

                JasperReport jr = (JasperReport) JRLoader.loadObject(AsignacionBienesR.class.getResource("/Reportes/AsignBienesFecha.jasper"));
                Map parametro = new HashMap<String, Date>();

                parametro.put("fecha_inicio", dcFechaInicio.getDate());
                parametro.put("fecha_termino", dcFechaFin.getDate());

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();

                //JasperPrintManager.printReport(jp, true);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "error" + e);
            }
        } else if (seleccion.equals("SalConsumibles")) {
            try {

                JasperReport jr = (JasperReport) JRLoader.loadObject(SalidaConsumiblesR.class.getResource("/Reportes/SalidaConsumiblesFecha.jasper"));
                Map parametro = new HashMap<String, Date>();

                parametro.put("fecha_inicio", dcFechaInicio.getDate());
                parametro.put("fecha_termino", dcFechaFin.getDate());

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();

                //JasperPrintManager.printReport(jp, true);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "error" + e);
            }
        } else if (seleccion.equals("Consumibles")) {
            try {

                JasperReport jr = (JasperReport) JRLoader.loadObject(ConsumiblesR.class.getResource("/Reportes/ConsumiblesFecha.jasper"));
                Map parametro = new HashMap<String, Date>();

                parametro.put("fecha_inicio", dcFechaInicio.getDate());
                parametro.put("fecha_termino", dcFechaFin.getDate());

                JasperPrint jp = JasperFillManager.fillReport(jr, parametro, cn);
                JasperViewer jv = new JasperViewer(jp, false);
                jv.show();

                //JasperPrintManager.printReport(jp, true);
            } catch (Exception e) {

                JOptionPane.showMessageDialog(rootPane, "error" + e);
            }
        }
    }//GEN-LAST:event_btnGenerarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGenerar;
    private com.toedter.calendar.JDateChooser dcFechaFin;
    private com.toedter.calendar.JDateChooser dcFechaInicio;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLFecha1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables
}
