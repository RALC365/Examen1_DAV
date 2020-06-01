package Factory;
/**
 *
 * @author ACER
 */
public class RopaSintetica implements Lavadora{

    @Override
    public void lavar() {
        System.out.println("Ropa de sintética lavada");
    }

    @Override
    public void remojar() {
        System.out.println("Ropa de sintética remojada");
    }

    @Override
    public void exprimir() {
        System.out.println("Se exprimió la ropa de sintética");
    }
    
}
