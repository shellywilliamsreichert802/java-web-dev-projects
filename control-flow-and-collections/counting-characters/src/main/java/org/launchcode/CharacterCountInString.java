package org.launchcode;

import java.util.*;

public class CharacterCountInString {
    public static void main(String[] args) {
        String inputString = "If the product of two terms is zero then common sense says at least one of the two terms has to be zero to start with. So if you move all the terms over to one side, you can put the quadratics into a form that can be factored allowing that side of the equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.\n" +
                "\n"; // Replace with your desired input string

        // Create a HashMap to store character counts
        HashMap<Character, Integer> charCountMap = new HashMap<>();

        // Convert the input string to a character array
        char[] strArray = inputString.toCharArray();

        // Loop through the array and update character counts
        for (char c : strArray) {
            if (charCountMap.containsKey(c)) {
                // Character already exists in the map, increment its count
                charCountMap.put(c, charCountMap.get(c) + 1);
            } else {
                // Character encountered for the first time, initialize its count
                charCountMap.put(c, 1);
            }
        }

        // Print the character and its frequency
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

