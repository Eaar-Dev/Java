public class Example02 {

    public static void main(String[] args) {

        System.out.println("*** Beer Song ***");

        for (int i = 99; i > 0; i--) {
            System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer!");
            System.out.println("take one down, pass it around " + (i - 1) + " bottles of beer on the wall!");
        }
    }

}
