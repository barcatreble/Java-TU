public abstract class Payment implements Payable{
    private double amount;
    protected String paymentMethod;

    public Payment(double amount){
        this.amount = amount;
    }

    public double getAmount() { return amount; }

    public String getPaymentMethod() { return paymentMethod; }

    public void showAmount() { System.out.println("Suma: " + getAmount()); }

    public abstract void pay();
}