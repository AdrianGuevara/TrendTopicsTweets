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
public class Places extends AbstractCollection<Place> {
    List<Place> places = new ArrayList<>();
    
    public Places() {
        places.add(new Place("TopWorld", 1));
        places.add(new Place("Alemania", 23424829));
        places.add(new Place("Arabia Saudita", 23424938));
        places.add(new Place("Argentina",	23424747));
        places.add(new Place("Austria", 23424750));
        places.add(new Place("Australia",	23424748));
        places.add(new Place("Belgica", 23424757));
        places.add(new Place("Brasil", 23424768));
        places.add(new Place("Canada", 23424775));
        places.add(new Place("Catar", 23424930));
        places.add(new Place("Corea del sur", 23424868));
        places.add(new Place("Dinamarca", 23424796));
        places.add(new Place("Estados Unidos", 23424977));
        places.add(new Place("Emiratos Arabes Unidos", 23424738));
        places.add(new Place("España", 23424950));
        places.add(new Place("Filipinas", 23424934));
        places.add(new Place("Francia", 23424819));
        places.add(new Place("Grecia", 23424833));
        places.add(new Place("Guatemala", 23424834));
        places.add(new Place("Mexico", 23424900));
        places.add(new Place("India", 23424848));
        places.add(new Place("Indonesia", 23424846));
        places.add(new Place("Irlanda", 23424803));
        places.add(new Place("Italia", 23424853));
        places.add(new Place("Japon", 23424856));
        places.add(new Place("Maldivas", 23424899));
        places.add(new Place("Marruecos", 23424893));
        places.add(new Place("Noruega", 23424910));
        places.add(new Place("Nueva Zelanda", 23424916));
        places.add(new Place("Peru", 23424919));
        places.add(new Place("Portugal", 23424925));
        places.add(new Place("Reino Unido", 23424975));
        places.add(new Place("Rumania", 23424933));
        places.add(new Place("Rusia", 23424936));
        places.add(new Place("Singapur", 23424948));
        places.add(new Place("Suiza", 23424957));
        places.add(new Place("Tailandia", 23424960));
        places.add(new Place("Venezuela", 23424982));
    }

    @Override
    public int size() {
        return places.size();
    }

    @Override
    public Iterator<Place> iterator() {
        return places.iterator();
    }

    @Override
    public Stream<Place> parallelStream() {
        return places.parallelStream();
    }
}
