package Vista;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Controlador.Controlador;
import Datos.DatosAltaBien;
import Datos.DatosArea;
import Datos.DatosBajaBien;
import Modelo.Modelo;
import static Vista.Principal.Escritorio;
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
public class BajaBienes extends javax.swing.JInternalFrame {
    
    DatosBajaBien datBBienes = new DatosBajaBien();
    DatosAltaBien datAlta = new DatosAltaBien();
    Controlador c = new Controlador();
    Modelo m = new Modelo();
    String accion = "";
    DatosArea datArea = new DatosArea();
    /**
     * Creates new form Bienes
     */
    public BajaBienes() throws SQLException {
        initComponents();
        //txtIdbien.setVisible(false);
        bloquear();
        cargar_tabla_Bajabienes("");
        datArea.mostrarComboAreas(comboAreas);
    }
    
    
    void bloquear() {
        txtDescripcion.setEnabled(false);
        txtInventario.setEnabled(false);
        txtValor.setEnabled(false);
        txtCantBaja.setEnabled(false);
        dcFechaBaja.setEnabled(false);
        dcFechaAlta.setEnabled(false);
        comboAreas.setEnabled(false);
        comboCausa.setEnabled(false);

        btnBuscarBien.setEnabled(false);
        btnElim.setEnabled(true);
        btnsave.setEnabled(false);
        btncancel.setEnabled(false);

    }

    void desbloquear() {
        txtInventario.setEnabled(true);
        txtDescripcion.setEnabled(true);
        txtValor.setEnabled(true);
        txtCantBaja.setEnabled(true);
        dcFechaBaja.setEnabled(true);
        dcFechaAlta.setEnabled(true);
        comboAreas.setEnabled(true);
        comboCausa.setEnabled(true);

        btnBuscarBien.setEnabled(true);
        btnElim.setEnabled(false);
        btnsave.setEnabled(true);
        btncancel.setEnabled(true);
    }

    void limpiar() {
        txtIdbien.setText("");
        txtDescripcion.setText("");
        txtValor.setText("");
        txtCantAlta.setText("");
    }
    
    void cargar_tabla_Bajabienes(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_Bajabienes_area(valor);
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
    }

    void actualizarDatos() {
        int filasel = tbDatos.getSelectedRow();
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar Registro");

            } else {
                String idbien = (String) tbDatos.getValueAt(filasel, 4);
                String inventario = (String) tbDatos.getValueAt(filasel, 1);
                String valor = (String) tbDatos.getValueAt(filasel, 5);
                String desc = (String) tbDatos.getValueAt(filasel, 6);

                
                txtIdbien.setText(idbien);
                txtInventario.setText(inventario);
                txtDescripcion.setText(desc);
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
        jLabel5 = new javax.swing.JLabel();
        txtIdbien = new javax.swing.JTextField();
        btnElim = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        txtDescripcion = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        lbFecha = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        dcFechaBaja = new com.toedter.calendar.JDateChooser();
        txtValor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtInventario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        comboAreas = new javax.swing.JComboBox<>();
        lbFecha1 = new javax.swing.JLabel();
        dcFechaAlta = new com.toedter.calendar.JDateChooser();
        btnBuscarBien = new javax.swing.JButton();
        comboCausa = new javax.swing.JComboBox<>();
        lbCantidad = new javax.swing.JLabel();
        txtCantBaja = new javax.swing.JTextField();
        txtCantAlta = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("Baja de bienes");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1072, 521));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("Causa de la Baja:");

        txtIdbien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdbienActionPerformed(evt);
            }
        });

        btnElim.setBackground(new java.awt.Color(41, 55, 61));
        btnElim.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnElim.setForeground(new java.awt.Color(255, 255, 255));
        btnElim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Downloading_Updates_24px.png"))); // NOI18N
        btnElim.setText("Realizar baja");
        btnElim.setBorder(null);
        btnElim.setBorderPainted(false);
        btnElim.setContentAreaFilled(false);
        btnElim.setOpaque(true);
        btnElim.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnElimMouseClicked(evt);
            }
        });
        btnElim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElimActionPerformed(evt);
            }
        });

        btnsave.setBackground(new java.awt.Color(41, 55, 61));
        btnsave.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Ok_24px.png"))); // NOI18N
        btnsave.setText("Ejecutar");
        btnsave.setBorder(null);
        btnsave.setBorderPainted(false);
        btnsave.setContentAreaFilled(false);
        btnsave.setOpaque(true);
        btnsave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnsaveMouseClicked(evt);
            }
        });
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
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
        btncancel.setMaximumSize(new java.awt.Dimension(45, 21));
        btncancel.setMinimumSize(new java.awt.Dimension(45, 21));
        btncancel.setOpaque(true);
        btncancel.setPreferredSize(new java.awt.Dimension(45, 21));
        btncancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btncancelMouseClicked(evt);
            }
        });
        btncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelActionPerformed(evt);
            }
        });

        txtDescripcion.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionActionPerformed(evt);
            }
        });
        txtDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDescripcionKeyTyped(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Nombre y Característica:");

        lbFecha.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbFecha.setText("Fecha de Baja:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel11.setText("Valor:");

        dcFechaBaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtValor.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtValorActionPerformed(evt);
            }
        });
        txtValor.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtValorKeyTyped(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("No. de Inventario: ");

        txtInventario.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtInventario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtInventarioKeyTyped(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("Area: ");

        comboAreas.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        comboAreas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboAreasActionPerformed(evt);
            }
        });

        lbFecha1.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbFecha1.setText("Fecha de Adqusición:");

        dcFechaAlta.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N

        btnBuscarBien.setBackground(new java.awt.Color(41, 55, 61));
        btnBuscarBien.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnBuscarBien.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscarBien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Search_24px.png"))); // NOI18N
        btnBuscarBien.setBorder(null);
        btnBuscarBien.setBorderPainted(false);
        btnBuscarBien.setContentAreaFilled(false);
        btnBuscarBien.setOpaque(true);
        btnBuscarBien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarBienActionPerformed(evt);
            }
        });

        comboCausa.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        comboCausa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione una causa...", "Inutilidad", "Siniestro", "Accidente o muerte", "Robo o extravío", "Reasignación", "Reclasificación" }));
        comboCausa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboCausaActionPerformed(evt);
            }
        });

        lbCantidad.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        lbCantidad.setText("Cantidad:");

        txtCantBaja.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCantBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantBajaActionPerformed(evt);
            }
        });
        txtCantBaja.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCantBajaKeyTyped(evt);
            }
        });

        txtCantAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantAltaActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(txtIdbien, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtCantAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(104, 104, 104)
                        .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(165, 165, 165))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lbFecha1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(dcFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(18, 18, 18)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(btnBuscarBien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(lbFecha, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(comboCausa, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(dcFechaBaja, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lbCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtCantBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)))
                .addGap(131, 131, 131))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdbien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCantAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(129, 129, 129)
                        .addComponent(jLabel8))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtInventario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel11)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboAreas, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(dcFechaAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(lbFecha1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbFecha)
                                    .addComponent(dcFechaBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(comboCausa, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDescripcion)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCantBaja, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbCantidad))))
                    .addComponent(btnBuscarBien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(41, 55, 61));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Baja de Bienes");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(451, 451, 451)
                .addComponent(jLabel10)
                .addContainerGap(463, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jLabel10)
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            cargar_tabla_Bajabienes("");
        } catch (SQLException ex) {
            Logger.getLogger(BajaBienes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncancelMouseClicked

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        
        if (txtInventario.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Número de Inventario");
            txtInventario.requestFocus();
            return;
        }
        if (txtDescripcion.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Descripción");
            txtDescripcion.requestFocus();
            return;
        }
        
        if (txtValor.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Valor");
            txtValor.requestFocus();
            return;
        }
        
        String firma = JOptionPane.showInputDialog("Ingrese su Firma Digital");
        String verificar = c.obtenerFirma();
        if (firma.equals(c.obtenerFirma())){
            
        
        String tipo = comboCausa.getItemAt(comboCausa.getSelectedIndex());
        
            if (!"Seleccione una causa...".equals(tipo)) {
                Calendar calA,calB;
        int dA, mA, aA, dB, mB, aB;
        calA = dcFechaAlta.getCalendar();
        calB = dcFechaBaja.getCalendar();
        dA = calA.get(Calendar.DAY_OF_MONTH);
        mA = calA.get(Calendar.MONTH);
        aA = calA.get(Calendar.YEAR) - 1900;
        dB = calB.get(Calendar.DAY_OF_MONTH);
        mB = calB.get(Calendar.MONTH);
        aB = calB.get(Calendar.YEAR) - 1900;
        
        datBBienes.setFechaAd(new Date(aA, mA, dA));
        Date fechaAlta = datBBienes.getFechaAd();
        datBBienes.setFechaBaja(new Date(aB, mB, dB));
        
        datBBienes.setnInventario(txtInventario.getText());
        datBBienes.setArea(comboAreas.getItemAt(comboAreas.getSelectedIndex()).getNombre());
        datBBienes.setDescripcion(txtDescripcion.getText());
        datBBienes.setValor(Integer.parseInt(txtValor.getText()));
        datBBienes.setCantidad(Integer.parseInt(txtCantBaja.getText()));
        datBBienes.setIdBien(Integer.parseInt(txtIdbien.getText()));
        datBBienes.setCausa(tipo);
        
        int CantAl = Integer.parseInt(txtCantAlta.getText());
        int cantB = Integer.parseInt(txtCantBaja.getText());
        int resta = CantAl - cantB;
        
        
                if (c.Guardar_Bajabienes(datBBienes)) {
                    c.editar_AltaBienes_xBaja(txtIdbien.getText(),resta);
                    c.eliminar_AltaBienes_xBaja(txtIdbien.getText());
                JOptionPane.showMessageDialog(null, "Bien Agregado.");
            
            limpiar();
            bloquear();
            try {
                cargar_tabla_Bajabienes("");
            } catch (SQLException ex) {
                Logger.getLogger(BajaBienes.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
            } else {
                JOptionPane.showMessageDialog(null, "Seleccione un tipo válido");
            }
        
        
        }else{
            JOptionPane.showMessageDialog(null, "Firma incorrecta");
        }
        
    }//GEN-LAST:event_btnsaveMouseClicked

    private void txtValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtValorActionPerformed

    private void comboAreasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboAreasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboAreasActionPerformed

    private void txtDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescripcionActionPerformed

    private void btncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btncancelActionPerformed

    private void comboCausaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboCausaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboCausaActionPerformed

    private void btnElimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnElimActionPerformed

    private void btnElimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimMouseClicked
        desbloquear();
        Calendar c2 = new GregorianCalendar();
        dcFechaAlta.setCalendar(c2);
        dcFechaBaja.setCalendar(c2);
        txtInventario.requestFocus();
    }//GEN-LAST:event_btnElimMouseClicked

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
        
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtCantBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantBajaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantBajaActionPerformed

    private void txtIdbienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdbienActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdbienActionPerformed

    private void txtCantAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantAltaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCantAltaActionPerformed

    private void btnBuscarBienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarBienActionPerformed
        ConsultaBienes form = null;
        try {
            form = new ConsultaBienes();
            Escritorio.add(form);

            form.setClosable(true);
            form.setIconifiable(true);

        } catch (SQLException ex) {
            Logger.getLogger(ValesAlmacen.class.getName()).log(Level.SEVERE, null, ex);
        }
        form.toFront();
        form.setVisible(true);
    }//GEN-LAST:event_btnBuscarBienActionPerformed

    private void txtInventarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtInventarioKeyTyped
       if (txtInventario.getText().length() == 27) {
            evt.consume();
        }
    }//GEN-LAST:event_txtInventarioKeyTyped

    private void txtDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDescripcionKeyTyped
        if (txtDescripcion.getText().length() == 70) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDescripcionKeyTyped

    private void txtValorKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtValorKeyTyped
        if (txtValor.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtValorKeyTyped

    private void txtCantBajaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCantBajaKeyTyped
        if (txtCantBaja.getText().length() == 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtCantBajaKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarBien;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<DatosArea> comboAreas;
    private javax.swing.JComboBox<String> comboCausa;
    private com.toedter.calendar.JDateChooser dcFechaAlta;
    private com.toedter.calendar.JDateChooser dcFechaBaja;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbCantidad;
    private javax.swing.JLabel lbFecha;
    private javax.swing.JLabel lbFecha1;
    private javax.swing.JTable tbDatos;
    public static javax.swing.JTextField txtCantAlta;
    public static javax.swing.JTextField txtCantBaja;
    public static javax.swing.JTextField txtDescripcion;
    public static javax.swing.JTextField txtIdbien;
    private javax.swing.JTextField txtInventario;
    public static javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
