
package facturacion;


public class Servicio {
    
     private String ref_servicio;
     private String id_servicio ;
  
  public Servicio(String ref , String id ) {
    this.ref_servicio=ref;
    this.id_servicio=id;
  }
 
  public String getID(){
    return id_servicio ;
  }
 
  public String toString() {
    return ref_servicio ;
  }
}
