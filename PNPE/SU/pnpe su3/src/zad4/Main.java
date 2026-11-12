package zad4;

public class Main {
    static void main() {
        SportsEquipment[] equipments = new SportsEquipment[6];
        equipments[0] = new Bicycle("b1");
        equipments[1] = new Bicycle("b2");
        equipments[2] = new Bicycle("b3");
        equipments[3] = new Ski("s1");
        equipments[4] = new Ski("s2");
        equipments[5] = new Ski("s3");

        SportsEquipment minPrice = equipments[0];
        for(SportsEquipment e : equipments){
            System.out.println("Cena za naem za 2 dni: " + e.calculateRentalPrice(2));
            if(minPrice.calculateRentalPrice(2) > e.calculateRentalPrice(2)){
                minPrice = e;
            }
        }
        System.out.println("Predmet s nai-niska cena za naem: " + minPrice.calculateRentalPrice(2));

        Reservable[] reservableEquipment = new Reservable[6];
        for(int i = 0; i < equipments.length; i++){
            reservableEquipment[i] = (Reservable) equipments[i];
        }

        reservableEquipment[0].reserve();
        reservableEquipment[3].reserve();
        reservableEquipment[0].returnEquipment();
        System.out.println("Nalichni predmeti: ");
        for(int i = 0; i < reservableEquipment.length; i++){
            if (reservableEquipment[i].isAvailable()) {
                System.out.println(equipments[i]);
            }
        }

        try{
            reservableEquipment[3].reserve();
        }
        catch(IllegalStateException e){
            System.out.println("Predmetut ne e nalichen!");
        }

    }
}
