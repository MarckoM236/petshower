
package facturacion.Vista;


import facturacion.Controlador.Control_servicio;
import facturacion.Controlador.control_existencias;
import javax.lang.model.SourceVersion;
import javax.swing.JOptionPane;


public class Interfaz_actualizar_servicios extends javax.swing.JFrame {
 control_existencias con = new control_existencias();
 Control_servicio ctrserv=new Control_servicio();
 
   private String id;
   private String ref;
   private String desc;
   private String valor;
   

    public Interfaz_actualizar_servicios(String id) {
        this.id = id;

        initComponents();

        txtref_servicio.setEnabled(false);
        llenar_campos(id);
    }
    
    public void llenar_campos(String id) {
        Object[][] datos = ctrserv.consulta_servicios_ID(id);

        this.ref = datos[0][0].toString();
        this.desc = datos[0][1].toString();
        this.valor = datos[0][2].toString();

        txtref_servicio.setText(ref);
        txtdescripcion_serv.setText(desc);
        txtpre_servicio.setText(valor);
    }

    public void bloquear() {
        txtdescripcion_serv.setEnabled(false);
        txtpre_servicio.setEnabled(false);
        registrar.setEnabled(false);
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pre_venta2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        txtdescripcion_serv = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtref_servicio = new javax.swing.JTextField();
        txtpre_servicio = new javax.swing.JTextField();

        pre_venta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_venta2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar Servicios");
        setBackground(new java.awt.Color(157, 195, 239));

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/salir.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txtdescripcion_serv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescripcion_servActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Descripcion");

        registrar.setBackground(java.awt.Color.white);
        registrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        registrar.setText("Actualizar");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Precio venta");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Referencia");

        txtref_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtref_servicioActionPerformed(evt);
            }
        });

        txtpre_servicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpre_servicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtpre_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtdescripcion_serv, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtref_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtref_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtdescripcion_serv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpre_servicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(128, 128, 128)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(registrar))
                .addGap(59, 59, 59))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtdescripcion_servActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescripcion_servActionPerformed
        txtdescripcion_serv.transferFocus();
    }//GEN-LAST:event_txtdescripcion_servActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
                  if (ctrserv.Update_servicio(this.id,txtdescripcion_serv.getText(), txtpre_servicio.getText())) {
            JOptionPane.showMessageDialog(null, "El servicio se Actualizo con exito");
            bloquear();
            llenar_campos(this.id);
        } else {
            JOptionPane.showMessageDialog(null, "Error al Actualizar el servicio", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }

    }//GEN-LAST:event_registrarActionPerformed

    private void txtref_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtref_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtref_servicioActionPerformed

    private void pre_venta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_venta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pre_venta2ActionPerformed

    private void txtpre_servicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpre_servicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpre_servicioActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz_actualizar_servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_actualizar_servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_actualizar_servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_actualizar_servicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String String = null;
                new Interfaz_actualizar_servicios(String).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField pre_venta2;
    private javax.swing.JButton registrar;
    private javax.swing.JTextField txtdescripcion_serv;
    private javax.swing.JTextField txtpre_servicio;
    private javax.swing.JTextField txtref_servicio;
    // End of variables declaration//GEN-END:variables

    public SourceVersion getSupportedSourceVersion() {
        return SourceVersion.latest();
    }
}
