package lesson20240703;

import java.util.List;

public class WorldApp {

    public static void main(String[] args) {
        CityDAO cityDAO = new CityDAO();

        City city = cityDAO.getById(1);
        System.out.println(city);

        City newCity = new City(231431, "Dream City", "USA", 1);
        cityDAO.save(newCity);

        List<City> cities = cityDAO.getAll();
        cities.forEach(System.out::println);
    }



}
