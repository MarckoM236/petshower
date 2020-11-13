
package facturacion.Controlador;

import facturacion.Modelo.Sentencias_sql;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Image;
import java.awt.Font;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class control_reportes {
    private int total;
    private Sentencias_sql sen;
    private String ruta_fac;

    public control_reportes() {
      sen = new Sentencias_sql();
      this.ruta_fac=sen.datos_string("Desc_ruta", "Select Desc_ruta from Rutas where Id_ruta=1");
    }
    
    //llenar campos de valor
    public String valores(String valor, int moneda) {
        int val = Integer.parseInt(valor);
        int operacion = 0;
        if (!valor.equals("0") && !valor.equals("")) {
            operacion = val * moneda;
            //txtval1.setText(Integer.toString(operacion));
            //this.val1=operacion;
        } else {
            if (valor.equals("")) {
                //txtcant1.setText("0");
                operacion = 0;
                //txtval1.setText("0");}
            }
        }
        return Integer.toString(operacion);
    }
    
    public String rutas(String id){
     return sen.datos_string("Desc_ruta", "Select Desc_ruta from Rutas where Id_ruta='"+id+"';");
    }
    
    public String total(String val1, String val2, String val3, String val4, String val5, String val6, String val7, String val8, String val9, String val10, String val11, String val12) {
        int suma = Integer.parseInt(val1) + Integer.parseInt(val2) + Integer.parseInt(val3) + Integer.parseInt(val4)
                + Integer.parseInt(val5) + Integer.parseInt(val6) + Integer.parseInt(val7) + Integer.parseInt(val8)
                + Integer.parseInt(val9) + Integer.parseInt(val10) + Integer.parseInt(val11) + Integer.parseInt(val12);
        String total;

        return total = Integer.toString(suma);
    }
    
    //Insertar datos cuadre inicial
    public boolean Registrar_cuadre_ini(String id_usuario, String fec_reporte, String val_ini_reporter) {
        String campos[] = {id_usuario, fec_reporte, val_ini_reporter};
        return sen.insertar(campos, "insert into reportes (id_usuario, fec_reporte, val_ini_reporter,val_ven_reporte,val_usu_reporte,dife_reporte) values (?,?,?,0,0,0);");

    }
   
    //Insertar datos del cuadre final
    public boolean Registrar_cuadre_final(String id_usuario, String id_reporte, String fec_reporte, String val_usu_reporte) {
        String campos[] = {val_usu_reporte, id_reporte, fec_reporte};
        return sen.insertar(campos, "update reportes set val_ven_reporte=(select SUM(total_factura)  from facturas where Id_usuario='" + id_usuario + "'"
                + "                   and Fecha_facturacion='" + fec_reporte + "'), val_usu_reporte=?, dife_reporte=(val_ini_reporter + val_ven_reporte)-val_usu_reporte "
                + "           where id_reporte=? and fec_reporte=?");

    }
    
    public String consulta_id_reporte(String id_usuario, String fecha) {
        String result;
        result = sen.datos_string("id_reporte", "select id_reporte,val_ini_reporter from reportes where id_usuario='" + id_usuario + "' and fec_reporte='" + fecha + "' ;");
        return result;

    }
    
    public String consulta_cuadre_exitos(String id_reporte) {
        String result;
        result = sen.datos_string("dife_reporte", "select dife_reporte from reportes where id_reporte='" + id_reporte + "';");
        return result;

    }
    
    public Object[][] consulta_cuadre_exitoso(String id_reporte) {
        String[] columnas = {"val_ini_reporter", "val_ven_reporte", "dife_reporte","val_usu_reporte"};
        Object[][] resultado = sen.GetTabla(columnas, "reportes", "select val_ini_reporter,val_ven_reporte, dife_reporte, val_usu_reporte from reportes where id_reporte='" + id_reporte + "';");
        return resultado;
    }

    
    
    /**
     *
     * @param nom_archivo
     * @param titulo_archivo
     * @param nombres
     * @param valores
     * @param fecha
     * @throws FileNotFoundException
     * @throws DocumentException
     * @throws BadElementException
     * @throws IOException
     */
    
    //generar reporte de cuadre inicial:
    public static void generar_pdf_cuadre_ini(String nom_archivo, String titulo_archivo, String nombres, String valores, String fecha, String ruta, String rutaIMG) throws FileNotFoundException, DocumentException, BadElementException, IOException {
        // Se crea el documento
        Document documento = new Document();

        // El OutPutStream para el fichero donde crearemos el PDF
        FileOutputStream ficheroPDF = new FileOutputStream(ruta + nom_archivo + ".pdf");

        // Se asocia el documento de OutPutStream
        PdfWriter.getInstance(documento, ficheroPDF);
        Image imagen;
        imagen = Image.getInstance(rutaIMG);
        // Se abre el documento
        documento.open();
        documento.add(imagen);
        // Titulo del archivo
        Paragraph titulo = new Paragraph(titulo_archivo + " " + fecha + " \n\n",
                FontFactory.getFont("arial",
                        21,
                        Font.BOLD,
                        BaseColor.BLUE
                )
        );

        // Añadimos el titulo al documento
        documento.add(titulo);

        //crear linea 1
        Paragraph nom = new Paragraph("Nombre de usuario: ",
                FontFactory.getFont("arial",
                        17,
                        Font.BOLD,
                        BaseColor.BLACK
                )
        );
        Paragraph nomusu = new Paragraph(nombres + " \n",
                FontFactory.getFont("arial",
                        17,
                        BaseColor.BLACK
                )
        );
        //crear linea 2
        Paragraph val = new Paragraph("Valor inicial en caja: ",
                FontFactory.getFont("arial",
                        17,
                        Font.BOLD,
                        BaseColor.BLACK
                )
        );
        Paragraph valusu = new Paragraph(valores + " \n",
                FontFactory.getFont("arial",
                        17,
                        BaseColor.BLACK
                )
        );

        //añadir lineas al documento  
        documento.add(nom);
        documento.add(nomusu);
        documento.add(val);
        documento.add(valusu);

        // Se cierra el documento
        documento.close();
    }
    
    //generar reporte cierre de caja:
    public static void generar_pdf_cuadre_fin(String nom_archivo, String titulo_archivo, String nombres, String val_ini, String val_ventas, String val_user, String dif, String fecha, String ruta, String rutaIMG) throws FileNotFoundException, DocumentException, BadElementException, IOException {
        // Se crea el documento
        Document documento = new Document();

        // El OutPutStream para el fichero donde crearemos el PDF
        FileOutputStream ficheroPDF = new FileOutputStream(ruta + nom_archivo + ".pdf");

        // Se asocia el documento de OutPutStream
        PdfWriter.getInstance(documento, ficheroPDF);
        Image imagen;
        imagen = Image.getInstance(rutaIMG);
        // Se abre el documento
        documento.open();
        documento.add(imagen);
        // Titulo del archivo
        Paragraph titulo = new Paragraph(titulo_archivo + " " + fecha + " \n\n",
                FontFactory.getFont("arial",
                        21,
                        Font.BOLD,
                        BaseColor.BLUE
                )
        );

        // Añadimos el titulo al documento
        documento.add(titulo);

        //crear linea 1
        Paragraph nom = new Paragraph("Nombre de usuario: ",
                FontFactory.getFont("arial",
                        17,
                        Font.BOLD,
                        BaseColor.BLACK
                )
        );
        Paragraph nomusu = new Paragraph(nombres + " \n",
                FontFactory.getFont("arial",
                        17,
                        BaseColor.BLACK
                )
        );

        //crear linea 2
        Paragraph val_in = new Paragraph("Valor de la base: ",
                FontFactory.getFont("arial",
                        17,
                        Font.BOLD,
                        BaseColor.BLACK
                )
        );
        Paragraph valini = new Paragraph(val_ini + " \n",
                FontFactory.getFont("arial",
                        17,
                        BaseColor.BLACK
                )
        );

        //crear linea 2
        Paragraph val_ve = new Paragraph("Valor ventas del dia: ",
                FontFactory.getFont("arial",
                        17,
                        Font.BOLD,
                        BaseColor.BLACK
                )
        );
        Paragraph valven = new Paragraph(val_ventas + " \n",
                FontFactory.getFont("arial",
                        17,
                        BaseColor.BLACK
                )
        );
        //crear linea 2
        Paragraph val = new Paragraph("Valor declarado: ",
                FontFactory.getFont("arial",
                        17,
                        Font.BOLD,
                        BaseColor.BLACK
                )
        );
        Paragraph valusu = new Paragraph(val_user + " \n",
                FontFactory.getFont("arial",
                        17,
                        BaseColor.BLACK
                )
        );
        //crear linea 3
        Paragraph diferencia = new Paragraph("La diferencia de valores es: ",
                FontFactory.getFont("arial",
                        17,
                        Font.BOLD,
                        BaseColor.BLACK
                )
        );
        Paragraph difer = new Paragraph(dif + " \n",
                FontFactory.getFont("arial",
                        17,
                        BaseColor.BLACK
                )
        );

        //añadir lineas al documento  
        documento.add(nom);
        documento.add(nomusu);
        documento.add(val_in);
        documento.add(valini);
        documento.add(val_ve);
        documento.add(valven);
        documento.add(val);
        documento.add(valusu);
        documento.add(diferencia);
        documento.add(difer);

        // Se cierra el documento
        documento.close();
    }
    
    //datos para factura:
    public Object[][] datos_factura(String id_user, String Nnm_factura) {

        String sql = "select cliente.Documento as doc_client,cliente.Nombres as nom_client,cliente.Apellidos as ape_client,cliente.Direccion as dir_client,"
                + "cliente.Telefono as tel_client,usuario.Nombres as nom_user, usuario.Apellidos as ape_user,facturas.Nnm_factura as num_factura, facturas.total_factura,"
                + "facturas.IVA,forma_de_pago.Descripcion_formapago,detalleFactura.cantidad, detalleFactura.total,concat(articulo.descripcion,servicio.desc_servicio) as descripcion,(articulo.precio_venta+servicio.valor_servicio) as precio_venta "
                + "from cliente,usuario,facturas,detalleFactura,articulo,servicio,forma_de_pago where usuario.Id_usuario='" + id_user + "' and facturas.Nnm_factura='" + Nnm_factura + "' "
                + "and facturas.Id_usuario=usuario.Id_usuario and detalleFactura.cod_factura=facturas.Nnm_factura and detalleFactura.cod_articulo=articulo.id_articulo "
                + "and detalleFactura.cod_servicio=servicio.id_servicio and cliente.id_cliente=facturas.cod_cliente and facturas.cod_formapago=forma_de_pago.id_formapago";

        String[] columnas = {"doc_client", "nom_client", "ape_client", "dir_client", "tel_client",
            "nom_user", "ape_user", "num_factura", "total_factura", "IVA", "Descripcion_formapago",
            "cantidad", "total", "descripcion", "precio_venta"};
        Object[][] resultado;
        resultado = sen.GetFactura(sql, columnas, Nnm_factura);

        return resultado;
    }
    
    public boolean existe_cuadre(String cod, String fecha) {
        return sen.existencias("id_reporte", " from reportes where id_usuario='" + cod + "' and fec_reporte='" + fecha + "';");

    }
    
    //generar factura en excel xlsx    
    public static void GenerarFactura(Object[][] datos, String fecha, String ruta1, String ruta2) throws IOException {
        //Variables locales
        String doc_client, nom_client, ape_client, dir_client, tel_client,
                nom_user, ape_user, num_factura, total_factura, IVA, Descripcion_formapago,
                cantidad = null, total, descripcion, precio_venta;

        //objeto recibido a String, asignacion a variables locales
        doc_client = datos[0][0].toString();
        nom_client = datos[0][1].toString();
        ape_client = datos[0][2].toString();
        dir_client = datos[0][3].toString();
        tel_client = datos[0][4].toString();
        nom_user = datos[0][5].toString();
        ape_user = datos[0][6].toString();
        num_factura = datos[0][7].toString();
        total_factura = datos[0][8].toString();
        IVA = datos[0][9].toString();
        Descripcion_formapago = datos[0][10].toString();
        try {
            
            XSSFWorkbook wb;
            int i, j;//variables para contadores.
            //ruta del archivo original
            try (FileInputStream file = new FileInputStream(new File(ruta1+"Modelo-factura-Pet.xlsx"))) {
                wb = new XSSFWorkbook(file);//abrir archivo.
                XSSFSheet sheet = wb.getSheetAt(0);//seleccionar la primera hoja del archivo.
                CellStyle headerStyle = wb.createCellStyle();//crear estilo centro
                headerStyle.setAlignment(headerStyle.ALIGN_CENTER);//estilo centrar contenido
                
                XSSFFont blueFont = wb.createFont();
                blueFont.setFontHeightInPoints((short)15);
                blueFont.setColor(HSSFColor.BLUE.index);
                CellStyle FactStyle = wb.createCellStyle();//crear estilo Numero factura               
                FactStyle.setFont(blueFont);
                
                //informacion de cliente y vendedor
                //Numero de factura
                XSSFRow Nnfactura = sheet.getRow(6);//obtener fila  en el archivo
                if (Nnfactura == null) {
                    Nnfactura = sheet.createRow(6);//crear fila si no existe.
                }
                XSSFCell fact = Nnfactura.createCell(2);//obtener celda especifica
                if (fact == null) {
                    fact = Nnfactura.createCell(2);//crear celda si no existe
                }
    //            fact.setCellStyle(VerticalStyle);
                fact.setCellValue(num_factura);//asignar valor a la celda
                fact.setCellStyle(FactStyle);
                
                
                //Nombre cliente
                XSSFRow Nclie = sheet.getRow(9);
                if (Nclie == null) {
                    Nclie = sheet.createRow(2);
                }
                XSSFCell nom = Nclie.createCell(2);
                if (nom == null) {
                    nom = Nclie.createCell(2);
                }
                nom.setCellValue(nom_client + " " + ape_client);               

                //Documento cliente
                XSSFRow Duser = sheet.getRow(10);
                if (Duser == null) {
                    Duser = sheet.createRow(2);
                }
                XSSFCell doc = Duser.createCell(2);
                if (doc == null) {
                    doc = Duser.createCell(2);
                }
                doc.setCellValue(doc_client);

                //Direccion cliente
                XSSFRow dirclie = sheet.getRow(11);
                if (dirclie == null) {
                    dirclie = sheet.createRow(2);
                }
                XSSFCell dir = dirclie.createCell(2);
                if (dir == null) {
                    dir = dirclie.createCell(2);
                }
                dir.setCellValue(dir_client);

                //Telefono cliente
                XSSFRow telclie = sheet.getRow(12);
                if (telclie == null) {
                    telclie = sheet.createRow(2);
                }
                XSSFCell tel = telclie.createCell(2);
                if (tel == null) {
                    tel = telclie.createCell(2);
                }
                tel.setCellValue(tel_client);

                //Nombre vendedor
                XSSFRow Nuser = sheet.getRow(9);
                if (Nuser == null) {
                    Nuser = sheet.createRow(9);
                }
                XSSFCell nomu = Nuser.createCell(4);
                if (nomu == null) {
                    nomu = Nuser.createCell(4);
                }
                nomu.setCellValue(nom_user + " " + ape_user);

                //Fecha factura
                XSSFRow FecF = sheet.getRow(9);
                if (FecF == null) {
                    FecF = sheet.createRow(9);
                }
                XSSFCell fec = FecF.createCell(7);
                if (fec == null) {
                    fec = FecF.createCell(7);
                }
                fec.setCellValue(fecha);
                fec.setCellStyle(headerStyle);

                //productos
                //Descripcion productos
                for (j = 0; j <= datos.length - 1; j++) {
                    i = 15 + j;

                    descripcion = datos[j][13].toString();
                    XSSFRow desP = sheet.getRow(i);

                    if (desP == null) {
                        desP = sheet.createRow(i);
                    }
                    XSSFCell desc = desP.createCell(2);
                    if (desc == null) {
                        desc = desP.createCell(2);
                    }
                    desc.setCellValue(descripcion);
                    desc.setCellStyle(headerStyle);

                }

                //Cantidad productos         
                for (j = 0; j <= datos.length - 1; j++) {
                    i = 15 + j;

                    cantidad = datos[j][11].toString();
                    XSSFRow cantP = sheet.getRow(i);

                    if (cantP == null) {
                        cantP = sheet.createRow(i);
                    }
                    XSSFCell cant = cantP.createCell(4);
                    if (cant == null) {
                        cant = cantP.createCell(4);
                    }
                    cant.setCellValue(cantidad);
                    cant.setCellStyle(headerStyle);

                }

                //Valor unitario productos         
                for (j = 0; j <= datos.length - 1; j++) {
                    i = 15 + j;

                    precio_venta = datos[j][14].toString();
                    XSSFRow preP = sheet.getRow(i);

                    if (preP == null) {
                        preP = sheet.createRow(i);
                    }
                    XSSFCell pre = preP.createCell(5);
                    if (pre == null) {
                        pre = preP.createCell(5);
                    }
                    pre.setCellValue(precio_venta);
                    pre.setCellStyle(headerStyle);

                }

                //Valor total productos          
                for (j = 0; j <= datos.length - 1; j++) {
                    i = 15 + j;

                    total = datos[j][12].toString();
                    XSSFRow preP = sheet.getRow(i);

                    if (preP == null) {
                        preP = sheet.createRow(i);
                    }
                    XSSFCell pre = preP.createCell(7);
                    if (pre == null) {
                        pre = preP.createCell(7);
                    }
                    pre.setCellValue(total);
                    pre.setCellStyle(headerStyle);
                    

                }

                //forma de pago y valor total de la factura
                //Forma de pago
                XSSFRow Fpago = sheet.getRow(28);
                if (Fpago == null) {
                    Fpago = sheet.createRow(28);
                }
                XSSFCell pag = Fpago.createCell(2);
                if (pag == null) {
                    pag = Fpago.createCell(2);
                }
                pag.setCellValue(Descripcion_formapago);
                pag.setCellStyle(headerStyle);

                //Valor parcial
                XSSFRow ValPF = sheet.getRow(26);
                if (FecF == null) {
                    ValPF = sheet.createRow(26);
                }
                XSSFCell valp = ValPF.createCell(7);
                if (valp == null) {
                    valp = ValPF.createCell(7);
                }
                valp.setCellValue(total_factura);
                valp.setCellStyle(headerStyle);

                //Valor factura
                XSSFRow ValF = sheet.getRow(28);
                if (FecF == null) {
                    ValF = sheet.createRow(28);
                }
                XSSFCell val = ValF.createCell(7);
                if (val == null) {
                    val = ValF.createCell(7);
                }
                val.setCellValue(total_factura);
                val.setCellStyle(headerStyle);

            }
            //ruta y nombre del archivo final src/facturacion/factura/Venta C:\Users\Marko\Documents\facturas
            FileOutputStream output = new FileOutputStream(ruta2 + num_factura + ".xlsx");
            wb.write(output);
            output.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(control_reportes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
    
  

