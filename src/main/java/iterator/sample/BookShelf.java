package iterator.sample;

public class BookShelf implements Aggregate {

    private Book[] books;
    private int last;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public int appendBook(Book book) {
        books[last] = book;
        return ++last;
    }

    public int getLength() {
        return last;
    }
}
