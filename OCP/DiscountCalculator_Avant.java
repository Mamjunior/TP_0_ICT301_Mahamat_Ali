package ict301.solid.ocp;

// Classe qui viole le principe OCP
public class DiscountCalculator_Avant {

    public double calculateDiscount(String customerType, double amount) {

        if (customerType.equals("STUDENT")) {
            return amount * 0.10;
        } else if (customerType.equals("VIP")) {
            return amount * 0.20;
        } else if (customerType.equals("REGULAR")) {
            return amount * 0.05;
        }

        return 0;
    }
}
