package ciclos.dowhile;

public class DoWhileChallenge {

    public static void main(String[] args) {
        System.out.println("*** Reto: Número Impares ***");

        short counter = 0;
        do {
            if (counter % 2 != 0) {
                System.out.print(counter + " ");
            }
            counter++;
        } while (counter <= 20);
    }
}
