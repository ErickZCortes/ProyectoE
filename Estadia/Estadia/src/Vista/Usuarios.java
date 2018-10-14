/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Controlador;
import Datos.GeneradorContraseña;
import Datos.DatosUsuario;
import Modelo.Modelo;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 * @author Erick
 * @author Mayra
 */
public class Usuarios extends javax.swing.JInternalFrame {

    DatosUsuario datUsuarios = new DatosUsuario();
    Controlador c = new Controlador();
    Modelo m = new Modelo();
    String accion = "";

    /**
     * Creates new form Usuarios
     */
    public Usuarios() throws SQLException {
        initComponents();
        bloquear();
        cargar_tabla_usuarios("");
        
    }

    void bloquear() {
        txtId.setVisible(false);
        txtacceso.setVisible(false);
        txtName.setEnabled(false);
        txtCURP.setEnabled(false);
        txtRFC.setEnabled(false);
        txtPassword.setEnabled(false);
        txtUser.setEnabled(false);
        cbAcceso.setEnabled(false);

        btnAdd.setEnabled(true);
        btnMod.setEnabled(true);
        btnElim.setEnabled(true);
        btnsave.setEnabled(false);
        btncancel.setEnabled(false);
        btnGenerador.setEnabled(false);
    }

    void desbloquear() {
        txtName.setEnabled(true);
        txtCURP.setEnabled(true);
        txtRFC.setEnabled(true);
        txtPassword.setEnabled(true);
        txtUser.setEnabled(true);
        cbAcceso.setEnabled(true);

        btnAdd.setEnabled(false);
        btnMod.setEnabled(false);
        btnElim.setEnabled(false);
        btnsave.setEnabled(true);
        btncancel.setEnabled(true);
        btnGenerador.setEnabled(true);
    }

    void limpiar() {
        txtCURP.setText("");
        txtName.setText("");
        txtPassword.setText("");
        txtRFC.setText("");
        txtUser.setText("");
    }

    void cargar_tabla_usuarios(String valor) throws SQLException {
        DefaultTableModel tb = c.cargar_tabla_usuarios(valor);
        tbDatos.setModel(tb);

        tbDatos.getColumnModel().getColumn(0).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(1).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(2).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(3).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(4).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(5).setPreferredWidth(150);
        tbDatos.getColumnModel().getColumn(6).setPreferredWidth(150);

    }

    void actualizarDatos() {
        int filasel = tbDatos.getSelectedRow();
        try {
            if (filasel == -1) {
                JOptionPane.showMessageDialog(null, "Seleccionar Registro");

            } else {
                String iduser = (String) tbDatos.getValueAt(filasel, 0);
                String nombre = (String) tbDatos.getValueAt(filasel, 1);
                String user = (String) tbDatos.getValueAt(filasel, 2);
                String password = (String) tbDatos.getValueAt(filasel, 3);
                String rfc = (String) tbDatos.getValueAt(filasel, 4);
                String curp = (String) tbDatos.getValueAt(filasel, 5);
                String acceso = (String) tbDatos.getValueAt(filasel, 6);

                txtId.setText(iduser);
                txtName.setText(nombre);
                txtUser.setText(user);
                txtPassword.setText(password);
                txtRFC.setText(rfc);
                txtCURP.setText(curp);
                txtacceso.setText(acceso);
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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();
        txtRFC = new javax.swing.JTextField();
        txtCURP = new javax.swing.JTextField();
        cbAcceso = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        btnAdd = new javax.swing.JButton();
        btnMod = new javax.swing.JButton();
        btnElim = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btncancel = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbDatos = new javax.swing.JTable();
        btnGenerador = new javax.swing.JButton();
        txtacceso = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder());
        setClosable(true);
        setIconifiable(true);
        setTitle("Agregar Usuarios");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1072, 521));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel3.setText("Usuario:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel4.setText("Contraseña:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel5.setText("RFC:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel6.setText("CURP:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        jLabel8.setText("Acesso:");

        txtName.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNameKeyTyped(evt);
            }
        });

        txtUser.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtUser.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUserKeyTyped(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPasswordKeyTyped(evt);
            }
        });

        txtRFC.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtRFC.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtRFCKeyTyped(evt);
            }
        });

        txtCURP.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtCURP.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCURPKeyTyped(evt);
            }
        });

        cbAcceso.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        cbAcceso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Auxiliar", "Almacén", "Usuario" }));
        cbAcceso.setToolTipText("");

        btnAdd.setBackground(new java.awt.Color(41, 55, 61));
        btnAdd.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icons8_Add_24px.png"))); // NOI18N
        btnAdd.setText("Agregar");
        btnAdd.setBorder(null);
        btnAdd.setBorderPainted(false);
        btnAdd.setContentAreaFilled(false);
        btnAdd.setDefaultCapable(false);
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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DATOS DEL USUARIO");

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

        btnGenerador.setBackground(new java.awt.Color(41, 55, 61));
        btnGenerador.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnGenerador.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerador.setText("Generar Contraseña");
        btnGenerador.setBorder(null);
        btnGenerador.setBorderPainted(false);
        btnGenerador.setContentAreaFilled(false);
        btnGenerador.setDefaultCapable(false);
        btnGenerador.setMaximumSize(new java.awt.Dimension(45, 21));
        btnGenerador.setMinimumSize(new java.awt.Dimension(45, 21));
        btnGenerador.setOpaque(true);
        btnGenerador.setPreferredSize(new java.awt.Dimension(45, 21));
        btnGenerador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneradorActionPerformed(evt);
            }
        });

        txtacceso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtaccesoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(170, 170, 170)
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtacceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel8))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(32, 32, 32)))
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel2))
                                        .addGap(30, 30, 30)))
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel3Layout.createSequentialGroup()
                                        .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnGenerador, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(134, 134, 134)
                                .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 440, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtacceso, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtCURP, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRFC, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnGenerador, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbAcceso, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnMod, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(btnElim, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncancel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1.setBackground(new java.awt.Color(41, 55, 61));

        jLabel10.setFont(new java.awt.Font("Trebuchet MS", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Usuarios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(436, 436, 436)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(464, Short.MAX_VALUE))
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

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        desbloquear();
        limpiar();
        accion = "A";
        txtName.requestFocus();
    }//GEN-LAST:event_btnAddMouseClicked

    private void btnModMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnModMouseClicked
        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccionar Registro");
        } else {
            desbloquear();
            accion = "M";
            txtName.requestFocus();
        }
    }//GEN-LAST:event_btnModMouseClicked

    private void btnElimMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnElimMouseClicked
        int filasel = tbDatos.getSelectedRow();
        if (filasel == -1) {
            JOptionPane.showMessageDialog(null, "Seleccione un Registro de la Tabla");
            return;
        } else {
            int i = JOptionPane.showConfirmDialog(this, "Si elimina el usuario lo borrara de las ventas asociadas a el ¿Desea Eliminar?", "Confirmar Eliminacion", JOptionPane.YES_NO_OPTION);
            if (i == 0) {
                if (!txtId.getText().equals("")) {
                    if (txtacceso.getText().equals("Administrador")) {
                        datUsuarios.setIdUsuario(Integer.parseInt(txtId.getText()));
                        c.eliminar_usuario(datUsuarios);
                        System.exit(0);
                    } else {
                        datUsuarios.setIdUsuario(Integer.parseInt(txtId.getText()));
                        c.eliminar_usuario(datUsuarios);
                        try {
                            cargar_tabla_usuarios("");
                        } catch (SQLException ex) {
                            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        limpiar();
                        bloquear();
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "No se elimino el usuario.");
                }
            }
        }

    }//GEN-LAST:event_btnElimMouseClicked

    private void btnsaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnsaveMouseClicked
        if (txtName.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar tu Nombre completo ");
            txtName.requestFocus();
            return;
        }
        if (txtRFC.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar tu RFC");
            txtRFC.requestFocus();
            return;
        }
        if (txtCURP.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar tu CURP");
            txtCURP.requestFocus();
            return;
        }
        if (txtUser.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar un Usuario");
            txtUser.requestFocus();
            return;
        }

        if (txtPassword.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Debes ingresar una Contraseña");
            txtPassword.requestFocus();
            return;
        }
        if (txtPassword.getText().length() <= 6) {
            JOptionPane.showMessageDialog(null, "Contraseña insegura.\n" + "Ingrese una contraseña mayor a 6 caracteres", "ADVERTENCIA", JOptionPane.WARNING_MESSAGE);
            txtPassword.requestFocus();
            return;
        }
        String a = "á";
        String e = "é";
        String i = "í";
        String o = "ó";
        String u = "ú";
        String texto = txtUser.getText();
        boolean resultadoa = texto.contains(a);
        boolean resultadoe = texto.contains(e);
        boolean resultadoi = texto.contains(i);
        boolean resultadoo = texto.contains(o);
        boolean resultadou = texto.contains(u);

        if (resultadoa || resultadoe || resultadoi || resultadoo || resultadou) {
            JOptionPane.showMessageDialog(null, "El usuario no debe contener tilde");
        } else {
            String idUsuario = txtId.getText();
            datUsuarios.setNombre(txtName.getText());
            datUsuarios.setUser(txtUser.getText());
            datUsuarios.setPassword(txtPassword.getText());
            datUsuarios.setFirmaD("Invalido");
            datUsuarios.setCURP(txtCURP.getText());
            datUsuarios.setRFC(txtRFC.getText());
            int acceso = cbAcceso.getSelectedIndex();
            datUsuarios.setAcceso((String) cbAcceso.getItemAt(acceso));

            if (c.Guardar_usuario(accion, datUsuarios, idUsuario)) {
                if (accion == "A") {
                    JOptionPane.showMessageDialog(null, "Usuario Agregado.");
                } else if (accion == "M") {
                    JOptionPane.showMessageDialog(null, "Usuario Actualizado.");
                }
                limpiar();
                bloquear();
                try {
                    cargar_tabla_usuarios("");
                } catch (SQLException ex) {
                    Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }


    }//GEN-LAST:event_btnsaveMouseClicked

    private void tbDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbDatosMouseClicked
        actualizarDatos();
        bloquear();
    }//GEN-LAST:event_tbDatosMouseClicked

    private void btncancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btncancelMouseClicked
        bloquear();
        limpiar();
        try {
            cargar_tabla_usuarios("");
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btncancelMouseClicked

    private void txtNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNameKeyTyped
        if (txtName.getText().length() == 60) {
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
    }//GEN-LAST:event_txtNameKeyTyped

    private void txtCURPKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCURPKeyTyped
        if (txtCURP.getText().length() == 18) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtCURPKeyTyped

    private void txtRFCKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtRFCKeyTyped
        if (txtRFC.getText().length() == 14) {
            evt.consume();
        }
        char c = evt.getKeyChar();
        if (Character.isLowerCase(c)) {
            String cad = ("" + c).toUpperCase();
            c = cad.charAt(0);
            evt.setKeyChar(c);
        }
    }//GEN-LAST:event_txtRFCKeyTyped

    private void txtUserKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUserKeyTyped
        if (txtUser.getText().length() == 20) {
            evt.consume();
        }

    }//GEN-LAST:event_txtUserKeyTyped

    private void txtPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyTyped
        if (txtPassword.getText().length() == 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPasswordKeyTyped

    private void btnGeneradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneradorActionPerformed
        String pswrd = GeneradorContraseña.getPassword(GeneradorContraseña.NUMEROS + GeneradorContraseña.MAYUSCULAS + GeneradorContraseña.MINUSCULAS, 8);
        txtPassword.setText(pswrd);
    }//GEN-LAST:event_btnGeneradorActionPerformed

    private void txtaccesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtaccesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtaccesoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnElim;
    private javax.swing.JButton btnGenerador;
    private javax.swing.JButton btnMod;
    private javax.swing.JButton btncancel;
    private javax.swing.JButton btnsave;
    private javax.swing.JComboBox<String> cbAcceso;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTable tbDatos;
    private javax.swing.JTextField txtCURP;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtRFC;
    private javax.swing.JTextField txtUser;
    private javax.swing.JTextField txtacceso;
    // End of variables declaration//GEN-END:variables
}
