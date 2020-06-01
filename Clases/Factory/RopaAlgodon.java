package Factory;
/**
 *
 * @author ACER
 */
public class RopaAlgodon implements Lavadora{

    @Override
    public void lavar() {
        System.out.println("Ropa de Algodón lavada");
    }

    @Override
    public void remojar() {
        System.out.println("Ropa de algodón remojada");
    }

    @Override
    public void exprimir() {
        System.out.println("Se exprimió la ropa de algodón");
    }
    
}
