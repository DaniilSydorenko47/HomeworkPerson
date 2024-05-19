package HW21BookKeeper;
import java.util.ArrayList;

public class BooksMemory {
    private ArrayList<Book> books;

    public BooksMemory(ArrayList<Book> books) {
        this.books = books;
    }

    public void addBook(String title, String author, int year)throws DuplicateBookException, InvalidYearException {
        try {
            for (Book book : books) {
                if (book.equals(new Book(title, author, year))) {
                    throw new DuplicateBookException("Книга з такою назвою, автором та роком публікації вже існує");
                }
                if (year < 0 || year > 2024) {
                    throw new InvalidYearException("Книга не може мати рік публікації менше за 0 або більше за теперішній рік");
                }
            }
            books.add(new Book(title, author, year));
        } catch (DuplicateBookException e){
            System.out.println(e.getMessage());
        } catch(InvalidYearException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Exception");
        }
    }

    public void removeBook(String title, String author) throws BookNotFoundException {
        try {
            Book book = new Book(title,author);
            books.add(book);
            for (Book book1: books){
                if (book1.getBook().equals(book)){
                    books.remove(book1);
                    books.remove(book);
                }
            }
            if (books.contains(book)){
                throw new BookNotFoundException("Книга з таким автором та назвою не знайдена");
            }

        } catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println("Exception");
        }
    }

    public ArrayList<Book> findBooksByAuthor(String author){
        ArrayList<Book> booksByAuthor = new ArrayList<>();
        for(Book book: books){
            if (book.getAuthor().equals(author)){
                booksByAuthor.add(book);
            }
        }
        return booksByAuthor;
    }
    public ArrayList<Book> indBooksByYear(int year){
        ArrayList<Book> booksByYear = new ArrayList<>();
        for (Book book: books) {
            if (book.getYear() == year){
                booksByYear.add(book);
            }
        }
        return booksByYear;
    }
}

class DuplicateBookException extends Exception{
    private String message;
    public DuplicateBookException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}

class InvalidYearException extends Exception{
    private String message;
    public InvalidYearException(String message){
        this.message = message;
    }
    @Override
    public String getMessage() {
        return message;
    }
}

class BookNotFoundException extends Exception{
    private String message;

    public BookNotFoundException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}