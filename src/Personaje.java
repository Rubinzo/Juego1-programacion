import java.util.Scanner;

public class Personaje {

    private String nombre;
    private int nivel;
    private double vida;
    private double ataque;
    private double defensa;
    private double velocidad;


    private int vida_inicial;
    private double ataque_inicial;
    private double defensa_inicial;
    private double velocidad_inicial;
    private String clase;

    private boolean clase_elegida = false;
    private boolean personaje_seleccionado = false;
    private boolean personaje_creado = false;

    private boolean turno = false;


    Colores color = new Colores();
    Scanner sc = new Scanner(System.in);


    public Personaje() {
        this.nivel = 0;
        this.vida = 100;
        this.ataque = 50;
        this.defensa = 0;
        this.velocidad = 100;

        this.vida_inicial = 100;
        this.ataque_inicial = 50;
        this.defensa_inicial = 0;
        this.velocidad_inicial = 100;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getVida() {
        return vida;
    }

    public void setVida(double vida) {
        this.vida = vida;
    }

    public double getAtaque() {
        return ataque;
    }

    public void setAtaque(double ataque) {
        this.ataque = ataque;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }

    public int getVida_inicial() {
        return vida_inicial;
    }

    public void setVida_inicial(int vida_inicial) {
        this.vida_inicial = vida_inicial;
    }

    public double getAtaque_inicial() {
        return ataque_inicial;
    }

    public void setAtaque_inicial(double ataque_inicial) {
        this.ataque_inicial = ataque_inicial;
    }

    public double getDefensa_inicial() {
        return defensa_inicial;
    }

    public void setDefensa_inicial(double defensa_inicial) {
        this.defensa_inicial = defensa_inicial;
    }

    public double getVelocidad_inicial() {
        return velocidad_inicial;
    }

    public void setVelocidad_inicial(double velocidad_inicial) {
        this.velocidad_inicial = velocidad_inicial;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public boolean getClase_elegida() {
        return clase_elegida;
    }

    public void setClase_elegida(boolean clase_elegida) {
        this.clase_elegida = clase_elegida;
    }

    public boolean getPersonaje_seleccionado() {
        return personaje_seleccionado;
    }

    public void setPersonaje_seleccionado(boolean personaje_seleccionado) {
        this.personaje_seleccionado = personaje_seleccionado;
    }

    public boolean getPersonaje_creado() {
        return personaje_creado;
    }

    public void setPersonaje_creado(boolean personaje_creado) {
        this.personaje_creado = personaje_creado;
    }

    public boolean getTurno() {
        return turno;
    }

    public void setTurno(boolean turno) {
        this.turno = turno;
    }

    public void cambiar_personaje_seleccionado(Personaje personaje1, Personaje personaje2, Estadisticas estadisticas) {
        System.out.println("=====Cambiar personaje seleccionado=====");
        System.out.println("¿Que personaje quieres elegir?");
        System.out.println("1. "+ personaje1.getNombre());
        System.out.println("2. "+ personaje2.getNombre());
        int cambiar_personaje_int = sc.nextInt();
        if(cambiar_personaje_int == 1 && personaje1.getPersonaje_seleccionado()==true){
            System.out.println(color.red + personaje1.getNombre() + " ya está seleccionado");
        } else if (cambiar_personaje_int == 1 && personaje1.getPersonaje_seleccionado()==false) {
            personaje1.setPersonaje_seleccionado(true);
            personaje2.setPersonaje_seleccionado(false);
        }else if(cambiar_personaje_int == 2 && personaje2.getPersonaje_seleccionado()==true){
            System.out.println(color.red + personaje2.getNombre() + " ya está seleccionado");
        } else if (cambiar_personaje_int == 2 && personaje2.getPersonaje_seleccionado()==false) {
            personaje2.setPersonaje_seleccionado(true);
            personaje1.setPersonaje_seleccionado(false);
        }
    }

    public void crear_personaje(Personaje personaje1, Personaje personaje2) {
        System.out.print("Escribe el nombre de tu personaje: ");
        String nombre_personaje2 = sc.nextLine();
//        System.out.println();
        personaje2.setNombre(nombre_personaje2);
        personaje1.setPersonaje_seleccionado(false);
        personaje2.setPersonaje_seleccionado(true);
        personaje2.setPersonaje_creado(true);
        System.out.println(color.grey + "Pulse ENTER para volver al menu" + color.reset);
        sc.nextLine();
    }


}
