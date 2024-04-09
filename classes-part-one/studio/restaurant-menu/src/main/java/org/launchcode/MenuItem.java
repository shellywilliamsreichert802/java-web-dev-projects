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
//nd access levels for each class.
//
//Menu Class:
//Fields:
//menuItems: A list to store all menu items.
//lastUpdated: A timestamp indicating when the menu was last updated.
//Data Types:
//menuItems: List of MenuItem objects.
//lastUpdated: Date or timestamp.
//Access Levels:
//menuItems: Private (accessible only within the class).
//lastUpdated: Private (accessible only within the class).
//Constructors:
//Default constructor (no parameters).
//Constructor that initializes the menuItems list and sets the initial lastUpdated timestamp.
//MenuItem Class:
//Fields:
//name: Name of the menu item.
//price: Price of the menu item.
//description: Description of the menu item.
//category: Category of the menu item (appetizer, main course, or dessert).
//isNew: Boolean flag indicating whether the menu item is new.
//Data Types:
//name: String.
//price: Double (or BigDecimal for precise currency handling).
//description: String.
//category: Enum (e.g., Appetizer, MainCourse, Dessert).
//isNew: Boolean.
//Access Levels:
//All fields: Private (accessible only within the class).
//Constructors:
//Constructor that initializes all fields except isNew.
//Additional constructor that sets isNew based on a parameter (e.g., boolean isNew).
//Remember to add getter and setter methods for relevant fields as needed. These classes will form the foundation for managing your restaurant’s menu and menu items. 🍽️👨‍🍳