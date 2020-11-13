
package facturacion.Vista;

import facturacion.Controlador.control_cliente;
import facturacion.Controlador.control_existencias;
import facturacion.Vendedor;
import facturacion.ciudad;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public final class Interfaz_Update_Clientes extends javax.swing.JInternalFrame {
private String campo;
private String id_ciudad;
private String id_tipo;
private String Documento;
private String Nombre;
private String Apellido;
private String tipo_doc;
private String ciudad;
private String Direccion;
private String Telefono;
private String tip;
private String ciu;
private int validaciu=0;
private int validatip=0;
Object [][] cliente;
control_existencias ctrl = new control_existencias();

    public Interfaz_Update_Clientes(String Documento) {
        this.Documento=Documento;
        this.campo="Documento";
        String nom_ciudad,id_ciudad,id_doc, des_doc;
        initComponents();    
        
        //llenar campos
        llenar_campos();
        docclientejTextField1.setText(this.Documento);
        nomclientejTextField2.setText(this.Nombre);
        apellclientejTextField3.setText(this.Apellido);
        dirclientejTextField4.setText(this.Direccion);
        telefonoclientjTextField1.setText(this.Telefono);


         DefaultComboBoxModel ciudad = new DefaultComboBoxModel();
         DefaultComboBoxModel documento = new DefaultComboBoxModel();
          
        
        Object[] tipo_doc = ctrl.combox("tipo_de_documento","id_tipo_documento");
        Object[] Descrip_doc = ctrl.combox("tipo_de_documento","Descripcion");
        combo_tipo.removeAllItems();
        combo_tipo.setModel(documento);
        documento.addElement(this.tipo_doc);
        documento.addElement("--");
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
        ciudad.addElement(this.ciudad);
        ciudad.addElement("--");
        for(int i=0;i<ciu.length;i++){
          nom_ciudad=nom_ciu[i].toString();
          id_ciudad=ciu[i].toString();
           ciudad.addElement(new ciudad(nom_ciudad,id_ciudad));
       
        
       
        
    }
    }
    
    //para llenar los campos
    public void llenar_campos(){
    
        cliente=ctrl.datos_clientes(this.Documento,this.campo);
        this.id_tipo=cliente[0][2].toString();
        this.tipo_doc=cliente[0][3].toString();
        this.Nombre=cliente[0][4].toString();
        this.Apellido=cliente[0][5].toString();
        this.Direccion=cliente[0][6].toString();
        this.id_ciudad=cliente[0][7].toString();
        this.ciudad=cliente[0][8].toString();
        this.Telefono=cliente[0][9].toString();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regclientejButton1 = new javax.swing.JButton();
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
        jLabel7 = new javax.swing.JLabel();
        telefonoclientjTextField1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(157, 195, 239));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Registrar clientes");

        regclientejButton1.setBackground(java.awt.Color.white);
        regclientejButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        regclientejButton1.setText("Guardar");
        regclientejButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regclientejButton1ActionPerformed(evt);
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

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Tipo de documento");

        ciudad_combo.setBackground(java.awt.Color.white);
        ciudad_combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        ciudad_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ciudad_comboItemStateChanged(evt);
            }
        });
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

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Telefono");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(regclientejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(salirclijButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(telefonoclientjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomclientejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(docclientejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(dirclientejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ciudad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(apellclientejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(combo_tipo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)))))
                        .addContainerGap(59, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(docclientejTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nomclientejTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(apellclientejTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dirclientejTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(telefonoclientjTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirclijButton3)
                    .addComponent(regclientejButton1))
                .addGap(26, 26, 26))
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
       regclientejButton1.setEnabled(false);
       
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
       regclientejButton1.setEnabled(true);
       
       
    }
    
    private void regclientejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclientejButton1ActionPerformed
      
        String doc,nom,ape,dir,ciu,tipo,tel,pass; 
        if (this.validatip==1){
       Vendedor id_doc=(Vendedor) combo_tipo.getSelectedItem();
     this.tip= id_doc.getID();
        }
        
        if(this.validaciu==1){
          ciudad id_ciu=(ciudad) ciudad_combo.getSelectedItem();
        this.ciu=id_ciu.getID();
        }
       
        doc = docclientejTextField1.getText();
        nom = nomclientejTextField2.getText();
        ape = apellclientejTextField3.getText();
        dir = dirclientejTextField4.getText();        
        tel = telefonoclientjTextField1.getText();
        pass="";
        control_cliente contr = new control_cliente(doc,this.tip, nom, ape, dir, this.ciu,tel,pass);
        if(!doc.equals("") && !this.tip.equals("") && !nom.equals("") && !ape.equals("") )
        {
        if(contr.Update_Clientes(this.campo,this.Documento))
        {
        JOptionPane.showMessageDialog(null,"El los datos del cliente se actualizaron con exito ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        bloquear_cajas();
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Error al actualizar los datos del cliente");
        }
        }
        else
        {
          JOptionPane.showMessageDialog(this, "Hay campos obligatorios");  
        }
        
       
               
    }//GEN-LAST:event_regclientejButton1ActionPerformed

    private void salirclijButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirclijButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirclijButton3ActionPerformed

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
       
        
    }//GEN-LAST:event_ciudad_comboActionPerformed

    private void combo_tipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_tipoItemStateChanged
       
        int com=combo_tipo.getSelectedIndex();
       if(com==0){
           this.tip=this.id_tipo;
           this.validatip=0;      
       }
       else if(com==1){
           this.tip=this.id_tipo;
           this.validatip=0;
       }
     else{
           this.validatip=1;  
      }
    }//GEN-LAST:event_combo_tipoItemStateChanged

    private void ciudad_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ciudad_comboItemStateChanged
        int com=ciudad_combo.getSelectedIndex();
       if(com==0){
           this.ciu=this.id_ciudad;
           this.validaciu=0;     
       }
       else if(com==1){
           this.ciu=this.id_ciudad;
           this.validaciu=0;      
       }
     else{
           this.validaciu=1;
      }
    }//GEN-LAST:event_ciudad_comboItemStateChanged

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellclientejTextField3;
    private javax.swing.JComboBox ciudad_combo;
    private javax.swing.JComboBox combo_tipo;
    private javax.swing.JTextField dirclientejTextField4;
    private javax.swing.JTextField docclientejTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField nomclientejTextField2;
    private javax.swing.JButton regclientejButton1;
    private javax.swing.JButton salirclijButton3;
    private javax.swing.JTextField telefonoclientjTextField1;
    // End of variables declaration//GEN-END:variables

}