package State_Nala;
/**
 *
 * @author ACER
 */
public interface State {
    void jugar();
    void comer();
    void dormir();
    void getState();

    void setNala(Nala nala);
}
