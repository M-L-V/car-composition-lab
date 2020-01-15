import org.junit.Before;
import org.junit.Test;
import org.relaxng.datatype.DatatypeException;
import vehicle.Vehicle;
import vehicle.vehicleTypes.Car;
import vehicle.vehicleTypes.ElectricCar;

import static org.junit.Assert.assertEquals;

public class DealershipTest {

    private Dealership dealership;
    private Vehicle car;
    private Vehicle electricCar;


    @Before
    public void before() {
        dealership = new Dealership(1000.00);
        car = new Car(250.50, "pink");
        electricCar = new ElectricCar(3000.50, "purple");
    }


    @Test
    public void hasTill(){
        assertEquals(1000.00, dealership.getTill(), 0.01);
    }

    @Test
    public void stockStartsEmpty(){
        assertEquals(0, dealership.getStock().size());
    }

    @Test
    public void canBuyVehicle(){
        dealership.buy(car);
        assertEquals(1, dealership.getStock().size());
        assertEquals(749.50, dealership.getTill(), 0.01);
    }

    @Test
    public void cannotBuyCar(){
        dealership.buy(electricCar);
        assertEquals(0, dealership.getStock().size());
        assertEquals(1000.0, dealership.getTill(), 0.01);
    }



}
