package listas.set;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

        /*
         * EN LOS SETS NO RESPETA EL ORDEN, SIEMPRE DEPENDE
         * DE COMO LO MANEJE EL SET, LO QUE DESTACA DE UN SET
         * ES QUE SIEMPRE VA A DEJAR DE LADO LOS DUPLICADOS
         * NO LOS VA A TOMAR NUNCA EN CUENTA
         */

        Set<String> ex = new HashSet<>();

        ex.add("Uno");
        ex.add("Uno");
        ex.add("Uno");
        ex.add("Dos");
        ex.add("Dos");
        ex.add("Dos");
        ex.add("Tres");
        ex.add("Tres");
        ex.add("Cuatro");
        ex.add("Cinco");

        System.out.println(ex);

        for (String elem : ex) {
            System.out.println("EX: " + elem);
        }
    }
}
