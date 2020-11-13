
package facturacion.Controlador;

import facturacion.Modelo.Sentencias_sql;
import facturacion.Persona;


public class control_usuario extends Persona {
    
    private Sentencias_sql sql; 

    public control_usuario(String documento) {
        super(documento);
        sql = new Sentencias_sql();
    }

    public control_usuario(String documento, String pass) {
        super(documento, pass);
        sql = new Sentencias_sql();
    }

    public control_usuario(String documento, String tipo, String nombres, String apellidos, String password, String direccion, String ciudad, String telefono, String rol) {
        super(documento, tipo, nombres, apellidos, password, direccion, ciudad, telefono, rol);
        sql = new Sentencias_sql();
    }

    //metodos
    public Object[][] consulta_todos() {
        String[] columnas = {"Documento", "Descripcion", "Nombres", "Apellidos", "Password", "Direccion", "Nombre_ciudad", "Telefono", "Descripcion_rol", "id_usuario"};
        Object[][] datos = sql.GetTabla(columnas, "usuario", "select id_usuario,Documento,Descripcion,Nombres,Apellidos,Password,Direccion,Nombre_ciudad,Telefono,Descripcion_rol from usuario,ciudad,tipo_de_documento,Roles where id_tipo_documento=cod_tipo_documento and Codigo_ciudad=cod_ciudad and Roles.codigo_rol= usuario.Cod_rol;");
        return datos;
    }

    public Object[] consuta_usuario(String tabla, String campo) {
        return sql.login(tabla, campo, "select " + campo + " from " + tabla + " where Documento=" + documento + " and Password='" + password + "';");
    }

    public String consulta_usuario_id() {
        String datos = sql.datos_string("Nombres", "select Nombres from usuario where cod_rol=2");
        return datos;
    }

    public Object[] combox(String tabla, String campo) {
        return sql.poblar_combox(tabla, campo, "select " + campo + " from " + tabla + ";");
    }

    public boolean ingresar_usuario() {
        String datos[] = {documento, tipo, nombres, apellidos, password, direccion, ciudad, telefono, rol};
        return sql.insertar(datos, "insert into usuario(Documento, cod_tipo_documento, Nombres, Apellidos,Password, Direccion, cod_ciudad,Telefono,Cod_rol) values(?,?,?,?,?,?,?,?,?)");
    }

    //recuperar password olvidado
    public String Consultar_rol() {
        String rol = sql.datos_string("Cod_rol", "select Cod_rol from usuario where Documento='" + documento + "';");
        if (rol.equals("1")) {
            return "1";
        } else if (rol.equals(null)) {
            return "0";
        } else if (rol.equals("2")) {
            return "2";
        } else {
            return "0";
        }
    }

    public boolean Recuperar_password() {
        String datos[] = {password, documento};
        return sql.insertar(datos, "update usuario set Password=? where Documento=?");
    }

    public boolean Update_Usuarios(String id, String rol) {
        String datos[] = {documento, tipo, nombres, apellidos, password, direccion, ciudad, telefono, rol};
        return sql.Update(datos, "update usuario set Documento=?,cod_tipo_documento=?,Nombres=?, Apellidos=?, Password=?, Direccion=?, cod_ciudad=?,Telefono=?, Cod_rol=? where id_usuario='" + id + "'");
    }

}
