import java.util.Random;
import java.util.Scanner;

public class Batalla {



    private boolean ataque1 = false;
    private boolean defensa1 = false;
    private boolean ataque2 = false;
    private boolean defensa2 = false;

    private boolean flag2 = true;


//    public Batalla() {
//
//    }

    Scanner sc = new Scanner(System.in);
    Colores color = new Colores();
    public void batalla(Personaje personaje1, Personaje personaje2){
        Random rand = new Random();
        String nombre1 = color.cyan + personaje1.getNombre() + color.reset;
        String nombre2 = color.cyan + personaje2.getNombre() + color.reset;

        System.out.println("Pulse ENTER para sortear el jugador que empieza atacando.");
        sc.nextLine();
//        int empezar_batalla = rand.nextInt(2);
        if(personaje1.getClase_elegida() &&personaje2.getPersonaje_creado() && personaje1.getClase_elegida() == true){
            switch (rand.nextInt(2)){
                case 0:
                    System.out.println("Empieza "+ nombre1);
                    while (flag2){
                        batalla_turno1(personaje1, personaje2);
                        if(personaje1.getVida() <= 0) {
                            System.out.println(nombre1 + " ha perdido");
                            System.out.println("El ganador es " + color.yellow + personaje2.getNombre() + color.reset);
                            flag2 = false;
                            break;
                        }
                        batalla_turno2(personaje1, personaje2);
                        if (personaje2.getVida() <= 0) {
                            System.out.println(nombre2 + " ha perdido" );
                            System.out.println("El ganador es " + color.yellow + personaje1.getNombre() + color.reset);
                            flag2 = false;
                            break;
                        }
                        continue;
                    }

                    break;
                case 1:
                    System.out.println("Empieza "+ nombre2);
                    while (flag2){
                        batalla_turno2(personaje1, personaje2);
                        if(personaje1.getVida() <= 0) {
                            System.out.println(nombre1 + " ha perdido");
                            System.out.println("El ganador es " + color.yellow + personaje2.getNombre() + color.reset);
                            flag2 = false;
                            break;
                        }
                        batalla_turno1(personaje1, personaje2);
                        if (personaje2.getVida() <= 0) {
                            System.out.println(nombre2+ " ha perdido" );
                            System.out.println("El ganador es " + color.yellow + personaje1.getNombre() + color.reset);
                            flag2 = false;
                            break;
                        }
                        continue;
                    }
                    break;

            }
        }
    }


    public void batalla_turno1(Personaje personaje1, Personaje personaje2){

        String nombre1 = color.cyan + personaje1.getNombre() + color.reset;
        String nombre2 = color.cyan + personaje2.getNombre() + color.reset;
        double daño_recibido1 = personaje1.getVida() - personaje2.getAtaque();
        double daño_recibido2 = personaje2.getVida() - personaje1.getAtaque();

        personaje1.setTurno(true);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("=====Menu de "+ nombre1+"=====");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.println("Vida "+ color.green + personaje1.getVida() + color.reset);
        System.out.println("Defensa "+ color.blue + personaje1.getDefensa() + color.reset);
        System.out.println("====================");
        int accion_batalla = sc.nextInt();
        sc.nextLine();
        switch (accion_batalla) {
            case 1:
                System.out.println(nombre1 + " ha realizado un ataque de "+ color.red + personaje1.getAtaque()+ color.reset);
                ataque1 = true;

                if (ataque2 == true) {
                    System.out.println(nombre2 + " te ha herido con "+ color.red + personaje1.getAtaque()+ color.reset + " puntos de ataque");
                    personaje1.setVida(daño_recibido1);
                    ataque2 = false;
                    Main.enter_continuar();
                    break;
                }
                personaje1.setTurno(false);
                personaje2.setTurno(true);
                break;

            case 2:
                System.out.println(nombre1 + " ha realizado una defensa");
                if (ataque2 == true && personaje1.getVelocidad() >= personaje2.getVelocidad()) {
                    System.out.println(nombre1 + " se defiende pero pierde "+ color.blue + 20 + " de defensa");
                    personaje1.setDefensa(personaje1.getDefensa()-20);
                    ataque2 = false;
                    personaje1.setTurno(false);
                    personaje2.setTurno(true);
                    Main.enter_continuar();
                    break;
                } else if (ataque2 == true && personaje1.getVelocidad() < personaje2.getVelocidad()) {
                    System.out.println(nombre1 + " se defiende pero "+nombre2 + " tiene más velocidad");
                    System.out.println(nombre1 +" pierde "+ color.red + personaje2.getAtaque()+ color.reset + " de vida");
                    personaje1.setVida(daño_recibido1);
                    Main.enter_continuar();
                    break;
                } else if (ataque2 == false) {
                    System.out.println(nombre1 + " se defiende pero " + nombre2 + " no le ha atacado");
                    System.out.println(nombre1 + " gana "+ color.blue + 15 + " de defensa");
                    personaje1.setDefensa(personaje1.getDefensa()+15);
                    personaje1.setTurno(false);
                    personaje2.setTurno(true);
                    Main.enter_continuar();
                }
        }
    }

    public void batalla_turno2(Personaje personaje1, Personaje personaje2){
        String nombre1 = color.cyan + personaje1.getNombre() + color.reset;
        String nombre2 = color.cyan + personaje2.getNombre() + color.reset;
        double daño_recibido1 = personaje1.getVida() - personaje2.getAtaque();
        double daño_recibido2 = personaje2.getVida() - personaje1.getAtaque();

        personaje2.setTurno(true);
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        System.out.println("=====Menu de "+ nombre2+"=====");
        System.out.println("1. Atacar");
        System.out.println("2. Defender");
        System.out.println("Vida "+color.green + personaje1.getVida() + color.reset);
        System.out.println("Defensa "+color.blue + personaje1.getDefensa() + color.reset);
        System.out.println("====================");
        int accion_batalla2 = sc.nextInt();
        sc.nextLine();
        switch (accion_batalla2) {
            case 1:
                System.out.println(nombre2 + " ha realizado un ataque de " + color.red + personaje2.getAtaque()+ color.reset);


                ataque2 = true;

                if (ataque1 == true) {
                    System.out.println(nombre1 + " te ha herido con "+ color.red + personaje2.getAtaque()+ color.reset + " puntos de ataque");
                    personaje2.setVida(daño_recibido2);
                    ataque1 = false;
                    Main.enter_continuar();
                    break;
                }

                personaje2.setTurno(false);
                personaje1.setTurno(true);
                break;


            case 2:
                System.out.println(nombre2 + " ha realizado una defensa");
                if (ataque1 == true && personaje2.getVelocidad() >= personaje1.getVelocidad()) {
                    System.out.println(nombre2 + " se defiende pero pierde " + color.blue + 20 + " de defensa");
                    personaje2.setDefensa(personaje1.getDefensa() - 20);
                    ataque1 = false;
                    personaje2.setTurno(false);
                    personaje1.setTurno(true);
                    Main.enter_continuar();
                    break;
                } else if (ataque1 == true && personaje2.getVelocidad() < personaje1.getVelocidad()) {
                    System.out.println(nombre2 + " se defiende pero " + nombre1 + " tiene más velocidad");
                    System.out.println(nombre2 + " pierde " + color.red + personaje1.getAtaque() + color.reset + " de vida");
                    personaje2.setVida(daño_recibido2);
                    Main.enter_continuar();
                    break;
                }else if (ataque1 == false) {
                    System.out.println(nombre2 + " se defiende pero " + nombre1 + " no le ha atacado");
                    System.out.println(nombre2 + " gana "+ color.blue + 15 + " de defensa");
                    personaje2.setDefensa(personaje2.getDefensa()+15);
                    personaje2.setTurno(false);
                    personaje1.setTurno(true);
                    Main.enter_continuar();
                }
        }
    }



}
