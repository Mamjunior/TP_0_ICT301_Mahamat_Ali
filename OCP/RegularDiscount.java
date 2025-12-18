package ict301.solid.ocp;

public class RegularDiscount implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.05;
    }
}
