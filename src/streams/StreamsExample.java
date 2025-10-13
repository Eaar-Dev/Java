package streams;

import java.util.Arrays;
import java.util.List;

public class StreamsExample {

    public static void main(String[] args) {
        List<Integer> example = Arrays.asList(5, 10, 15, 20, 20, 25, 25, 30);

        example.stream()
                .filter(n -> n > 10)
                .map(n -> n * 2)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
