package org.launchcode;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;

public class StudioSuperBonus {
    public static void main(String[] args) {
        try {
            // Read the input string from a file (replace with your file path)
            Path filePath = Path.of("path/to/your/input/file.txt");
            String inputString = Files.readString(filePath);

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
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
