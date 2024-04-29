package org.launchcode;

import java.util.Comparator;

public class FlavorComparator implements Comparator<Flavor> {
    @Override
    public int compare(Flavor flavor1, Flavor flavor2) {
        // Compare Flavor objects by their names alphabetically
        return flavor1.getName().compareTo(flavor2.getName());

        // Compare Flavor objects by the number of allergens (descending order)
//        return Integer.compare(flavor2.getAllergens().size(), flavor1.getAllergens().size());
    }
}
