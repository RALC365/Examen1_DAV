package Builder;
/**
 * @author RICHARDSON LAINEZ - 11711075
 */
public class Cocina {
    private PizzaBuilder pizzaBuilder;
 
    public void setPizzaBuilder(PizzaBuilder pizzaBuilder) { 
        this.pizzaBuilder = pizzaBuilder; 
    }
    
    public Pizza getPizza() { 
        return this.pizzaBuilder.getPizza(); 
    }
 
    public void construirPizza() {
       pizzaBuilder.crearNuevaPizza();
       pizzaBuilder.buildMasa();
       pizzaBuilder.buildSalsa();
       pizzaBuilder.buildRelleno();
    }
}
