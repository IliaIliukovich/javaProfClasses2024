package lesson20240703;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CityDAO implements WorldDAO<City, Integer>{

    private static final String GET_ALL = "SELECT * FROM city";
    private static final String GET_BY_ID = "SELECT * FROM city WHERE city.id = ?";
    private static final String SAVE_CITY = "INSERT INTO city (city.name, city.population, city.countrycode) VALUES (?, ?, ?)";
    private ConnectorDB connectorDB = new ConnectorDB();

    @Override
    public List<City> getAll() {
        List<City> cities = new ArrayList<>();
        try (
            Connection connection = connectorDB.makeConnection();
            Statement statement = connection.createStatement();
            ){
            ResultSet resultSet = statement.executeQuery(GET_ALL);
            while (resultSet.next()) {
                City city = getCityFromResultSet(resultSet);
                cities.add(city);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cities;
    }

    private City getCityFromResultSet(ResultSet resultSet) throws SQLException {
        City city = new City();
        city.setId(resultSet.getInt("ID"));
        city.setName(resultSet.getString("Name"));
        city.setCountryCode(resultSet.getString("CountryCode"));
        city.setPopulation(resultSet.getInt("Population"));
        return city;
    }

    @Override
    public City getById(Integer id) {
        try (
            Connection connection = connectorDB.makeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(GET_BY_ID);
        ){
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            City city = getCityFromResultSet(resultSet);
            return city;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public void save(City city) {
        try (
            Connection connection = connectorDB.makeConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(SAVE_CITY);
        ){
            preparedStatement.setString(1, city.getName());
            preparedStatement.setInt(2, city.getPopulation());
            preparedStatement.setString(3, city.getCountryCode());
            int updated = preparedStatement.executeUpdate();
            System.out.println("Update sucessfull: " + updated);
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void delete(Integer integer) {

    }

    @Override
    public void update(Integer integer) {

    }

    public void saveSpecialCities() {
        try (
                Connection connection = connectorDB.makeConnection();
                Statement statement = connection.createStatement();
        ){
           connection.setAutoCommit(false);
           statement.execute("INSERT INTO city (city.name, city.population, city.countrycode) VALUES ('SpecialCity1', 1, 'USA')");

            Savepoint savepoint = connection.setSavepoint();

            statement.execute("INSERT INTO city (city.name, city.population, city.countrycode) VALUES ('SpecialCity2', 1, 'USA')");

           try {
               System.out.println(1 / 0);
           } catch (ArithmeticException e) {
                connection.rollback(savepoint);
           }
           connection.commit();

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
