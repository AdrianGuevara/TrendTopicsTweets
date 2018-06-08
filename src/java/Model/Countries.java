package Model;

import java.util.AbstractCollection;
import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Cesar Granados
 */
public class Countries extends AbstractCollection<Country> {
    List<Country> countries = new ArrayList<>();
    
    public Countries() {
        countries.add(new Country("TopWorld", 1));
        countries.add(new Country("Alemania", 23424829));
        countries.add(new Country("Arabia Saudita", 23424938));
        countries.add(new Country("Argentina",	23424747));
        countries.add(new Country("Austria", 23424750));
        countries.add(new Country("Australia",	23424748));
        countries.add(new Country("Belgica", 23424757));
        countries.add(new Country("Brasil", 23424768));
        countries.add(new Country("Canada", 23424775));
        countries.add(new Country("Catar", 23424930));
        countries.add(new Country("Corea del sur", 23424868));
        countries.add(new Country("Dinamarca", 23424796));
        countries.add(new Country("Estados Unidos", 23424977));
        countries.add(new Country("Emiratos Arabes Unidos", 23424738));
        countries.add(new Country("España", 23424950));
        countries.add(new Country("Filipinas", 23424934));
        countries.add(new Country("Francia", 23424819));
        countries.add(new Country("Grecia", 23424833));
        countries.add(new Country("Guatemala", 23424834));
        countries.add(new Country("Mexico", 23424900));
        countries.add(new Country("India", 23424848));
        countries.add(new Country("Indonesia", 23424846));
        countries.add(new Country("Irlanda", 23424803));
        countries.add(new Country("Italia", 23424853));
        countries.add(new Country("Japon", 23424856));
        countries.add(new Country("Maldivas", 23424899));
        countries.add(new Country("Marruecos", 23424893));
        countries.add(new Country("Noruega", 23424910));
        countries.add(new Country("Nueva Zelanda", 23424916));
        countries.add(new Country("Peru", 23424919));
        countries.add(new Country("Portugal", 23424925));
        countries.add(new Country("Reino Unido", 23424975));
        countries.add(new Country("Rumania", 23424933));
        countries.add(new Country("Rusia", 23424936));
        countries.add(new Country("Singapur", 23424948));
        countries.add(new Country("Suiza", 23424957));
        countries.add(new Country("Tailandia", 23424960));
        countries.add(new Country("Venezuela", 23424982));
    }

    public int size() {
        return countries.size();
    }

    public Iterator<Country> iterator() {
        return countries.iterator();
    }

    @Override
    public Stream<Country> parallelStream() {
        return countries.parallelStream();
    }
}
