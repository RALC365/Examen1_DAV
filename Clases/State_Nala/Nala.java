package State_Nala;
/**
 *
 * @author ACER
 */
public class Nala {
    private State estado;

    public Nala() {
        this.setState(new Aburrido());
    }

    public void setState(State estado) {
        this.estado = estado;
        this.estado.setNala(this);
    }

    public void comer() {
        this.estado.comer();
    }

    public void dormir() {
        this.estado.dormir();
    }

    public void jugar() {
        this.estado.jugar();
    }

    public void getState() {
        this.estado.getState();
    }
}
