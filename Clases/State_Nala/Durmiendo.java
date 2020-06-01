package State_Nala;
import java.util.Timer;
import java.util.TimerTask;
/**
 *
 * @author ACER
 */
public class Durmiendo implements State {
    private Nala nala;

    @Override
    public void jugar() {
    }

    @Override
    public void comer() {
    }

    @Override
    public void dormir() {
    }

    @Override
    public void getState() {
        System.out.println("(Nala esta durmiendo... Zzzzz (shhhhh)");
    }

    @Override
    public void setNala(Nala nala) {
        this.nala = nala;

        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Durmiendo.this.nala.setState(new Hambriento());
            }
        }, 7000);
    }
}
