package ict301.solid.isp;

// Imprimante simple : imprime seulement
public class SimplePrinter implements Printer {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }
}
