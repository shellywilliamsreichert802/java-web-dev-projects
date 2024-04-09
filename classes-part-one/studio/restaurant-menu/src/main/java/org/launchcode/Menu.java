package org.launchcode;

// Menu class
class Menu {
    private List<MenuItem> menuItems;
    private LocalDateTime lastUpdated;

    // Default constructor
    public Menu() {
        menuItems = new ArrayList<>();
        lastUpdated = LocalDateTime.now();
    }

    // Add a menu item to the list
    public void addMenuItem(MenuItem menuItem) {
        menuItems.add(menuItem);
        lastUpdated = LocalDateTime.now();
    }

    // Getters (omitted for brevity)
}

// Example usage
public class RestaurantApp {
    public static void main(String[] args) {
        Menu restaurantMenu = new Menu();

        MenuItem appetizer = new MenuItem("Spring Rolls", 8.99, "Crispy rolls filled with veggies", Category.APPETIZER, true);
        MenuItem mainCourse = new MenuItem("Chicken Alfredo", 15.99, "Creamy pasta with grilled chicken", Category.MAIN_COURSE);
        MenuItem dessert = new MenuItem("Chocolate Lava Cake", 6.99, "Warm chocolate cake with a gooey center", Category.DESSERT);

        restaurantMenu.addMenuItem(appetizer);
        restaurantMenu.addMenuItem(mainCourse);
        restaurantMenu.addMenuItem(dessert);

        // Display menu or perform other operations
    }
}