package org.launchcode;
import java.util.Scanner;

public class AliceSearch {
    public static void main(String[] args) {
        // Store the first sentence in a string
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        // Prompt the user for a search term
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();

        // Perform a case-insensitive search
        boolean found = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());

        // Print the result
        System.out.println("Search term found: " + found);
    }
}
