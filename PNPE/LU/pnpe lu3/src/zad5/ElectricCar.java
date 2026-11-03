package zad5;

public class ElectricCar extends Vehicle implements Serviceable{
    public ElectricCar(String brand, int maxSpeed){
        super(brand, maxSpeed);
    }

    @Override
    public double calculateTripCost(double distance){
        return distance * (18 / 100.0) * 0.30;
    }

    @Override
    public void performService(){
        System.out.println("Обслужването е извършено!");
    }

    @Override
    public double getServiceCost(){ return 150.0; }
}
