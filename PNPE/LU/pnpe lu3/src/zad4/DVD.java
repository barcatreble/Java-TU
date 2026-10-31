package zad4;

public class DVD extends LibraryItem implements Borrowable{
    int duration;
    boolean available;

    DVD(String title, int year, int duration) {
        super(title, year);
        this.duration = duration;
        this.available = true;
    }

    @Override
    public double calculateLateFee(int daysLate){
        return daysLate;
    }

    @Override
    public boolean isAvailable(){ return available; }

    @Override
    public void borrowItem(){
        if(available) available = false;
    }

    @Override
    public void returnItem(){
        available = true;
    }
}

