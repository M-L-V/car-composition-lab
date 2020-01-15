import vehicle.Vehicle;

import java.util.ArrayList;

public class Dealership {

    private double till;
    private ArrayList<Vehicle> stock;

    public Dealership(double till) {
        this.till = till;
        this.stock = new ArrayList<Vehicle>();
    }

    public double getTill() {
        return till;
    }

    public ArrayList<Vehicle> getStock() {
        return stock;
    }

    public void buy(Vehicle vehicle) {
        if (till >= vehicle.getPrice()){
            stock.add(vehicle);
            till -= vehicle.getPrice();
        }
    }

    public void sell(Vehicle vehicle, Customer customer) {
        if(stock.contains(vehicle)){
            customer.buy(vehicle);
            stock.remove(vehicle);
            till += vehicle.getPrice();
        }
    }
}
