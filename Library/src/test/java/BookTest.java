import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    private Book book;


    @Before
    public void before(){
        book = new Book("Zendaya", "Shake It Up", "Biography");
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Zendaya", book.getAuthor());
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Shake It Up", book.getTitle());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Biography", book.getGenre());
    }
}
