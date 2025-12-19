package oop2.library;

public class Library {

    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }


    public void showAvailableBooks() {
        for (Book book : books) {
            if (book.isAvailable()) {
                System.out.println("," + book.getTitle());
            }
        }
    }
}
