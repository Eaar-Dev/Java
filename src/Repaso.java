
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Repaso {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22, 33, 55, 66, 77, 88, 99, 234, 3465, 4537);
        List<String> text = Arrays.asList("EsUnEjemplo", "dE cOMO", "FUNCiona", "esto", "XDXD");

        System.out.println("*** Ejemplo del uso de filter ***");
        System.out.println("*** Ejemplo numérico ***");
        numbers.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
        System.out.println("**********************");
        System.out.println("----------------------");

        System.out.println("*** Ejemplo string ***");
        text.stream().filter(t -> Character.isUpperCase(t.charAt(1)))
                .forEach(System.out::println);
        System.out.println("**********************");
        System.out.println("----------------------");

        System.out.println("*** Ejemplo string ***");
        text.stream().filter(t -> t.endsWith("a"))
                .forEach(System.out::println);
        System.out.println("**********************");
        System.out.println("----------------------");

        System.out.println("*** Ejemplo del uso de map ***");
        System.out.println("*** Ejemplo numérico ***");
        numbers.stream().map(m -> m * 2).forEach(System.out::println);
        System.out.println("**********************");
        System.out.println("----------------------");

        System.out.println("*** Ejemplo string ***");
        List<String> answer = text.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(answer);
        System.out.println("**********************");
        System.out.println("----------------------");

        System.out.println("*** Ejemplo string ***");
        text.stream().map(t -> t.length()).forEach(System.out::println);
        System.out.println("**********************");
        System.out.println("----------------------");

        System.out.println("*** Buscar un número en específico de la manera más rápida ***");
        System.out.println("*** Busqueda con Arrays.binarySearch ***");
        int[] arr = { 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int ans = Arrays.binarySearch(arr, 10);

        System.out.println("El número es: " + arr[ans] + " y el índice es: " + ans);
        System.out.println("**********************");
        System.out.println("----------------------");

        System.out.println("*** Busqueda con binarySeach como método ***");
        int target = 6;
        int ans2 = binarySearch(arr, target); // Arrays.binarySearch(arr, 10);

        if (ans2 != -1) {
            System.out.println("El número es: " + arr[ans2] + " y el índice es: " + ans2);
        } else {
            System.out.println("El número " + target + " no está dentro del arreglo");
        }

        System.out.println("**********************");
        System.out.println("----------------------");
    }

    public static int binarySearch(int[] arr, int target) {

        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {

            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
