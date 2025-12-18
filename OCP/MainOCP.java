package ict301.solid.ocp;

public class MainOCP {

    public static void main(String[] args) {

        DiscountCalculator calculator;

        calculator = new DiscountCalculator(new StudentDiscount());
        System.out.println("Student discount: " + calculator.calculateDiscount(1000));

        calculator = new DiscountCalculator(new VipDiscount());
        System.out.println("VIP discount: " + calculator.calculateDiscount(1000));

        calculator = new DiscountCalculator(new RegularDiscount());
        System.out.println("Regular discount: " + calculator.calculateDiscount(1000));
    }
}
