package task19;

import java.util.*;

public interface CityProcessor {
    Optional<City> process(List<City> cities, Continent continent);
}
