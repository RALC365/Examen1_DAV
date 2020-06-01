package Adapter;

/**
 *
 * @author ACER
 */
public class AdapterMecanico extends ControlRemoto_Automatico{
    CarroMecanico mecanico;
    public AdapterMecanico(){
        super();
        mecanico = new CarroMecanico();
    }

    @Override
    public void encender() {
        if(mecanico.isChargedBattery){
            mecanico.encender();
        }else{
            System.out.println("La bateria esta descargada");
            mecanico.encerder2da();
        }
    }

    @Override
    public void avanzar() {
        for (int i = 0; i < 5; i++) {
            mecanico.meterClutch();
            mecanico.aumentarVelocidad();
            mecanico.sacarCluthc();
        }
    }

    @Override
    public void detenerse() {
        for (int i = 0; i < 5; i++) {
            mecanico.meterClutch();
            mecanico.bajarVelocidad();
            System.out.println("Deteniendose...");
        }
    }

    @Override
    public void retroceder() {
        detenerse();
        System.out.println("Moviendo palanca a \"Reverse(R)\"");
        System.out.println("Retrociendo...");
    }

    @Override
    public void apagar() {
        detenerse();
        System.out.println("Moviendo palanca a \"Neutral(N)\"");
        System.out.println("Motor apagado");
        mecanico.meterClutch();
        System.out.println("Poner 1era");
        mecanico.sacarCluthc();
    }
    
    public void setIsChargedBattery(boolean isChargedBattery) {
        mecanico.isChargedBattery = isChargedBattery;
    }
}
