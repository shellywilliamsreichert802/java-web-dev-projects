package org.launchcode;

import java.util.ArrayList;

//public class EvenNumberSum {
//import java.util.ArrayList;
import java.util.List;

//Write a static method to find the sum of all the even numbers in an ArrayList. Within main, create a list with at least 10 integers and call your method on the list.
public class EvenNumberSum {

    public static int sumOfEvenNumbers(List<Integer> numbers) {
        int sum = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        // Create an ArrayList with at least 10 integers
        List<Integer> integerList = new ArrayList<>();
        integerList.add(2);
        integerList.add(5);
        integerList.add(10);
        integerList.add(2);
        integerList.add(5);
        integerList.add(10);
        integerList.add(7);
        integerList.add(4);
        integerList.add(8);
        integerList.add(3);
        integerList.add(6);
        integerList.add(9);
        integerList.add(12);
        // Add more integers as needed...

        // Calculate and print the sum of even numbers
        int evenSum = sumOfEvenNumbers(integerList);
        System.out.println("Sum of even numbers: " + evenSum);
    }
}

//
//    public static void main(String[] args) {
//        // Create an ArrayList with at least 10 integers/numbers interchangable?
//        ArrayList<Integer> integers = new ArrayList<>();
//        integers.add(2);
//        integers.add(5);
//        integers.add(10);
//        integers.add(7);
//        integers.add(4);
//        integers.add(8);
//        integers.add(3);
//        integers.add(6);
//        integers.add(9);
//        integers.add(12);
//
//        // Call the method to find the sum of even numbers
//        int evenSum = sumEven(integers);
//
//        // Print the result
//        System.out.println("Sum of even numbers: " + evenSum);
//    }
//
//        int total = 0;
//        for (int integer : arr) {
//            if (integer % 2 == 0) {
//                total += integer;
//            }
//        }
//        return total;
//    }
//}

