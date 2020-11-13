
package facturacion.Vista;

import facturacion.Articulo;
import facturacion.Vista.interfaz_buscararticulos;
import facturacion.Controlador.control_articulos;
import facturacion.Controlador.control_existencias;
import java.util.Date;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;


public class Interfaz_actualizar_articulos extends javax.swing.JFrame {
    control_existencias con = new control_existencias();
    control_articulos ctrart = new control_articulos();
    private String tipo;
    private String provee;
    private String id;
    private String tip;
    private String id_tipo;
    private int validatip = 0;
    private String tip_prov;
    private int valida_prov = 0;

    public Interfaz_actualizar_articulos(String id) {
        this.id = id;
        String nom_ciudad, id_art, id_doc, des_art, proveedor, id_prov;
        initComponents();

        //campos que no se modifican
        ref_articulo.setEnabled(false);
        pre_venta.setEnabled(false);

        //fecha actual
        Date hoy = new Date();
        fecha_ingreso.setText(hoy.getDate() + "/" + (hoy.getMonth() + 1) + "/" + (hoy.getYear() + 1900));

        //asignar valores
        llenar_campos(id);
        
        
        DefaultComboBoxModel artic = new DefaultComboBoxModel();
        DefaultComboBoxModel prove = new DefaultComboBoxModel();
        
        Object[] tipo_art = con.combox("tipo_articulo", "id_tipoarticulo");
        Object[] descrip_art = con.combox("tipo_articulo", "descripcion_articulo");
        combo_tipo.removeAllItems();
        combo_tipo.setModel(artic);
        artic.addElement(tipo);
        for (int i = 0; i < tipo_art.length; i++) {
            des_art = descrip_art[i].toString();
            id_art = tipo_art[i].toString();
            artic.addElement(new Articulo(des_art, id_art));

        }
        
        Object[] prov = con.combox("proveedor", "No_documento");
        comboproveedor.removeAllItems();
        comboproveedor.addItem(provee);
        comboproveedor.addItem("--");
        for (int i = 0; i < prov.length; i++) {

            comboproveedor.addItem(prov[i]);

        }
        
    }
    
    //Metodos
    public void llenar_campos(String id) {
        Object[][] datos = ctrart.consulta_articulos_ID(id);
        ref_articulo.setText(datos[0][0].toString());
        descripcion_prod.setText(datos[0][1].toString());
        pre_venta.setText(datos[0][2].toString());
        pre_costo.setText(datos[0][3].toString());
        cant_prod.setText(datos[0][4].toString());
        this.id_tipo = datos[0][5].toString();
        tipo = datos[0][6].toString();
        provee = datos[0][7].toString();
    }

    
    public void bloquear_cajas() {
        descripcion_prod.setEnabled(false);
        fecha_ingreso.setEnabled(false);
        pre_venta.setEnabled(false);
        pre_costo.setEnabled(false);
        cant_prod.setEnabled(false);
        combo_tipo.setEnabled(false);
        comboproveedor.setEnabled(false);
        registrar.setEnabled(false);
        TexNProv.setEnabled(false);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pre_venta2 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        descripcion_prod = new javax.swing.JTextField();
        fecha_ingreso = new javax.swing.JTextField();
        cant_prod = new javax.swing.JTextField();
        pre_costo = new javax.swing.JTextField();
        combo_tipo = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        comboproveedor = new javax.swing.JComboBox();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        registrar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TexNProv = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        ref_articulo = new javax.swing.JTextField();
        pre_venta = new javax.swing.JTextField();

        pre_venta2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_venta2ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Actualizar articulos");
        setBackground(new java.awt.Color(157, 195, 239));

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Proveedor");

        jButton1.setBackground(java.awt.Color.white);
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/salir.png"))); // NOI18N
        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        descripcion_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcion_prodActionPerformed(evt);
            }
        });

        fecha_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecha_ingresoActionPerformed(evt);
            }
        });

        cant_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_prodActionPerformed(evt);
            }
        });

        pre_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_costoActionPerformed(evt);
            }
        });

        combo_tipo.setBackground(java.awt.Color.white);
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_tipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_tipoItemStateChanged(evt);
            }
        });
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Precio costo");

        comboproveedor.setBackground(java.awt.Color.white);
        comboproveedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboproveedor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboproveedorItemStateChanged(evt);
            }
        });
        comboproveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboproveedorActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Fecha ingreso");

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

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Cantidad");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Tipo");

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Referencia");

        ref_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ref_articuloActionPerformed(evt);
            }
        });

        pre_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pre_ventaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(132, 132, 132)
                        .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(TexNProv, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(descripcion_prod, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(pre_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(85, 85, 85)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(pre_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6)
                                    .addComponent(cant_prod)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGap(259, 259, 259)
                                    .addComponent(fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(ref_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(128, 128, 128)
                                .addComponent(registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ref_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fecha_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pre_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pre_costo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cant_prod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboproveedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TexNProv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61)
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

    private void descripcion_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcion_prodActionPerformed
        descripcion_prod.transferFocus();
    }//GEN-LAST:event_descripcion_prodActionPerformed

    private void fecha_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecha_ingresoActionPerformed
        //fecha_ingreso.transferFocus();
    }//GEN-LAST:event_fecha_ingresoActionPerformed

    private void cant_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_prodActionPerformed
        cant_prod.transferFocus();
    }//GEN-LAST:event_cant_prodActionPerformed

    private void pre_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_costoActionPerformed
        pre_costo.transferFocus();
    }//GEN-LAST:event_pre_costoActionPerformed

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_tipoActionPerformed

    private void comboproveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboproveedorActionPerformed
        if (comboproveedor.getSelectedItem() != null) {
            if (comboproveedor.getSelectedItem().toString().equals("--")) {
                TexNProv.setText("");
            } else {
                Object[][] datos = con.datos_proveedor(comboproveedor.getSelectedItem().toString());
                TexNProv.setText(datos[0][0].toString());
            }
        }

    }//GEN-LAST:event_comboproveedorActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        String des, tipo, prov, fecha, preve, precos, sto;
        if (this.validatip == 1) {
            Articulo id_articulo = (Articulo) combo_tipo.getSelectedItem();
            this.tip = id_articulo.getID();
        }
        if (this.valida_prov == 1) {
            this.tip_prov = comboproveedor.getSelectedItem().toString();
        }

        des = descripcion_prod.getText();
        fecha = fecha_ingreso.getText();
        preve = pre_venta.getText();
        precos = pre_costo.getText();
        sto = cant_prod.getText();

        control_articulos ctrl = new control_articulos();

        if (ctrl.Update_articulo(id, des, preve, precos, sto, this.tip, this.tip_prov, fecha)) {
            interfaz_buscararticulos act = new interfaz_buscararticulos();
            act.mostrar_tabla();
            JOptionPane.showMessageDialog(null, "El articulo se Actualizo con exito");
            llenar_campos(id);
            bloquear_cajas();

        } else {
            JOptionPane.showMessageDialog(null, "Error al Actualizar el articulo", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
       

    }//GEN-LAST:event_registrarActionPerformed

    private void ref_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ref_articuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ref_articuloActionPerformed

    private void pre_venta2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_venta2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pre_venta2ActionPerformed

    private void pre_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pre_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pre_ventaActionPerformed

    private void combo_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tipoItemStateChanged
        int com = combo_tipo.getSelectedIndex();
        if (com == 0) {
            this.tip = this.id_tipo;
            this.validatip = 0;
        } else if (com == 1) {
            this.tip = this.id_tipo;
            this.validatip = 0;
        } else {
            this.validatip = 1;
        }
    }//GEN-LAST:event_combo_tipoItemStateChanged

    private void comboproveedorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboproveedorItemStateChanged
        int com = comboproveedor.getSelectedIndex();

        if (com == 1) {
            this.tip_prov = this.provee;
            this.valida_prov = 0;
        } else {
            this.valida_prov = 1;
        }
    }//GEN-LAST:event_comboproveedorItemStateChanged

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
            java.util.logging.Logger.getLogger(Interfaz_actualizar_articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_actualizar_articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_actualizar_articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_actualizar_articulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String String = null;
                new Interfaz_actualizar_articulos(String).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TexNProv;
    private javax.swing.JTextField cant_prod;
    private javax.swing.JComboBox combo_tipo;
    private javax.swing.JComboBox comboproveedor;
    private javax.swing.JTextField descripcion_prod;
    private javax.swing.JTextField fecha_ingreso;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField pre_costo;
    private javax.swing.JTextField pre_venta;
    private javax.swing.JTextField pre_venta2;
    private javax.swing.JTextField ref_articulo;
    private javax.swing.JButton registrar;
    // End of variables declaration//GEN-END:variables
}
