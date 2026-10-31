package zad2;

public class Main {
    public static void main(String[] args) {
        BankAccount smetka1 = new BankAccount("Georgi Ivanov", 2131232, 4321.21);
        BankAccount smetka2 = new BankAccount("Kiril Todorov", 321584992, 1452.33);

        System.out.println(smetka1.getOwner());
        System.out.println(smetka1.getAccountNumber());
        System.out.println(smetka1.getBalance());

        smetka2.setOwner("Georgi Ivanov");
        smetka2.setAccountNumber(42152151);
        smetka2.setBalance(4221.21);
    }
}
