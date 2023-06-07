import java.util.ArrayList;

public class Library {

    private ArrayList<Book> book;

    public Library(){
        this.book = new ArrayList<>();
    }

    public int bookCount(){
        return this.book.size();
    }

    public void addBook(Book book) {
        if(this.book.size() < 3) {
            this.book.add(book);
        }
    }

    public void checkOutBook(Book book) {
        this.book.remove(book);
    }
}
