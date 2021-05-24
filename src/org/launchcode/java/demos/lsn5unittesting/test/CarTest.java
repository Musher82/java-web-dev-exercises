package org.launchcode.java.demos.lsn5unittesting.test;
import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {

    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)

    @Before
    public void createCarObject() {
        Car test_car = new Car("Toyota", "Prius", 10, 50);
    }

    //TODO: constructor sets gasTankLevel properly

    @Test
    public void testInitialGasTank(){
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        assertTrue(test_car.getGasTankLevel() == 10);
    }
    //TODO: gasTankLevel is accurate after driving within tank range

    @Test
    public void testGasTankAfterDriving(){
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        test_car.drive(50);
        assertEquals(9, test_car.getGasTankLevel(), .001);
    }
    //TODO: gasTankLevel is accurate after attempting to drive past tank range

    @Test
    public void testGasTankAfterExceedingTankRange(){
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        test_car.drive(550);
        assertEquals(test_car.getGasTankLevel(), 0, .001);
    }

    //TODO: can't have more gas than tank size, expect an exception

    @Test(expected = IllegalArgumentException.class)
    public void testGasOverfillException(){
        Car test_car = new Car("Toyota", "Prius", 10, 50);
        test_car.addGas(5);
        fail("car cannot have more gas in tank than the size of the tank");
    }

}
