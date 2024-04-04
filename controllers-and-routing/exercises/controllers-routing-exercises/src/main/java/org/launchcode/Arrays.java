package org.launchcode;
//import java.util.Scanner;

public class Arrays {

    //Create and initialize an array with the following values in a single line: 1, 1, 2, 3, 5, 8.
    public static void main(String[] args) {
        // Create and initialize the array
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // Print all values in the array
        System.out.println("All values in the array:");
        for (int value : integerArray) {
            System.out.print(value + " ");
        }
        System.out.println(); // Print a newline

//Loop through the array and print out each value, then modify the loop to only print the odd numbers.
        // Print only the odd numbers
        System.out.println("Odd numbers in the array:");
        for (int value : integerArray) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
