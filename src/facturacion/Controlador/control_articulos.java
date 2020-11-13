
package facturacion.Controlador;

import facturacion.Modelo.Sentencias_sql;
import javax.swing.JOptionPane;

public class control_articulos {
    
    
    Sentencias_sql sensql;
   
    public control_articulos() {
        sensql = new Sentencias_sql();
    }

    public boolean consulta_existencia_art(String ref_articulo) {
        return sensql.existencias("ref_articulo", "from articulo where ref_articulo='" + ref_articulo + "';");
    }

    public boolean ingresar_articulo(String ref, String descripcion, int precioventa, int preciocosto, int stock, String tipoart, String codprov, String fechaingreso) {
        String datos[] = {ref, descripcion, Integer.toString(precioventa), Integer.toString(preciocosto), Integer.toString(stock), tipoart, codprov, fechaingreso};
        return sensql.insertar(datos, "insert into articulo (ref_articulo, descripcion, precio_venta,precio_costo, stock, cod_tipo_articulo, cod_proveedor, fecha_ingreso) values(?,?,?,?,?,?,?,?)");
    }

    public Object[][] consulta_articulos() {
        String[] columnas = {"id_articulo", "ref_articulo", "descripcion", "precio_venta", "precio_costo", "stock", "descripcion_articulo", "Nombre_comercial", "fecha_ingreso"};
        Object[][] datos = sensql.GetTabla(columnas, "articulo", "select id_articulo,ref_articulo,descripcion,articulo.precio_venta,precio_costo,stock,descripcion_articulo,Nombre_comercial,fecha_ingreso from articulo,proveedor,tipo_articulo where id_tipoarticulo=cod_tipo_articulo and No_documento=cod_proveedor and articulo.precio_venta > 0;");
        return datos;
    }

    public Object[][] consulta_articulos_ID(String id) {
        String[] columnas = {"ref_articulo", "descripcion", "precio_venta", "precio_costo", "stock", "cod_tipo_articulo", "descripcion_articulo", "cod_proveedor"};
        Object[][] datos = sensql.GetTabla(columnas, "articulo", "select ref_articulo,descripcion,articulo.precio_venta,precio_costo,stock,cod_tipo_articulo,descripcion_articulo,cod_proveedor from articulo,tipo_articulo where id_tipoarticulo=cod_tipo_articulo  and id_articulo='" + id + "';");
        return datos;
    }

    public boolean Update_articulo(String id, String desc, String preventa, String precosto, String stock, String codtipo, String codpro, String fec) {
        String datos[] = {desc, preventa, precosto, stock, codtipo, codpro, fec};
        return sensql.Update(datos, "update articulo set descripcion=?,precio_venta=?,precio_costo=?, stock=?, cod_tipo_articulo=?, cod_proveedor=?,fecha_ingreso=? where id_articulo='" + id + "'");
    }
    
}