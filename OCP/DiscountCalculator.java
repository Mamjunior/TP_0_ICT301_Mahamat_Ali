package ict301.solid.ocp;

// Classe fermée à la modification
public class DiscountCalculator {

    private DiscountStrategy strategy;

    public DiscountCalculator(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double calculateDiscount(double amount) {
        return strategy.calculate(amount);
    }
}
