
package facturacion.Vista;


import facturacion.Controlador.Control_servicio;
import facturacion.Controlador.control_existencias;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;




public class Interfaz_servicio extends javax.swing.JInternalFrame {
control_existencias con = new control_existencias();
   
    public Interfaz_servicio() {
       String nom_ciudad,id_art,id_doc, des_art,proveedor,id_prov;
        initComponents();
        limpiar();
        bloquear_cajas();
   
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtdesc_serv = new javax.swing.JTextField();
        txtpre_venta = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nuevoreg = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        txtreferencia = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(157, 195, 239));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar Servicio");
        setPreferredSize(new java.awt.Dimension(800, 500));

        txtdesc_serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdesc_servActionPerformed(evt);
            }
        });

        txtpre_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpre_ventaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Referencia");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Precio venta");

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/salir.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        cancelar.setBackground(java.awt.Color.white);
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/cancelar.png"))); // NOI18N
        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        nuevoreg.setBackground(java.awt.Color.white);
        nuevoreg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/new.png"))); // NOI18N
        nuevoreg.setText("Nuevo registro");
        nuevoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoregActionPerformed(evt);
            }
        });

        registrar.setBackground(java.awt.Color.white);
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        registrar.setText("Registrar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        txtreferencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtreferenciaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Descripcion");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/servicios.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setForeground(java.awt.Color.red);
        jLabel4.setText("*");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setForeground(java.awt.Color.red);
        jLabel5.setText("*");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setForeground(java.awt.Color.red);
        jLabel6.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel5))
                                    .addComponent(txtdesc_serv, javax.swing.GroupLayout.DEFAULT_SIZE, 263, Short.MAX_VALUE)
                                    .addComponent(txtpre_venta)
                                    .addComponent(txtreferencia))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 145, Short.MAX_VALUE)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 89, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtreferencia, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtdesc_serv, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtpre_venta, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nuevoreg)
                            .addComponent(cancelar)
                            .addComponent(jButton1)
                            .addComponent(registrar))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void limpiar()
    {
       txtreferencia.setText("");
       txtdesc_serv.setText("");
       txtpre_venta.setText("");  
    }
    
    public void  bloquear_cajas()
    {
        txtreferencia.setEnabled(false);
       txtdesc_serv.setEnabled(false);
       txtpre_venta.setEnabled(false);
       nuevoreg.setEnabled(true);
       registrar.setEnabled(false);
       cancelar.setEnabled(false); 
    }
    public void  desbloquear()
    {
       txtreferencia.setEnabled(true);
       txtdesc_serv.setEnabled(true);
       txtpre_venta.setEnabled(true);
       nuevoreg.setEnabled(false);
       registrar.setEnabled(true);
       cancelar.setEnabled(true);
      
       
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
    bloquear_cajas();
    limpiar();
    }//GEN-LAST:event_cancelarActionPerformed

    private void nuevoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoregActionPerformed
    desbloquear();
    txtdesc_serv.requestFocus();
    }//GEN-LAST:event_nuevoregActionPerformed

    private void txtdesc_servActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdesc_servActionPerformed
    txtdesc_serv.transferFocus();
    }//GEN-LAST:event_txtdesc_servActionPerformed

    private void txtpre_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpre_ventaActionPerformed
    txtpre_venta.transferFocus();
    }//GEN-LAST:event_txtpre_ventaActionPerformed
    
    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String ref, des, pre_venta;

        ref = txtreferencia.getText();
        des = txtdesc_serv.getText();
        pre_venta = txtpre_venta.getText();

        Control_servicio ctrl = new Control_servicio();

        if (!ref.equals("") && !des.equals("") && !pre_venta.equals("")) {
            if (!ctrl.consulta_servicio(ref)) {
                if (ctrl.ingresar_servicio(ref, des, pre_venta)) {
                    JOptionPane.showMessageDialog(null, "El servicio se registro con exito");
                    limpiar();
                    bloquear_cajas();
                } else {
                    JOptionPane.showMessageDialog(null, "Error al registrar el servicio", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "El numero de referencia ya esta asignado a un servicio");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
        }

    }//GEN-LAST:event_registrarActionPerformed

    private void txtreferenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtreferenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtreferenciaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton nuevoreg;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField txtdesc_serv;
    private javax.swing.JTextField txtpre_venta;
    private javax.swing.JTextField txtreferencia;
    // End of variables declaration//GEN-END:variables
}
