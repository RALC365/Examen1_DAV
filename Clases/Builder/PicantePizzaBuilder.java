package Builder;
/**
 * @author RICHARDSON LAINEZ - 11711075
 */
public class PicantePizzaBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() { 
        pizza.setMasa("Cocida"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("Picante"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("Pimienta + Salchichón"); 
    }
}