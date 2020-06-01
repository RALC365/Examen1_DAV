package patrones_diseno_exam1;

import Adapter.AdapterMecanico;
import Adapter.CarroAutomatico;
import Adapter.ControlRemoto_Automatico;
import Builder.Cocina;
import Builder.HawaiPizzaBuilder;
import Builder.PicantePizzaBuilder;
import Builder.Pizza;
import Builder.PizzaBuilder;
import Factory.Lavadora;
import Factory.LavadoraInterface;
import Observer.Doñas;
import Observer.SucesosColonia;
import Observer.Tortilleras;
import Observer.Wachis;
import Singleton.VasoRefill_PriceSmart;
import State_Nala.Nala;
import java.util.Scanner;

/**
 * @author RICHARDSON LAINEZ - 11711075
 */
public class Patrones_Diseno_Exam1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¡Bienvenido, ingeniero Román!");
        int opcion = -1;
        while (true) {
        System.out.println("-------------------OPCIONES DE PATRONES DE DISEÑO-------------------\n"
                + "1.- Singleton\n"
                + "2.- Factory\n"
                + "3.- Observer\n"
                + "4.- Adapter\n"
                + "5.- Builder\n"
                + "6.- State\n"
                + "0.- Salir\n"
                + "Por favor, introduzca el número de la patrón de diseño "
                + "para continuar:");
        opcion = sc.nextInt();
        switch (opcion) {
            case 1:
                Singleton();
                break;
            
            case 2:
                Factory();
                break;
                
            case 3:
                Observer();
                break;
                
            case 4:
                Adapter();
                break;
                
            case 5:
                Builder();
                break;
                
            case 6:
                State();
                break;
            case 0:
                System.out.println("Nos vemos, ingeniro Román ¡Feliz día!");
                System.exit(0);
                break;
            default:
                System.out.println("Por favor, introduzca una opción válida");;
        }
        }
    }
    
    public static void Singleton(){
        System.out.println("Como el vaso de PriceSmart es grande y tiene refill"
                + "se puede optar por solo usar uno. Se simula una situación"
                + "en específico");
        VasoRefill_PriceSmart vaso = VasoRefill_PriceSmart.getVaso();
        vaso.llenar_vaso();
        vaso.beber_fresco();
    }
    
    public static void Factory(){
        LavadoraInterface lavadora = new LavadoraInterface();
        
        Lavadora lav1 = lavadora.getLavadora("ALGODON");
        lav1.lavar();
        lav1.remojar();
        lav1.exprimir();
        System.out.println("");
        
        Lavadora lav2 = lavadora.getLavadora("SINTETICA");
        lav2.lavar();
        lav2.remojar();
        lav2.exprimir();
        System.out.println("");
        
        Lavadora lav3 = lavadora.getLavadora("DELICADA");
        lav3.lavar();
        lav3.remojar();
        lav3.exprimir();
        System.out.println("");
    }
    
    public static void Observer(){
        SucesosColonia losChismes = new SucesosColonia();
        
        new Doñas(losChismes);
        new Wachis(losChismes);
        new Tortilleras(losChismes);
        
        System.out.println("-------------------La hija del pastor quedó "
                + "embarazada sin casarse-------------------");
        losChismes.setChiste("La hija del pastor quedó embarazada sin casarse");
    }
    
    public static void Builder(){
        Cocina cocina = new Cocina();
        PizzaBuilder hawai_pizzabuilder = new HawaiPizzaBuilder();
        PizzaBuilder picante_pizzabuilder = new PicantePizzaBuilder();
 
        cocina.setPizzaBuilder(hawai_pizzabuilder);
        cocina.construirPizza();
 
        Pizza pizza = cocina.getPizza();
        System.out.println("Pizza Hawaiana: ");
        System.out.println("Masa: " + pizza.getMasa());
        System.out.println("Relleno: " + pizza.getRelleno());
        System.out.println("Salsa: " + pizza.getSalsa() + "\n");
        
        cocina.setPizzaBuilder(picante_pizzabuilder);
        cocina.construirPizza();
 
        Pizza pizza2 = cocina.getPizza();
        System.out.println("Pizza Picante: ");
        System.out.println("Masa: " + pizza.getMasa());
        System.out.println("Relleno: " + pizza.getRelleno());
        System.out.println("Salsa: " + pizza.getSalsa());
    }
    
    public static void Adapter(){
        ControlRemoto_Automatico carroAutomatico = new CarroAutomatico();
        ControlRemoto_Automatico carroMecanico = new AdapterMecanico();
        
        System.out.println("-------------------CARRO AUTOMATICO-------------------");
        carroAutomatico.encender();
        carroAutomatico.encender();
        carroAutomatico.avanzar();
        carroAutomatico.detenerse();
        carroAutomatico.apagar();
        
        System.out.println("-------------------CARRO MECANICO-------------------");
        carroMecanico.encender();
        carroMecanico.avanzar();
        carroMecanico.detenerse();
        carroMecanico.apagar();
    }
    
    public static void State(){
        Scanner scanner = new Scanner(System.in);
        Nala nala = new Nala();
        int opcion;
        String menuNala = "-------------------MENÚ NALA-------------------\n" +
                "1.- Dar de comer\n"
                + "2.- Dormirla\n"
                + "3.- Jugar con ella\n"
                + "4.- ¿Cómo se siente Nala?\n"
                + "0.- Volver al menú de Patrones de Diseño\n";
        int ban = 1;
        while (ban == 1) {
            System.out.println(menuNala);
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1: nala.comer(); 
                break;
                
                case 2: nala.dormir(); 
                break;
                
                case 3: nala.jugar(); 
                break;
                
                case 4: nala.getState(); 
                break;
                
                case 0: System.out.println("¡Guaf Guaf! (¡Adios, amo!)"); 
                        ban = 0;
                break;
                default: System.out.println("¿Guaf? ¿Guaf? "
                        + "(No entendí. Por favor, introduzca una opción válida)");
            }
        }
    }
    
}
