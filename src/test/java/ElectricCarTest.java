import org.junit.Test;
import vehicle.vehicleTypes.ElectricCar;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {

    private ElectricCar electricCar;

    @Test
    public void testElectricCar(){
        electricCar = new ElectricCar(300.50, "green");
        assertEquals(300.5, electricCar.getPrice(), 0.01);
        assertEquals("green", electricCar.getColour());
    }

    @Test
    public void damageCar(){
        electricCar = new ElectricCar(200.5, "pink");
        electricCar.damage(100.0);
        assertEquals(100.5, electricCar.getPrice(), 0.01);
    }

}
