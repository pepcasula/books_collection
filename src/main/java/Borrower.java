import java.util.ArrayList;

public class Borrower {

    private String name;
    private ArrayList<Books> collection;
    private int capacity;

    public Borrower(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<Books>();
    }

    public void borrowFromLibrary(Library library, Books book){
        library.removeBook(book);
        this.collection.add(book);
    }

    public int countMyBooks(){
        return this.collection.size();
    }
}
