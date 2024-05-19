package HW21BookKeeper;
import java.util.ArrayList;


public class BooksMain {
    public static void main(String[] args) throws DuplicateBookException, InvalidYearException, BookNotFoundException {
        ArrayList<Book> books = new ArrayList<>();
        BooksMemory booksMemory = new BooksMemory(books);
        Book book1 = new Book();
        booksMemory.addBook("Вбивство у східному експресі","Агата Крісті",1934);
        booksMemory.addBook("Володар перснів", "Толкін", 1954);
        booksMemory.addBook("Гаррі Поттер","Ролінг", 1990);
        System.out.println(books);
        booksMemory.removeBook("Володар перснів", "Толкін");
        System.out.println(books);
        System.out.println(booksMemory.findBooksByAuthor("Агата Крісті"));
        System.out.println(booksMemory.indBooksByYear(1990));
    }
}