package ciclos.dowhile;

public class Example1 {
    public static void main(String[] args) {
        System.out.println("*** Números inversos ***");

        short counter = 10;
        do {
            System.out.print(counter-- + " ");
        } while (counter > 0);
    }
}
