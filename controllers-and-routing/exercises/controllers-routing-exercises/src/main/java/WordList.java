import java.util.List;
import java.util.Scanner;

//Write a static method to print out each word in a list that has exactly 5 letters.

//Modify your code to prompt the user to enter the word length for the search.
public class WordList {
//    public static void printFiveLetterWords(List<String> wordList) {
    public static void printWordsByLength(List<String> wordList, int desiredLength) {
    for (String word : wordList) {
//            if (word.length() == 5) {
        if (word.length() == desiredLength) {
                System.out.println(word);
            }
        }
    }

    public static void main(String[] args) {
        List<String> myWordList = List.of("apple", "banana", "grape", "melon", "kiwi", "pear");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the desired word length: ");
          int numChars = scanner.nextInt();
//        int length = scanner.nextInt();
//
        printWordsByLength(myWordList, numChars);
//
//        printFiveLetterWords(myWordList);
    }
}

