package HW21BookKeeper;
import java.util.ArrayList;
import java.util.Arrays;

public class BooksMain {
    public static void main(String[] args) throws DuplicateBookException, InvalidYearException {
        ArrayList<Book> books = new ArrayList<>();
        BooksMemory booksMemory = new BooksMemory(books);
        Book book1 = new Book();

        try {
            booksMemory.addBook("Вбивство у східному експресі","Агата Крісті",1934);
            booksMemory.addBook("Володар перснів", "Толкін", 1954);
            booksMemory.addBook("Гобіт", "Толкін", 1937);
            System.out.println(books);
            System.out.println(booksMemory.findBooksByAuthor("Толкін"));
            System.out.println(booksMemory.indBooksByYear(1937));

            booksMemory.removeBook("Толкін", "Гобіт");
        } catch (DuplicateBookException e) {
            System.out.println(e.getMessage());
        } catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        } catch (InvalidYearException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Помилка");
        }
    }
}