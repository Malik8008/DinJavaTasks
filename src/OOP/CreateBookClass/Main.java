package OOP.CreateBookClass;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();
        book.title="We learn Java";
        book.author="Huseyn Ahmedov";
        book.price=50;
        System.out.println("A constructor with no parameters: ");
        System.out.println("Book title is: "+book.title);
        System.out.println("Book author is: "+book.author);
        System.out.println("Book price is: "+book.price);

        Book book1 = new Book("We learn driving","Faxri Asadov",20);
        System.out.println("\nA constructor with all parameters: ");
        System.out.println(book1);

        Book book2 = new Book("I can fly","James Cameron");
        System.out.println("\nA constructor with only title and author: ");
        System.out.println(book2);
    }
}
