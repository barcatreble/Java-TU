package zad5;

public class Main {
    static void main() {
        Vehicle[] vehicles = new Vehicle[6];
        vehicles[0] = new Car("Honda", 180);
        vehicles[1] = new Car("Mercedes", 200);
        vehicles[2] = new Car("Volkswagen", 190);
        vehicles[3] = new ElectricCar("Tesla", 190);
        vehicles[4] = new ElectricCar("Peugeot", 180);
        vehicles[5] = new ElectricCar("Hyundai", 180);

        //1
        for(Vehicle v : vehicles){
            double razhod = v.calculateTripCost(200);
            System.out.printf("Разход на %s с макс. скорост %dkm/h за 200км: %.2flv.\n", v.getBrand(), v.getMaxSpeed(), razhod);
        }
        System.out.println();

        //2
        Vehicle cheapest = vehicles[0];
        for(Vehicle v : vehicles){
            if(v.calculateTripCost(200) < cheapest.calculateTripCost(200)) cheapest = v;
        }
        System.out.printf("Превозно средство с най-нисък разход: %s (макс. скорост: %dkm/h) . Разход: %.2flv.\n", cheapest.getBrand(),  cheapest.getMaxSpeed(), cheapest.calculateTripCost(200));
        System.out.println();

        //3
        Serviceable[] serviceableVehicles = new Serviceable[6];
        for (int i = 0; i < vehicles.length; i++) {
            serviceableVehicles[i] = (Serviceable) vehicles[i];
        }

        //4
        for(Serviceable s : serviceableVehicles){
            s.performService();
            System.out.println("Цената на обслужването е: " + s.getServiceCost() + "lv.");
            System.out.println();
        }
    }
}
