package iterator.sample;

import java.util.ArrayList;
import java.util.List;

public class BookShelf implements Aggregate {

    private List<Book> books;
//    private int last;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Book getBookAt(int index) {
        return books.get(index);
    }

    public int appendBook(Book book) {
        books.add(book);
//        return ++last;
        return books.size();
    }

    public int getLength() {
//        return last;
        return books.size();
    }
}
