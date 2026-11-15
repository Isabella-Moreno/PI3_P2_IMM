package Ejercicio1;

public class Persona implements Hablador, Trabajador {

    private String nombre;
    private String profesion;

    public Persona(String nombre, String profesion) {
        this.nombre = nombre;
        this.profesion = profesion;
    }

    @Override
    public void hablar() {
        System.out.println(nombre + " dice: ¡Hola! Mucho gusto.");
    }

    @Override
    public void trabajar() {
        System.out.println(nombre + " está trabajando en su rol de " + profesion + ".");
    }
}