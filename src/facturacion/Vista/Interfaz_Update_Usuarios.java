
package facturacion.Vista;

import facturacion.Controlador.Encriptacion;
import facturacion.Vista.Interfaz_actualizar_articulos;
import facturacion.Controlador.control_existencias;
import facturacion.Controlador.control_usuario;
import facturacion.Roles;
import facturacion.Vendedor;
import facturacion.ciudad;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class Interfaz_Update_Usuarios extends javax.swing.JFrame {
private String id_usuario;
private String id_ciudad;
private String id_tipo;
private String id_rol;
private String Documento;
private String Nombre;
private String Apellido;
private String Pass;
private String tipo_doc;
private String ciudad;
private String Direccion;
private String Telefono;
private String Rol;
private String tip;
private String ciu;
private int validaciu=0;
private int validatip=0;
private int validarol=0;
Object [][] usuario;
control_existencias ctrl = new control_existencias();

    public Interfaz_Update_Usuarios(String id) {
        this.id_usuario=id;
        String nom_ciudad,id_ciudad,id_doc, des_doc,id_r,des_r;
        initComponents();    
        
        
        
        //llenar campos
        llenar_campos();
        txtdocumento.setText(this.Documento);
        txtnombres.setText(this.Nombre);
        txtapellidos.setText(this.Apellido);
        txtpassword.setText(this.Pass);
        txtdireccion.setText(this.Direccion);
        txttelefono.setText(this.Telefono);
        

         DefaultComboBoxModel ciudad = new DefaultComboBoxModel();
         DefaultComboBoxModel documento = new DefaultComboBoxModel();
         DefaultComboBoxModel roles = new DefaultComboBoxModel();
          
        
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
        
        Object[] rol = ctrl.combox("Roles","codigo_rol");
        Object[] des_rol = ctrl.combox("Roles","Descripcion_rol");
        rol_combo.removeAllItems();
        rol_combo.setModel(roles);
        roles.addElement(this.Rol);
        roles.addElement("--");
        for(int i=0;i<rol.length;i++){
          des_r=des_rol[i].toString();
          id_r=rol[i].toString();
           roles.addElement(new Roles(des_r,id_r));    
    }
    }
    
    //para llenar los campos
    public void llenar_campos(){
    
        usuario=ctrl.datos_usuarios(this.id_usuario);
        //instancia Encriptacion
        Encriptacion pss = new Encriptacion();
        String passEnc = null;
        this.Documento=usuario[0][1].toString();
        this.id_tipo=usuario[0][2].toString();
        this.tipo_doc=usuario[0][3].toString();
        this.Nombre=usuario[0][4].toString();
        this.Apellido=usuario[0][5].toString();
    try {
        passEnc=pss.Desencriptar(usuario[0][6].toString());
    } catch (Exception ex) {
        Logger.getLogger(Interfaz_Update_Usuarios.class.getName()).log(Level.SEVERE, null, ex);
    }
        this.Pass=passEnc;
        this.Direccion=usuario[0][7].toString();
        this.id_ciudad=usuario[0][8].toString();
        this.ciudad=usuario[0][9].toString();
        this.Telefono=usuario[0][10].toString();
        this.id_rol=usuario[0][11].toString();
        this.Rol=usuario[0][12].toString();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        regclientejButton1 = new javax.swing.JButton();
        salirclijButton3 = new javax.swing.JButton();
        txtdocumento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtnombres = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtapellidos = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combo_tipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        ciudad_combo = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        txtdireccion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txttelefono = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        rol_combo = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setTitle("Actualizar usuarios");
        setBackground(new java.awt.Color(157, 195, 239));

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

        txtdocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdocumentoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Documento");

        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Nombres");

        txtapellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtapellidosActionPerformed(evt);
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

        txtdireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdireccionActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel6.setText("Direccion");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("Telefono");

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("Rol");

        rol_combo.setBackground(java.awt.Color.white);
        rol_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        rol_combo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                rol_comboItemStateChanged(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("Contraseña");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(regclientejButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43)
                        .addComponent(salirclijButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel6)
                                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7)
                                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8)
                                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(rol_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(ciudad_combo, javax.swing.GroupLayout.Alignment.LEADING, 0, 134, Short.MAX_VALUE))
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(59, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9)
                            .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
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
                    .addComponent(txtdocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtdireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciudad_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rol_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtpassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(salirclijButton3)
                    .addComponent(regclientejButton1))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void limpiar()
    {
       txtdocumento.setText("");
       combo_tipo.setName("");
       txtnombres.setText("");
       txtapellidos.setText("");
       txtdireccion.setText("");
        
    }
    
    public void  bloquear_cajas()
    {
       txtdocumento.setEnabled(false);
       combo_tipo.setEnabled(false);
       txtnombres.setEnabled(false);
       txtapellidos.setEnabled(false);
       txtdireccion.setEnabled(false);       
       ciudad_combo.setEnabled(false);       
       regclientejButton1.setEnabled(false);
       
       txttelefono.setEnabled(false);
       
    }
    public void  desbloquear()
    {
       txtdocumento.setEnabled(true);
       combo_tipo.setEnabled(true);
       txtnombres.setEnabled(true);
       txtapellidos.setEnabled(true);
       txtdireccion.setEnabled(true);       
       ciudad_combo.setEnabled(true); 
       txttelefono.setEnabled(true); 
       regclientejButton1.setEnabled(true);
       
       
    }
    
    private void regclientejButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regclientejButton1ActionPerformed
      
        String doc,nom,ape,dir,ciu,tipo,tel,pass,passEnc; 
        
        //instancia Encriptacion
        Encriptacion pss = new Encriptacion();
        
        if (this.validatip==1){
       Vendedor id_doc=(Vendedor) combo_tipo.getSelectedItem();
     this.tip= id_doc.getID();
        }
        
        if(this.validaciu==1){
          ciudad id_ciu=(ciudad) ciudad_combo.getSelectedItem();
        this.ciu=id_ciu.getID();
        }
        
        if(this.validarol==1){
          Roles id_rol=(Roles) rol_combo.getSelectedItem();
        this.Rol=id_rol.getID();
        }
       
        doc = txtdocumento.getText();
        nom = txtnombres.getText();
        ape = txtapellidos.getText();
        dir = txtdireccion.getText();        
        tel = txttelefono.getText();
        pass=txtpassword.getText();
        passEnc=pss.Encriptar(pass);
        
        control_usuario contr = new control_usuario(doc, this.tip, nom, ape,passEnc, dir, this.ciu,tel,this.Rol);
        if(!doc.equals("") && !this.tip.equals("") && !nom.equals("") && !ape.equals("") && !pass.equals("") )
        {
        if(contr.Update_Usuarios(this.id_usuario,this.Rol))
        {
        JOptionPane.showMessageDialog(null,"El los datos del usuario se actualizaron con exito ","Mensaje",JOptionPane.INFORMATION_MESSAGE);
        limpiar();
        bloquear_cajas();
        }
        else
        {
        JOptionPane.showMessageDialog(this, "Error al actualizar los datos del usuario");
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

    private void txtdocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdocumentoActionPerformed
    txtdocumento.transferFocus();
    }//GEN-LAST:event_txtdocumentoActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed
    txtnombres.transferFocus();
    }//GEN-LAST:event_txtnombresActionPerformed

    private void txtapellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtapellidosActionPerformed
    txtapellidos.transferFocus();
    }//GEN-LAST:event_txtapellidosActionPerformed

    private void txtdireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdireccionActionPerformed
    txtdireccion.transferFocus();
    }//GEN-LAST:event_txtdireccionActionPerformed

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

    private void rol_comboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_rol_comboItemStateChanged
        int com=rol_combo.getSelectedIndex();
       if(com==0){
           this.Rol=this.id_rol;
           this.validarol=0;     
       }
       else if(com==1){
           this.Rol=this.id_rol;
           this.validarol=0;        
       }
     else{
           this.validarol=1;
      }
    }//GEN-LAST:event_rol_comboItemStateChanged
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
                new Interfaz_Update_Usuarios("").setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ciudad_combo;
    private javax.swing.JComboBox combo_tipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton regclientejButton1;
    private javax.swing.JComboBox<String> rol_combo;
    private javax.swing.JButton salirclijButton3;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtdireccion;
    private javax.swing.JTextField txtdocumento;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables

}