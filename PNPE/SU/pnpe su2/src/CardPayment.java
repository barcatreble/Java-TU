public class CardPayment extends Payment{
    CardPayment(double amount) {
        super(amount);
        this.paymentMethod = "Plashtane s karta";
    }

    @Override
    public void pay() {
        System.out.println(getPaymentMethod());
        showAmount();
    }
}