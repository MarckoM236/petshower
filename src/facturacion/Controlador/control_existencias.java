
package facturacion.Controlador;

import facturacion.Modelo.Sentencias_sql;
import java.util.Formatter;


public class control_existencias {

    private Sentencias_sql sen;
    private String Documento;
    private String numero_factura = "";
    private String id_articulo;

    //set y get
    public String getNumero_factura() {
        return numero_factura;
    }

    public void setNumero_factura(String numero_factura) {
        this.numero_factura = numero_factura;
    }

    public String getId_cliente() {
        return Documento;
    }

    public void setId_cliente(String id_cliente) {
        this.Documento = Documento;
    }
    private String No_documento;

    public String getId_proveedor() {
        return No_documento;
    }

    public void setId_proveedor(String id_proveedor) {
        this.No_documento = No_documento;
    }

    public String getId_articulo() {
        return id_articulo;
    }

    public void setId_articulo(String id_articulo) {
        this.id_articulo = id_articulo;
    }

    //metodos
    public control_existencias() {
        sen = new Sentencias_sql();
    }

    public boolean existe_cliente(String cod) {

        this.Documento = cod;
        return sen.existencias(cod, " from cliente where Documento='" + cod + "';");
    }

    public boolean existe_proveedor(String id_prov) {
        this.No_documento = id_prov;
        return sen.existencias(id_prov, " from proveedor where No_documento='" + id_prov + "';");
    }

    public boolean existe_articulo(String idart) {
        this.id_articulo = idart;
        return sen.existencias(idart, " from articulo where id_articulo='" + idart + "';");
    }

    public String ingresa_nombre_Cliente() {
        String result;
        result = sen.datos_string("nombres", "select nombres from cliente where Documento='" + this.Documento + "';");
        return result;
    }

    public String ingresa_apellidos_Cliente() {
        String resultado;
        resultado = sen.datos_string("apellidos", "select apellidos from cliente where Documento='" + this.Documento + "';");
        return resultado;
    }

    public String ingresa_Id_Cliente() {
        String result;
        result = sen.datos_string("id_cliente", "select id_cliente from cliente where Documento='" + this.Documento + "';");
        return result;
    }
    
    //Generar numero consecutivo de la factura
    public String GenerarNumeroFactura() {
        String codigo = "FACT-", sql1, sql2,sql3;
        int suma;
        //consulta si existe factura
        sql1 = sen.datos_string("Nnm_factura", "select Nnm_factura from facturas where Nnm_factura LIKE '%00001';");
        
        //si no existe la crea empezando en 1
        if (sql1.equals("")) {
            codigo = codigo + "00001";
        } 
        
         else {
            //consulta  numero de la ultima factura creada
            sql2 = sen.datos_string("Num_factura", "SELECT MAX(RIGHT(Nnm_factura,5)) as Num_factura from facturas ;");
            //formato de numero de longitud 5 00001
            Formatter fmt = new Formatter();

            suma = Integer.parseInt(sql2) + 1; 
            fmt.format("%05d", suma);

            codigo = codigo + fmt;
        }
        numero_factura = codigo;
        return codigo;
    }

    public void registrar_factura(String Nnm_factura, String id_cliente, String Nombre_empleado, String fecha_facturacion) {
        String[] datos = {Nnm_factura, id_cliente, Nombre_empleado, fecha_facturacion};
        sen.insertar(datos, "insert into facturas(Nnm_factura,cod_cliente,Id_usuario,fecha_facturacion,cod_formapago,total_factura, IVA) values(?,?,?,?,5,0,0);");
    }

    public boolean update_factura(String factura, String total, String iva, String fpago, String tip_tarjeta, String num_aprovacion) {
        String campos[] = {fpago, total, iva, factura};
        String campos_tarjeta[] = {tip_tarjeta, factura, num_aprovacion};
        if (sen.insertar(campos, "update facturas set cod_formapago=?, total_factura=?, IVA=?  where Nnm_factura=?;")) {

            sen.insertar(campos_tarjeta, "insert into pago_tarjeta (id_tip_tarjeta, Nnm_factura, Num_aprovacion) values (?, ?, ?);");
            return true;
        } else {
            return false;
        }
    }

    public boolean update_stock(String stock, String id_articulo) {
        String campos[] = {stock, id_articulo};
        return sen.insertar(campos, "update articulo set stock=stock+? where id_articulo= (select id_articulo from articulo where ref_articulo=?);");
    }

    public Object[] combox(String tabla, String campo) {
        return sen.poblar_combox(tabla, campo, "select " + campo + " from " + tabla + ";");
    }

    public Object[] combox_vendedor(String tabla, String campo, String nombre) {

        return sen.poblar_combox_Vendedor(tabla, campo, "select " + campo + " from " + tabla + " where Cod_rol=2d;");
    }

    public Object[][] datos_articulo(String id_articulo, String campo) {
        String[] columnas = {"descripcion", "precio_venta", "stock"};
        Object[][] resultado = sen.GetTabla(columnas, "articulo", "select descripcion,  precio_venta, stock from articulo where " + campo + "='" + id_articulo + "';");
        return resultado;
    }

    public Object[][] datos_proveedor(String id_prov) {
        String[] columnas = {"Nombre_comercial"};
        Object[][] resultado = sen.GetTabla(columnas, "proveedor", "select Nombre_comercial from proveedor where No_documento='" + id_prov + "';");
        return resultado;
    }

    public Object[][] datos_proveedores(String id_prov, String campo) {
        String[] columnas = {"cod_tipo_documento", "Descripcion", "Nombre", "Apellido", "Nombre_comercial", "direccion", "cod_ciudad", "Nombre_ciudad", "Telefono"};
        Object[][] resultado = sen.GetTabla(columnas, "proveedor", "select * from proveedor,ciudad, tipo_de_documento where id_tipo_documento=cod_tipo_documento and Codigo_ciudad=cod_ciudad and " + campo + "='" + id_prov + "';");
        return resultado;
    }

    public Object[][] datos_cliente(String id_cliente) {
        String[] columnas = {"Documento", "Descripcion", "Nombres", "Apellidos", "Direccion", "Nombre_ciudad", "Telefono"};
        Object[][] resultado = sen.GetTabla(columnas, "cliente", "select * from cliente, ciudad, tipo_de_documento where id_tipo_documento=cod_tipo_documento and Codigo_ciudad=cod_ciudad and Documento='" + id_cliente + "';");
        return resultado;
    }

    public Object[][] datos_clientes(String id_cliente, String campo) {
        String[] columnas = {"id_cliente", "Documento", "id_tipo_documento", "Descripcion", "Nombres", "Apellidos", "Direccion", "Codigo_ciudad", "Nombre_ciudad", "Telefono"};
        Object[][] resultado = sen.GetTabla(columnas, "cliente", "select * from cliente, ciudad, tipo_de_documento where id_tipo_documento=cod_tipo_documento and Codigo_ciudad=cod_ciudad and " + campo + "='" + id_cliente + "';");
        return resultado;
    }

    public Object[][] datos_usuarios(String id_cliente) {
        String[] columnas = {"id_usuario", "Documento", "id_tipo_documento", "Descripcion", "Nombres", "Apellidos", "Password", "Direccion", "Codigo_ciudad", "Nombre_ciudad", "Telefono", "codigo_rol", "Descripcion_rol"};
        Object[][] resultado = sen.GetTabla(columnas, "usuario", "select * from usuario, ciudad, tipo_de_documento,Roles where id_tipo_documento=cod_tipo_documento and Codigo_ciudad=cod_ciudad  and Roles.codigo_rol= usuario.Cod_rol and id_usuario='" + id_cliente + "';");
        return resultado;
    }

    public boolean Delete_Clie_Usu(String campo, String tabla, String id) {
        return sen.Delete("delete from " + tabla + " where " + campo + "='" + id + "';");
    }

    public boolean Delete_articulo(String id) {
        return sen.Delete("delete from articulo where id_articulo='" + id + "';");
    }
    
    public boolean Delete_servicio(String id) {
        return sen.Delete("delete from servicio where id_servicio='" + id + "';");
    }

    public Object[][] datos_detallefactura(String numero_factura) {
        Object[][] resultado = null;

        String[] columnas = {"cod_factura", "codigo", "descripcion", "cantidad", "total"};
        resultado = sen.GetTabla(columnas, "detalleFactura where cod_factura='" + numero_factura + "';", "select cod_factura,concat(ref_articulo,ref_servicio) as codigo,concat(servicio.desc_servicio,articulo.descripcion) as descripcion, cantidad, total from detalleFactura,articulo,servicio where id_articulo = cod_articulo and id_servicio = cod_servicio and cod_factura='" + numero_factura + "';");

        return resultado;
    }

    public Object[][] consulta_factura(String id) {
        String[] columnas = {"Nnm_factura", "cliente.Nombres", "cliente.Apellidos", "usuario.Nombres", "usuario.Apellidos", "Fecha_facturacion", "Descripcion_formapago", "total_factura", "IVA"};
        Object[][] resultado = sen.GetTabla(columnas, "facturas", "select cliente.Nombres,cliente.Apellidos,facturas.Nnm_factura,facturas.Fecha_facturacion,"
                + "facturas.total_factura,facturas.IVA,usuario.Nombres,usuario.Apellidos ,forma_de_pago.Descripcion_formapago from cliente, "
                + "facturas,usuario,forma_de_pago where facturas.cod_cliente=cliente.id_cliente and facturas.Id_usuario=usuario.Id_usuario and "
                + "facturas.cod_formapago=forma_de_pago.id_formapago and cliente.Documento='" + id + "';");
        return resultado;
    }

    public boolean devolucion(String cod_detallefactura, String cod_detallearticulo, String Motivo, String fecha_devolucion, String cantidad) {
        String id_detalleFactura = sen.datos_string("id_detalle", "select id_detalle from detalleFactura where cod_factura='" + cod_detallefactura + "' and "
                + "cod_articulo= (select id_articulo from articulo where ref_articulo='" + cod_detallearticulo + "');");
        String[] columnas = {id_detalleFactura, Motivo, fecha_devolucion, cantidad};
        return sen.insertar(columnas, "insert into devolucion(id_detalle,Mot_devolucion,fec_devolucion,cant_devolucion) values(?,?,?,?)");
    }

    public boolean registrar_producto(String Nnm_factura, String id_articulo, String cantidad, String total) {
        String[] datos = {Nnm_factura, id_articulo, cantidad, total};

        String[] datosP = {cantidad, id_articulo};
        if (sen.insertar(datosP, "update articulo set stock=stock-? where id_articulo=?;")) {
            return sen.insertar(datos, "insert into detalleFactura(cod_factura,cod_articulo,cod_servicio,cantidad,total) values(?,?,1,?,?);");
        } else {
            return false;
        }
    }

    public boolean registrar_servicio(String Nnm_factura, String id_servicio, String total) {
        String[] datoss = {Nnm_factura, id_servicio, total};
        return sen.insertar(datoss, "insert into detalleFactura(cod_factura,cod_articulo,cod_servicio,cantidad,total) values(?,1,?,1,?);");
    }

    public Object[][] datos_servicio(String id_servicio) {
        String[] columnas = {"desc_servicio", "valor_servicio"};
        Object[][] resultado = sen.GetTabla(columnas, "servicio", "select desc_servicio,valor_servicio from servicio where id_servicio='" + id_servicio + "';");
        return resultado;
    }

    public Double total_factura(String numfact) {
        return sen.datos_totalfactura("total", "select round( sum( total ) , 2 ) as total from detalleFactura where cod_factura='" + numfact + "';");
    }
    
    
}
