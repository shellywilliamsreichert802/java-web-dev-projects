package org.launchcode;
import java.util.Scanner;

public class AliceFindReplace {
    public static void main(String[] args) {

        // Store the first sentence in a string
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        // Prompt the user for a search term
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();
//extend the program to handle the additional requirements. We’ll follow these steps:
//
//Find the index of the user-entered word within the sentence.
//Get the length of the word.
//Prompt the user for a replacement word.
//Create a new sentence by removing the word and replacing it with the user’s input.
//It will find the index and length of the user-entered word.
//Prompt you for a replacement word.
//Replace the word in the sentence with your input and print the updated sentence.


        // Perform a case-insensitive search
        String lowerCaseSentence = aliceSentence.toLowerCase();
        String lowerCaseSearchTerm = searchTerm.toLowerCase();
        int index = lowerCaseSentence.indexOf(lowerCaseSearchTerm);
        boolean found = false;

        while (index != -1) {
            found = true;
            System.out.println("Found at index: " + index);

            // Move the search forward
            index = lowerCaseSentence.indexOf(lowerCaseSearchTerm, index + 1);
        }

        if (found) {
            // Get the length of the word
            int wordLength = searchTerm.length();
            System.out.println("Length of '" + searchTerm + "': " + wordLength);

            // Prompt the user for a replacement word
            System.out.print("Enter a replacement word: ");
            String replacementWord = scanner.nextLine();

            // Replace the word with the user's input
            String updatedSentence = aliceSentence.replace(searchTerm, replacementWord);

            // Print the updated sentence
            System.out.println("Updated sentence:");
            System.out.println(updatedSentence);
        } else {
            System.out.println("Search term not found.");
        }
    }
}
