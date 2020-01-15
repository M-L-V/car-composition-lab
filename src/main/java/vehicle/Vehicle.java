package vehicle;

import vehicle.carParts.Engine;
import vehicle.carParts.Tyres;

public abstract class Vehicle {

    private Engine engine;
    private Tyres tyres;
    private double price;
    private String colour;

    public void Vehicle(double price, String colour){
        this.engine = new Engine();
        this.tyres = new Tyres();
        this.price = price;
        this.colour = colour;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }


}
