package zad1;

public class Book {
    private final String title;
    private final String author;
    private final int pages;

    Book(String title, String author, int pages){
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public void printInfo() {
        System.out.println("Zaglavie: " + title);
        System.out.println("Avtor: " + author);
        System.out.println("Broi stranici: " + pages);
        System.out.println();
    }
}
