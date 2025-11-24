package OOP.CreateBookClass;

import java.util.Objects;

public class Book {
    String title;
    String author;
    int price;

    public Book() {
    }

    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() {
        if (price == 0) {
            return "Book{title='" + title + "', author='" + author + "'}";
        }else {
            return "Book{" +
                    "title='" + title + '\'' +
                    ", author='" + author + '\'' +
                    ", price=" + price +
                    '}';
        }
    }
}
