package org.launchcode;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Test out your Divide() function!
        try {
            int result = Divide(10, 2); // Example: 10 / 2
            System.out.println("Result: " + result);

            // Test division by zero
            int zeroResult = Divide(5, 0); // Attempt to divide by zero
            System.out.println("Result: " + zeroResult); // This line won't execute
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        HashMap<String, String> studentFiles = new HashMap<>();
        studentFiles.put("Carl", "Program.java");
        studentFiles.put("Brad", "");
        studentFiles.put("Elizabeth", "MyCode.java");
        studentFiles.put("Stefanie", "CoolProgram.java");

        // Test out your CheckFileExtension() function!
        for (String student : studentFiles.keySet()) {
            try {
                int points = CheckFileExtension(studentFiles.get(student));
                System.out.println(student + " received " + points + " points.");
            } catch (CustomFileException e) {
                System.out.println(student + ": " + e.getMessage());
            }
        }
    }

    public static void Divide(int x, int y) {
        // Write code here!
        try {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero!");
            }
            return x / y;
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
            return 0; // Return a default value (you can customize this)
        }
    }
//In the Divide method:
//We check if y is zero.
//If it is, we throw an ArithmeticException with a helpful message.
//Otherwise, we perform the division and return the result.
    public static int CheckFileExtension(String fileName)
    {
        // Write code here!
//        return 0; // Placeholder return value
        if (fileName == null || fileName.isEmpty()) {
            throw new CustomFileException("File name cannot be null or empty.");
        }

        if (fileName.endsWith(".java")) {
            return 1; // Student gets 1 point for .java file
        } else {
            return 0; // Student gets 0 points for other file types
        }
    }
}

class CustomFileException extends Exception {
    public CustomFileException(String message) {
        super(message);
    }
}
//In the CheckFileExtension method:
//We check if the fileName is null or empty. If so, we throw a custom exception (CustomFileException) with an appropriate message.
//If the fileName ends with “.java”, the student gets 1 point; otherwise, they get 0 points.


///***
// 1. HashMap for Student Files:
// You’ve created a HashMap called studentFiles to store student names as keys and their corresponding file names as values.
//For example:
//Carl submitted a file named “Program.java”.
//Brad hasn’t submitted any file (empty string).
//Elizabeth submitted a file named “MyCode.java”.
//Stefanie submitted a file named “CoolProgram.java”.
//2. Divide Function:
//You’ve declared a method called Divide that takes two integer parameters, x and y.
//The purpose of this function is not yet defined. You’ll need to add the actual implementation inside the method body.
//3. CheckFileExtension Function:
//You’ve also declared a method called CheckFileExtension that takes a String parameter called fileName.
//Similar to the Divide function, the implementation is missing. You’ll need to write code to check the file extension based on the provided fileName.