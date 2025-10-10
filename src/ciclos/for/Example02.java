
import java.util.Arrays;

public class Example02 {

    public static void main(String[] args) {

        System.out.println("*** Beer Song ***");

        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            System.out.println("take one down, pass it around " + (i - 1) + " bottles of beer on the wall!");
        }

        // THIS IS ANOTHER EXAMPLE WITHOUT CONTEXT
        int[] arr = { 1, 3, 5, 6, 8, 9, 10, 14, 16, 19 };

        int data = Arrays.binarySearch(arr, 6);
        System.out.println(arr[data]);
    }

}
