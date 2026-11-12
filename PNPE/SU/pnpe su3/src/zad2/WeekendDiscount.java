package zad2;

public class WeekendDiscount implements DiscountPolicy{
    @Override
    public double calculateDiscount(double price){
        return 0.15 * price;
    }
}
