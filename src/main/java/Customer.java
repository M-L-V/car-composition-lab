import vehicle.Vehicle;

import java.util.ArrayList;

public class Customer {


    private double money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(double money) {
        this.money = money;
        this.ownedVehicles = new ArrayList<Vehicle>();
    }

    public double getMoney() {
        return money;
    }

    public ArrayList<Vehicle> getOwnedVehicles() {
        return ownedVehicles;
    }
}
