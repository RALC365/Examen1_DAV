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
public class Aburrido implements State {
    private Nala nala;

    @Override
    public void jugar() {
        System.out.println("¡GUAFF! ¡GUAFF! ¡GUAFFFff! (¡JUGUEMOS! ¡A LA PELOTA! ¡LANZALAAAAA!");
        nala.setState(new Cansado());
    }

    @Override
    public void comer() {
        System.out.println("No tengo hambre");
    }

    @Override
    public void dormir() {
        System.out.println("No quiero dormir!");
    }

    @Override
    public void getState() {
        System.out.println("¡Guaf... guaf.. ¡Guaf! (Estoy... aburrida... ¡Quiero jugar!");
    }

    @Override
    public void setNala(Nala nala) {
        this.nala = nala;
    }
}
