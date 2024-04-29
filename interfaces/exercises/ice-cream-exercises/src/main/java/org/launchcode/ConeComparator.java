package org.launchcode;

import java.util.Comparator;

//public class ConeComparator {
public class ConeComparator implements Comparator<Cone> {
    @Override
    public int compare(Cone cone1, Cone cone2) {
        // Compare Cones objects by their costs
        //FIX ERROR according to the interface, compare MUST return an integer value, but the cost fields are double type.
        //        return Double.compare(o1.getCost(), o2.getCost()); } }
//OR
        //use if/else if/else block to evaluate o1.getCost() - o2.getCost(). Return a positive integer, negative integer, or 0 depending on the result.
        if (cone1.getCost() - cone2.getCost() < 0){
            return -1;
        } else if (cone1.getCost() - cone2.getCost() > 0) {
            return 1;
        } else {
            return 0;
        }
    }
}

