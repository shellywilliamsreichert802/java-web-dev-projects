package org.launchcode;

import java.util.ArrayList;
import java.util.List;
import java.time.LocalDateTime;

// Enum to represent menu item categories
enum Category {
    APPETIZER,
    MAIN_COURSE,
    DESSERT
}

// MenuItem class
class MenuItem {
    private String name;
    private double price;
    private String description;
    private Category category;
    private boolean isNew;

    // Constructor without isNew parameter
    public MenuItem(String name, double price, String description, Category category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = false; // Default value
    }

    // Constructor with isNew parameter
    public MenuItem(String name, double price, String description, Category category, boolean isNew) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.isNew = isNew;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public Category getCategory() {
        return category;
    }

    public boolean isNew() {
        return isNew;
    }
}