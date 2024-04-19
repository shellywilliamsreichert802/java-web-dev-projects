public class Main {
    //HouseCat class is defined and it extends from the Cat class
    public static void main(String[] args) {
        // Create an instance of HouseCat
        HouseCat garfield = new HouseCat("Garfield", 12);

        // Call the eat method
        garfield.eat();

        // Check if Garfield is tired after eating
        System.out.println(garfield.isTired());   // prints true

// HouseCat extends Cat, meaning it inherits all of the fields and methods from Cat. When we create a new HouseCat, it calls the no-argument constructor of Cat (i.e., super()), which sets the weight to 13
        HouseCat spike = new HouseCat("Spike");
        System.out.println(spike.getWeight()); // prints 13


        //cheshireCat is an instance of HouseCat, so cheshireCat.noise() calls the noise() method defined in HouseCat. Bc HouseCat overrides the noise() method from Cat
        Cat plainCat = new Cat(8.6);
        HouseCat cheshireCat = new HouseCat("Cheshire", 12);
        System.out.println(plainCat.noise()); // prints "Meeeeeeooooowww!"
        System.out.println(cheshireCat.noise()); // prints "Hello, my name is Cheshire!"
    }
    //plainCat is an instance of Cat, so plainCat.noise() calls the noise() method defined in Cat. cheshireCat is an instance of HouseCat, so cheshireCat.noise() calls the noise() method defined in HouseCat. This is because HouseCat overrides the noise() method from Cat
}