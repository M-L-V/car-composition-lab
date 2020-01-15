package vehicle;

import vehicle.carParts.Engine;
import vehicle.carParts.Tyres;

public abstract class Vehicle {

    protected Engine engine;
    protected Tyres tyres;
    protected double price;
    protected String colour;
    protected double damage;

    public Vehicle(double price, String colour){
        this.engine = new Engine();
        this.tyres = new Tyres();
        this.price = price;
        this.colour = colour;
        this.damage = 0;
    }

    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }

    public void increasePrice(double increasePrice) {
        this.price += increasePrice;
    }

    public void damage(double damageValue){
        price -= damageValue;
        damage += damageValue;
    };
}
