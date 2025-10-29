import java.util.Scanner;

public class Clases {



    private int menu_clases1;

    Colores color = new Colores();
    Personaje personaje = new Personaje();
//    Personaje personaje1 = new Personaje();
//    Personaje personaje2 = new Personaje();
    Scanner sc = new Scanner(System.in);





    public void elegir_clase(Personaje personaje1, Personaje personaje2) {
        int menu_clases1 = 0;
        if (personaje1.getPersonaje_seleccionado() && personaje1.getClase_elegida() == true) {
            System.out.println(color.red + "Ya has elegido una clase" + color.reset);
            System.out.println("La clase seleccionada es: " + personaje1.getClase());
            System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
            sc.nextLine();
        } else if (personaje1.getPersonaje_seleccionado() == true && personaje1.getClase_elegida() == false) {
            mostrar_clases();
            menu_clases1 = sc.nextInt();
            sc.nextLine();
            if (menu_clases1 == 1) {

                personaje1.setVida(personaje.getVida_inicial() + 50);
                personaje1.setAtaque(personaje.getAtaque_inicial() - 30);
                personaje1.setDefensa(personaje.getDefensa_inicial() + 30);
                personaje1.setVelocidad(personaje.getVelocidad_inicial() - 50);

                personaje1.setClase_elegida(true);
                personaje1.setClase(color.cyan + "-Tanque-" + color.reset);

                System.out.println("La clase seleccionada es" + color.cyan + " -Tanque- " + color.reset);
                System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
                sc.nextLine();

            } else if (menu_clases1 == 2) {
                personaje1.setVida(personaje.getVida_inicial() - 70);
                personaje1.setAtaque(personaje.getAtaque_inicial() + 25);
                personaje1.setDefensa(personaje.getDefensa_inicial() + 15);
                personaje1.setVelocidad(personaje.getVelocidad_inicial() + 50);

                personaje1.setClase_elegida(true);
                personaje1.setClase(color.cyan + "-Ninja-" + color.reset);

                System.out.println("La clase seleccionada es" + color.cyan + " -Ninja- " + color.reset);
                System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
                sc.nextLine();
            }
            //Personaje 2
        } else if (personaje2.getPersonaje_seleccionado() && personaje2.getClase_elegida() == true) {
            System.out.println(color.red + "Ya has elegido una clase" + color.reset);
            System.out.println("La clase seleccionada es: " + personaje2.getClase());
            System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
            sc.nextLine();
        } else if (personaje2.getPersonaje_seleccionado() == true && personaje2.getClase_elegida() == false) {
            mostrar_clases();
            menu_clases1 = sc.nextInt();
            sc.nextLine();
            if (menu_clases1 == 1) {

                personaje2.setVida(personaje.getVida_inicial() + 50);
                personaje2.setAtaque(personaje.getAtaque_inicial() - 30);
                personaje2.setDefensa(personaje.getDefensa_inicial() + 30);
                personaje2.setVelocidad(personaje.getVelocidad_inicial() - 50);

                personaje2.setClase_elegida(true);
                personaje2.setClase(color.cyan + "-Tanque-" + color.reset);

                System.out.println("La clase seleccionada es" + color.cyan + " -Tanque- " + color.reset);
                System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
                sc.nextLine();

            } else if (menu_clases1 == 2) {
                personaje2.setVida(personaje.getVida_inicial() - 70);
                personaje2.setAtaque(personaje.getAtaque_inicial() + 25);
                personaje2.setDefensa(personaje.getDefensa_inicial() + 15);
                personaje2.setVelocidad(personaje.getVelocidad_inicial() + 50);

                personaje2.setClase_elegida(true);
                personaje2.setClase(color.cyan + "-Ninja-" + color.reset);

                System.out.println("La clase seleccionada es" + color.cyan + " -Ninja- " + color.reset);
                System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
                sc.nextLine();
            }
        }

    }

    public void mostrar_clases(){
        System.out.println("----------Elige una clase----------");
        System.out.println(color.cyan + "1. Tanque: " + color.reset);
        System.out.println(color.green + "\tNivel: " + color.red + personaje.getNivel() + color.reset);
        System.out.println(color.green + "\tVida: " + color.red + (personaje.getVida() + 50) + color.reset);
        System.out.println(color.green + "\tAtaque: " + color.red + (personaje.getAtaque() - 30) + color.reset);
        System.out.println(color.green + "\tDefensa: " + color.red + (personaje.getDefensa_inicial() + 30) + color.reset);
        System.out.println(color.green + "\tVelocidad: " + color.red + (personaje.getVelocidad_inicial() - 50) + color.reset);


        System.out.println(color.cyan + "2. Ninja: " + color.reset);
        System.out.println(color.green + "\tNivel: " + color.red + personaje.getNivel() + color.reset);
        System.out.println(color.green + "\tVida: " + color.red + (personaje.getVida() - 70) + color.reset);
        System.out.println(color.green + "\tAtaque: " + color.red + (personaje.getAtaque() + 25) + color.reset);
        System.out.println(color.green + "\tDefensa: " + color.red + (personaje.getDefensa_inicial() + 15) + color.reset);
        System.out.println(color.green + "\tVelocidad: " + color.red + (personaje.getVelocidad_inicial() + 50) + color.reset);
        System.out.println("-----------------------------------");
    }

//    ================================================================================

//    public void elegir_clase1(Personaje personaje1, Personaje personaje2) {
//        if(personaje1.getPersonaje_seleccionado() && personaje1.getClase_elegida()==true){
//            System.out.println(color.red + "Ya has elegido una clase" + color.reset);
//            System.out.println("La clase seleccionada es"+color.cyan + personaje1.getClase() + color.reset);
//            System.out.println(color.grey +"Pulse ENTER para volver al menu"+ color.reset);
//        } else if (personaje1.getPersonaje_seleccionado() && personaje1.getClase_elegida()==false) {
//            menu_clases1 = 0;
//
//            System.out.println("----------Elige una clase----------");
//            System.out.println(color.cyan +"1. Tanque: " + color.reset);
//            System.out.println(color.green +"\tNivel: "+ color.red + personaje.getNivel()+ color.reset);
//            System.out.println(color.green +"\tVida: "+ color.red + (personaje.getVida()+ 50)+ color.reset);
//            System.out.println(color.green +"\tAtaque: "+ color.red + (personaje.getAtaque() - 30)+ color.reset);
//            System.out.println(color.green +"\tDefensa: "+ color.red + (personaje.getDefensa_inicial() + 30) + color.reset);
//            System.out.println(color.green +"\tVelocidad: "+ color.red + (personaje.getVelocidad_inicial() - 50)+ color.reset);
//
//
//            System.out.println(color.cyan +"2. Ninja: " + color.reset);
//            System.out.println(color.green +"\tNivel: "+ color.red + personaje.getNivel()+ color.reset);
//            System.out.println(color.green +"\tVida: "+ color.red + (personaje.getVida() - 70)+ color.reset);
//            System.out.println(color.green +"\tAtaque: "+ color.red + (personaje.getAtaque() + 25)+ color.reset);
//            System.out.println(color.green +"\tDefensa: "+ color.red + (personaje.getDefensa_inicial() + 15) + color.reset);
//            System.out.println(color.green +"\tVelocidad: "+ color.red + (personaje.getVelocidad_inicial() + 50)+ color.reset);
//            System.out.println("-----------------------------------");
//            menu_clases1 = sc.nextInt();
//            sc.nextLine();
//            if(menu_clases1 == 1){
//
//                personaje1.setVida(personaje.getVida_inicial()+50);
//                personaje1.setAtaque(personaje.getAtaque_inicial()-30);
//                personaje1.setDefensa(personaje.getDefensa_inicial()+30);
//                personaje1.setVelocidad(personaje.getVelocidad_inicial()-50);
//
//                System.out.println("La clase seleccionada es"+color.cyan +" -Tanque- " + color.reset);
//
//        }


//========================================================
//            if (personaje1.getPersonaje_seleccionado()==true){
//
//            } else if (personaje2.getPersonaje_seleccionado()==true) {
//
//            }
//            if(personaje1.getClase_elegida() == true){
//
//            }
//            if(personaje2.getClase_elegida() == true){
//
//            }
//            personaje1.getPersonaje_seleccionado(false);
//            personaje1.getClase() = color.cyan + "-Tanque-" + color.reset;
//
//
//
//
//
//
//
//            System.out.println(grey +"Pulse ENTER para volver al menu"+ reset);
//            sc.nextLine();
//
//
//        }
//        else if(menu_clases1 == 2){
//            System.out.println("La clase seleccionada es"+color.cyan +" -Ninja- " + color.reset);
//            clase1_elegida = true;
//            this.clase = cyan + "-Ninja-" + reset;
//
//            this.vida = (this.vida_inicial - 70);
//            this.ataque = (this.ataque_inicial + 25);
//            this.defensa = (this.defensa_inicial + 15);
//            this.velocidad = (this.velocidad_inicial + 50);
//
//
//            System.out.println(color.grey +"Pulse ENTER para volver al menu"+ color.reset);
//            sc.nextLine();
//        }
//    }


}
