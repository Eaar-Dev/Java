package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilterExample {

    public static void main(String[] args) {

        List<Integer> st = Arrays.asList(3, 4, 6, 12, 20);

        System.out.println("*** EXAMPLE 1 ***");
        st.stream()
                .filter(num -> num % 2 == 0)
                .forEach(System.out::println);

        System.out.println("*** EXAMPLE 2 ***");
        Stream<String> ex = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksForGeeks");

        ex.filter(str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);

        System.out.println("*** EXAMPLE 3 ***");
        Stream<String> ex2 = Stream.of("Geeks", "fOr", "GEEKSQUIZ", "GeeksForGeeks");
        ex2.filter(str -> str.endsWith("s"))
                .forEach(System.out::println);

    }
}
