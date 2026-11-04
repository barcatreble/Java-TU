import java.util.Scanner;

public class zad2 {
    static int power(int x, int n){
        if(n > 0){
            return x * power(x, n-1);
        }
        else if (n == 0) {
            return 1;
        }
        else{
            return 1 / power(x, - n);
        }
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Vuvedete chislo: ");
        int x = Integer.parseInt(sc.next());

        System.out.print("Vuvedete stepen na chisloto: ");
        int n = Integer.parseInt(sc.next());

        System.out.printf("Chisloto %d na stepen %d e ravno na %d", x, n, power(x, n));
    }
}
