package streams;

import java.util.Arrays;
import java.util.List;

public class StreamDistinct {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 1, 1, 1, 1, 1, 234, 234, 234, 234, 24, 4, 654, 74568);
        List<String> arr1 = Arrays.asList("Ejemplo", "EJE", "LALSFKJKJ", "OQUDFub", "JEJESCO", "EJEMPLOS", "EJEMPLOS",
                "EjEmPlOs", "EJE");

        System.out.println("*** EJEMPLO CON NUMEROS ***");
        arr.stream().distinct().forEach(System.out::println);

        System.out.println("*** EJEMPLO CON STRINGS ***");
        arr1.stream().filter(n -> n.startsWith("E")).distinct()
                .forEach(System.out::println);

    }
}
