package streams;

import java.util.stream.IntStream;

public class StreamPalindrome {

    public static void main(String[] args) {

        // We are going to create a class to validate if a word or string is a
        // palindrome

        String pal = "dabale arroz a la zorra el abad";

        String word = pal.toLowerCase().replaceAll("\\s+", "");

        boolean isPalindrome = IntStream.range(0, word.length() / 2)
                .allMatch(a -> word.charAt(a) == word.charAt(word.length() - 1 - a));

        System.out.println("Is /'" + pal + "'/ palindrome? " + isPalindrome);
    }
}
