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
public class Cansado implements State {
    private Nala nala;

    @Override
    public void jugar() {
        System.out.println("No tengo ganas de jugar");
    }

    @Override
    public void comer() {
        System.out.println("No tengo hambre");
    }

    @Override
    public void dormir() {
        System.out.println("Buenas noches uwu");
        nala.setState(new Durmiendo());
    }

    @Override
    public void getState() {
        System.out.println("Guaf... Zzzzz (Tengo sueño... Zzzzz)");
    }

    @Override
    public void setNala(Nala nala) {
        this.nala = nala;
    }
}

