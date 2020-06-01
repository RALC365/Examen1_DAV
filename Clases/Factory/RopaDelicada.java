package Factory;
/**
 *
 * @author ACER
 */
public class RopaDelicada implements Lavadora{

    @Override
    public void lavar() {
        System.out.println("Ropa de delicada lavada");
    }

    @Override
    public void remojar() {
        System.out.println("Ropa de delicada remojada");
    }

    @Override
    public void exprimir() {
        System.out.println("Se exprimió la ropa de delicada");
    }
    
}
