
package facturacion;


public class IVA {
    
    private Double precio;
    
    
    public IVA(Double precio) {
        this.precio = precio;
       
    }
   
    public  Double calcular_iva()
    { 
        double iva;               
        iva = precio*19/100;
        return iva;
        
    }
    }

