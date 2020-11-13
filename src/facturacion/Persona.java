
package facturacion;


public class Persona {
    
    protected String id;
    protected String documento; 
    protected String tipo;
    protected String nombres;
    protected String apellidos;
    protected String direccion;
    protected String ciudad;
    protected String telefono;
    protected String password;
    protected String  rol;

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    public Persona(String documento, String tipo, String nombres, String apellidos, String direccion, String ciudad, String telefono) {     
        this.documento = documento;
        this.tipo = tipo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;       
        this.ciudad = ciudad;
        this.telefono=telefono;
        
    }
    public Persona(String documento, String tipo, String nombres, String apellidos,String password, String direccion, String ciudad,String telefono,String rol) {
        this.documento = documento;
        this.tipo = tipo;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;       
        this.ciudad = ciudad;
        this.telefono=telefono;
        this.password=password;
        this.rol=rol;
    }
    public Persona(String documento, String pass){
    this.documento=documento;
    this.password=pass;
    }
    
    public Persona(String documento){
    this.documento=documento;
    }
    
    
    
    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    public String getpassword(){
        return password;
    } 
    
    public void setpassword(String pass){
        this.password=pass;
    }
    
}
