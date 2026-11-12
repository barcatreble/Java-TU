package zad4;

public abstract class SportsEquipment {
    private String name;
    SportsEquipment(String name){
        this.name = name;
    }

    public abstract int calculateRentalPrice(int days);

    public String getName() {
        return name;
    }
}
