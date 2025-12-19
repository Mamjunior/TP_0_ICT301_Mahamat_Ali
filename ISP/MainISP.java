package ict301.solid.isp;

public class MainISP {

    public static void main(String[] args) {

        Printer simplePrinter = new SimplePrinter();
        simplePrinter.print();

        MultiFunctionPrinter mfp = new MultiFunctionPrinter();
        mfp.print();
        mfp.scan();
        mfp.fax();
    }
}
