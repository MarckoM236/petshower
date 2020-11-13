
package facturacion.Controlador;

import facturacion.Modelo.Sentencias_sql;


public class Control_servicio {
    Sentencias_sql sensql;
    
    
    public Control_servicio() {
        sensql = new Sentencias_sql();
    }

    public boolean consulta_servicio(String ref_servicio) {
        return sensql.existencias("ref_servicio", "from servicio where ref_servicio='" + ref_servicio + "';");
    }

    public Object[][] consulta_servicios() {
        String[] columnas = {"id_servicio", "ref_servicio", "desc_servicio", "valor_servicio"};
        Object[][] datos = sensql.GetTabla(columnas, "servicio", "select * from servicio where valor_servicio>0 ");
        return datos;
    }

    public Object[][] consulta_servicios_ID(String id) {
        String[] columnas = {"ref_servicio", "desc_servicio", "valor_servicio"};
        Object[][] datos = sensql.GetTabla(columnas, "servicio", "select * from servicio where  id_servicio='" + id + "';");
        return datos;
    }

    // insertar servicios
    public boolean ingresar_servicio(String ref, String descripcion, String precioventa) {
        String datos[] = {ref, descripcion, precioventa};
        return sensql.insertar(datos, "insert into servicio (ref_servicio, desc_servicio, valor_servicio) values (?,?,?)");
    }
    
    //Actualizar servicios
    public boolean Update_servicio(String id, String descripcion, String precio) {
        String datos[] = {descripcion, precio};
        return sensql.Update(datos, "update servicio set desc_servicio=?,valor_servicio=? where id_servicio='" + id + "';");
    }
}
