package Builder;
/**
 * @author RICHARDSON LAINEZ - 11711075
 */
public class HawaiPizzaBuilder extends PizzaBuilder {
    @Override
    public void buildMasa() { 
        pizza.setMasa("Suave"); 
    }
    
    @Override
    public void buildSalsa() { 
        pizza.setSalsa("Dulce"); 
    }
    
    @Override
    public void buildRelleno() { 
        pizza.setRelleno("Chorizo + Alcachofas"); 
    }
}
