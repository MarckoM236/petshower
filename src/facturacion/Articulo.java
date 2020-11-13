
package facturacion;

/**
 *
 * @author marco
 */
public class Articulo {
    
     private String des_art;
  private String id_art ;
  private String ref_art;
  
  public Articulo(String des , String id ) {
    this.des_art=des;
    this.id_art=id;
  }
  
 
  public String getID(){
    return id_art ;
  }
 
  public String toString() {
    return des_art ;
  }
  
}
