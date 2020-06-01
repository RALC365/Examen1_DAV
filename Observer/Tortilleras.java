package Observer;
/**
 *
 * @author ACER
 */
public class Tortilleras extends Chismosos{
    private String elChisme = "";
    
    public Tortilleras(SucesosColonia chismes){
        this.chismes = chismes; //Clase Subject
        this.chismes.agregarChismos(this);//Añadimos la doña a los observadores
    }
    
    @Override
    public void actualizar() {
        elChisme = chismes.getChisme();
        System.out.println("Tortillera: \"Comadre fijese que: "
                + elChisme + "\"");
    }
    
}
