import java.awt.*;
import java.sql.Time;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
//    personajes = [{"mon",68,89,90,90},{"mon",68,89,90,90}]

    private static Scanner sc = new Scanner(System.in);
    private static Colores color = new Colores();
    private static Personaje personaje = new Personaje();
    private static Personaje personaje1 = new Personaje();
    private static Personaje personaje2 = new Personaje();
    private static Estadisticas estadisticas = new Estadisticas();
    private static Clases clases = new Clases();
    private static Batalla batalla = new Batalla();


    public static void main(String[] args) {

//        Estadisticas estadisticas = new Estadisticas(personaje1);



        System.out.println("1. Crear personaje");
        System.out.println("2. Salir");
        int crear_personaje = sc.nextInt();
        sc.nextLine();


        if (crear_personaje == 1) {
            System.out.print("Escribe el nombre de tu personaje: ");
            String nombre_personaje1 = sc.nextLine();
            System.out.println();
            personaje1.setNombre(nombre_personaje1);
            personaje1.setPersonaje_seleccionado(true);
            boolean flag = true;
            while (flag) {

                System.out.println(color.blue + "----------Que acción quieres hacer----------");
                System.out.println("1. Modificar personaje");
                System.out.println("2. Mostrar estadísticas");
                System.out.println("3. Elegir clase");
                System.out.println("4. Crear otro personaje");
                System.out.println("5. Cambiar de personaje");
                System.out.println("6. Batalla");
                System.out.println("10. Salir");
                System.out.println("--------------------------------------------" + color.reset);
                int menu_personaje = sc.nextInt();
                sc.nextLine();
                switch (menu_personaje) {
                    //Modificar personaje
                    case 1:
                        System.out.println("¿Que quieres modificar?");
                        System.out.println("1. Nombre");
                        System.out.println("2. Clase");

                        break;
                    //Estadisticas personaje
                    case 2:
                        int n = estadisticas.elegir_estadisticas(personaje1, personaje2);
                        if (n == 1) {
                            estadisticas.ver_estadisticas1(personaje1, personaje2);
                            continue;
                        } else if (n == 2) {
                            estadisticas.ver_estadisticas2(personaje1, personaje2);
                            continue;
                        } else if (n == 3) {
                            break;
                        } else {
                            System.out.println(color.red + "Introduce un número del 1-2" + color.reset);
                            continue;
                        }
                    case 3:
                        clases.elegir_clase(personaje1, personaje2);
                        continue;

                    case 4:
                        personaje.crear_personaje(personaje1, personaje2);
                        continue;
                    case 5:
                        personaje.cambiar_personaje_seleccionado(personaje1, personaje2, estadisticas);
                        continue;
                    case 6:
                        batalla.batalla(personaje1, personaje2);
                        flag = false;
                        break;
                    case 10:
                        flag = false;
                        break;

                }
            }

        } else if (crear_personaje == 2) {
            System.out.println(color.red + "Saliendo del programa.." + color.reset);

        }


    }

    public static void tiempo() {
        try {
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
    public  static void enter_continuar() {
        System.out.println(color.grey +"Pulse ENTER para volver al menu"+ color.reset);
        sc.nextLine();
    }

//    public static void elegir_clase1() {
//        if (personaje1.getPersonaje_seleccionado() == true && personaje1.getClase_elegida() == true) {
//            System.out.println(color.red + "Ya has elegido una clase" + color.reset);
//            System.out.println("La clase seleccionada es: " + personaje1.getClase());
//            System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
//            sc.nextLine();
//        } else if (personaje1.getPersonaje_seleccionado() == true && personaje1.getClase_elegida() == false) {
//            int menu_clases1 = 0;
//
//            System.out.println("----------Elige una clase----------");
//            System.out.println(color.cyan + "1. Tanque: " + color.reset);
//            System.out.println(color.green + "\tNivel: " + color.red + personaje.getNivel() + color.reset);
//            System.out.println(color.green + "\tVida: " + color.red + (personaje.getVida() + 50) + color.reset);
//            System.out.println(color.green + "\tAtaque: " + color.red + (personaje.getAtaque() - 30) + color.reset);
//            System.out.println(color.green + "\tDefensa: " + color.red + (personaje.getDefensa_inicial() + 30) + color.reset);
//            System.out.println(color.green + "\tVelocidad: " + color.red + (personaje.getVelocidad_inicial() - 50) + color.reset);
//
//
//            System.out.println(color.cyan + "2. Ninja: " + color.reset);
//            System.out.println(color.green + "\tNivel: " + color.red + personaje.getNivel() + color.reset);
//            System.out.println(color.green + "\tVida: " + color.red + (personaje.getVida() - 70) + color.reset);
//            System.out.println(color.green + "\tAtaque: " + color.red + (personaje.getAtaque() + 25) + color.reset);
//            System.out.println(color.green + "\tDefensa: " + color.red + (personaje.getDefensa_inicial() + 15) + color.reset);
//            System.out.println(color.green + "\tVelocidad: " + color.red + (personaje.getVelocidad_inicial() + 50) + color.reset);
//            System.out.println("-----------------------------------");
//            menu_clases1 = sc.nextInt();
//            sc.nextLine();
//            if (menu_clases1 == 1) {
//
//                personaje1.setVida(personaje.getVida_inicial() + 50);
//                personaje1.setAtaque(personaje.getAtaque_inicial() - 30);
//                personaje1.setDefensa(personaje.getDefensa_inicial() + 30);
//                personaje1.setVelocidad(personaje.getVelocidad_inicial() - 50);
//
//                personaje1.setClase_elegida(true);
//                personaje1.setClase(color.cyan+"-Tanque-"+ color.reset);
//
//                System.out.println("La clase seleccionada es" + color.cyan + " -Tanque- " + color.reset);
//                System.out.println(color.grey +"Pulse ENTER para volver al menu"+ color.reset);
//                sc.nextLine();
//
//            } else if (menu_clases1 == 2) {
//
//            }
//        }
//    }
}