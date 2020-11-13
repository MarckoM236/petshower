
package facturacion.Controlador;

import facturacion.Modelo.Sentencias_sql;
import facturacion.Persona;


public class control_cliente extends Persona {
  private Sentencias_sql sql; 

    
    public control_cliente(String documento, String tipo, String nombres, String apellidos, String direccion, String ciudad, String telefono, String pass) {
        super(documento, tipo, nombres, apellidos, direccion, ciudad, telefono);
        sql = new Sentencias_sql();
    }

    public boolean ingresar_cliente() {
        String datos[] = {documento, tipo, nombres, apellidos, direccion, ciudad, telefono};
        return sql.insertar(datos, "insert into cliente(Documento, cod_tipo_documento, Nombres, Apellidos, Direccion, cod_ciudad,Telefono) values(?,?,?,?,?,?,?)");
    }

    public Object[][] consulta_clientes() {
        String[] columnas = {"Documento", "Descripcion", "Nombres", "Apellidos", "Direccion", "Nombre_ciudad", "Telefono", "id_cliente"};
        Object[][] datos = sql.GetTabla(columnas, "cliente", "select id_cliente,Documento,Descripcion,Nombres,Apellidos,Direccion,Nombre_ciudad,Telefono from cliente,ciudad,tipo_de_documento where id_tipo_documento=cod_tipo_documento and Codigo_ciudad=cod_ciudad;");
        return datos;
    }

    public boolean Update_Clientes(String campo, String id) {
        String datos[] = {documento, tipo, nombres, apellidos, direccion, ciudad, telefono};
        return sql.Update(datos, "update cliente set Documento=?,cod_tipo_documento=?,Nombres=?, Apellidos=?, Direccion=?, cod_ciudad=?,Telefono=? where " + campo + "='" + id + "'");
    }
   
   
}