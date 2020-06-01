/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Adapter;

/**
 *
 * @author ACER
 */
public class CarroAutomatico extends ControlRemoto_Automatico{
    boolean isChargedBattery;
    
    public CarroAutomatico(){
        this.isChargedBattery = true;
    }
    
    @Override
    public void encender() {
        if(isChargedBattery){
            System.out.println("Encendiendo motor...");
        }else{
            System.out.println("La bateria esta descargada, no se puede encender");
        }
    }

    @Override
    public void avanzar() {
        System.out.println("Moviendo palanca a \"Drive(D)\"");
        System.out.println("Apretando el acelerador...");
        System.out.println("Avanzando...");
    }

    @Override
    public void detenerse() {
        System.out.println("Deteniendose");
    }

    @Override
    public void retroceder() {
       detenerse();
       System.out.println("Moviendo palanca a \"Reverse(R)\"");
       System.out.println("Retrociendo...");
    }

    @Override
    public void apagar() {
        System.out.println("Moviendo palanca a \"Neutral(N)\"");
        System.out.println("Motor apagado");
        System.out.println("Moviendo palanca a \"Park(P)\"");
    }

    public void setIsChargedBattery(boolean isChargedBattery) {
        this.isChargedBattery = isChargedBattery;
    }
    
    
    
}
