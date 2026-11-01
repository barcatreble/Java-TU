public class PaymentFactory {
    static Payable createPayment(String type, double amount){
        switch(type) {
            case "card": return new CardPayment(amount);
            case "cash": return new CashPayment(amount);
            default: throw new IllegalArgumentException("Unknown payment type!");
        }
    }
}