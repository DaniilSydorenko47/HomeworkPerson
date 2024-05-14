package HW21BookKeeper;

import java.util.ArrayList;

public class BooksMain {
    public static void main(String[] args) throws DuplicateBookException,InvalidYearException {
        BooksMemory booksMemory = new BooksMemory();
        try {
            booksMemory.addBook("Discovery","Some author", 2020);
            booksMemory.removeBook("Discovery","Some");
        } catch(DuplicateBookException e) {
            System.out.println(e.getMessage());
        } catch (InvalidYearException e) {
            System.out.println(e.getMessage());
        } catch (BookNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
