package Ejercicio2;

public class Animal implements Volador, Nadador {

    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    @Override
    public void volar() {
        System.out.println("El animal (" + especie + ") despliega sus alas y comienza a volar.");
    }

    @Override
    public void nadar() {
        System.out.println("El animal (" + especie + ") se sumerge y nada ágilmente en el agua.");
    }
}