package BookManagement;
import java.util.ArrayList;
import java.util.List;
public class Library {
    private List<Book> books;

    public Library(){
        books=new ArrayList<>();
    }

    public boolean addBook(Book book) {
        if (findBookByIsbn(book.getIsbn())) {  // 直接使用boolean结果
            return false;
        }
        books.add(book);
        return true;
    }

    public boolean findBookByIsbn(String isbn){
        return getBookByIsbn(isbn)!=null;
    }

    public List<Book> getAllBooks(){
        return new ArrayList<>(books);
    }

    public Book getBookByIsbn(String isbn) {
        for (Book book : books) {
            if (book.getIsbn().equals(isbn)) {
                return book;
            }
        }
        return null;
    }

    public boolean removeBookByIsbn(String isbn) {
        Book bookToRemove = getBookByIsbn(isbn);
        if (bookToRemove != null) {
            books.remove(bookToRemove);
            return true;
        }
        return false;
    }

    public int getBookCount() {
        return books.size();
    }
}
