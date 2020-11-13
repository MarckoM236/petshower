
package facturacion.Vista;

import facturacion.Controlador.control_cliente;
import facturacion.Controlador.control_existencias;
import facturacion.Vendedor;
import facturacion.ciudad;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public final class Interfaz_Clientes extends javax.swing.JInternalFrame {

    control_existencias ctrl = new control_existencias();
    public Interfaz_Clientes() {
        String nom_ciudad,id_ciudad,id_doc, des_doc;
        initComponents();    
        limpiar();
        bloquear_cajas();
         DefaultComboBoxModel ciudad = new DefaultComboBoxModel();
         DefaultComboBoxModel documento = new DefaultComboBoxModel();
          
        
        Object[] tipo_doc = ctrl.combox("tipo_de_documento","id_tipo_documento");
        Object[] Descrip_doc = ctrl.combox("tipo_de_documento","Descripcion");
        combo_tipo.removeAllItems();
        combo_tipo.setModel(documento);
        for(int i=0;i<tipo_doc.length;i++){
        //combo_tipo.addItem(tipo_doc[i]);
        des_doc=Descrip_doc[i].toString();
          id_doc=tipo_doc[i].toString();
           documento.addElement(new Vendedor(des_doc,id_doc));
        
    }
        
        Object[] ciu = ctrl.combox("ciudad","Codigo_ciudad");
        Object[] nom_ciu = ctrl.combox("ciudad","Nombre_ciudad");
        ciudad_combo.removeAllItems();
        ciudad_combo.setModel(ciudad);
        for(int i=0;i<ciu.length;i++){
          nom_ciudad=nom_ciu[i].toString();
          id_ciudad=ciu[i].toString();
           ciudad.addElement(new ciudad(nom_ciudad,id_ciudad));
       
        
        //ciudad_combo.addItem(ciu[i] );
        
    }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regclientejButton1 = new javax.swing.JButton();
        cancelclijButton2 = new javax.swing.JButton();
        salirclijButton3 = new javax.swing.JButton();
        docclientejTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nomclientejTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        apellclientejTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        ciudad_combo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        dirclientejTextField4 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        nuevojButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        telefonoclientjTextField1 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(157, 195, 239));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar clientes");

        regclientejButton1.setBackground(java.awt.Color.white);
        regclientejButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        regclientejButton1.setText("Registrar");
        regclientejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclientejButton1ActionPerformed(evt);
            }
        });

        cancelclijButton2.setBackground(java.awt.Color.white);
        cancelclijButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/cancelar.png"))); // NOI18N
        cancelclijButton2.setText("Cancelar");
        cancelclijButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelclijButton2ActionPerformed(evt);
            }
        });

        salirclijButton3.setBackground(java.awt.Color.white);
        salirclijButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/salir.png"))); // NOI18N
        salirclijButton3.setText("Salir");
        salirclijButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirclijButton3ActionPerformed(evt);
            }
        });

        docclientejTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                docclientejTextField1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Documento");

        nomclientejTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nomclientejTextField2ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nombres");

        apellclientejTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellclientejTextField3ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel3.setText("Apellidos");

        combo_tipo.setBackground(java.awt.Color.white);
        combo_tipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_tipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_tipoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Tipo de documento");

        ciudad_combo.setBackground(java.awt.Color.white);
        ciudad_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ciudad_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciudad_comboActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel5.setText("Ciudad");

        dirclientejTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirclientejTextField4ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Direccion");

        nuevojButton1.setBackground(java.awt.Color.white);
        nuevojButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/new.png"))); // NOI18N
        nuevojButton1.setText(" Nuevo registro");
        nuevojButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevojButton1ActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setForeground(java.awt.Color.red);
        jLabel8.setText("*");

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setForeground(java.awt.Color.red);
        jLabel9.setText("*");

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setForeground(java.awt.Color.red);
        jLabel10.setText("*");

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setForeground(java.awt.Color.red);
        jLabel11.setText("*");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setForeground(java.awt.Color.red);
        jLabel12.setText("*");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setForeground(java.awt.Color.red);
        jLabel13.setText("*");

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel14.setForeground(java.awt.Color.red);
        jLabel14.setText("*");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel8))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(9, 9, 9)
                                        .addComponent(jLabel12))
                                    .addComponent(dirclientejTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(7, 7, 7)
                                        .addComponent(jLabel14))
                                    .addComponent(nomclientejTextField2)
                                    .addComponent(docclientejTextField1))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ciudad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel13))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel10))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(combo_tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 140, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11))
                                    .addComponent(apellclientejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(telefonoclientjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(nuevojButton1)
                        .addGap(43, 43, 43)
                        .addComponent(regclientejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelclijButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salirclijButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel8)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docclientejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomclientejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellclientejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirclientejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefonoclientjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelclijButton2)
                    .addComponent(salirclijButton3)
                    .addComponent(regclientejButton1)
                    .addComponent(nuevojButton1))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar()
    {
       docclientejTextField1.setText("");
       combo_tipo.setName("");
       nomclientejTextField2.setText("");
       apellclientejTextField3.setText("");
       dirclientejTextField4.setText("");
        
    }
    
    public void  bloquear_cajas()
    {
       docclientejTextField1.setEnabled(false);
       combo_tipo.setEnabled(false);
       nomclientejTextField2.setEnabled(false);
       apellclientejTextField3.setEnabled(false);
       dirclientejTextField4.setEnabled(false);       
       ciudad_combo.setEnabled(false); 
       nuevojButton1.setEnabled(true);
       regclientejButton1.setEnabled(false);
       cancelclijButton2.setEnabled(false);
       telefonoclientjTextField1.setEnabled(false);
       
    }
    public void  desbloquear()
    {
       docclientejTextField1.setEnabled(true);
       combo_tipo.setEnabled(true);
       nomclientejTextField2.setEnabled(true);
       apellclientejTextField3.setEnabled(true);
       dirclientejTextField4.setEnabled(true);       
       ciudad_combo.setEnabled(true); 
       telefonoclientjTextField1.setEnabled(true);
       nuevojButton1.setEnabled(false);
       regclientejButton1.setEnabled(true);
       cancelclijButton2.setEnabled(true);
       
    }
    
    private void regclientejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclientejButton1ActionPerformed
      
        String doc,nom,ape,dir,ciu,tipo,tel,pass; 
        ciudad id_ciu=(ciudad) ciudad_combo.getSelectedItem();
        Vendedor id_doc=(Vendedor) combo_tipo.getSelectedItem();
 
        doc = docclientejTextField1.getText();
        tipo= id_doc.getID();
        nom = nomclientejTextField2.getText();
        ape = apellclientejTextField3.getText();
        dir = dirclientejTextField4.getText();        
        ciu= id_ciu.getID();
        tel = telefonoclientjTextField1.getText();
        pass="";
        control_cliente contr = new control_cliente(doc, tipo, nom, ape, dir, ciu,tel,pass);
        if(!doc.equals("") && !tipo.equals("") && !nom.equals("") && !ape.equals("") && !dir.equals("") && !tel.equals("") )
        {
        if(contr.ingresar_cliente())
        {
        JOptionPane.showMessageDialog(null,"El cliente se registro con exito ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        bloquear_cajas();
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Error al registrar el cliente");
        }
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");  
        }
        
       
               
    }//GEN-LAST:event_regclientejButton1ActionPerformed

    private void salirclijButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirclijButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirclijButton3ActionPerformed

    private void cancelclijButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelclijButton2ActionPerformed
    bloquear_cajas();  
    limpiar();
    }//GEN-LAST:event_cancelclijButton2ActionPerformed

    private void nuevojButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevojButton1ActionPerformed
    desbloquear();
    docclientejTextField1.requestFocus();
    }//GEN-LAST:event_nuevojButton1ActionPerformed

    private void docclientejTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_docclientejTextField1ActionPerformed
    docclientejTextField1.transferFocus();
    }//GEN-LAST:event_docclientejTextField1ActionPerformed

    private void nomclientejTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nomclientejTextField2ActionPerformed
    nomclientejTextField2.transferFocus();
    }//GEN-LAST:event_nomclientejTextField2ActionPerformed

    private void apellclientejTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellclientejTextField3ActionPerformed
    apellclientejTextField3.transferFocus();
    }//GEN-LAST:event_apellclientejTextField3ActionPerformed

    private void dirclientejTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirclientejTextField4ActionPerformed
    dirclientejTextField4.transferFocus();
    }//GEN-LAST:event_dirclientejTextField4ActionPerformed

    private void combo_tipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_tipoActionPerformed
        

    }//GEN-LAST:event_combo_tipoActionPerformed

    private void ciudad_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciudad_comboActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_ciudad_comboActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellclientejTextField3;
    private javax.swing.JButton cancelclijButton2;
    private javax.swing.JComboBox ciudad_combo;
    private javax.swing.JComboBox combo_tipo;
    private javax.swing.JTextField dirclientejTextField4;
    private javax.swing.JTextField docclientejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField nomclientejTextField2;
    private javax.swing.JButton nuevojButton1;
    private javax.swing.JButton regclientejButton1;
    private javax.swing.JButton salirclijButton3;
    private javax.swing.JTextField telefonoclientjTextField1;
    // End of variables declaration//GEN-END:variables

}