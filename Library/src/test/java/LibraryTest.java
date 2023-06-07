import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Book book;
    private Library library;

    @Before
    public void before() {
        book = new Book("George Orwell", "Animal Farm", "Political Satire");
        library = new Library();
    }

    @Test
    public void canAddBookToLibrary(){
        library.addBook(book);
        assertEquals(1, library.bookCount());
    }

    @Test
    public void canBorrowBookFromLibrary(){
        library.addBook(book);
        library.checkOutBook(book);
        assertEquals(0, library.bookCount());
    }

    @Test
    public void thereIsNoMoreRoomAtTheInn(){
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        library.addBook(book);
        assertEquals(3, library.bookCount());
    }
}


