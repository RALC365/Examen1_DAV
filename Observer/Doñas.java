package Observer;
/**
 *
 * @author ACER
 */
public class Doñas extends Chismosos{
    private String elChisme = "";
    
    public Doñas(SucesosColonia chismes){
        this.chismes = chismes; //Clase Subject
        this.chismes.agregarChismos(this);//Añadimos la doña a los observadores
    }
    
    @Override
    public void actualizar() {
        elChisme = chismes.getChisme();
        System.out.println("Doña: \"Doña Lupe se dió cuenta que: "
                + elChisme + "\"");
    }
    
}
