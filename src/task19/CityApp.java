package task19;

import java.util.*;


public class CityApp {
    public static void main(String[] args) {
        StringProcessor toUpperCase = String::toUpperCase;
        System.out.println(toUpperCase.process("hello world"));

        List<City> cities = Arrays.asList(
                new City(1, "Tokyo", 37000000, Continent.ASIA),
                new City(2, "Moscow", 12500000, Continent.EUROPE),
                new City(3, "New York", 8400000, Continent.NORTH_AMERICA),
                new City(4, "Sydney", 5000000, Continent.AUSTRALIA),
                new City(5, "Lagos", 9000000, Continent.AFRICA),
                new City(6, "São Paulo", 12000000, Continent.SOUTH_AMERICA)
        );

        CityProcessor mostPopulatedOnContinent = (cityList, continent) ->
                cityList.stream()
                        .filter(city -> city.continent == continent)
                        .max(Comparator.comparingInt(city -> city.population));

        Optional<City> mostPopulatedCity = mostPopulatedOnContinent.process(cities, Continent.EUROPE);
        mostPopulatedCity.ifPresent(city -> System.out.println("Самый густонаселенный город в Европе: " + city));

        CityProcessor leastPopulatedOnContinent = (cityList, continent) ->
                cityList.stream()
                        .filter(city -> city.continent == continent)
                        .min(Comparator.comparingInt(city -> city.population));

        Optional<City> leastPopulatedCity = leastPopulatedOnContinent.process(cities, Continent.EUROPE);
        leastPopulatedCity.ifPresent(city -> System.out.println("Город с минимальным населением в Европе: " + city));

        cities.stream()
                .max(Comparator.comparingInt(city -> city.population))
                .ifPresent(city -> System.out.println("Самый густонаселенный город: " + city));

        cities.stream()
                .min(Comparator.comparingInt(city -> city.population))
                .ifPresent(city -> System.out.println("Город с самым маленьким населением: " + city));

        cities.stream()
                .filter(city -> city.population > 1_000_000)
                .findFirst()
                .ifPresent(city -> System.out.println("Первый город с населением >1 млн: " + city));

        List<City> largeCities = cities.stream()
                .filter(city -> city.population > 1_000_000)
                .toList();
        System.out.println("Города с населением >1 млн.: " + largeCities);

        List<String> cityNames = cities.stream()
                .map(city -> city.name)
                .toList();
        System.out.println("Названия городов: " + cityNames);
    }
}
