package HW21BookKeeper;
import java.util.ArrayList;
import java.util.Arrays;

public class BooksMain {
    public static void main(String[] args) throws DuplicateBookException, InvalidYearException, BookNotFoundException {
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<Book> smallBooks = new ArrayList<>();
        BooksMemory booksMemory = new BooksMemory(books,smallBooks);
        Book book1 = new Book();
        booksMemory.addBook("Вбивство у східному експресі","Агата Крісті",1934);
        booksMemory.addBook("Володар перснів", "Толкін", 1954);
        booksMemory.addBook("Гобіт", "Толкін", 1937);
        System.out.println(books);
        booksMemory.removeBook("Гобіт", "Толкін");
        System.out.println(books);
//        System.out.println(booksMemory.findBooksByAuthor("Толкін"));
//        System.out.println(booksMemory.indBooksByYear(1937));

        //booksMemory.removeBook("Толкін", "Гобіт");

    }
}