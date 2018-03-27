package iterator.sample;

public class IteratorMain {

    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy Long Legs"));
        Iterator iterator = bookShelf.iterator();
        while (iterator.hasNext()){
            System.out.println(((Book) iterator.next()).getName());
        }
    }
}
