import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String paymentMethod = sc.next();
        double amount = Double.parseDouble(sc.next());

        Payable payable = PaymentFactory.createPayment(paymentMethod, amount);
        Order order = new Order(payable);
        order.checkout();
    }
}