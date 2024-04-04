import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//BONUS: Instead of creating our own list of words, what if we want to use the string from the Array Practice section? Search “Java convert String to ArrayList” online to see how to split a string into the more flexible ArrayList collection.
public class WordPrinter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String inputSentence = scanner.nextLine();

        // Split the input sentence into words using space as the delimiter
        String[] wordsArray = inputSentence.split(" ");

        // Convert the array of words to an ArrayList
        List<String> wordList = new ArrayList<>(Arrays.asList(wordsArray));

        // Prompt the user to enter the desired word length
        System.out.print("Enter the desired word length: ");
        int desiredLength = scanner.nextInt();

        // Print words from the list that match the desired length
        printWordsByLength(wordList, desiredLength);
    }

    public static void printWordsByLength(List<String> wordList, int desiredLength) {
        for (String word : wordList) {
            if (word.length() == desiredLength) {
                System.out.println(word);
            }
        }
    }
}