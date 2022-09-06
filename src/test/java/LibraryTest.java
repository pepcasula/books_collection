import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Books book1;
    Books book2;
    Books book3;
    Books book4;
    Books book5;
    Library publicLibrary;
    Borrower myReadings;

    @Before
    public void setUp(){
        book1 = new Books("The Hitchhiker's Guide to the Galaxy", "Douglas Adams", "Fiction");
        book2 = new Books("The roaches have no king", "Daniel Evan Weiss", "Fiction");
        book3 = new Books("Bad Pharma", "Ben Goldacre", "Journalism");
        book4 = new Books("The Zen and the art of walking on the water", "Chris Jesus", "Biography");
        book5 = new Books("The 100 greatest Devil's Grip players of all times and their techniques", "Peppino Casula", "Sport");
        publicLibrary = new Library("Public Library", 4);
        myReadings = new Borrower("Peppino Casula", 2);
        publicLibrary.addBook(book1);
        publicLibrary.addBook(book2);
        publicLibrary.addBook(book3);
    }

    @Test
    public void canCountBooks(){
        assertEquals(3, publicLibrary.countBooks());
    }

    @Test
    public void canAddBook(){
        publicLibrary.addBook(book4);
        assertEquals(4, publicLibrary.countBooks());
    }

    @Test
    public void canCheckStockFull(){
        publicLibrary.addBook(book4);
        assertEquals("Stock is full, the book can't be added!", publicLibrary.addBook(book5));
    }

    @Test
    public void canRemoveBook(){
        publicLibrary.removeBook(book1);
        assertEquals(2, publicLibrary.countBooks());
    }

    @Test
    public void canBorrowBook(){
        myReadings.borrowFromLibrary(publicLibrary, book1);
        assertEquals(1, myReadings.countMyBooks());
    }
}
