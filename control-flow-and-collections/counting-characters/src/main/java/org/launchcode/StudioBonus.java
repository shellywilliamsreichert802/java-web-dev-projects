package org.launchcode;

//public class StudioBonus {

import java.util.*;

public class StudioBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine(); // Prompt the user to enter the string

        // Create a HashMap to store character counts (case-insensitive)
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to a character array
        char[] strArray = inputString.toCharArray();

        // Loop through the array and update character counts (excluding non-alphabetic characters)
        for (char c : strArray) {
            if (Character.isLetter(c)) { // Exclude non-alphabetic characters
                char lowercaseChar = Character.toLowerCase(c); // Make it case-insensitive
                charCountMap.put(lowercaseChar, charCountMap.getOrDefault(lowercaseChar, 0) + 1);
            }
        }

        // Print the character and its frequency
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

