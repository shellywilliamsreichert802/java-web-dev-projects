package org.launchcode;
//import java.util.Scanner;

public class Arrays {
    public static void main(String[] args) {
        // Create and initialize the array
        int[] integerArray = {1, 1, 2, 3, 5, 8};

        // Print all values in the array
        System.out.println("All values in the array:");
        for (int value : integerArray) {
            System.out.print(value + " ");
        }
        System.out.println(); // Print a newline

        // Print only the odd numbers
        System.out.println("Odd numbers in the array:");
        for (int value : integerArray) {
            if (value % 2 != 0) {
                System.out.print(value + " ");
            }
        }
    }
}
