package Model;

/**
 *
 * @author Cesar Granados
 */
public class Place {
    
    int id;
    String name;

    public Place(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
