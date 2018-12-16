package collection.Set;

import java.util.HashSet;
import java.util.Set;

public class BookDemo {
    public static void main(String[] args) {
        Set<Book> books = new HashSet<Book>();
        Book b1 = new Book(1, "baroMas", "rakib", "Unknown", 40);
        Book b2 = new Book(1, "ampata", "rakib hasan", "Unknown", 20);
        Book b3 = new Book(3, "seser kobita", "rakib kobir", "Unknown", 30);
        Book b4 = new Book(2, "amar gram", "khan", "Unknown", 10);
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);

        books.forEach(book -> {
            if (book.getId().equals(2)) {
                System.out.println("  " + book.getName());
            }
        });

        for (Book book : books) {
            System.out.println("*" + book.getName());
        }
    }
}
