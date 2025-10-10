package listas.list;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        /*
         * UNA LISTA NO TIENE UN ORDEN ESPECÍFICO
         * SIMPLEMENTE PONE UN CONJUNTO DENTRO DE LA LISTA
         * SIN ORDEN
         */

        List<String> ex = new ArrayList<>();
        ex.add("NARANJA");
        ex.add("TORONJA");
        ex.add("EQUISDE");

        System.out.println(ex);

        for (String fruta : ex) {
            System.out.println("EX: " + fruta);
        }

    }
}
