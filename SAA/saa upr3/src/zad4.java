import java.util.Scanner;

public class zad4 {
    static boolean isInNumber(int digit, int num){
        if(num == 0){
            return false;
        }
        if(digit == num % 10){
            return true;
        }
        return isInNumber(digit, num/10);
    }

    static void main() {
        System.out.println("Proverka za nalichie na cifra v chislo");

        Scanner sc = new Scanner(System.in);
        System.out.print("Vuvedete cifra: ");
        int digit = Integer.parseInt(sc.next());
        System.out.print("Vuvedete chislo: ");
        int num = Integer.parseInt(sc.next());

        System.out.println("Nalichna li e cifrata v chisloto? " + isInNumber(digit, num));
    }
}
