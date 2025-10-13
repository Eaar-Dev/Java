
import java.util.Arrays;

public class Example02 {

    public static void main(String[] args) {

        System.out.println("*** Beer Song ***");

        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            System.out.println("take one down, pass it around " + (i - 1) + " bottles of beer on the wall!");
        }

        // THIS IS ANOTHER EXAMPLE WITHOUT CONTEXT
        // int[] arr = { 1, 3, 5, 6, 8, 9, 10, 14, 16, 19 };
        int[] arr = { 2, 34, 2, 7, 5, 8, 9, 3, 67, 8, 2, 234, 243, 63, 6, 46, 235, 62, 2364, 257, };
        int target = 6;

        Arrays.sort(arr);
        // int data = Arrays.binarySearch(arr, 6);
        int data = binarySearch(arr, target);

        if (data != -1) {
            System.out.println("Número " + arr[data] + " encontrado");
        } else {
            System.out.println("Número 6 no encontrado");
        }
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
