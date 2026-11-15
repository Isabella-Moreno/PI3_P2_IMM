package Ejercicio2;

import java.util.Scanner;

public class AnimalPrueba {

    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        System.out.print("Ingrese la especie del animal (ej. Pato, Pelícano): ");
        String especie = sc.nextLine();

        Animal animal = new Animal(especie);

        System.out.println("\n--- HABILIDADES DEL ANIMAL ---");
        animal.volar();
        animal.nadar();
    }
}