/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Presentacion;

import Datos.Dproveedor;
import Logica.Lproveedor;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author vitela
 */
public class frmProveedor extends javax.swing.JInternalFrame {

    /**
     * Creates new form frmhabitacion
     */
    public frmProveedor() {
        initComponents();
        MostrarProveedoresI("");
        txtIdproveedor.setVisible(false);
        InhabilitarComponentes();
    }
    private String accion = "guardar";

    void OcultarColumnas() {
        tablaProveedores.getColumnModel().getColumn(0).setMaxWidth(0);
        tablaProveedores.getColumnModel().getColumn(0).setMinWidth(0);
        tablaProveedores.getColumnModel().getColumn(0).setPreferredWidth(0);
    }

    void InhabilitarComponentes() {
        txtIdproveedor.setVisible(false);
        txtNombrep.setEnabled(false);
        txtDireccion.setEnabled(false);
        txtTelefonop.setEnabled(false);
        txtCelularp.setEnabled(false);

        btnGuardar.setEnabled(false);
        btnCancelar.setEnabled(false);
        btnEliminar.setEnabled(false);
        
        txtIdproveedor.setText("");
        txtTelefonop.setText("");
        txtNombrep.setText("");
        txtDireccion.setText("");
        txtCelularp.setText("");

    }

    void HabilitarComponentes() {
        txtIdproveedor.setVisible(false);
        txtNombrep.setEnabled(true);
        txtDireccion.setEnabled(true);
        txtTelefonop.setEnabled(true);
        txtCelularp.setEnabled(true);

        btnGuardar.setEnabled(true);
        btnCancelar.setEnabled(true);
        btnEliminar.setEnabled(true);
        txtIdproveedor.setText("");
        txtTelefonop.setText("");     
        txtNombrep.setText("");
        txtDireccion.setText("");
        txtCelularp.setText("");

    }

    void MostrarProveedoresI(String buscar) {
        try {
            DefaultTableModel modelo;
            Lproveedor func = new Lproveedor();
            modelo = func.MostrarProveedores(buscar);

            tablaProveedores.setModel(modelo);
            OcultarColumnas();
            lbltotalregistros.setText("Total registros" + Integer.toString(func.totalregistros));
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
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

        lblPrveedores = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtIdproveedor = new javax.swing.JTextField();
        lblNombreProv = new javax.swing.JLabel();
        txtNombrep = new javax.swing.JTextField();
        lblDireccionProv = new javax.swing.JLabel();
        lblTelefonoProv = new javax.swing.JLabel();
        txtTelefonop = new javax.swing.JTextField();
        lblCelularProv = new javax.swing.JLabel();
        btnNuevo = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblIdProv = new javax.swing.JLabel();
        txtCelularp = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablaProveedores = new javax.swing.JTable();
        btnBuscar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        txtBuscar = new javax.swing.JTextField();
        lblBusNombre = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        lbltotalregistros = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mantener Proveedores");

        lblPrveedores.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblPrveedores.setText("Proveedores");

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Registro de Proveedores"));

        lblNombreProv.setText("Nombre de proveedor");

        txtNombrep.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrepActionPerformed(evt);
            }
        });
        txtNombrep.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombrepKeyTyped(evt);
            }
        });

        lblDireccionProv.setText("Dirección:");

        lblTelefonoProv.setText("Teléfono local:");

        txtTelefonop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonopActionPerformed(evt);
            }
        });
        txtTelefonop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonopKeyTyped(evt);
            }
        });

        lblCelularProv.setText("Teléfono celular:");

        btnNuevo.setBackground(new java.awt.Color(102, 102, 102));
        btnNuevo.setForeground(new java.awt.Color(255, 255, 255));
        btnNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/nuevo.png"))); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(102, 102, 102));
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Save.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnCancelar.setBackground(new java.awt.Color(102, 102, 102));
        btnCancelar.setForeground(new java.awt.Color(255, 255, 255));
        btnCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/cancelar.png"))); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        lblIdProv.setText("Id de proveedor");

        txtCelularp.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCelularpKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreProv)
                    .addComponent(lblIdProv)
                    .addComponent(lblDireccionProv)
                    .addComponent(lblTelefonoProv)
                    .addComponent(lblCelularProv))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtNombrep)
                        .addGap(239, 239, 239))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTelefonop, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCelularp, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnNuevo)
                .addGap(102, 102, 102)
                .addComponent(btnGuardar)
                .addGap(82, 82, 82)
                .addComponent(btnCancelar)
                .addGap(0, 59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtIdproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblIdProv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblNombreProv, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtNombrep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDireccionProv, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTelefonop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblTelefonoProv))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCelularp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCelularProv))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNuevo)
                    .addComponent(btnGuardar)
                    .addComponent(btnCancelar)))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Registros"));

        tablaProveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tablaProveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaProveedoresMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tablaProveedores);

        btnBuscar.setBackground(new java.awt.Color(102, 102, 102));
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnEliminar.setBackground(new java.awt.Color(102, 102, 102));
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/eliminar.png"))); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBuscarKeyReleased(evt);
            }
        });

        lblBusNombre.setText("Buscar por nombre:");

        btnSalir.setBackground(new java.awt.Color(102, 102, 102));
        btnSalir.setForeground(new java.awt.Color(255, 255, 255));
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/salir.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        lbltotalregistros.setText("Registros");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbltotalregistros)
                .addGap(73, 73, 73))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 446, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSalir))
                            .addComponent(lblBusNombre))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblBusNombre)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBuscar)
                    .addComponent(btnEliminar)
                    .addComponent(txtBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(lbltotalregistros)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblPrveedores)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblPrveedores)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(49, 49, 49))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (txtNombrep.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar Nombre de proveedor");
            txtNombrep.requestFocus();
            return;
        }

        if (txtTelefonop.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar Telefono");
            txtTelefonop.requestFocus();
            return;
        }

        if (txtDireccion.getText().length() == 0) {
            JOptionPane.showConfirmDialog(rootPane, "Debe ingresar direccion");
            txtDireccion.requestFocus();
            return;
        }

        Dproveedor dts = new Dproveedor();
        Lproveedor func = new Lproveedor();

        dts.setNombre(txtNombrep.getText());

        dts.setDireccion(txtDireccion.getText());
        dts.setTelefonop(txtTelefonop.getText());
        dts.setCelularp(txtCelularp.getText());

        if (accion.equals("guardar")) {
            if (func.InsertarProveedor(dts)) {
                JOptionPane.showMessageDialog(rootPane, "El proveedor fue registrado ");
                MostrarProveedoresI("");
                InhabilitarComponentes();
            }

        } else if (accion.equals("editar")) {
            dts.setIdproveedor(Integer.parseInt(txtIdproveedor.getText()));

            if (func.EditarProveedor(dts)) {
                JOptionPane.showMessageDialog(rootPane, "el registro de proveedor  fue Editado ");
                MostrarProveedoresI("");
                InhabilitarComponentes();
            }
        }
// TODO add your handling code here:
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed

        HabilitarComponentes();
        btnGuardar.setText("Guardar");
        accion = "guardar";
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
           
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        
         if (!txtIdproveedor.getText().equals("")) {
                int confirmacion= JOptionPane.showConfirmDialog(rootPane, "Estas seguro de eliminar proveedor?","Confirmar",2);
                
                if (confirmacion==0){
                    Lproveedor func = new Lproveedor();
                    Dproveedor dts = new Dproveedor();
                    
                    dts.setIdproveedor(Integer.parseInt(txtIdproveedor.getText()));
                    func.EliminarProveedor(dts);
                    MostrarProveedoresI("");
                   InhabilitarComponentes();
                    
                }
            
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        
        MostrarProveedoresI(txtBuscar.getText());
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtNombrepActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrepActionPerformed
        // TODO add your handling code here:
        txtNombrep.transferFocus();
    }//GEN-LAST:event_txtNombrepActionPerformed

    private void txtTelefonopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonopActionPerformed
        // TODO add your handling code here:
        txtTelefonop.transferFocus();
    }//GEN-LAST:event_txtTelefonopActionPerformed

    private void tablaProveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaProveedoresMouseClicked
        // TODO add your handling code here:
        btnGuardar.setText("Editar");
        HabilitarComponentes();
        btnEliminar.setEnabled(true);
        accion="editar";
        
        int fila =tablaProveedores.rowAtPoint(evt.getPoint());
        txtIdproveedor.setText(tablaProveedores.getValueAt(fila, 0).toString());
        txtNombrep.setText(tablaProveedores.getValueAt(fila, 1).toString());
        txtDireccion.setText(tablaProveedores.getValueAt(fila, 2).toString());
        txtTelefonop.setText(tablaProveedores.getValueAt(fila, 3).toString());
        txtCelularp.setText(tablaProveedores.getValueAt(fila, 4).toString());
   
       
        
        
    }//GEN-LAST:event_tablaProveedoresMouseClicked

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalirActionPerformed

    private void txtBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBuscarKeyReleased
        // TODO add your handling code here:
         MostrarProveedoresI(txtBuscar.getText());
    }//GEN-LAST:event_txtBuscarKeyReleased

    private void txtNombrepKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombrepKeyTyped
        // TODO add your handling code here:
         String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[\ba-zA-Záéóíú.ÁÉÍÓÚñÑ ]"))){
            evt.consume();
            getToolkit().beep();
             JOptionPane.showMessageDialog(this, "Ingrese letras");
            //Regresa cursor al campo 
            txtNombrep.setCursor(null);
            txtNombrep.setCaretColor(Color.red);
        }
    }//GEN-LAST:event_txtNombrepKeyTyped

    private void txtTelefonopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonopKeyTyped
        // TODO add your handling code here:
        String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[\b0-9-* ]"))){ 
            evt.consume();
            getToolkit().beep();
             JOptionPane.showMessageDialog(this, "Ingrese digitos");
            //Regresa cursor al campo 
            txtTelefonop.setCursor(null);
            txtTelefonop.setCaretColor(Color.red);
        }
    }//GEN-LAST:event_txtTelefonopKeyTyped

    private void txtCelularpKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtCelularpKeyTyped
        // TODO add your handling code here:
        String s1=String.valueOf(evt.getKeyChar());
        
        if(!(s1.matches("[\b0-9-* ]"))){ 
            evt.consume();
            getToolkit().beep();
             JOptionPane.showMessageDialog(this, "Ingrese digitos");
            //Regresa cursor al campo 
            txtCelularp.setCursor(null);
            txtCelularp.setCaretColor(Color.red);
        }
    }//GEN-LAST:event_txtCelularpKeyTyped

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmProveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmProveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblBusNombre;
    private javax.swing.JLabel lblCelularProv;
    private javax.swing.JLabel lblDireccionProv;
    private javax.swing.JLabel lblIdProv;
    private javax.swing.JLabel lblNombreProv;
    private javax.swing.JLabel lblPrveedores;
    private javax.swing.JLabel lblTelefonoProv;
    private javax.swing.JLabel lbltotalregistros;
    private javax.swing.JTable tablaProveedores;
    private javax.swing.JTextField txtBuscar;
    private javax.swing.JTextField txtCelularp;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtIdproveedor;
    private javax.swing.JTextField txtNombrep;
    private javax.swing.JTextField txtTelefonop;
    // End of variables declaration//GEN-END:variables
}