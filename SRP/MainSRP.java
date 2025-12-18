package ict301.solid.srp;

public class MainSRP {

    public static void main(String[] args) {

        BookSRP book = new BookSRP(
                "Les principes SOLID",
                "Etudiants M1 GL",
                "Révision des principes SOLID"
        );

        BookPrinter printer = new BookPrinter();
        BookSaver saver = new BookSaver();
        BookBusinessLogic logic = new BookBusinessLogic();

        printer.printToScreen(book);
        saver.saveToDatabase(book);
        logic.emprunter(book, "Marcial");
    }
}
