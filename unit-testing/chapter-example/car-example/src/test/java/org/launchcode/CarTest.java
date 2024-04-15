package org.launchcode;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.assertFalse;

import static org.junit.jupiter.api.Assertions.assertTrue;

class CarTest {
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest() {
        assertEquals(10, 10, .001);
    }
    //TODO: constructor sets gasTankLevel properly
    Car test_car;
    @BeforeEach
    public void createCarObject() {
        test_car = new Car("Toyota", "Prius", 10, 50);
    }
    @Test
    public void testInitialGasTank() {
//        Car test_car = new Car("Toyota", "Prius", 10, 50);
//        assertEquals(10, test_car.getGasTankLevel(), .001);
//    }

        //testInitialGasTank(), the assertFalse() method will pass if test_car.getGasTankLevel() == 0 is false, i.e., the gas tank level is not zero. If the gas tank level is zero, the test will fail. This is a good way to check that the initial gas tank level has been set correctly and is not zero.
//        assertFalse(test_car.getGasTankLevel() == 0);
//    }

        //testInitialGasTank(), the assertTrue() method will pass if test_car.getGasTankLevel() > 0 is true, i.e., the gas tank level is greater than zero. If the gas tank level is zero or less, the test will fail. This is a good way to check that the initial gas tank level has been set correctly and is greater than zero.
        assertTrue(test_car.getGasTankLevel() > 0);
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    @Test
    public void testGasTankLevel() {
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    @Test
    public void testGasTankAfterExceedingTankRange() {
        test_car.drive(555);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }
    //TODO: can't have more gas than tank size, expect an exception
    //TODO: can't have more gas than tank size, expect an exception
    @Test()
    public void testGasOverfillException() {
        assertThrows(IllegalArgumentException.class, () -> test_car.addGas(5), "Shouldn't get here, car cannot have more gas in tank than the size of the tank"
        );
    }
}