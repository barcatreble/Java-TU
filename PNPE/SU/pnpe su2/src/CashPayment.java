public class CashPayment extends Payment{
    CashPayment(double amount) {
        super(amount);
        this.paymentMethod = "Plashtane v broi";
    }

    @Override
    public void pay() {
        System.out.println(getPaymentMethod());
        showAmount();
    }
}