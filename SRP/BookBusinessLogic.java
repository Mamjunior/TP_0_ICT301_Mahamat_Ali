package ict301.solid.srp;

// Responsabilité : logique métier
public class BookBusinessLogic {

    public void emprunter(BookSRP book, String lecteur) {
        System.out.println("Emprunt du livre '" + book.getTitle() + "' par " + lecteur);
    }

    public void autreService(BookSRP book) {
        System.out.println("Autre traitement métier sur le livre '" + book.getTitle() + "'");
    }
}
