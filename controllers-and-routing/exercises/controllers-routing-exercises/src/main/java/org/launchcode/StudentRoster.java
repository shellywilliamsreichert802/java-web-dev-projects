package org.launchcode;

///Make a program similar to GradebookHashMap that does the following:
//
//It takes in student names and ID numbers (as integers) instead of names and grades.
//The keys should be the IDs and the values should be the names.
//Modify the roster printing code accordingly.

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentRoster {
    private Map<Integer, String> roster;

    //The StudentRoster class uses a HashMap to store student information.
    public StudentRoster() {
        roster = new HashMap<>();
    }

    //The addStudent method allows you to add students by providing their ID and name.
    public void addStudent(int studentId, String studentName) {
        roster.put(studentId, studentName);
    }

    //The printRoster method displays the student roster with ID-number and name pairs.
    public void printRoster() {
        System.out.println("Student Roster:");
        for (Map.Entry<Integer, String> entry : roster.entrySet()) {
            int studentId = entry.getKey();
            String studentName = entry.getValue();
            System.out.println("ID: " + studentId + ", Name: " + studentName);
        }
    }

    public static void main(String[] args) {
        StudentRoster myRoster = new StudentRoster();
        Scanner scanner = new Scanner(System.in);

        // Example: Adding students
        myRoster.addStudent(101, "Alice");
        myRoster.addStudent(102, "Bob");
        myRoster.addStudent(103, "Charlie");

        // Example: Printing the roster
        myRoster.printRoster();
    }
}
