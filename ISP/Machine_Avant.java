package ict301.solid.isp;

// Interface trop large (violation ISP)
public interface Machine_Avant {

    void print();
    void scan();
    void fax();
}

// Imprimante simple forcée d'implémenter des méthodes inutiles
class SimplePrinter implements Machine_Avant {

    @Override
    public void print() {
        System.out.println("Printing document...");
    }

    @Override
    public void scan() {
        throw new UnsupportedOperationException("Scan not supported");
    }

    @Override
    public void fax() {
        throw new UnsupportedOperationException("Fax not supported");
    }
}
