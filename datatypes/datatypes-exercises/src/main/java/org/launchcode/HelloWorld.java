package org.launchcode;

//Add an import statement at the the top of the file to include Scanner:
import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {

        //Declare a variable of type Scanner called input:
        Scanner input = new Scanner(System.in);

        //Add a question to ask the user:
        System.out.println("Hello, what is your name:");

        //Create a variable to store the user’s response using the Scanner’s .nextLine() method
        String name = input.nextLine();

        //Use concatenation to print the greeting:
        System.out.println("Hello " + name);
    }
}
