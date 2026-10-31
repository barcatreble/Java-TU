package zad2;

public class Main {
    static void main() {
        PaymentMethod[] payments = new PaymentMethod[6];
        payments[0] = new CashPayment();
        payments[1] = new CashPayment();
        payments[2] = new CardPayment();
        payments[3] = new CardPayment();
        payments[4] = new BankTransfer();
        payments[5] = new BankTransfer();

        double amount = 100.00;
        double fee = 0; double totalFee = 0;
        int i = 0;
        for(PaymentMethod payment : payments){
            i++;
            fee = payment.calculateFee(amount);
            System.out.printf("Payment Tax N%d: %.2f\n", i, fee);
            totalFee += fee;
        }

        System.out.printf("Total Payments Tax: %.2f", totalFee);
    }
}
