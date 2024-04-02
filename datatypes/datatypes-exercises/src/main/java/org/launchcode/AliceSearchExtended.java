package org.launchcode;
import java.util.Scanner;

public class AliceSearchExtended {
    public static void main(String[] args) {

        // Store the first sentence in a string
        String aliceSentence = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, 'and what is the use of a book,' thought Alice 'without pictures or conversation?'";

        // Prompt the user for a search term
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a search term: ");
        String searchTerm = scanner.nextLine();

        // Perform a case-insensitive search
        boolean found = aliceSentence.toLowerCase().contains(searchTerm.toLowerCase());

        if (found) {
            // Get the index of the word
            int index = aliceSentence.toLowerCase().indexOf(searchTerm.toLowerCase());
            System.out.println("Index of '" + searchTerm + "': " + index);

            // Get the length of the word
            int wordLength = searchTerm.length();
            System.out.println("Length of '" + searchTerm + "': " + wordLength);

            // Remove the word from the sentence
            String updatedSentence = aliceSentence.replace(searchTerm, "");

            // Print the updated sentence
            System.out.println("Updated sentence:");
            System.out.println(updatedSentence);
        } else {
            System.out.println("Search term not found.");
        }
    }
}



//To handle multiple occurances of the word we can modify (previous code was sufficient)
//In this modified version:
//
//We use a while loop to find all occurrences of the search term within the sentence.
//The loop continues until no more occurrences are found.
//We print the index of each occurrence.
//The word is removed from the sentence, and the updated sentence is displayed.
//Now you can input any search term, and the program will handle multiple occurrences!

                // Perform a case-insensitive search
//                String lowerCaseSentence = aliceSentence.toLowerCase();
//                String lowerCaseSearchTerm = searchTerm.toLowerCase();
//                int index = lowerCaseSentence.indexOf(lowerCaseSearchTerm);
//                boolean found = false;
//
//                while (index != -1) {
//                    found = true;
//                    System.out.println("Found at index: " + index);
//
//                    // Move the search forward
//                    index = lowerCaseSentence.indexOf(lowerCaseSearchTerm, index + 1);
//                }
//
//                if (found) {
//                    // Get the length of the word
//                    int wordLength = searchTerm.length();
//                    System.out.println("Length of '" + searchTerm + "': " + wordLength);
//
//                    // Remove all occurrences of the word from the sentence
//                    String updatedSentence = aliceSentence.replace(searchTerm, "");
//
//                    // Print the updated sentence
//                    System.out.println("Updated sentence:");
//                    System.out.println(updatedSentence);
//                } else {
//                    System.out.println("Search term not found.");
//                }
//            }
//        }



//replace only specific occurrences of the word, we can modify the program to allow you to specify which occurrences to replace.
//In this version:
//
//We find all occurrences of the search term as before.
//The user is prompted to enter the index of the occurrence they want to replace.
//We replace only the specified occurrence and print the updated sentence.
//Feel free to try it out with different search terms and replacement indices

                // Perform a case-insensitive search
//                String lowerCaseSentence = aliceSentence.toLowerCase();
//                String lowerCaseSearchTerm = searchTerm.toLowerCase();
//                int index = lowerCaseSentence.indexOf(lowerCaseSearchTerm);
//                boolean found = false;
//
//                while (index != -1) {
//                    found = true;
//                    System.out.println("Found at index: " + index);
//
//                    // Move the search forward
//                    index = lowerCaseSentence.indexOf(lowerCaseSearchTerm, index + 1);
//                }
//
//                if (found) {
//                    // Prompt the user for the index of the occurrence to replace
//                    System.out.print("Enter the index of the occurrence to replace: ");
//                    int replaceIndex = scanner.nextInt();
//
//                    // Replace the specific occurrence
//                    String updatedSentence = aliceSentence.replaceFirst("(?i)" + searchTerm, "");
//
//                    // Insert the new word at the specified index
//                    updatedSentence = updatedSentence.substring(0, replaceIndex) + searchTerm + updatedSentence.substring(replaceIndex);
//
//                    // Print the updated sentence
//                    System.out.println("Updated sentence:");
//                    System.out.println(updatedSentence);
//                } else {
//                    System.out.println("Search term not found.");
//                }
//            }
//        }


//extend the program to handle the additional requirements. We’ll follow these steps:
//
//Find the index of the user-entered word within the sentence.
//Get the length of the word.
//Prompt the user for a replacement word.
//Create a new sentence by removing the word and replacing it with the user’s input.
//It will find the index and length of the user-entered word.
//Prompt you for a replacement word.
//Replace the word in the sentence with your input and print the updated sentence.
