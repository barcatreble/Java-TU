package zad4;

public class Book extends LibraryItem implements Borrowable{
    String author;
    boolean available;

    Book(String title, int year, String author){
        super(title, year);
        this.author = author;
        this.available = true;
    }

    @Override
    public double calculateLateFee(int daysLate){
        return 0.50 * daysLate;
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
