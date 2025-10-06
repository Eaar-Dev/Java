public class ForCicle {

    public static void main(String[] args) {
        System.out.println("*** FOR IN ACTION ***");

        System.out.println("\n1st Example-----");
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n2nd Example-----");
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello World!");
        }

        System.out.println("\n3th Example-----");
        for (int i = 1; i <= 10; i++) {
            int mult = 5 * i;
            System.out.println("5 x " + i + " = " + mult);
        }

        System.out.println("\n4th Example-----");
        for (int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }

        System.out.println("\n5th Example-----");
        for (int i = 0; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
    }

}
