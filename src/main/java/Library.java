import java.awt.print.Book;
import java.util.ArrayList;

public class Library {

    private String name;
    private ArrayList<Books> collection;
    private int capacity;

    public Library(String name, int capacity){
        this.name = name;
        this.capacity = capacity;
        this.collection = new ArrayList<Books>();
    }

    public int countBooks(){
        return this.collection.size();
    }

    public String addBook(Books book){
        if (this.collection.size() < this.capacity){
            this.collection.add(book);
            return "Book Added";
        } else {
            return "Stock is full, the book can't be added!";
        }
    }

    public void removeBook(Books book){
        this.collection.remove(book);
    }
}
