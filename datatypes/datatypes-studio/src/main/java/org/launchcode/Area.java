package org.launchcode;
//
//import java.util.Scanner;
//
//    public class Area {
//        public static void main(String[] args) {
//            Scanner scanner = new Scanner(System.in);
//
//            System.out.print("Enter the radius of the circle: ");
////            double radius = scanner.nextDouble();
//
//            // Calculate the area using the formula A = π * r^2
//            //double area = Math.PI * Math.pow(radius, 2);
//
//            // Calculate the area using Circle.getArea(radius)
////            double area = Circle.getArea(radius);
//
//            String input = scanner.nextLine();
//
//            try {
//                double radius = Double.parseDouble(input);
//
//                if (radius < 0) {
//                    System.out.println("Error: Radius cannot be negative.");
//                } else {
//                    // Calculate the area using Circle.getArea(radius)
//                    double area = Circle.getArea(radius);
//                    System.out.println("The area of a circle with radius " + radius + " is: " + area);
//                }
//            } catch (NumberFormatException e) {
//                System.out.println("Error: Invalid input. Please enter a valid numeric value.");
//            }
//        }
//    }


import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double radius;
        do {
            System.out.print("Enter the radius of the circle: ");
            String input = scanner.nextLine();

            try {
                radius = Double.parseDouble(input);

                if (radius < 0) {
                    System.out.println("Error: Radius cannot be negative. Please try again.");
                } else {
                    // Calculate the area using Circle.getArea(radius)
                    double area = Circle.getArea(radius);
                    System.out.println("The area of a circle with radius " + radius + " is: " + area);
                }
            } catch (NumberFormatException e) {
                System.out.println("Error: Invalid input. Please enter a valid numeric value.");
                radius = -1; // Set a negative value to continue the loop
            }
        } while (radius < 0);
    }
}