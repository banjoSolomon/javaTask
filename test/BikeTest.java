import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike myBike;

    @BeforeEach
    public void checkBike() {
        myBike = new Bike();
    }

    @Test
    public void testToCheckBikeIsOn() {
        assertFalse(myBike.checkPowerOn());
        myBike.turnOn();
        assertTrue(myBike.checkPowerOn());

    }

    @Test
    public void testToCheckBikeIsOff() {
        myBike.turnOff();
        assertFalse(myBike.checkPowerOn());
    }

    @Test
    public void testAccelerationWhenBikeISOff() {
       myBike.turnOff();
       assertEquals(0,myBike.acceleration());

    }

    @Test
    public void testAccelerationWithinGearRange() {
        myBike.turnOn();
        myBike.setGear(1);
        myBike.setCurrentSpeed(15);
        myBike.acceleration();
        assertEquals(16, myBike.getCurrentSpeed());

        myBike.setGear(2);
        myBike.setCurrentSpeed(24);        myBike.acceleration();

        assertEquals(26, myBike.getCurrentSpeed());

        myBike.setGear(3);
        myBike.setCurrentSpeed(35);        myBike.acceleration();

        assertEquals(38,myBike.getCurrentSpeed());


        myBike.setGear(4);
        myBike.setCurrentSpeed(44);        myBike.acceleration();

        assertEquals(48,myBike.getCurrentSpeed());

    }

    @Test
    public void testDecelerateWithin_GearRange(){
        myBike.turnOn();
        myBike.setGear(1);
        myBike.setCurrentSpeed(15);
        assertEquals(14,myBike.decelerate());

        myBike.setGear(2);
        myBike.setCurrentSpeed(24);
        assertEquals(22,myBike.decelerate());

        myBike.setGear(3);
        myBike.setCurrentSpeed(35);
        assertEquals(32,myBike.decelerate());

        myBike.setGear(4);
        myBike.setCurrentSpeed(44);
        assertEquals(40,myBike.decelerate());




    }
}