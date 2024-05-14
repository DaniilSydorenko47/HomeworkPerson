package HW21BookKeeper;

import java.io.IOException;
import java.util.ArrayList;

public class BooksMemory {
    public ArrayList<Book> books = new ArrayList<Book>();

    public void addBook(String title, String author, int year)throws DuplicateBookException, InvalidYearException {
        for (Book book : books) {
            if (book.equals(new Book(title, author, year))) {
                throw new DuplicateBookException("Книга з такою назвою, автором та роком публікації вже існує");
            }
            if (year<0 || year >2024){
                throw new InvalidYearException("Книга не може мати рік публікації менше за 0 або більше за теперішній рік");
            }
        }
        books.add(new Book(title,author,year));
    }
    public void removeBook(String author, String title) throws BookNotFoundException{
        for (Book book: books){
            if (!book.getAuthor().equals(author) && !book.getTitle().equals(title)){
                throw new BookNotFoundException("Книга не знайдена");
            } else {
                books.remove(book);
            }
        }
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