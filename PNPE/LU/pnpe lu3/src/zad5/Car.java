package zad5;

public class Car extends Vehicle implements Serviceable{
    public Car(String brand, int maxSpeed){
        super(brand, maxSpeed);
    }

    @Override
    public double calculateTripCost(double distance){
        return distance * (7 / 100.0) * 2.60;
    }

    @Override
    public void performService(){
        System.out.println("Обслужването е извършено!");
    }

    @Override
    public double getServiceCost(){ return 250.0 ; }
}
