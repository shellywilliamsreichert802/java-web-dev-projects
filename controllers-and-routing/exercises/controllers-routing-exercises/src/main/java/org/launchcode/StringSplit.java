package org.launchcode;

public class StringSplit {
    public static void main(String[] args) {
        // Given string
        String phrase = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";
        String[] words = phrase.split(" ");
//        System.out.println(Arrays.toString(words));
        // Print each word
        for (String word : words) {
            System.out.println(word);
        }
        String[] sentences = phrase.split("\\.");
        // Print each sentence
        for (String sentence : sentences) {
            System.out.println(sentence);
        }
    }
}

