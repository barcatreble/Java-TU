package zad4;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Yamaha", 2021);
        vehicle1.printVehicleInfo();

        Car kola1 = new Car("Mercedes", 2009, "CLS", 4);
        Car kola2 = new Car("BMW", 2023, "M3", 2);
        kola1.printCarInfo();
        kola2.printCarInfo();
    }
}
