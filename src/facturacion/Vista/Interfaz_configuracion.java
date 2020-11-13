
package facturacion.Vista;


import facturacion.Controlador.Control_rutas;
import facturacion.Controlador.Control_servicio;
import facturacion.Controlador.control_existencias;
import javax.swing.JOptionPane;


public class Interfaz_configuracion extends javax.swing.JInternalFrame {
Control_rutas con = new Control_rutas();
Object[][] datos;   
    public Interfaz_configuracion() {
        initComponents();
        llenar_campos();
        bloquear_cajas();       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_factura = new javax.swing.JTextField();
        txt_reporte = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nuevoreg = new javax.swing.JButton();
        btn_factura = new javax.swing.JButton();
        txt_plantilla = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btn_reportes = new javax.swing.JButton();
        btn_plantilla = new javax.swing.JButton();

        setBackground(new java.awt.Color(157, 195, 239));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Configurar rutas");
        setPreferredSize(new java.awt.Dimension(800, 500));

        txt_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_facturaActionPerformed(evt);
            }
        });

        txt_reporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_reporteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Ruta Plantilla");

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Ruta Reportes");

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
        nuevoreg.setText("Actualizar");
        nuevoreg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoregActionPerformed(evt);
            }
        });

        btn_factura.setBackground(java.awt.Color.white);
        btn_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        btn_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_facturaActionPerformed(evt);
            }
        });

        txt_plantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_plantillaActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Ruta Factura");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/config.png"))); // NOI18N

        btn_reportes.setBackground(java.awt.Color.white);
        btn_reportes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        btn_reportes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_reportesActionPerformed(evt);
            }
        });

        btn_plantilla.setBackground(java.awt.Color.white);
        btn_plantilla.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        btn_plantilla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_plantillaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(txt_factura, javax.swing.GroupLayout.DEFAULT_SIZE, 455, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_plantilla)
                    .addComponent(txt_reporte))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_reportes)
                        .addGap(202, 202, 202))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_factura)
                            .addComponent(btn_plantilla))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(36, 36, 36))))
            .addGroup(layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(nuevoreg, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel2)
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btn_plantilla)
                                .addGap(42, 42, 42)
                                .addComponent(btn_factura))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btn_reportes))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_plantilla, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txt_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txt_reporte, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoreg)
                    .addComponent(cancelar)
                    .addComponent(jButton1))
                .addGap(71, 71, 71))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void llenar_campos() {
        datos = con.consulta_rutas();
        txt_plantilla.setText(datos[0][0].toString());
        txt_factura.setText(datos[1][0].toString());
        txt_reporte.setText(datos[2][0].toString());
    }

    public void bloquear_cajas() {
        txt_plantilla.setEnabled(false);
        txt_factura.setEnabled(false);
        txt_reporte.setEnabled(false);
        nuevoreg.setEnabled(true);
        btn_plantilla.setEnabled(false);
        btn_reportes.setEnabled(false);
        btn_factura.setEnabled(false);
        cancelar.setEnabled(false);
    }

    public void desbloquear() {
        txt_plantilla.setEnabled(true);
        txt_factura.setEnabled(true);
        txt_reporte.setEnabled(true);
        nuevoreg.setEnabled(false);
        btn_plantilla.setEnabled(true);
        btn_reportes.setEnabled(true);
        btn_factura.setEnabled(true);
        cancelar.setEnabled(true);

    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
    bloquear_cajas();
    
    }//GEN-LAST:event_cancelarActionPerformed

    private void txt_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_facturaActionPerformed
    txt_factura.transferFocus();
    }//GEN-LAST:event_txt_facturaActionPerformed

    private void txt_reporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_reporteActionPerformed
    txt_reporte.transferFocus();
    }//GEN-LAST:event_txt_reporteActionPerformed
    
    private void btn_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_facturaActionPerformed
        String factura;
        factura = txt_factura.getText();
        if (con.Update_rutas("2", factura)) {
            JOptionPane.showMessageDialog(rootPane, "Se actualizo la ruta de la factura con exito");
            bloquear_cajas();
            llenar_campos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error al intentar actualizar la ruta");
        }
    }//GEN-LAST:event_btn_facturaActionPerformed

    private void txt_plantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_plantillaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_plantillaActionPerformed

    private void nuevoregActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoregActionPerformed
        desbloquear();
        txt_factura.requestFocus();
    }//GEN-LAST:event_nuevoregActionPerformed

    private void btn_reportesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_reportesActionPerformed
        String reporte;
        reporte = txt_reporte.getText();
        if (con.Update_rutas("3", reporte)) {
            JOptionPane.showMessageDialog(rootPane, "Se actualizo la ruta de los reportes con exito");
            bloquear_cajas();
            llenar_campos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error al intentar actualizar la ruta");
        }
    }//GEN-LAST:event_btn_reportesActionPerformed

    private void btn_plantillaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_plantillaActionPerformed
        String plantilla;
        plantilla = txt_plantilla.getText();
        if (con.Update_rutas("1", plantilla)) {
            JOptionPane.showMessageDialog(rootPane, "Se actualizo la ruta de la plantilla con exito");
            bloquear_cajas();
            llenar_campos();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error al intentar actualizar la ruta");
        }
        
        
    }//GEN-LAST:event_btn_plantillaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_factura;
    private javax.swing.JButton btn_plantilla;
    private javax.swing.JButton btn_reportes;
    private javax.swing.JButton cancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JButton nuevoreg;
    private javax.swing.JTextField txt_factura;
    private javax.swing.JTextField txt_plantilla;
    private javax.swing.JTextField txt_reporte;
    // End of variables declaration//GEN-END:variables
}
