package zad2;

public class BankTransfer implements PaymentMethod{
    @Override
    public double calculateFee(double amount){
        return 1.50;
    }
}
