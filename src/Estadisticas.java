import java.util.Scanner;

public class Estadisticas {
    private  String nombre_p1_est;
    private  String nombre_p2_est;
    private  int ver_estadisticas;
    private String nombre_ver_estadisticas;

//    private Personaje personaje = new Personaje();
    Personaje personaje = new Personaje();

    //Dentro de Estadisticas (Personaje personaje)
    public Estadisticas() {
//        this.personaje = personaje;
    }


    public String getNombre_p2_est() {
        return nombre_p2_est;
    }

    public void setNombre_p2_est(String nombre_p2_est) {
        this.nombre_p2_est = nombre_p2_est;
    }

    public String getNombre_p1_est() {
        return nombre_p1_est;
    }

    public void setNombre_p1_est(String nombre_p1_est) {
        this.nombre_p1_est = nombre_p1_est;
    }

    public int getVer_estadisticas() {
        return ver_estadisticas;
    }

    public void setVer_estadisticas(int ver_estadisticas) {
        this.ver_estadisticas = ver_estadisticas;
    }

    public String getNombre_ver_estadisticas() {
        return nombre_ver_estadisticas;
    }

    public void setNombre_ver_estadisticas(String nombre_ver_estadisticas) {
        this.nombre_ver_estadisticas = nombre_ver_estadisticas;
    }

    Personaje personaje1 = new Personaje();
    Personaje personaje2 = new Personaje();
    Scanner sc = new Scanner(System.in);
    Colores color = new Colores();

    public int elegir_estadisticas(Personaje personaje1, Personaje personaje2) {
        if (personaje1.getClase_elegida() && personaje1.getPersonaje_seleccionado() == true) {
            nombre_p1_est = personaje1.getNombre();
        } else if (personaje1.getClase_elegida()==false && personaje1.getPersonaje_seleccionado() == true) {
            nombre_p1_est =personaje1.getNombre() + color.grey +"\t --Primero tienes que elegir una clase--"+color.reset;
        }
        if (personaje2.getClase_elegida()==true) {
            nombre_p2_est = personaje2.getNombre();
        } else if (personaje2.getPersonaje_creado()==false) {
            nombre_p2_est =color.grey +"\t --Primero tienes que crear el segundo personaje--"+color.reset;
        } else if (personaje2.getPersonaje_creado() == true && personaje.getClase_elegida() == false) {
            nombre_p2_est = personaje2.getNombre() + color.grey +"\t --Primero tienes que elegir una clase--"+color.reset;
        }
        System.out.println("========Ver estadisticas========");
        System.out.println("¿Que personaje quieres elegir?");
        System.out.println("1. "+ nombre_p1_est);
        System.out.println("2. "+ nombre_p2_est);
        System.out.println("3. Salir");
        int ver_estadisticas = sc.nextInt();
        sc.nextLine();
//      creo que no hay que ponerlo porque el return se lleva el enter
        return ver_estadisticas;
    }



    public void ver_estadisticas1(Personaje personaje1, Personaje personaje2) {

        if (personaje1.getPersonaje_seleccionado() &&  personaje1.getClase_elegida() == true){
//            nombre_ver_estadisticas = personaje1.getNombre(); Se puede quitar
            System.out.println(color.blue +"----------Estadisticas del Personaje----------"+ color.reset);
//            System.out.println("Estadisticas de: " + nombre_ver_estadisticas ); Se puede quitar
            System.out.println("\t\t\tClase: " + personaje1.getClase());
            System.out.println(color.green +"Nombre: "+ color.red + personaje1.getNombre() + color.reset);
            System.out.println(color.green +"Nivel: "+ color.red + personaje1.getNivel() + color.reset);
            System.out.println(color.green +"Vida: "+ color.red + personaje1.getVida() + color.reset);
            System.out.println(color.green +"Ataque: "+ color.red + personaje1.getAtaque() + color.reset);
            System.out.println(color.green +"Defensa: "+ color.red + personaje1.getDefensa() + color.reset);
            System.out.println(color.green +"Velocidad: "+ color.red + personaje1.getVelocidad() + color.reset);


            System.out.println(color.blue +"------------------------------------------------"+ color.reset);
            System.out.println(color.grey +"Pulse ENTER para volver al menu"+ color.reset);
            sc.nextLine();
        } else if (personaje1.getPersonaje_seleccionado() == true && personaje1.getClase_elegida() == false) {
            System.out.println(color.red + "Necesitas elegir una clase primero" + color.reset);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }else if (personaje1.getPersonaje_seleccionado() == false) {
            System.out.println(color.red + "Este personaje no está seleccionado" + color.reset);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }




    }
    public void ver_estadisticas2(Personaje personaje1, Personaje personaje2) {

        if (personaje2.getPersonaje_creado() && personaje2.getPersonaje_seleccionado() && personaje2.getClase_elegida() == true) {
            System.out.println(color.blue + "----------Estadisticas del Personaje----------" + color.reset);
            System.out.println("\t\t\tClase: " + personaje2.getClase());
            System.out.println(color.green + "Nombre: " + color.red + personaje2.getNombre() + color.reset);
            System.out.println(color.green + "Nivel: " + color.red + personaje2.getNivel() + color.reset);
            System.out.println(color.green + "Vida: " + color.red + personaje2.getVida() + color.reset);
            System.out.println(color.green + "Ataque: " + color.red + personaje2.getAtaque() + color.reset);
            System.out.println(color.green + "Defensa: " + color.red + personaje2.getDefensa() + color.reset);
            System.out.println(color.green + "Velocidad: " + color.red + personaje2.getVelocidad() + color.reset);


            System.out.println(color.blue + "------------------------------------------------" + color.reset);
            System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
            sc.nextLine();
        } else if (personaje2.getPersonaje_creado() == true && personaje2.getPersonaje_seleccionado() == true && personaje2.getClase_elegida() == false) {
            System.out.println(color.red + "Necesitas elegir una clase primero" + color.reset);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }else if (personaje2.getPersonaje_creado() == true && personaje2.getPersonaje_seleccionado() == false) {
            System.out.println(color.red + "Este personaje no está seleccionado" + color.reset);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }else if (personaje2.getPersonaje_creado() == false) {
            System.out.println(color.red + "Este personaje no está creado" + color.reset);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
