package org.launchcode;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Case menu = new Case();
        ArrayList<Flavor> flavors = menu.getFlavors();
        ArrayList<Cone> cones = menu.getCones();

        // TODO: Use a Comparator class to sort the 'flavors' array alphabetically by the 'name' field.

        Comparator comparator = new FlavorComparator();
        flavors.sort(comparator);

//        flavors.sort(new FlavorComparator());
        System.out.println("Before - Sorted Flavors:");
        for (Flavor flavor : flavors) {
            System.out.println(flavor.getName());
        }
//            System.out.println("**********************");

//
//            // Print the sorted flavors
//        System.out.println("After - Sorted Flavors:");
//        for (Flavor flavor : flavors) {
//                System.out.println(flavor.getName());
//        }

        //Instead of declaring and initializing the comparator object, we could combine steps 1 and 2 above by using a single statement:
    //flavors.sort(new FlavorComparator());

        // TODO: Use a Comparator class to sort the 'cones' array in increasing order by the 'cost' field.
                // Create an instance of the ConeCostComparator
//                Comparator<Cone> costComparator = new ConeComparator();
//
//                System.out.println("Sorted Cones (by cost):");
//                for (Cone cone : cones) {
//                    System.out.println(cone.getName() + " - Cost: $" + cone.getCost());
//                }
//                System.out.println("**********************");
//
//        // Sort the cones array by cost (increasing order)
//                cones.sort(costComparator);
//
//                // Print the sorted cones (optional)
//                System.out.println("Sorted Cones (by cost):");
//                for (Cone cone : cones) {
//                    System.out.println(cone.getName() + " - Cost: $" + cone.getCost());
//                }
        // SEE ABOVE TODO: Print the 'flavors' and 'cones' lists (in a clear manner) to verify the sorting.
    }
}