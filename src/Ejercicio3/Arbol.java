package Ejercicio3;

public class Arbol implements Corredor {

    // MALA PRÁCTICA: Compila sin error, pero rompe la cohesión del diseño porque un árbol no corre.
    @Override
    public void correr() {
        System.out.println("Error lógico: Un árbol tiene raíces y no puede correr.");
    }
}