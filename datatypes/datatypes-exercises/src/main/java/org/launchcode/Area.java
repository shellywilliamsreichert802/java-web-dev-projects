package org.launchcode;

//Add an import statement at the the top of the file to include Scanner:
import java.util.Scanner;
public class Area {
    public static void main(String[] args) {

        //Add a Scanner object to handle the user’s input.
        Scanner scanner = new Scanner(System.in);
        //Add a print line to prompt the user for the length of the rectangle.
        System.out.println("Enter the length of the rectangle:");
        //Define a variable to handle the user’s response. Now is the time to know what type the dimension will be.
        double length = scanner.nextDouble();
        //prompt the user for the width of the rectangle
        System.out.print("Enter the width of the rectangle: ");
        double width = scanner.nextDouble();
        //Use the length and width values to calculate the rectangle’s area.
        double area = length * width;
        //Print a statement using concatenation to communicate to the user what the area of their rectangle is.
        System.out.println("Area of the rectangle is: " + area);
    }
}
