package zad5;

public abstract class Vehicle {
    private String brand;
    private int maxSpeed;

    public Vehicle(String brand, int maxSpeed){
        this.brand = brand;
        this.maxSpeed = maxSpeed;
    }

    public String getBrand() {
        return brand;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public abstract double calculateTripCost(double distance);
}
