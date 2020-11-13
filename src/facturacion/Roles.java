
package facturacion;


public class Roles {
    
    private String des_rol;
  private String id_rol ;

  
  
  public Roles(String des , String id) {
    this.des_rol=des;
    this.id_rol=id;
  }
  
  
  
  public String getID(){
    return id_rol ;
  }
 
  public String toString() {
    return des_rol ;
  }
  
 
}
