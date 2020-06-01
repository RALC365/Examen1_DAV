/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package State_Nala;

/**
 *
 * @author ACER
 */
public class Hambriento implements State {
    private Nala nala;

    @Override
    public void jugar() {
        System.out.println("No tengo ganas de jugar");
    }

    @Override
    public void comer() {
        System.out.println("Ñom ñom ñom");
        nala.setState(new Aburrido());
    }

    @Override
    public void dormir() {
        System.out.println("No tengo sueño");
    }

    @Override
    public void getState() {
        System.out.println("¡Tengo hambre!");
    }

    @Override
    public void setNala(Nala nala) {
        this.nala = nala;
    }
}
