package Observer;
import java.util.ArrayList;
/**
 *
 * @author ACER
 * clase SUBJECT
 */
public class SucesosColonia {

    private ArrayList<Chismosos> chismosos = new ArrayList <Chismosos>();
    private String chisme;
    
    public String getChisme(){
        return chisme;
    }
    
    public void setChiste(String chismeDelMomento){
        this.chisme = chismeDelMomento;
        contarElChisme();
    }
    
    public void agregarChismos(Chismosos chismoso){
        this.chismosos.add(chismoso);
    }
    
    public void contarElChisme(){
        for (Chismosos chismoso : chismosos) {
            chismoso.actualizar();
        }
    }
}
