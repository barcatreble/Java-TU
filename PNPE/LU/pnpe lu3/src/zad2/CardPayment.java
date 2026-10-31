package zad2;

public class CardPayment implements PaymentMethod{
    @Override
    public double calculateFee(double amount){
        return 0.02 * amount;
    }
}
