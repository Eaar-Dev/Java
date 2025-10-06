
import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {

        System.out.println("*** Bart's Detention ***");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        sc.close();

        System.out.println("What do you want me to write?");
        System.out.println(text);

        for (int i = 0; i <= 99; i++) {
            System.out.println(i + ": " + text);
        }

    }
}
