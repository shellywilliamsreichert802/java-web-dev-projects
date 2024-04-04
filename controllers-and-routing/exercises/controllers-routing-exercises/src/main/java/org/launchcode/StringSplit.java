package org.launchcode;
//
public class StringSplit {

//step 3 For this exercise, use the string “I would...mouse.” Use the split method to divide the string at each space and store the individual words in an array. If you need to review the method syntax, look back at the string methods table.
    public static void main(String[] args) {
//        // Given string
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");

//step4 Print the array of words to verify that your code works. The syntax is:
//        System.out.println(Arrays.toString(words)); DOES NOT WORK

//        // Print each word
        for (String word : words) {
            System.out.println(word);
        }
        String[] sentences = phrase.split("\\.");

//Repeat steps 3 and 4, but change the delimiter to split the string into separate sentences.
//        // Print each sentence
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}
