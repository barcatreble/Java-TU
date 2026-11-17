import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception1 {
    public static void main(String[] args) {
        int number;
        boolean result = false;
        do{
            try{
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter an integer: ");
                number = sc.nextInt();
                int a = 100;
                System.out.printf("%d / %d = %d", a , number, division(a, number));
                result = true;
            }
            catch(InputMismatchException e){
                System.out.println("Greshka: " + e.getMessage());
            }
            catch(ArithmeticException e){
                System.out.println("Greshka: " + e.getMessage());
            }
            catch(Exception e){
                e.printStackTrace();
            }
        }
        while(!result);
    }

    static int division(int a, int num){
        return a / num;
    }
}