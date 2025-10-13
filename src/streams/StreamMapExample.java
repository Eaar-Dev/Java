package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapExample {

    public static void main(String[] args) {

        System.out.println("*** EXAMPLE 1 ***");
        List<Integer> list = Arrays.asList(2, 4, 6, 8, 10, 12, 14, 16);
        list.stream().map(n -> n * 3).forEach(System.out::println);

        System.out.println("*** EXAMPLE 2 ***");
        List<String> list1 = Arrays.asList("geeks", "gfg", "g", "e", "e", "k", "s");
        List<String> answer = list1.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(answer);

        System.out.println("*** EXAMPLE 3 ***");
        List<String> list2 = Arrays.asList("Geeks", "FOR", "GEEKSQUIZ", "Computer", "Science", "gfg");
        list2.stream().map(str -> str.length()).forEach(System.out::println);
    }

}
