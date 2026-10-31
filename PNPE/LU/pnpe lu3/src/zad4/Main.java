package zad4;

public class Main {
    static void main() {
        LibraryItem[] items = {
                new Book("Pod igoto", 1894, "Ivan Vazov"),
                new Book("Tiutiun", 1951, "Dimitar Dimov"),
                new Book("Bai Ganyo", 1894, "Aleko Konstantinov"),
                new DVD("Inception", 2010, 148),
                new DVD("Matrix", 1999, 136),
                new DVD("Avatar", 2009, 162)
        };

        System.out.println("--- Taksa za prosrochie (pri 3 dni zakusnenie) ---");
        for (LibraryItem item : items) {
            double fee = item.calculateLateFee(3);
            System.out.println("Zaglavie " + item.title + " , Taksa: " + fee + " lv.");
        }
        System.out.println();

        Borrowable[] borrowableItems = {
                (Borrowable)items[0],
                (Borrowable)items[1],
                (Borrowable)items[2],
                (Borrowable)items[3],
                (Borrowable)items[4],
                (Borrowable)items[5]
        };

        borrowableItems[0].borrowItem();
        borrowableItems[3].borrowItem();
        borrowableItems[0].returnItem();

        System.out.println("--- Nalichnost ---");
        for (Borrowable item : borrowableItems) {
            LibraryItem libItem = (LibraryItem)item;
            System.out.println("Material: " + libItem.title + " | Nalichen: " + item.isAvailable());
        }
    }
}
