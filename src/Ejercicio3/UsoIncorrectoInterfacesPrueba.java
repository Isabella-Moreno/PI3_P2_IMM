package Ejercicio3;

public class UsoIncorrectoInterfacesPrueba {

    public void iniciar() {
        // --- CASO 1: OMITIR MÉTODOS DE LA INTERFAZ (ERROR DE COMPILACIÓN) ---
        // Si creas: public class Tortuga implements Corredor {} sin @Override correr(),
        // Java arroja: "Class 'Tortuga' must either be declared abstract or implement abstract method 'correr()' in 'Corredor'"

        // --- CASO 2: IMPLEMENTACIÓN SIN SENTIDO LÓGICO (MALA PRÁCTICA) ---
        Corredor arbol = new Arbol();
        arbol.correr();

        System.out.println("\n--- DISCUSIÓN EJERCICIO 3 ---");
        System.out.println("1. Contrato obligatorio: Toda clase concreta que use 'implements' está obligada por el compilador "
                + "a implementar el 100% de los métodos abstractos de la interfaz.");
        System.out.println("2. Cohesión semántica: Implementar interfaces en clases sin relación real (como Arbol -> Corredor) "
                + "genera código engañoso, obliga a escribir métodos vacíos o absurdos y viola el principio de segregación de interfaces.");
    }
}