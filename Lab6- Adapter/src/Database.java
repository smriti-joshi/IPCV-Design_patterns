import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;
public class Database {
    ArrayList<ModernDatabase> books = new ArrayList<>();

    public void addToDatabase(ModernDatabase newBook) {
        books.add(newBook);
    }

    public void getInfoByTitle(String name) {
        boolean y = false;
        for (ModernDatabase o : books) {
            if (o.getTitle().equals(name)) {
                y = true;
                System.out.println(o.getAuthor()+"|"+ o.getTitle()+"|"+o.getLocation() );
            }
        }
        if(!y)
            System.out.println("Book is not in the database!");
    }
    public void getInfoByAuthor(String name) {
        boolean y = false;
        for (ModernDatabase o : books) {
            if (o.getAuthor().equals(name)) {
                y = true;
                System.out.println(o.getAuthor()+"|"+ o.getTitle()+"|"+o.getLocation() );
            }
        }
        if(!y)
            System.out.println("Book is not in the database!");
    }
    public void getInfoByLocation(String name) {
        boolean y = false;
        for (ModernDatabase o : books) {
            if (o.getLocation().equals(name)) {
                y = true;
                System.out.println(o.getAuthor()+"|"+ o.getTitle()+"|"+o.getLocation() );
            }
        }
        if(!y)
            System.out.println("Book is not in the database!");
    }
}
