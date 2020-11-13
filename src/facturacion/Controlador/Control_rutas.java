
package facturacion.Controlador;

import facturacion.Modelo.Sentencias_sql;


public class Control_rutas {

    Sentencias_sql sensql;

    public Control_rutas() {
        sensql = new Sentencias_sql();
    }
    
    //consultar las rutas almacenadas en la BD
    public Object[][] consulta_rutas() {
        String[] columnas = {"Desc_ruta"};
        Object[][] resultado = sensql.GetTabla(columnas, "Rutas", "Select * from Rutas;");
        return resultado;
    }
    
    //Actualizar rutas
    public boolean Update_rutas(String id, String ruta) {
        String datos[] = {ruta};
        return sensql.Update(datos, "update Rutas set desc_ruta=? where Id_ruta='" + id + "';");
    }
}
