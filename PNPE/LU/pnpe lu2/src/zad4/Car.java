package zad4;

public class Car extends Vehicle{
    String model;
    int doors;
    Car(String brand, int year, String model, int doors){
        super(brand, year);
        this.model = model;
        this.doors = doors;
    }

    public void printCarInfo(){
        super.printVehicleInfo();
        System.out.println("Model: " + model);
        System.out.println("Broi vrati: " + doors);
        System.out.println();
    }
}
