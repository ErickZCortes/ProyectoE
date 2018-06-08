package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Controlador.Controlador;
import Datos.DatosAltaBien;
import Datos.DatosArea;
import Modelo.Modelo;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
public class AltaBienes extends javax.swing.JInternalFrame {
    
    DatosAltaBien datAltaB = new DatosAltaBien();
    Controlador c = new Controlador();
    Modelo m = new Modelo();
    String accion = "";
    DatosArea datArea = new DatosArea();
    /**
     * Creates new form Bienes
     */
    public AltaBienes() throws SQLException {
        initComponents();
        bloquear();
        cargar_tabla_AltaBienes("");
        Calendar c2 = new GregorianCalendar();
        dcFecha.setCalendar(c2);
        datArea.mostrarComboAreas(comboAreas);
    }
    
    
    void bloquear() {
        txtId.setVisible(false);
        txtInventario.setEnabled(false);
        txtDescripcion.setEnabled(false);
        txtCantidad.setEnabled(false);
        txtMarca.setEnabled(false);
        txtModelo.setEnabled(false);
        txtSerie.setEnabled(false);
        txtValor.setEnabled(false);
        comboAreas.setEnabled(false);
        comboForma.setEnabled(false);
        dcFecha.setEnabled(false);

        btnAdd.setEnabled(true);
        btnMod.setEnabled(true);
        btnsave.setEnabled(false);
        btncancel.setEnabled(false);

    }

    void desbloquear() {
        txtId.setVisible(true);
        txtInventario.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtCantidad.setEnabled(true);
        txtMarca.setEnabled(true);
        txtModelo.setEnabled(true);
        txtSerie.setEnabled(true);
        txtValor.setEnabled(true);
        comboAreas.setEnabled(true);
        comboForma.setEnabled(true);
        dcFecha.setEnabled(true);

        btnAdd.setEnabled(false);
        btnMod.setEnabled(false);
        btnsave.setEnabled(true);
        btncancel.setEnabled(true);
    }

    void limpiar() {
        txtId.setText("");
        txtInventario.setText("");
        txtDescripcion.setText("");
        txtCantidad.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtSerie.setText("");
        txtValor.setText("");
        
    }
    
    void cargar_tabla_AltaBienes(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_Altabienes(valor);
        tbDatos.setModel(tb);

        tbDatos.getColumnModel().getColumn(0).setPreferredWidth(60);
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

    void actualizarDatos() {
        int filasel = tbDatos.getSelectedRow();
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar Registro");

            } else {
                String idalta = (String) tbDatos.getValueAt(filasel, 0);
                String inventario = (String) tbDatos.getValueAt(filasel, 1);
                String fechaad = tbDatos.getValueAt(filasel, 3).toString();
                String descripcion = (String) tbDatos.getValueAt(filasel, 5);
                String cantidad = (String) tbDatos.getValueAt(filasel, 6);
                String marca = (String) tbDatos.getValueAt(filasel, 7);
                String modelo = (String) tbDatos.getValueAt(filasel, 8);
                String serie = (String) tbDatos.getValueAt(filasel, 9);
                String valor = (String) tbDatos.getValueAt(filasel, 10);
                
                txtId.setText(idalta);
                txtInventario.setText(inventario);
                txtDescripcion.setText(descripcion);
                txtCantidad.setText(cantidad);
                txtMarca.setText(marca);
                txtModelo.setText(modelo);
                txtSerie.setText(serie);
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

        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtInventario = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtCantidad = new javax.swing.JTextField();
        txtId = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtSerie = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dcFecha = new com.toedter.calendar.JDateChooser();
        comboAreas = new javax.swing.JComboBox<>();
        txtDescripcion = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comboForma = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();

        setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("No. de Inventario: ");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Marca:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Cantidad:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Area: ");

        txtInventario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtMarca.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtCantidad.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        btnAdd.setBackground(new java.awt.Color(64, 74, 83));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        btnMod.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnMod.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/314502-24.png"))); // NOI18N
        btnMod.setText("Modificar");
        btnMod.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(64, 74, 83), 2));
        btnMod.setContentAreaFilled(false);
        btnMod.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnModMouseClicked(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(64, 74, 83));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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
        btncancel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
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

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Modelo:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel7.setText("Valor:");

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });

        txtModelo.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtSerie.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSerie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSerieActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Serie:");

        lbFecha.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbFecha.setText("fecha de Adqusición:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Forma de Adquisición:");

        dcFecha.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        comboAreas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        comboAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreasActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel9.setText("Nombre y Característica:");

        comboForma.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        comboForma.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona un tipo...", "Entrada de almacén", "Compra directa", "Donación", "Nanencia o producción", "Indocumentación", "Reposición", "Transferencia", "Reasignación" }));
        comboForma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboFormaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbFecha)
                        .addGap(18, 18, 18)
                        .addComponent(dcFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18)
                        .addComponent(comboForma, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5))
                            .addGap(18, 18, 18)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtMarca)
                                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addComponent(jLabel7)
                            .addGap(18, 18, 18)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(111, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel4)
                    .addComponent(txtModelo, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(dcFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(lbFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(comboForma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSerie, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(jLabel11)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel7))
                .addGap(46, 46, 46)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.setBackground(new java.awt.Color(41, 55, 61));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Alta y Modificación de Bienes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(405, 405, 405)
                .addComponent(jLabel10)
                .addContainerGap(352, Short.MAX_VALUE))
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
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
        actualizarDatos();
        bloquear();
    }//GEN-LAST:event_tbDatosMouseClicked

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        bloquear();
        limpiar();
        try {
            cargar_tabla_AltaBienes("");
        } catch (SQLException ex) {
            Logger.getLogger(AltaBienes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncancelMouseClicked

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        if (txtInventario.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Numero de Inventario");
            txtInventario.requestFocus();
            return;
        }
        if (txtValor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Valor");
            txtValor.requestFocus();
            return;
        }
        if (txtCantidad.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Cantidad");
            txtCantidad.requestFocus();
            return;
        }
        if (txtMarca.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Marca ");
            txtMarca.requestFocus();
            return;
        }
        if (txtModelo.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Modelo");
            txtModelo.requestFocus();
            return;
        }
        if (txtSerie.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Numero de Serie");
            txtSerie.requestFocus();
            return;
        }
        
        if (txtValor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Forma de Adquisición");
            txtValor.requestFocus();
            return;
        }
        
        String firma = JOptionPane.showInputDialog("Ingrese su Firma Digital");
        String verificar = c.obtenerFirma();
        if (firma.equals(c.obtenerFirma())){
            Calendar cal;
        int d, m, a;
        cal = dcFecha.getCalendar();
        d = cal.get(Calendar.DAY_OF_MONTH);
        m = cal.get(Calendar.MONTH);
        a = cal.get(Calendar.YEAR) - 1900;
        datAltaB.setFechaAd(new Date(a, m, d));
        Date fecha = datAltaB.getFechaAd();
        
        
        String idBien = txtId.getText();
        datAltaB.setnInventario(txtInventario.getText());
        datAltaB.setArea(comboAreas.getItemAt(comboAreas.getSelectedIndex()).getNombre());
        datAltaB.setDescripcion(txtDescripcion.getText());
        datAltaB.setCantidad(txtCantidad.getText());
        datAltaB.setMarca(txtMarca.getText());
        datAltaB.setModelo(txtModelo.getText());
        datAltaB.setSerie(txtSerie.getText());
        datAltaB.setValor(txtValor.getText());
        
        String forma = comboForma.getItemAt(comboForma.getSelectedIndex());
        
            if (!"Seleccione un tipo...".equals(forma)) {
                datAltaB.setFormaAd(forma);
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un tipo válido");
            }
        if (c.Guardar_Altabienes(accion, datAltaB, idBien)) {
            if (accion == "A") {
                JOptionPane.showMessageDialog(null, "Bien Agregado.");
            } else if (accion == "M") {
                JOptionPane.showMessageDialog(null, "Bien Actualizado.");
            }
            limpiar();
            bloquear();
            try {
                cargar_tabla_AltaBienes("");
            } catch (SQLException ex) {
                Logger.getLogger(AltaBienes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Firma incorrecta");
        }
        
    }//GEN-LAST:event_btnsaveMouseClicked

    private void btnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseClicked
        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccionar Registro");
        } else {
            desbloquear();
            accion = "M";
            txtInventario.requestFocus();
            dcFecha.setVisible(false);
            dcFecha.setEnabled(false);
            lbFecha.setVisible(false);
        }
    }//GEN-LAST:event_btnModMouseClicked

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        desbloquear();
        limpiar();
        accion = "A";
        txtInventario.requestFocus();
        dcFecha.setVisible(true);
            dcFecha.setEnabled(true);
            lbFecha.setVisible(true);
        
    }//GEN-LAST:event_btnAddMouseClicked

    private void txtSerieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSerieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSerieActionPerformed

    private void comboAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAreasActionPerformed

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void comboFormaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboFormaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboFormaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<DatosArea> comboAreas;
    private javax.swing.JComboBox<String> comboForma;
    private com.toedter.calendar.JDateChooser dcFecha;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtInventario;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtSerie;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
