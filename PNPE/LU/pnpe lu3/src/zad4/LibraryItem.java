package zad4;

public abstract class LibraryItem {
    String title;
    int year;

    LibraryItem(String title, int year){
        this.title = title;
        this.year = year;
    }

    public abstract double calculateLateFee(int daysLate);
}