package Adapter;
/**
 *
 * @author ACER
 */
public class CarroMecanico {
    
    int velocidad;
    boolean isChargedBattery;
    
    public CarroMecanico(){
        velocidad = 0;
        isChargedBattery = false;
    }
    
    public void meterClutch(){
        System.out.println("Metiendo clutch");
    }
    
    public void sacarCluthc(){
        System.out.println("Sacando clutch");
    }
    
    public void aumentarVelocidad(){
        velocidad++;
        System.out.println("Palanca en la velocidad: " + velocidad);
    }
    
    public void bajarVelocidad(){
        velocidad--;
        System.out.println("Palanca en la velocidad: " + velocidad);
    }
    
    public void encender(){
        System.out.println("Encendiendo motor...");
    }
    
    public void encerder2da(){
        System.out.println("Quitando freno de mano");
        System.out.println("Colocando en 2da");
        System.out.println("3... 2... 1...");
        meterClutch();
        
    }
    
}
