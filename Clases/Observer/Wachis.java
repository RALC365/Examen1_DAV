package Observer;
/**
 *
 * @author ACER
 */
public class Wachis extends Chismosos{
    private String elChisme = "";
    
    public Wachis(SucesosColonia chismes){
        this.chismes = chismes; //Clase Subject
        this.chismes.agregarChismos(this);//Añadimos la doña a los observadores
    }
    
    @Override
    public void actualizar() {
        elChisme = chismes.getChisme();
        System.out.println("Compa: \"Compita se dió cuenta que: "
                + elChisme + "\"");
    }
    
}
