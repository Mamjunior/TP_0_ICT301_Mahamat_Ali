package ict301.solid.srp;

// Responsabilité : persistance
public class BookSaver {

    public void saveToDatabase(BookSRP book) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' en base de données...");
    }

    public void saveToFile(BookSRP book, String filename) {
        System.out.println("Sauvegarde de '" + book.getTitle() + "' dans le fichier " + filename);
    }
}
