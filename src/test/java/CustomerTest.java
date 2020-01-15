import org.junit.Before;
import org.junit.Test;
import vehicle.Vehicle;
import vehicle.vehicleTypes.HybridCar;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    private Customer customer;
    private Vehicle hybridCar;


    @Before
    public void before(){
        customer = new Customer(300.20);
        hybridCar = new HybridCar(150.20, "brown");
    }

    @Test
    public void hasMoney(){
        assertEquals(300.2, customer.getMoney(), 0.01);
    }

    @Test
    public void carCollectionStartsEmpty(){
        assertEquals(0, customer.getOwnedVehicles().size());
    }

}

