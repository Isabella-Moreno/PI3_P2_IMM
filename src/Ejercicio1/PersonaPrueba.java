package Ejercicio1;

import java.util.Scanner;

public class PersonaPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Nombre de la persona: ");
        String nombre = sc.nextLine();

        System.out.print("Profesión: ");
        String profesion = sc.nextLine();

        Persona persona = new Persona(nombre, profesion);

        System.out.println("\n--- COMPORTAMIENTOS IMPLEMENTADOS ---");
        persona.hablar();
        persona.trabajar();
    }
}