
package facturacion.Vista;

import facturacion.Articulo;
import facturacion.Controlador.control_existencias;
import facturacion.Controlador.control_reportes;
import facturacion.FPago;
import facturacion.IVA;
import facturacion.Servicio;
import facturacion.Vendedor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;


public class Interfaz_factura extends javax.swing.JInternalFrame {

    
    control_existencias con;
    private String id_client;
     private String id_user;
     private String nombres;
     private String apellidos;
     //private Object combox;
     private String tip_tarjeta;
    control_reportes control;
    private Object [][] datostabla;
    private String tipo_producto="";
    public Interfaz_factura(control_existencias con,String id, String nom, String ape) {
        initComponents();
        this.control= new control_reportes();
         this.id_user=id;
        this.nombres=nom;
        this.apellidos=ape;
        String id_pago, des_pago, id_vend, des_vend, rol_vend,set,id_serv,ref_serv,desc_serv,val_serv,id_art,ref_art;
        DefaultComboBoxModel pago = new DefaultComboBoxModel();
        DefaultComboBoxModel vend = new DefaultComboBoxModel();
        DefaultComboBoxModel tipo = new DefaultComboBoxModel();
        DefaultComboBoxModel Serv = new DefaultComboBoxModel();
        DefaultComboBoxModel Art = new DefaultComboBoxModel();
        
        fecha_fact.setEnabled(false);
        num_factura.setEnabled(false);
        cliente_factura.setEnabled(false);
        apell_cli.setEnabled(false);
        articulo_venta.setEnabled(false);
        stock_art.setEnabled(false);
        preciu_unid.setEnabled(false);
        cant_art.setEnabled(false);
        iva_art.setEnabled(false);
        desc_art.setEnabled(false);
        Total_art.setEnabled(false);
        combo_articulos.setEnabled(false);
        Reg_articulo.setEnabled(false);
        imprimir_bt.setEnabled(false);
        total_factura.setEnabled(false);
        combo_formapago.setEnabled(false);
        comboTipo.setEnabled(false);
        txtservicio.setEnabled(false);
        txtvalor.setEnabled(false);
        btnvisa.setVisible(false);
        btnmaster.setVisible(false);
        btnmaestro.setVisible(false);
        btnameexp.setVisible(false);
        btncambiar.setVisible(false);
        btnfactura.setVisible(false);
        
        articulo_venta.setVisible(false);
        stock_art.setVisible(false);
        preciu_unid.setVisible(false);
        cant_art.setVisible(false);
        iva_art.setVisible(true);
        desc_art.setVisible(false);
        Total_art.setVisible(false);
        combo_articulos.setVisible(false);
        lbl_id_articulo.setVisible(false);
         lbl_total_art.setVisible(false);
         lblarticulo.setVisible(false);
         lblcantidad.setVisible(false);
         lbldescuento.setVisible(false);
         lblprecio_unidad.setVisible(false);
         lblstock.setVisible(false);
         
         lbl_id_servicio.setVisible(false);
         comboServicio.setVisible(false);
         lblservicio.setVisible(false);
         txtservicio.setVisible(false);
         lblvalor.setVisible(false);
         txtvalor.setVisible(false);
        
        
        this.con = con;
        
        id_client=con.ingresa_Id_Cliente();
        
        cliente_factura.setText( con.ingresa_nombre_Cliente() );
        
        apell_cli.setText(con.ingresa_apellidos_Cliente());
        
        num_factura.setText(con.GenerarNumeroFactura());  
        
        Date hoy = new Date();
        fecha_fact.setText( hoy.getDate()+"/"+(hoy.getMonth()+1) +"/"+(hoy.getYear()+1900) );
        
        Object[] idarticulo = con.combox("articulo","id_articulo");
        Object[] ref_articulo = con.combox("articulo","ref_articulo");
        combo_articulos.removeAllItems();
        combo_articulos.setModel(Art);
        for(int i=0;i<idarticulo.length;i++)
        {
        ref_art=ref_articulo[i].toString();
        id_art=idarticulo[i].toString();
        Art.addElement(new Articulo(ref_art, id_art));
        }
        
        Object[] idservicio = con.combox("servicio","id_servicio");
        Object[] ref_servicio = con.combox("servicio","ref_servicio");
        Object[] des_servicio = con.combox("servicio","desc_servicio");
        Object[] val_servicio = con.combox("servicio","valor_servicio");
       comboServicio.removeAllItems();
       comboServicio.setModel(Serv);
       for(int i=0;i<idservicio.length;i++)
       {
        ref_serv=ref_servicio[i].toString();
        id_serv=idservicio[i].toString();
        
        desc_serv=des_servicio[i].toString();
        val_serv=val_servicio[i].toString();
        Serv.addElement(new Servicio(ref_serv,id_serv));
        }
     
        Object[] formapago = con.combox("forma_de_pago","id_formapago");
        Object[] des_formapago = con.combox("forma_de_pago","Descripcion_formapago");
        combo_formapago.removeAllItems();
        combo_formapago.setModel(pago);
        for(int i=0;i<formapago.length;i++)
        {
        id_pago=formapago[i].toString();
        des_pago=des_formapago[i].toString();
        pago.addElement(new FPago(des_pago,id_pago));
        }
//        
//        
       Combo_vendedor.removeAllItems();
       Combo_vendedor.setModel(vend);
    
     String nomComp= nombres+" "+apellidos;
     vend.addElement(new Vendedor(nomComp,id_user)); 
      
     // Creacion del JComboBox y añadir los items.
		comboTipo.removeAllItems();
                comboTipo.setModel(tipo);
                tipo.addElement("--");
                tipo.addElement("Servicio");
                tipo.addElement("Producto");
//	
//       
    }
    
    
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cliente_factura = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        num_factura = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fecha_fact = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        lbl_id_articulo = new javax.swing.JLabel();
        combo_articulos = new javax.swing.JComboBox();
        lblarticulo = new javax.swing.JLabel();
        articulo_venta = new javax.swing.JTextField();
        lblprecio_unidad = new javax.swing.JLabel();
        preciu_unid = new javax.swing.JTextField();
        stock_art = new javax.swing.JTextField();
        lblstock = new javax.swing.JLabel();
        lbl_total_art = new javax.swing.JLabel();
        Total_art = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        Reg_articulo = new javax.swing.JButton();
        apell_cli = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        reg_factura = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblcantidad = new javax.swing.JLabel();
        cant_art = new javax.swing.JTextField();
        combo_formapago = new javax.swing.JComboBox();
        desc_art = new javax.swing.JTextField();
        lbldescuento = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        iva_art = new javax.swing.JTextField();
        total_factura = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        imprimir_bt = new javax.swing.JButton();
        Combo_vendedor = new javax.swing.JComboBox();
        btnvisa = new javax.swing.JButton();
        btnmaster = new javax.swing.JButton();
        btnmaestro = new javax.swing.JButton();
        btnameexp = new javax.swing.JButton();
        btncambiar = new javax.swing.JButton();
        lblNaprovacion = new javax.swing.JLabel();
        txtNaprovacion = new javax.swing.JTextField();
        btnfactura = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        lbl_id_servicio = new javax.swing.JLabel();
        lblservicio = new javax.swing.JLabel();
        txtservicio = new javax.swing.JTextField();
        lblvalor = new javax.swing.JLabel();
        txtvalor = new javax.swing.JTextField();
        comboServicio = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(157, 195, 239));
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Generar factura");

        jLabel1.setText("Nombre cliente");

        jLabel2.setText("Num factura");

        jLabel3.setText("Vendedor");

        jLabel4.setText("Forma pago");

        jLabel5.setText("Fecha");

        lbl_id_articulo.setText("ref_articulo");

        combo_articulos.setBackground(java.awt.Color.white);
        combo_articulos.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_articulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_articulosActionPerformed(evt);
            }
        });

        lblarticulo.setText("Articulo");

        lblprecio_unidad.setText("Precio_unidad");

        lblstock.setText("stock");

        lbl_total_art.setText("Total articulos");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        Reg_articulo.setBackground(java.awt.Color.white);
        Reg_articulo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        Reg_articulo.setText("Registrar detalle");
        Reg_articulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Reg_articuloActionPerformed(evt);
            }
        });

        jLabel11.setText("Apellido cliente");

        reg_factura.setBackground(java.awt.Color.white);
        reg_factura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/new.png"))); // NOI18N
        reg_factura.setText("registrar factura");
        reg_factura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reg_facturaActionPerformed(evt);
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

        lblcantidad.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lblcantidad.setText("Cantidad");

        cant_art.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cant_artActionPerformed(evt);
            }
        });
        cant_art.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cant_artKeyReleased(evt);
            }
        });

        combo_formapago.setBackground(java.awt.Color.white);
        combo_formapago.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_formapago.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_formapagoItemStateChanged(evt);
            }
        });
        combo_formapago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_formapagoActionPerformed(evt);
            }
        });
        combo_formapago.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                combo_formapagoKeyPressed(evt);
            }
        });

        lbldescuento.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbldescuento.setText("Descuento");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel14.setText("IVA");

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Total factura");

        imprimir_bt.setBackground(java.awt.Color.white);
        imprimir_bt.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/guardar.png"))); // NOI18N
        imprimir_bt.setText("Registrar total");
        imprimir_bt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imprimir_btActionPerformed(evt);
            }
        });

        Combo_vendedor.setBackground(java.awt.Color.white);
        Combo_vendedor.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnvisa.setBackground(java.awt.Color.white);
        btnvisa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/visa.png"))); // NOI18N
        btnvisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnvisaActionPerformed(evt);
            }
        });

        btnmaster.setBackground(java.awt.Color.white);
        btnmaster.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/master.png"))); // NOI18N
        btnmaster.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmasterActionPerformed(evt);
            }
        });

        btnmaestro.setBackground(java.awt.Color.white);
        btnmaestro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/simbolo.png"))); // NOI18N
        btnmaestro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmaestroActionPerformed(evt);
            }
        });

        btnameexp.setBackground(java.awt.Color.white);
        btnameexp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/ameexp.png"))); // NOI18N
        btnameexp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnameexpActionPerformed(evt);
            }
        });

        btncambiar.setBackground(java.awt.Color.white);
        btncambiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/actualizar.png"))); // NOI18N
        btncambiar.setText("Cambiar tarjeta");
        btncambiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncambiarActionPerformed(evt);
            }
        });

        lblNaprovacion.setText("Numero de aprovacion");

        btnfactura.setBackground(java.awt.Color.white);
        btnfactura.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/factura.png"))); // NOI18N
        btnfactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacturaActionPerformed(evt);
            }
        });

        jLabel16.setText("Tipo producto");

        comboTipo.setBackground(java.awt.Color.white);
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboTipo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboTipoItemStateChanged(evt);
            }
        });
        comboTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboTipoActionPerformed(evt);
            }
        });

        lbl_id_servicio.setText("ref_servicio");

        lblservicio.setText("Servicio");

        txtservicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtservicioActionPerformed(evt);
            }
        });

        lblvalor.setText("Valor");

        comboServicio.setBackground(java.awt.Color.white);
        comboServicio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboServicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboServicioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(Reg_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnfactura)
                                        .addGap(132, 132, 132)
                                        .addComponent(lblNaprovacion)
                                        .addGap(6, 6, 6))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btncambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(combo_formapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel14)
                                .addGap(18, 18, 18)
                                .addComponent(iva_art, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(txtNaprovacion))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(btnvisa)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnmaster)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnmaestro)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnameexp)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel15)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(total_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 50, Short.MAX_VALUE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(imprimir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)
                            .addComponent(lbl_id_articulo)
                            .addComponent(lblcantidad)
                            .addComponent(lbl_id_servicio))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(num_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(129, 129, 129)
                                    .addComponent(jLabel5))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cliente_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(47, 47, 47)
                                    .addComponent(jLabel3))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addComponent(apell_cli, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(46, 46, 46)
                                    .addComponent(jLabel16)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(cant_art, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lbldescuento))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(combo_articulos, 0, 111, Short.MAX_VALUE)
                                            .addComponent(comboServicio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(34, 34, 34)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(10, 10, 10)
                                                .addComponent(lblarticulo))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(5, 5, 5)
                                                .addComponent(lblservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtservicio, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(articulo_venta, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                                    .addComponent(desc_art))
                                .addGap(22, 22, 22)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Combo_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(fecha_fact, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(61, 61, 61)
                                        .addComponent(reg_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblstock)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(stock_art, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(lblvalor)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lbl_total_art)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(Total_art, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(14, 14, 14)
                                .addComponent(lblprecio_unidad)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preciu_unid, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(num_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5)
                        .addComponent(fecha_fact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(reg_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Combo_vendedor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cliente_factura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(4, 4, 4))
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(apell_cli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cant_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(preciu_unid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(txtvalor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lblvalor))
                                    .addGap(18, 18, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblstock, javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(stock_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(13, 13, 13)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(lbl_id_servicio)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(16, 16, 16)
                                                        .addComponent(lblservicio))
                                                    .addComponent(txtservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(12, 12, 12)
                                            .addComponent(comboServicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(28, 28, 28)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(combo_articulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(lbl_id_articulo)
                                        .addComponent(lblarticulo)
                                        .addComponent(articulo_venta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(lblprecio_unidad))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbldescuento)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(desc_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lbl_total_art)
                                .addComponent(Total_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lblcantidad))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(iva_art, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(total_factura, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btncambiar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(combo_formapago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)
                            .addComponent(Reg_articulo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnameexp)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnvisa)
                                .addComponent(btnmaster)
                                .addComponent(btnmaestro)))))
                .addGap(18, 30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnfactura, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(imprimir_bt, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtNaprovacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblNaprovacion)))
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void reg_facturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_facturaActionPerformed
        String vend;
        
        Vendedor id_vendedor=(Vendedor) Combo_vendedor.getSelectedItem();
        vend = id_vendedor.getID();
        
        con.registrar_factura(num_factura.getText(),id_client,vend,fecha_fact.getText());
        cant_art.setEnabled(true);
        iva_art.setEnabled(true);
        desc_art.setEnabled(true);
        Total_art.setEnabled(true);
        combo_articulos.setEnabled(true);
        Reg_articulo.setEnabled(true);
        total_factura.setEnabled(true);
        imprimir_bt.setEnabled(true);
        reg_factura.setEnabled(false);
        Combo_vendedor.setEnabled(false);
        comboTipo.setEnabled(true);
    }//GEN-LAST:event_reg_facturaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void combo_articulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_articulosActionPerformed
     if(combo_articulos.getSelectedItem()!=null )
     {
            Articulo id_art=(Articulo) combo_articulos.getSelectedItem();
            Object[][] datos = con.datos_articulo(id_art.getID().toString(),"id_articulo");
            articulo_venta.setText(datos[0][0].toString());
            preciu_unid.setText(datos[0][1].toString());
            stock_art.setText(datos[0][2].toString());
            cant_art.setText("0");
            Total_art.setText("0");
            desc_art.setText("0");
        
     }        
    }//GEN-LAST:event_combo_articulosActionPerformed
              
        
        
        
    private void cant_artActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cant_artActionPerformed
     
    }//GEN-LAST:event_cant_artActionPerformed

    private void cant_artKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cant_artKeyReleased
        double suma;      
        double descuento = Double.parseDouble(desc_art.getText());
        double precio = Double.parseDouble(preciu_unid.getText());
        int cant = Integer.parseInt( cant_art.getText() );
        double desc = descuento/100;
        double porcent;
        if (descuento == 0)
        {
        suma = precio*cant ;
        }
        else
        {
        porcent = precio*desc;
        suma = (precio-porcent)*cant ;
        }
        Total_art.setText(Double.toString(suma));
        
    }//GEN-LAST:event_cant_artKeyReleased

    private void Reg_articuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Reg_articuloActionPerformed
      
        int c = Integer.parseInt(stock_art.getText());
        int b = Integer.parseInt(cant_art.getText());
        
      if(tipo_producto.equals("2")){  
        if(!cant_art.getText().equals("0") )
        {
            if (c > b)
            {            
            Articulo id_art=(Articulo) combo_articulos.getSelectedItem();
            if( con.registrar_producto(num_factura.getText(),id_art.getID().toString(),cant_art.getText(),Total_art.getText()))
            {
                JOptionPane.showMessageDialog(this, "El articulo se registro con exito");
                cant_art.setText("0");
                Total_art.setText("0");                
                desc_art.setText("");
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al registrar el articulo");
            }
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El stock del articulo no soporta la venta por favor actualize en stock");
            }
        }
            else
            {
            JOptionPane.showMessageDialog(this, "La cantidad no es valida");
            }
        
        
        
        
    }
      else if(tipo_producto.equals("1")){
          Servicio id_ser=(Servicio) comboServicio.getSelectedItem();
        if( con.registrar_servicio(num_factura.getText(),id_ser.getID().toString(),txtvalor.getText()))
            {
                JOptionPane.showMessageDialog(this, "El Servicio se registro con exito");
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al registrar el Servicio");
            }
        
        
      }
      
      
        String[] columnas = {"Numero_factura","Codigo","Descripcion","Cantidad","Total"};
        datostabla = con.datos_detallefactura(num_factura.getText());
        DefaultTableModel datosta = new DefaultTableModel(datostabla,columnas);
        jTable1.setModel(datosta);
        Double a = con.total_factura(num_factura.getText());
        
        total_factura.setText(a.toString());
        IVA iva = new IVA(Double.parseDouble(total_factura.getText()));
        iva_art.setText(iva.calcular_iva().toString());
        
        combo_formapago.setEnabled(true);
        
        
    }//GEN-LAST:event_Reg_articuloActionPerformed

    private void imprimir_btActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imprimir_btActionPerformed
    FPago id_pag=(FPago) combo_formapago.getSelectedItem();
    String fpago = id_pag.getID();
        
        if(!total_factura.getText().equals("0") )
        {
            
            
            if(con.update_factura(num_factura.getText(),total_factura.getText(),iva_art.getText(),fpago, tip_tarjeta, txtNaprovacion.getText()))
            {
                JOptionPane.showMessageDialog(this, "Se registro la venta");
                total_factura.setText("0");
                iva_art.setText("0");  
                cant_art.setEnabled(false);
                iva_art.setEnabled(false);
                desc_art.setEnabled(false);
                Total_art.setEnabled(false);
                combo_articulos.setEnabled(false);
                Reg_articulo.setEnabled(false);
                imprimir_bt.setEnabled(false);
                total_factura.setEnabled(false);
                btnvisa.setVisible(false);
                btnmaster.setVisible(false);
                btnmaestro.setVisible(false);
                btnameexp.setVisible(false);
                btncambiar.setVisible(false);
                lblNaprovacion.setVisible(false);
                txtNaprovacion.setVisible(false);
                btnfactura.setVisible(true);
                
                
            }
            else
            {
                JOptionPane.showMessageDialog(this, "Error al registrar la venta");
            }
            }
            
            else
            {
            JOptionPane.showMessageDialog(this, "El total no es valido");
            }
    }//GEN-LAST:event_imprimir_btActionPerformed

    private void combo_formapagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_formapagoActionPerformed
//        FPago id_pag=(FPago) combo_formapago.getSelectedItem();
//        String fpago = id_pag.getID();


          
    }//GEN-LAST:event_combo_formapagoActionPerformed

    private void combo_formapagoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_combo_formapagoKeyPressed
      
    }//GEN-LAST:event_combo_formapagoKeyPressed

    private void combo_formapagoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_formapagoItemStateChanged
        //JOptionPane.showMessageDialog(null, "se selecciono"+combo_formapago.getSelectedIndex());
        Object combox;
        combox=combo_formapago.getSelectedIndex();
        if(combox.equals(2)){
        btnvisa.setVisible(true);
        btnmaster.setVisible(true);
        btnmaestro.setVisible(true);
        btnameexp.setVisible(true);
        lblNaprovacion.setVisible(true);
        txtNaprovacion.setVisible(true);
    }
        else{
        btnvisa.setVisible(false);
        btnmaster.setVisible(false);
        btnmaestro.setVisible(false);
        btnameexp.setVisible(false);
        btncambiar.setVisible(false);
        lblNaprovacion.setVisible(false);
        txtNaprovacion.setVisible(false);
        }
        
    }//GEN-LAST:event_combo_formapagoItemStateChanged

    private void btnvisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnvisaActionPerformed
        //
        String visa="1";
        tip_tarjeta=visa;
        btnvisa.setEnabled(true);
        btnmaster.setEnabled(false);
        btnmaestro.setEnabled(false);
        btnameexp.setEnabled(false);
        btncambiar.setVisible(true);
    }//GEN-LAST:event_btnvisaActionPerformed

    private void btnmasterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmasterActionPerformed
         String master="2";
         tip_tarjeta=master;
        btnvisa.setEnabled(false);
        btnmaster.setEnabled(true);
        btnmaestro.setEnabled(false);
        btnameexp.setEnabled(false);
        btncambiar.setVisible(true);
    }//GEN-LAST:event_btnmasterActionPerformed

    private void btnmaestroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmaestroActionPerformed
         String diners="3";
         tip_tarjeta=diners;
        btnvisa.setEnabled(false);
        btnmaster.setEnabled(false);
        btnmaestro.setEnabled(true);
        btnameexp.setEnabled(false);
        btncambiar.setVisible(true);
    }//GEN-LAST:event_btnmaestroActionPerformed

    private void btnameexpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnameexpActionPerformed
        String american="4";
        tip_tarjeta=american;
        btnvisa.setEnabled(false);
        btnmaster.setEnabled(false);
        btnmaestro.setEnabled(false);
        btnameexp.setEnabled(true);
        btncambiar.setVisible(true);
    }//GEN-LAST:event_btnameexpActionPerformed

    private void btncambiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncambiarActionPerformed
        // limpiar botones tarjetas
        btnvisa.setEnabled(true);
        btnmaster.setEnabled(true);
        btnmaestro.setEnabled(true);
        btnameexp.setEnabled(true);
    }//GEN-LAST:event_btncambiarActionPerformed

    private void btnfacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacturaActionPerformed
        Object [][] datos=null;
        String ruta1=control.rutas("1");//ubicacion de la plantilla
        String ruta2=control.rutas("2");//ubicacion donde se guarda
        int i;
        int j;
     
        datos=control.datos_factura(id_user, num_factura.getText());
       
        //JOptionPane.showMessageDialog(null, datos[1][0].toString());
        if(datos==null){
          JOptionPane.showMessageDialog(null,"No existe la factura");
        }
        else{ 
           
            try {   
                control.GenerarFactura(datos,fecha_fact.getText(),ruta1,ruta2);
            } catch (IOException ex) {
                Logger.getLogger(Interfaz_factura.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        }
    }//GEN-LAST:event_btnfacturaActionPerformed

    private void comboTipoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboTipoItemStateChanged
        Object combox;
        combox=comboTipo.getSelectedIndex();
        if(combox.equals(2)){
            this.tipo_producto="2";
        articulo_venta.setVisible(true);
        stock_art.setVisible(true);
        preciu_unid.setVisible(true);
        cant_art.setVisible(true);
        iva_art.setVisible(true);
        desc_art.setVisible(true);
        Total_art.setVisible(true);
        combo_articulos.setVisible(true);
         lbl_id_articulo.setVisible(true);
         lbl_total_art.setVisible(true);
         lblarticulo.setVisible(true);
         lblcantidad.setVisible(true);
         lbldescuento.setVisible(true);
         lblprecio_unidad.setVisible(true);
         lblstock.setVisible(true);
         lbl_id_servicio.setVisible(false);
         comboServicio.setVisible(false);
         lblservicio.setVisible(false);
         txtservicio.setVisible(false);
         lblvalor.setVisible(false);
         txtvalor.setVisible(false);
         
    }
        else if(combox.equals(1)){
            this.tipo_producto="1";
        articulo_venta.setVisible(false);
        stock_art.setVisible(false);
        preciu_unid.setVisible(false);
        cant_art.setVisible(false);
        iva_art.setVisible(true);
        desc_art.setVisible(false);
        Total_art.setVisible(false);
        combo_articulos.setVisible(false);
        lbl_id_articulo.setVisible(false);
         lbl_total_art.setVisible(false);
         lblarticulo.setVisible(false);
         lblcantidad.setVisible(false);
         lbldescuento.setVisible(false);
         lblprecio_unidad.setVisible(false);
         lblstock.setVisible(false);
         lbl_id_servicio.setVisible(true);
         comboServicio.setVisible(true);
         lblservicio.setVisible(true);
         txtservicio.setVisible(true);
         lblvalor.setVisible(true);
         txtvalor.setVisible(true);

        }
    }//GEN-LAST:event_comboTipoItemStateChanged

    private void txtservicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtservicioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtservicioActionPerformed

    private void comboServicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboServicioActionPerformed
        
        if(comboServicio.getSelectedItem()!=null )
     {
            Servicio id_ser=(Servicio) comboServicio.getSelectedItem();
            Object[][] dato = con.datos_servicio(id_ser.getID().toString());
            txtservicio.setText(dato[0][0].toString());
            txtvalor.setText(dato[0][1].toString());
           
     }        
    }//GEN-LAST:event_comboServicioActionPerformed

    private void comboTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboTipoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Combo_vendedor;
    private javax.swing.JButton Reg_articulo;
    private javax.swing.JTextField Total_art;
    private javax.swing.JTextField apell_cli;
    private javax.swing.JTextField articulo_venta;
    private javax.swing.JButton btnameexp;
    private javax.swing.JButton btncambiar;
    private javax.swing.JButton btnfactura;
    private javax.swing.JButton btnmaestro;
    private javax.swing.JButton btnmaster;
    private javax.swing.JButton btnvisa;
    private javax.swing.JTextField cant_art;
    private javax.swing.JTextField cliente_factura;
    private javax.swing.JComboBox comboServicio;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JComboBox combo_articulos;
    private javax.swing.JComboBox combo_formapago;
    private javax.swing.JTextField desc_art;
    private javax.swing.JTextField fecha_fact;
    private javax.swing.JButton imprimir_bt;
    private javax.swing.JTextField iva_art;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblNaprovacion;
    private javax.swing.JLabel lbl_id_articulo;
    private javax.swing.JLabel lbl_id_servicio;
    private javax.swing.JLabel lbl_total_art;
    private javax.swing.JLabel lblarticulo;
    private javax.swing.JLabel lblcantidad;
    private javax.swing.JLabel lbldescuento;
    private javax.swing.JLabel lblprecio_unidad;
    private javax.swing.JLabel lblservicio;
    private javax.swing.JLabel lblstock;
    private javax.swing.JLabel lblvalor;
    private javax.swing.JTextField num_factura;
    private javax.swing.JTextField preciu_unid;
    private javax.swing.JButton reg_factura;
    private javax.swing.JTextField stock_art;
    private javax.swing.JTextField total_factura;
    private javax.swing.JTextField txtNaprovacion;
    private javax.swing.JTextField txtservicio;
    private javax.swing.JTextField txtvalor;
    // End of variables declaration//GEN-END:variables
}
