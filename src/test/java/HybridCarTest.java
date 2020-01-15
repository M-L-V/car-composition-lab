import org.junit.Test;
import vehicle.vehicleTypes.HybridCar;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {

    private HybridCar hybridCar;

    @Test
    public void testHybridCar(){
        hybridCar = new HybridCar(350.20, "blue");
        assertEquals(350.2, hybridCar.getPrice(), 0.01);
        assertEquals("blue", hybridCar.getColour());
    }

    @Test
    public void damageCar(){
        hybridCar = new HybridCar(200.5, "pink");
        hybridCar.damage(100.0);
        assertEquals(100.5, hybridCar.getPrice(), 0.01);
    }

}
