package zad4;

public class Vehicle {
    protected String brand;
    private int year;
    Vehicle(String brand, int year){
        this.brand = brand;
        this.year = year;
    }

    public void printVehicleInfo(){
        System.out.println("Marka:" + brand);
        System.out.println("Godina: " + year);
        System.out.println();
    }
}
