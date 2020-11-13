
package facturacion;

public class Vendedor {
   
  private String des_vend;
  private String id_vend ;
  private String rol;
  
  
  public Vendedor(String des , String id) {
    this.des_vend=des;
    this.id_vend=id;
  }
  
  
  
  public String getID(){
    return id_vend ;
  }
 
  public String toString() {
    return des_vend ;
  }
  
  public String getRol(){
      return rol;
  }
  
  
}
