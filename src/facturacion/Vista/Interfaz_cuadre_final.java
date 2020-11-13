
package facturacion.Vista;

import facturacion.Controlador.control_reportes;
import com.itextpdf.text.DocumentException;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Interfaz_cuadre_final extends javax.swing.JInternalFrame {
    String val1="0";
    String val2="0";
    String val3="0";
    String val4="0";
    String val5="0";
    String val6="0";
    String val7="0";
    String val8="0";
    String val9="0";
    String val10="0";
    String val11="0";
    String val12="0";
    control_reportes control;
    String id_user;
    String nombre;
    String apellido;
    String fecha;
    String id_reporte;
    String fec_reporte;
    String titulo="Cuadre Cierre de Caja";
    String resultado;
    Object[][] datos;
    String val_repo_ini;
    String val_ventas;
    String total="0";
    
    public Interfaz_cuadre_final(String id, String nomb, String ape) {
        initComponents();
         control= new control_reportes();
         this.id_user=id;
         this.nombre=nomb;
         this.apellido=ape;
        limpiar();
        //bloquear todos los componentes:
        bloquear_cajas();
        
        //valores user:
        txtuser.setText(nomb+" "+ape);
        //valot fecha
        Date hoy = new Date();
        this.fecha=hoy.getDate()+"/"+(hoy.getMonth()+1) +"/"+(hoy.getYear()+1900);
        this.fec_reporte=hoy.getDate()+"-"+(hoy.getMonth()+1) +"-"+(hoy.getYear()+1900);
        txtfecha.setText( fecha );
        
        this.id_reporte=control.consulta_id_reporte(id_user, fecha);
        
         
    }
    
    public void limpiar (){
     txttotal.setText("0");
     txtcant1.setText("0");
     txtcant2.setText("0");
     txtcant3.setText("0");
     txtcant4.setText("0");
     txtcant5.setText("0");
     txtcant6.setText("0");
     txtcant7.setText("0");
     txtcant8.setText("0");
     txtcant9.setText("0");
     txtcant10.setText("0");
     txtcant11.setText("0");
     txtval1.setText("0");
     txtval2.setText("0");
     txtval3.setText("0");
     txtval4.setText("0");
     txtval5.setText("0");
     txtval6.setText("0");
     txtval7.setText("0");
     txtval8.setText("0");
     txtval9.setText("0");
     txtval10.setText("0");
     txtval11.setText("0");
     txttic.setText("0");
    }
    
    public void bloquear_cajas (){
     txtuser.setEnabled(false);
     txtfecha.setEnabled(false);
     txttotal.setEnabled(false);
     txtcant1.setEnabled(false);
     txtcant2.setEnabled(false);
     txtcant3.setEnabled(false);
     txtcant4.setEnabled(false);
     txtcant5.setEnabled(false);
     txtcant6.setEnabled(false);
     txtcant7.setEnabled(false);
     txtcant8.setEnabled(false);
     txtcant9.setEnabled(false);
     txtcant10.setEnabled(false);
     txtcant11.setEnabled(false);
     txtval1.setEnabled(false);
     txtval2.setEnabled(false);
     txtval3.setEnabled(false);
     txtval4.setEnabled(false);
     txtval5.setEnabled(false);
     txtval6.setEnabled(false);
     txtval7.setEnabled(false);
     txtval8.setEnabled(false);
     txtval9.setEnabled(false);
     txtval10.setEnabled(false);
     txtval11.setEnabled(false);
     txttic.setEnabled(false);
     btnregistrar.setEnabled(false);
     btncancelar.setEnabled(false);
     btnPdf.setVisible(false);
    }
    
    public void desbloquear_cajas(){
     txtcant1.setEnabled(true);
     txtcant2.setEnabled(true);
     txtcant3.setEnabled(true);
     txtcant4.setEnabled(true);
     txtcant5.setEnabled(true);
     txtcant6.setEnabled(true);
     txtcant7.setEnabled(true);
     txtcant8.setEnabled(true);
     txtcant9.setEnabled(true);
     txtcant10.setEnabled(true);
     txtcant11.setEnabled(true);
     txttic.setEnabled(true);
     btnregistrar.setEnabled(true);
     btncancelar.setEnabled(true);
    }
    
    public void valida_campos(){
        if (txtcant1.getText().equals("")) {
            txtcant1.setText("0");
            txtval1.setText("0");
        }
        if (txtcant2.getText().equals("")) {
            txtcant2.setText("0");
            txtval2.setText("0");
        }
        if (txtcant3.getText().equals("")) {
            txtcant3.setText("0");
            txtval3.setText("0");
        }
        if (txtcant4.getText().equals("")) {
            txtcant4.setText("0");
            txtval4.setText("0");
        }
        if (txtcant5.getText().equals("")) {
            txtcant5.setText("0");
            txtval5.setText("0");
        }
        if (txtcant6.getText().equals("")) {
            txtcant6.setText("0");
            txtval6.setText("0");
        }
        if (txtcant7.getText().equals("")) {
            txtcant7.setText("0");
            txtval7.setText("0");
        }
        if (txtcant8.getText().equals("")) {
            txtcant8.setText("0");
            txtval8.setText("0");
        }
        if (txtcant9.getText().equals("")) {
            txtcant9.setText("0");
            txtval9.setText("0");
        }
        if (txtcant10.getText().equals("")) {
            txtcant10.setText("0");
            txtval10.setText("0");
        }
        if (txtcant11.getText().equals("")) {
            txtcant11.setText("0");
            txtval11.setText("0");
        }
        if (txttic.getText().equals("")) {
            txttic.setText("0");
            txttic.setText("0");
        }
     
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        txtcant3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtcant5 = new javax.swing.JTextField();
        txtcant6 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcant4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtval8 = new javax.swing.JTextField();
        txtval2 = new javax.swing.JTextField();
        txtval6 = new javax.swing.JTextField();
        txtval9 = new javax.swing.JTextField();
        txtval10 = new javax.swing.JTextField();
        txtval11 = new javax.swing.JTextField();
        txtcant11 = new javax.swing.JTextField();
        txtcant10 = new javax.swing.JTextField();
        txtcant8 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtcant9 = new javax.swing.JTextField();
        txtcant7 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtval7 = new javax.swing.JTextField();
        txtcant2 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtcant1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtval1 = new javax.swing.JTextField();
        txtval5 = new javax.swing.JTextField();
        txtval3 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtval4 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txttic = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txttotal = new javax.swing.JTextField();
        txtuser = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtfecha = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btncancelar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnnuevo = new javax.swing.JButton();
        lblresultado = new javax.swing.JLabel();
        btnPdf = new javax.swing.JButton();

        setBackground(new java.awt.Color(157, 195, 239));
        setTitle("Cuadre inicial");

        jPanel2.setBackground(java.awt.Color.white);

        txtcant3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant3ActionPerformed(evt);
            }
        });
        txtcant3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant3KeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel8.setText("$ 50.000");

        txtcant5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant5ActionPerformed(evt);
            }
        });
        txtcant5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant5KeyReleased(evt);
            }
        });

        txtcant6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant6ActionPerformed(evt);
            }
        });
        txtcant6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant6KeyReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel9.setText("Valor");

        txtcant4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant4ActionPerformed(evt);
            }
        });
        txtcant4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant4KeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel10.setText("Moneda");

        txtval8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval8ActionPerformed(evt);
            }
        });

        txtval2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval2ActionPerformed(evt);
            }
        });

        txtval6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval6ActionPerformed(evt);
            }
        });

        txtval9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval9ActionPerformed(evt);
            }
        });

        txtval10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval10ActionPerformed(evt);
            }
        });

        txtval11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval11ActionPerformed(evt);
            }
        });

        txtcant11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant11ActionPerformed(evt);
            }
        });
        txtcant11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant11KeyReleased(evt);
            }
        });

        txtcant10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant10ActionPerformed(evt);
            }
        });
        txtcant10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant10KeyReleased(evt);
            }
        });

        txtcant8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant8ActionPerformed(evt);
            }
        });
        txtcant8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant8KeyReleased(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel16.setText("$ 200");

        txtcant9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant9ActionPerformed(evt);
            }
        });
        txtcant9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant9KeyReleased(evt);
            }
        });

        txtcant7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant7ActionPerformed(evt);
            }
        });
        txtcant7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant7KeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel11.setText("Cantidad");

        txtval7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval7ActionPerformed(evt);
            }
        });

        txtcant2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant2ActionPerformed(evt);
            }
        });
        txtcant2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant2KeyReleased(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel21.setText("$ 500");

        txtcant1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcant1ActionPerformed(evt);
            }
        });
        txtcant1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtcant1KeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcant1KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcant1KeyTyped(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel22.setText("$ 50");

        jLabel23.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel23.setText("$ 100");

        jLabel12.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel12.setText("$ 5.000");

        jLabel13.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel13.setText("$ 2.000");

        txtval1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval1ActionPerformed(evt);
            }
        });

        txtval5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval5ActionPerformed(evt);
            }
        });

        txtval3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval3ActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel14.setText("$ 1.000");

        txtval4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtval4ActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel15.setText("$ 100.000");

        jLabel7.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel7.setText("$ 10.000");

        jLabel17.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel17.setText("$ 20.000");

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel4.setText("Valor en tickets ");

        txttic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtticActionPerformed(evt);
            }
        });
        txttic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtticKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(88, 88, 88))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txttic, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel15)
                            .addComponent(jLabel17)
                            .addComponent(jLabel7)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14)
                            .addComponent(jLabel21)
                            .addComponent(jLabel16)
                            .addComponent(jLabel23)
                            .addComponent(jLabel22))
                        .addGap(39, 39, 39)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant4, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(txtval4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant7, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant6, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant5, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant8, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant9, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant11, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtcant10, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtval10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(55, 55, 55))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(90, 90, 90)
                            .addComponent(jLabel11))
                        .addComponent(jLabel10))
                    .addContainerGap(230, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(txtval1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtcant2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtval2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtval3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtval4, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(txtval5, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtval6, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtval7, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtval8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcant8, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtval9, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtval10, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel23))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcant11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtval11, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txttic, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(37, 37, 37)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(jLabel11))
                    .addContainerGap(420, Short.MAX_VALUE)))
        );

        jPanel1.setBackground(java.awt.Color.white);

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 25)); // NOI18N
        jLabel3.setText("Total ");

        txttotal.setFont(new java.awt.Font("Ubuntu", 1, 30)); // NOI18N
        txttotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txttotal)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(55, 55, 55))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(txttotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel1.setText("Usuario");

        txtfecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfechaActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        jLabel2.setText("Fecha actual");

        jLabel6.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel6.setText("Ingrese la cantidad de dinero segun denominacion");

        btncancelar.setBackground(java.awt.Color.white);
        btncancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/cancelar.png"))); // NOI18N
        btncancelar.setText("Cancelar");
        btncancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncancelarActionPerformed(evt);
            }
        });

        jButton2.setBackground(java.awt.Color.white);
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/salir.png"))); // NOI18N
        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnregistrar.setBackground(java.awt.Color.white);
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });

        btnnuevo.setBackground(java.awt.Color.white);
        btnnuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/new.png"))); // NOI18N
        btnnuevo.setText("Nuevo cuadre");
        btnnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnuevoActionPerformed(evt);
            }
        });

        lblresultado.setFont(new java.awt.Font("Ubuntu", 1, 24)); // NOI18N
        lblresultado.setForeground(java.awt.Color.gray);

        btnPdf.setBackground(java.awt.Color.white);
        btnPdf.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/btn_save.png"))); // NOI18N
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(btnPdf))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(lblresultado, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnnuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnregistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btncancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel1)
                .addGap(179, 179, 179)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtuser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnnuevo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPdf)
                        .addGap(20, 20, 20)
                        .addComponent(lblresultado, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnregistrar)
                            .addComponent(btncancelar)
                            .addComponent(jButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtcant3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant3ActionPerformed

    private void txtcant5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant5ActionPerformed

    private void txtcant6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant6ActionPerformed

    private void txtcant4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant4ActionPerformed

    private void txtval8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval8ActionPerformed

    private void txtval2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval2ActionPerformed

    private void txtval6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval6ActionPerformed

    private void txtval9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval9ActionPerformed

    private void txtval10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval10ActionPerformed

    private void txtval11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval11ActionPerformed

    private void txtcant11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant11ActionPerformed

    private void txtcant10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant10ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant10ActionPerformed

    private void txtcant8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant8ActionPerformed

    private void txtcant9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant9ActionPerformed

    private void txtcant7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant7ActionPerformed

    private void txtval7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval7ActionPerformed

    private void txtcant2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcant2ActionPerformed

    private void txtcant1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcant1ActionPerformed
        
    }//GEN-LAST:event_txtcant1ActionPerformed

    private void txtval1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval1ActionPerformed
        
     
    }//GEN-LAST:event_txtval1ActionPerformed

    private void txtval5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval5ActionPerformed

    private void txtval3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval3ActionPerformed

    private void txtval4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtval4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtval4ActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed

    }//GEN-LAST:event_txtuserActionPerformed

    private void txtfechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfechaActionPerformed

    }//GEN-LAST:event_txtfechaActionPerformed

    private void btncancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncancelarActionPerformed
        limpiar();
        this.total="0";
    }//GEN-LAST:event_btncancelarActionPerformed
 
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
//        String val12=txttic.getText();
//        String total=txttotal.getText();
//       
//        if(txttic.getText().equals("")){
//        
//        txttic.setText("0");
//        int new_total=Integer.parseInt(total) - Integer.parseInt(val12);
//        
//        txttotal.setText(Integer.toString(new_total));
//        }
        
        if(control.Registrar_cuadre_final(id_user,id_reporte, fecha,txttotal.getText())){
                 JOptionPane.showMessageDialog(null,"Se registro el cierre de caja");
                 btnPdf.setVisible(true);
                 this.datos=control.consulta_cuadre_exitoso(id_reporte);
                 int ini=Integer.parseInt(datos[0][0].toString());
                 int ven=Integer.parseInt(datos[0][1].toString());
                 this.resultado=datos[0][2].toString();
                 int dec=Integer.parseInt(datos[0][3].toString());

                 if(resultado.equals("0")){
                  lblresultado.setText("Su diferencia es 0");
                 }
                 else {
                     if ((ini + ven) > dec) {
                         lblresultado.setText("Saldo en contra $" + resultado);
                     } else {
                         lblresultado.setText("Saldo a favor $" + resultado);
                     }
                 }
                 this.val_repo_ini=datos[0][0].toString();
                 this.val_ventas=datos[0][1].toString();
            }
        else
            {
                JOptionPane.showMessageDialog(null, "Error al registrar el cuadre");
            }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void btnnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnuevoActionPerformed
        desbloquear_cajas();
        btnnuevo.setEnabled(false);
        
        
    }//GEN-LAST:event_btnnuevoActionPerformed

    private void txtcant1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant1KeyTyped
        
    }//GEN-LAST:event_txtcant1KeyTyped

    private void txtcant1KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant1KeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txtcant1KeyPressed

    private void txtcant1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant1KeyReleased
      valida_campos();
      String val= control.valores(txtcant1.getText(), 100000);
      
      txtval1.setText(val);
      this.val1=val;
      
      this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
      txttotal.setText(String.valueOf(this.total));
      
    }//GEN-LAST:event_txtcant1KeyReleased

    private void txtcant2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant2KeyReleased
        valida_campos();
        String val= control.valores(txtcant2.getText(), 50000);
         txtval2.setText(val);
         this.val2=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant2KeyReleased

    private void txtcant3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant3KeyReleased
        valida_campos();
        String val= control.valores(txtcant3.getText(), 20000);
         txtval3.setText(val);
         this.val3=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant3KeyReleased

    private void txtcant4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant4KeyReleased
        valida_campos();
        String val= control.valores(txtcant4.getText(), 10000);
         txtval4.setText(val);
         this.val4=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant4KeyReleased

    private void txtcant5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant5KeyReleased
        valida_campos();
        String val= control.valores(txtcant5.getText(), 5000);
         txtval5.setText(val);
         this.val5=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant5KeyReleased

    private void txtcant6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant6KeyReleased
        valida_campos();
        String val= control.valores(txtcant6.getText(), 2000);
         txtval6.setText(val);
         this.val6=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant6KeyReleased

    private void txtcant7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant7KeyReleased
        valida_campos();
        String val= control.valores(txtcant7.getText(), 1000);
         txtval7.setText(val);
         this.val7=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant7KeyReleased

    private void txtcant8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant8KeyReleased
        valida_campos();
        String val= control.valores(txtcant8.getText(), 500);
         txtval8.setText(val);
         this.val8=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant8KeyReleased

    private void txtcant9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant9KeyReleased
        valida_campos();
        String val= control.valores(txtcant9.getText(), 200);
         txtval9.setText(val);
         this.val9=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant9KeyReleased

    private void txtcant11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant11KeyReleased
        valida_campos();
        String val= control.valores(txtcant11.getText(), 50);
         txtval11.setText(val);
         this.val11=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
        
        
    }//GEN-LAST:event_txtcant11KeyReleased

    private void txtcant10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcant10KeyReleased
        valida_campos();
        String val= control.valores(txtcant10.getText(), 100);
         txtval10.setText(val);
         this.val10=val;
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtcant10KeyReleased

    private void txttotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttotalActionPerformed
        
    }//GEN-LAST:event_txttotalActionPerformed

    private void txtticActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtticActionPerformed
        
    }//GEN-LAST:event_txtticActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        String ruta=control.rutas("3");
        String rutaIMG=control.rutas("4");
        String fech="Rep_fin_"+fec_reporte;
        try {
            control.generar_pdf_cuadre_fin(fech,titulo,nombre,val_repo_ini,val_ventas,txttotal.getText(),resultado,fecha,ruta,rutaIMG);
        } catch (DocumentException ex) {
            Logger.getLogger(Interfaz_cuadre_final.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Interfaz_cuadre_final.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPdfActionPerformed

    private void txtticKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtticKeyReleased
        valida_campos();
        
         this.val12=txttic.getText();
         
         this.total=control.total(val1, val2, val3, val4, val5, val6, val7, val8, val9, val10, val11, val12);
         txttotal.setText(String.valueOf(this.total));
    }//GEN-LAST:event_txtticKeyReleased

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btncancelar;
    private javax.swing.JButton btnnuevo;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblresultado;
    private javax.swing.JTextField txtcant1;
    private javax.swing.JTextField txtcant10;
    private javax.swing.JTextField txtcant11;
    private javax.swing.JTextField txtcant2;
    private javax.swing.JTextField txtcant3;
    private javax.swing.JTextField txtcant4;
    private javax.swing.JTextField txtcant5;
    private javax.swing.JTextField txtcant6;
    private javax.swing.JTextField txtcant7;
    private javax.swing.JTextField txtcant8;
    private javax.swing.JTextField txtcant9;
    private javax.swing.JTextField txtfecha;
    private javax.swing.JTextField txttic;
    private javax.swing.JTextField txttotal;
    private javax.swing.JTextField txtuser;
    private javax.swing.JTextField txtval1;
    private javax.swing.JTextField txtval10;
    private javax.swing.JTextField txtval11;
    private javax.swing.JTextField txtval2;
    private javax.swing.JTextField txtval3;
    private javax.swing.JTextField txtval4;
    private javax.swing.JTextField txtval5;
    private javax.swing.JTextField txtval6;
    private javax.swing.JTextField txtval7;
    private javax.swing.JTextField txtval8;
    private javax.swing.JTextField txtval9;
    // End of variables declaration//GEN-END:variables

    private String toString(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
