package zad2;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        DiscountPolicy[] discounts = {
                new StudentDiscount(),
                new StudentDiscount(),
                new WeekendDiscount(),
                new WeekendDiscount(),
                new NoDiscount(),
                new NoDiscount()
        };

        System.out.print("Vuvedete cena: ");
        double price = 0;
        try{
            price = sc.nextDouble();
        }
        catch(InputMismatchException e){
            System.out.println("Trqbva da vuvedete chislo!");
            return;
        }
        double totalDiscount = 0;
        int i = 0;
        for (DiscountPolicy d : discounts){
            double discount = d.calculateDiscount(price);
            System.out.printf("Namalenie %d: %.2f\n", discount);
            totalDiscount += discount;
            i++;
        }
        System.out.printf("Obshto namalenie: %.2f ", totalDiscount);
    }
}
