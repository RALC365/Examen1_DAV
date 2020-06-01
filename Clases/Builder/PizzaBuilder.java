package Builder;
/**
 * @author RICHARDSON LAINEZ - 11711075
 */
public abstract class PizzaBuilder {
    protected Pizza pizza;
 
    public Pizza getPizza() { 
        return pizza; 
    }
    
    public void crearNuevaPizza() { 
        pizza = new Pizza(); 
    }
 
    public abstract void buildMasa();
    public abstract void buildSalsa();
    public abstract void buildRelleno();
}
