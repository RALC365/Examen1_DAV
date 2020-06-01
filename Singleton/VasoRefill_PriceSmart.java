package Singleton;
/**
 *
 * @author ACER
 */
public class VasoRefill_PriceSmart {
    private static VasoRefill_PriceSmart instancia_vaso;
    
    //el construtor es private con el objetivo de que no se creen más instancias
    private VasoRefill_PriceSmart(){ 
    }
    
    //El objetivo de singleton es trabajar con una sola instancia
    public static VasoRefill_PriceSmart getVaso(){
        if(instancia_vaso == null){
            instancia_vaso = new VasoRefill_PriceSmart();
        }
        return instancia_vaso;
    }
    
    //Metodos de prueba
    public void llenar_vaso(){
        System.out.println("Se llenó el vaso con fresco");
    }
    
    public void beber_fresco(){
        System.out.println("Se bebió el fresco, el vaso esta vacío");
    }
}
