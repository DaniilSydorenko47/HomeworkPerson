package HW21BookKeeper;

import java.io.IOException;
import java.util.ArrayList;


public class BooksMemory {
    private ArrayList<Book> books;
    private ArrayList<Book> smallBooks;// = new ArrayList<Book>();

    public BooksMemory(ArrayList<Book> books, ArrayList<Book> smallBooks) {
        this.books = books;
        this.smallBooks = smallBooks;
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
            smallBooks.add(new Book(title,author));
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
            int year = 0;
            for (Book book: books) {
                if (book.getTitle().equals(title) && book.getAuthor().equals(author)) {
                    year = book.getYear();
                }
                //Book book1 = new Book(title, author, year);
                if (book.getTitle().equals(title) && book.getAuthor().equals(author) && book.getYear() == year) {
                    books.remove(book);
                } else {
                    throw new BookNotFoundException("Книга з таким автором та назвою не знайдена");
                }
            }
        }

        catch (BookNotFoundException e){
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
        for(Book book: books){
            if (book.getYear()== year){
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