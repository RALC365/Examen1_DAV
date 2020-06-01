package Factory;
/**
 *
 * @author ACER
 */
public class LavadoraInterface {
    public Lavadora getLavadora(String tipoRopa){
        switch (tipoRopa) {
            case "ALGODON":
                return new RopaAlgodon();
            case "SINTETICA":
                return new RopaSintetica();
            case "DELICADA":
                return new RopaDelicada();
        }
        return null;
    }
}
