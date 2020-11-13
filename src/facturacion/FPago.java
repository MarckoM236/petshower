
package facturacion;


public class FPago {
     private String des_pago;
  private String id_pago ;
  
  public FPago(String des , String id ) {
    this.des_pago=des;
    this.id_pago=id;
  }
 
  public String getID(){
    return id_pago ;
  }
 
  public String toString() {
    return des_pago ;
  }
}
