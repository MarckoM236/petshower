//Developer friend:
//When I wrote this code, 
//only God and I know what we were doing,
// now only God knows.

package facturacion.Vista;

import facturacion.Vista.Login;
import facturacion.Vista.interfaz_buscararticulos;
import facturacion.Vista.interfaz_consultas;
import facturacion.Vista.interfaz_gestionarticulos;
import facturacion.Vista.Interfaz_Update_Clientes;
import facturacion.Vista.Interfaz_Proveedor;
import facturacion.Vista.Interfaz_Clientes;
import facturacion.Controlador.control_existencias;
import facturacion.Controlador.control_reportes;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class Interfaz_principal extends javax.swing.JFrame {

    control_existencias ctrl = new control_existencias();
    control_reportes ctrrepo = new control_reportes();
    
    private String id_user;
    private String nombres;
    private String apellidos;
    private String rol_user;
    private String fecha;
    Object prin;

    public Interfaz_principal(String id, String nom, String ape, String rol) {
        initComponents();

        this.id_user = id;
        this.nombres = nom;
        this.apellidos = ape;
        this.rol_user = rol;
        jMenuUser.setText(nombres + " " + apellidos);
        
        //bloquear elementos
        jMenuGesClient.setEnabled(false);
        jMenuGesArt.setEnabled(false);
        jMenuGesProv.setEnabled(false);
        jMenuGesUser.setEnabled(false);
        jMenuRegUser.setEnabled(false);
        jMenuRegprov.setEnabled(false);
        btnCF.setEnabled(false);
        jMenuItemConfig.setEnabled(false);
        jMenuGesServ.setEnabled(false);
        jMenuItemRA.setEnabled(false);
        jMenuItemRS.setEnabled(false);
        
        //Asignar permisos
        Rol();
        
        //fecha actual
        Date hoy = new Date();
        this.fecha=hoy.getDate()+"/"+(hoy.getMonth()+1) +"/"+(hoy.getYear()+1900) ;
        
        //requiere la fecha actual
        activarcuadre();
    }

    private Interfaz_principal() {
        throw new UnsupportedOperationException("Not supported yet."); 

    }
    
    //metodos
    public void Rol() {
        //1=ADMINISTRADOR
        //2=VENDEDOR
        if (this.rol_user.equals("1")) {
            jMenuGesClient.setEnabled(true);
            jMenuGesArt.setEnabled(true);
            jMenuGesProv.setEnabled(true);
            jMenuGesUser.setEnabled(true);
            jMenuRegUser.setEnabled(true);
            jMenuRegprov.setEnabled(true);
            jMenuItemConfig.setEnabled(true);
            jMenuGesServ.setEnabled(true);
            jMenuItemRA.setEnabled(true);
            jMenuItemRS.setEnabled(true);
        }

    }

    public void activarcuadre() {
        if (ctrrepo.existe_cuadre(this.id_user, this.fecha)) {
            btnCF.setEnabled(true);
            btnCI.setEnabled(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        btnCF = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCI = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        JMenuGClientes = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuGesClient = new javax.swing.JMenuItem();
        jMenu = new javax.swing.JMenu();
        jMenuItemRA = new javax.swing.JMenuItem();
        jMenuItemRS = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        Buscararticulos = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuGesArt = new javax.swing.JMenuItem();
        jMenuGesServ = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        item_venta = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuProv = new javax.swing.JMenu();
        jMenuRegprov = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuGesProv = new javax.swing.JMenuItem();
        jMenuUser = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuGesUser = new javax.swing.JMenuItem();
        jMenuRegUser = new javax.swing.JMenuItem();
        jMenuItemConfig = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jDesktopPane1.setBackground(java.awt.Color.white);

        jPanel1.setBackground(new java.awt.Color(157, 195, 239));

        btnCF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/cierre_caja.png"))); // NOI18N
        btnCF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCFActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel3.setForeground(java.awt.Color.white);
        jLabel3.setText("Cuadre Inicial");

        btnCI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/caja.png"))); // NOI18N
        btnCI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCIActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel4.setForeground(java.awt.Color.white);
        jLabel4.setText("Cuadre Final");

        jLabel5.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jLabel5.setForeground(java.awt.Color.white);
        jLabel5.setText("© MyM Creation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(51, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCF, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCI, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(49, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(21, 21, 21)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCI, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCF, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(266, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(583, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(36, 36, 36)))
        );

        jDesktopPane1.add(jPanel1);
        jPanel1.setBounds(0, 0, 210, 640);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/logopets.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel1);
        jLabel1.setBounds(250, 10, 900, 210);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/logoprin.jpg"))); // NOI18N
        jDesktopPane1.add(jLabel2);
        jLabel2.setBounds(530, 230, 330, 360);

        jMenuBar1.setBackground(new java.awt.Color(98, 156, 243));

        JMenuGClientes.setBackground(java.awt.Color.white);
        JMenuGClientes.setBorder(new javax.swing.border.MatteBorder(null));
        JMenuGClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/clients.png"))); // NOI18N
        JMenuGClientes.setText("Clientes");
        JMenuGClientes.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        JMenuGClientes.setPreferredSize(new java.awt.Dimension(195, 50));

        jMenuItem1.setBackground(java.awt.Color.white);
        jMenuItem1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem1.setText("Buscar clientes");
        jMenuItem1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        JMenuGClientes.add(jMenuItem1);

        jMenuItem4.setBackground(java.awt.Color.white);
        jMenuItem4.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuItem4.setText("Registrar");
        jMenuItem4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        JMenuGClientes.add(jMenuItem4);

        jMenuItem10.setBackground(java.awt.Color.white);
        jMenuItem10.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuItem10.setText("Actualizar clientes");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        JMenuGClientes.add(jMenuItem10);

        jMenuGesClient.setBackground(java.awt.Color.white);
        jMenuGesClient.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuGesClient.setText("Gestion clientes");
        jMenuGesClient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGesClientActionPerformed(evt);
            }
        });
        JMenuGClientes.add(jMenuGesClient);

        jMenuBar1.add(JMenuGClientes);

        jMenu.setBackground(java.awt.Color.white);
        jMenu.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/articulos.png"))); // NOI18N
        jMenu.setText("Art - Serv");
        jMenu.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        jMenu.setPreferredSize(new java.awt.Dimension(195, 50));

        jMenuItemRA.setBackground(java.awt.Color.white);
        jMenuItemRA.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItemRA.setText("Registar articulo");
        jMenuItemRA.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItemRA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRAActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemRA);

        jMenuItemRS.setBackground(java.awt.Color.white);
        jMenuItemRS.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuItemRS.setText("Registrar Servicios");
        jMenuItemRS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemRSActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItemRS);

        jMenuItem6.setBackground(java.awt.Color.white);
        jMenuItem6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem6.setText("Actualizar stock");
        jMenuItem6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem6);

        jMenuItem8.setBackground(java.awt.Color.white);
        jMenuItem8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem8.setText("Devoluciones");
        jMenuItem8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem8);

        Buscararticulos.setBackground(java.awt.Color.white);
        Buscararticulos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Buscararticulos.setText("Lista de articulos");
        Buscararticulos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Buscararticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscararticulosActionPerformed(evt);
            }
        });
        jMenu.add(Buscararticulos);

        jMenuItem12.setBackground(java.awt.Color.white);
        jMenuItem12.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuItem12.setText("Lista de servicios");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu.add(jMenuItem12);

        jMenuGesArt.setBackground(java.awt.Color.white);
        jMenuGesArt.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuGesArt.setText("Gestion de articulos");
        jMenuGesArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGesArtActionPerformed(evt);
            }
        });
        jMenu.add(jMenuGesArt);

        jMenuGesServ.setBackground(java.awt.Color.white);
        jMenuGesServ.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuGesServ.setText("Gestion de servicios");
        jMenuGesServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGesServActionPerformed(evt);
            }
        });
        jMenu.add(jMenuGesServ);

        jMenuBar1.add(jMenu);

        jMenu3.setBackground(java.awt.Color.white);
        jMenu3.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/facturacionn.png"))); // NOI18N
        jMenu3.setText("Facturación");
        jMenu3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        jMenu3.setPreferredSize(new java.awt.Dimension(230, 50));

        item_venta.setBackground(java.awt.Color.white);
        item_venta.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        item_venta.setText("Venta Clientes");
        item_venta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        item_venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                item_ventaActionPerformed(evt);
            }
        });
        jMenu3.add(item_venta);

        jMenuBar1.add(jMenu3);

        jMenu4.setBackground(java.awt.Color.white);
        jMenu4.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/consultar.png"))); // NOI18N
        jMenu4.setText("Consultas");
        jMenu4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        jMenu4.setPreferredSize(new java.awt.Dimension(200, 50));

        jMenuItem7.setBackground(java.awt.Color.white);
        jMenuItem7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem7.setText("Consulta facturas clientes");
        jMenuItem7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu4.add(jMenuItem7);

        jMenuBar1.add(jMenu4);

        jMenuProv.setBorder(new javax.swing.border.MatteBorder(null));
        jMenuProv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/proveedor.png"))); // NOI18N
        jMenuProv.setText("Proveedores");
        jMenuProv.setFont(new java.awt.Font("Segoe UI Semibold", 0, 23)); // NOI18N
        jMenuProv.setPreferredSize(new java.awt.Dimension(210, 50));

        jMenuRegprov.setBackground(java.awt.Color.white);
        jMenuRegprov.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuRegprov.setText("Registrar proveedor");
        jMenuRegprov.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuRegprov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegprovActionPerformed(evt);
            }
        });
        jMenuProv.add(jMenuRegprov);

        jMenuItem5.setBackground(java.awt.Color.white);
        jMenuItem5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jMenuItem5.setText("Lista proveedores");
        jMenuItem5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenuProv.add(jMenuItem5);

        jMenuGesProv.setBackground(java.awt.Color.white);
        jMenuGesProv.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuGesProv.setText("Gestion proveedores");
        jMenuGesProv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGesProvActionPerformed(evt);
            }
        });
        jMenuProv.add(jMenuGesProv);

        jMenuBar1.add(jMenuProv);

        jMenuUser.setBackground(java.awt.Color.white);
        jMenuUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/facturacion/imagenes/ui.png"))); // NOI18N
        jMenuUser.setFont(new java.awt.Font("Ubuntu", 1, 22)); // NOI18N
        jMenuUser.setIconTextGap(8);
        jMenuUser.setPreferredSize(new java.awt.Dimension(300, 50));

        jMenuItem9.setBackground(java.awt.Color.white);
        jMenuItem9.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuItem9.setText("Cerrar Sesion");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuItem9);
        jMenuUser.add(jSeparator1);

        jMenuGesUser.setBackground(java.awt.Color.white);
        jMenuGesUser.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuGesUser.setText("Gestion de Usuarios");
        jMenuGesUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuGesUserActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuGesUser);

        jMenuRegUser.setBackground(java.awt.Color.white);
        jMenuRegUser.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuRegUser.setText("Registrar Usuario");
        jMenuRegUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuRegUserActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuRegUser);

        jMenuItemConfig.setBackground(java.awt.Color.white);
        jMenuItemConfig.setFont(new java.awt.Font("Ubuntu", 1, 18)); // NOI18N
        jMenuItemConfig.setText("Configuracion");
        jMenuItemConfig.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemConfigActionPerformed(evt);
            }
        });
        jMenuUser.add(jMenuItemConfig);

        jMenuBar1.add(jMenuUser);
        jMenuUser.getAccessibleContext().setAccessibleDescription("");

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 1516, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 627, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Interfaz_buscarclientes buscar = new Interfaz_buscarclientes();
        jDesktopPane1.add(buscar);
        buscar.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuRegprovActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegprovActionPerformed
        Interfaz_Proveedor prov = new Interfaz_Proveedor();
        jDesktopPane1.add(prov);
        prov.show();
    }//GEN-LAST:event_jMenuRegprovActionPerformed

    private void jMenuItemRAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRAActionPerformed
        Interfaz_articulo art = new Interfaz_articulo();
        jDesktopPane1.add(art);
        art.show();
    }//GEN-LAST:event_jMenuItemRAActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        Interfaz_Clientes cli = new Interfaz_Clientes();
        jDesktopPane1.add(cli);
        cli.show();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void BuscararticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscararticulosActionPerformed
        interfaz_buscararticulos bus = new interfaz_buscararticulos();
        jDesktopPane1.add(bus);
        bus.show();
    }//GEN-LAST:event_BuscararticulosActionPerformed

    private void item_ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_item_ventaActionPerformed
        String venta = JOptionPane.showInputDialog(this, "Ingrese el documento del cliente: ","Venta", JOptionPane.OK_OPTION);
        if (ctrl.existe_cliente(venta)) {
            activarcuadre();
            Interfaz_factura fact = new Interfaz_factura(ctrl, id_user, nombres, apellidos);
            jDesktopPane1.add(fact);
            fact.show();
        } else {

            JOptionPane.showMessageDialog(null, "El cliente no existe, debe registrarlo", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_item_ventaActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        Interfaz_buscarproveedor proveedor = new Interfaz_buscarproveedor();
        jDesktopPane1.add(proveedor);
        proveedor.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Interfaz_actualizarstock stock = new Interfaz_actualizarstock();
        jDesktopPane1.add(stock);
        stock.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        interfaz_consultas consulta = new interfaz_consultas();
        jDesktopPane1.add(consulta);
        consulta.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        Interfaz_devoluciones dev = new Interfaz_devoluciones();
        jDesktopPane1.add(dev);
        dev.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        //closed sesion
        Login log = new Login();
        log.show();
        this.dispose();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void btnCFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCFActionPerformed
        Interfaz_cuadre_final usuario = new Interfaz_cuadre_final(id_user, nombres, apellidos);
        jDesktopPane1.add(usuario);
        usuario.show();
    }//GEN-LAST:event_btnCFActionPerformed

    private void btnCIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCIActionPerformed
        Interfaz_cuadre_inicial usuario = new Interfaz_cuadre_inicial(id_user, nombres, apellidos);
        jDesktopPane1.add(usuario);
        usuario.show();
    }//GEN-LAST:event_btnCIActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        String cliente = JOptionPane.showInputDialog(this, "Ingrese el documento del cliente: ","Actualizar", JOptionPane.OK_OPTION);
        if (ctrl.existe_cliente(cliente)) {
            Interfaz_Update_Clientes clie = new Interfaz_Update_Clientes(cliente);
            jDesktopPane1.add(clie);
            clie.show();
        } else {

            JOptionPane.showMessageDialog(null, "El cliente no existe, debe registrarlo", "Mensaje", JOptionPane.QUESTION_MESSAGE);
        }
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuGesArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGesArtActionPerformed
        interfaz_gestionarticulos art = new interfaz_gestionarticulos();
        jDesktopPane1.add(art);
        art.show();
    }//GEN-LAST:event_jMenuGesArtActionPerformed

    private void jMenuRegUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuRegUserActionPerformed
        Interfaz_Usuario user = new Interfaz_Usuario();
        jDesktopPane1.add(user);
        user.show();
    }//GEN-LAST:event_jMenuRegUserActionPerformed

    private void jMenuGesUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGesUserActionPerformed
        Interfaz_gestionusuarios moduser= new Interfaz_gestionusuarios();
        jDesktopPane1.add(moduser);
        moduser.show();
    }//GEN-LAST:event_jMenuGesUserActionPerformed

    private void jMenuGesClientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGesClientActionPerformed
        Interfaz_gestionclientes modclient= new Interfaz_gestionclientes();
        jDesktopPane1.add(modclient);
        modclient.show();
    }//GEN-LAST:event_jMenuGesClientActionPerformed

    private void jMenuGesProvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGesProvActionPerformed
        Interfaz_gestionarproveedor modpro= new Interfaz_gestionarproveedor();
        jDesktopPane1.add(modpro);
        modpro.show();
    }//GEN-LAST:event_jMenuGesProvActionPerformed

    private void jMenuItemRSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemRSActionPerformed
        Interfaz_servicio rserv= new Interfaz_servicio();
        jDesktopPane1.add(rserv);
        rserv.show();
    }//GEN-LAST:event_jMenuItemRSActionPerformed

    private void jMenuGesServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuGesServActionPerformed
        interfaz_gestionservicios gesserv= new interfaz_gestionservicios();
        jDesktopPane1.add(gesserv);
        gesserv.show();
    }//GEN-LAST:event_jMenuGesServActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
       interfaz_buscarservicios serv= new interfaz_buscarservicios();
        jDesktopPane1.add(serv);
        serv.show();
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItemConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemConfigActionPerformed
        Interfaz_configuracion config= new Interfaz_configuracion();
        jDesktopPane1.add(config);
        config.show();
    }//GEN-LAST:event_jMenuItemConfigActionPerformed
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
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Buscararticulos;
    private javax.swing.JMenu JMenuGClientes;
    private javax.swing.JButton btnCF;
    private javax.swing.JButton btnCI;
    private javax.swing.JMenuItem item_venta;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuGesArt;
    private javax.swing.JMenuItem jMenuGesClient;
    private javax.swing.JMenuItem jMenuGesProv;
    private javax.swing.JMenuItem jMenuGesServ;
    private javax.swing.JMenuItem jMenuGesUser;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenuItem jMenuItemConfig;
    private javax.swing.JMenuItem jMenuItemRA;
    private javax.swing.JMenuItem jMenuItemRS;
    private javax.swing.JMenu jMenuProv;
    private javax.swing.JMenuItem jMenuRegUser;
    private javax.swing.JMenuItem jMenuRegprov;
    private javax.swing.JMenu jMenuUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    // End of variables declaration//GEN-END:variables

}
