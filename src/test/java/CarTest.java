import org.junit.Test;
import vehicle.vehicleTypes.Car;

import static org.junit.Assert.assertEquals;

public class CarTest {

    private Car car;


    @Test
    public void testCar(){
        car = new Car(200.50, "pink");
        assertEquals(200.5, car.getPrice(), 0.01);
        assertEquals("pink", car.getColour());
    }

}
