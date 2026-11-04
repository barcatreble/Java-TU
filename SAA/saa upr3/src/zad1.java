import java.util.Scanner;

public class zad1 {
    static void numberToBinary(int num){
        if(num > 1){
            numberToBinary(num / 2);
        }
        System.out.print(num % 2);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vuvedete estestveno chislo: ");
        int num = Integer.parseInt(sc.next());

        System.out.println("Dvoichno: ");
        numberToBinary(num);
    }
}
