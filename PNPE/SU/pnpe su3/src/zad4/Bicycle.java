package zad4;

public class Bicycle extends SportsEquipment implements Reservable{
    private boolean available;
    Bicycle(String name){
        super(name);
        this.available = true;
    }

    @Override
    public int calculateRentalPrice(int days){
        return 15 * days;
    }

    @Override
    public void reserve(){
        if(!isAvailable()){
            throw new IllegalStateException("Koleloto veche e rezervirano!");
        }
        available = false;

    }

    @Override
    public void returnEquipment(){
        if(isAvailable()){
            throw new IllegalStateException("Koleloto veche e nalichno!");
        }
        available = true;
    }

    @Override
    public boolean isAvailable(){
        return available;
    }
}
