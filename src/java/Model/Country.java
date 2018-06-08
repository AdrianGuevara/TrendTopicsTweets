package Model;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;
import twitter4j.Trend;

/**
 *
 * @author Cesar Granados
 */
public class Country implements Iterable<Trend> {
    
    int id;
    String name;
    List<Trend> trends = new ArrayList<>();

    public Country(String name, int id) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public void addTrend(Trend trend) {
        trends.add(trend);
    }

    @Override
    public Iterator<Trend> iterator() {
        return trends.iterator();
    }

    public Stream<Trend> parallelStream() {
        return trends.parallelStream();
    }
}
