public class HouseCat extends Cat {
    private String name;
    private String species = "Felis catus";

    public HouseCat(String aName, double aWeight) {
        super(aWeight); //This calls the Cat(double aWeight) constructor
        //super keyword allows the subclass to access the constructor from the base class
        name = aName;
    }
    public HouseCat(String aName) {
        name = aName;
    }

    public boolean isSatisfied() {
        return !isHungry() && !isTired();
    }

    @Override
    public String noise() {
        return "Hello, my name is " + name + "!";
    }
//    @Override
//    public String noise() {
//        String baseNoise = super.noise(); // Call the overridden method in the base class
//        return "Hello, my name is " + name + "! Base noise: " + baseNoise;
//    }
// calls the overridden method in the base class via super.noise()
    //super.noise() calls the noise() method defined in the Cat class. The noise() method in HouseCat then appends this base noise to its own noise. So, if you create a HouseCat object and call its noise() method, it will print both the noise from HouseCat and the noise from Cat
    public String purr() {
        return "I'm a HouseCat";
    }
}
