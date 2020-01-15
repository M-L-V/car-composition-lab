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
    private Customer customer;


    @Before
    public void before() {
        dealership = new Dealership(1000.00);
        car = new Car(250.50, "pink");
        electricCar = new ElectricCar(3000.50, "purple");
        customer = new Customer(500.00);
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

    @Test
    public void canSellToCustomer(){
        dealership.buy(car);
        dealership.sell(car, customer);
        assertEquals(1000, dealership.getTill(), 0.01);
        assertEquals(0, dealership.getStock().size());
        assertEquals(1, customer.getOwnedVehicles().size());
        assertEquals(249.50, customer.getMoney(), 0.01);
    }

    @Test
    public void cannotSellToCustomerNoneExistingCar(){
        dealership.sell(car, customer);
        assertEquals(1000, dealership.getTill(), 0.01);
        assertEquals(0, dealership.getStock().size());
        assertEquals(0, customer.getOwnedVehicles().size());
        assertEquals(500.0, customer.getMoney(), 0.01);
    }

    @Test
    public void cannotSellToCustomerNotEnoughMoney(){
        dealership.buy(electricCar);
        dealership.sell(electricCar, customer);
        assertEquals(1000, dealership.getTill(), 0.01);
        assertEquals(0, dealership.getStock().size());
        assertEquals(0, customer.getOwnedVehicles().size());
        assertEquals(500.0, customer.getMoney(), 0.01);
    }

    @Test
    public void canRepairVehicle(){
        car.damage(100.0);
        dealership.repair(car);
        assertEquals(250.5, car.getPrice(), 0.01);
        assertEquals(900.0, dealership.getTill(), 0.01);
    }

    @Test
    public void cannotRepairVehicleNotDamaged(){
        dealership.repair(car);
        assertEquals(250.5, car.getPrice(), 0.01);
        assertEquals(1000.0, dealership.getTill(), 0.01);
    }

    @Test
    public void cannotRepairVehicleTooExpensiveDamage(){
        electricCar.damage(2000.0);
        dealership.repair(electricCar);
        assertEquals(1000.50, electricCar.getPrice(), 0.01 );
        assertEquals(1000.0, dealership.getTill(), 0.01);
    }



}
