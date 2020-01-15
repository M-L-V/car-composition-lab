package vehicle;

import vehicle.carParts.Engine;
import vehicle.carParts.Tyres;

public abstract class Vehicle {

    protected Engine engine;
    protected Tyres tyres;
    protected double price;
    protected String colour;

    public Vehicle(double price, String colour){
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

    public void setPrice(double price) {
        this.price = price;
    }

    public void damage(double value){
        price -= value;
    };
}
