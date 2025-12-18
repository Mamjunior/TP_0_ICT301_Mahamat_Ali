package ict301.solid.ocp;

public class VipDiscount implements DiscountStrategy {

    @Override
    public double calculate(double amount) {
        return amount * 0.20;
    }
}
