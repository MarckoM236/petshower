

package facturacion;

public class ciudad {
    
    private String nom_ciudad;
  private String id_ciudad ;
  
  public ciudad(String nom , String id ) {
    this.nom_ciudad=nom;
    this.id_ciudad=id;
  }
 
  public String getID(){
    return id_ciudad ;
  }
 
  public String toString() {
    return nom_ciudad ;
  }
}
