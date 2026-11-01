public class Order {
    private Payable p;
    public Order(Payable p){
        this.p = p;
    }

    public void checkout(){
        p.pay();
    }
}