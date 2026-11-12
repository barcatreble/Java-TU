package zad4;

public class Ski extends SportsEquipment implements Reservable{
    private boolean available;
    Ski(String name){
        super(name);
        this.available = true;
    }

    @Override
    public int calculateRentalPrice(int days){
        return 25 * days;
    }

    @Override
    public void reserve(){
        if(!isAvailable()){
            throw new IllegalStateException("Skite veche sa rezervirani!");
        }
        available = false;

    }

    @Override
    public void returnEquipment(){
        if(isAvailable()){
            throw new IllegalStateException("Skite veche sa nalichni!");
        }
        available = true;
    }

    @Override
    public boolean isAvailable(){
        return available;
    }
}
