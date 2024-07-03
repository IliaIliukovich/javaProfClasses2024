package lesson20240703;

import java.sql.*;

public class JdbcConnectionExample {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
//        Class.forName("com.mysql.cj.jdbc.Driver");

        try (
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world", "root", "root");
            Statement statement = connection.createStatement();
        ) {
            statement.setFetchSize(5);
            ResultSet resultSet = statement.executeQuery("select city.name, city.population from city");
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columnCount = metaData.getColumnCount();
//            System.out.println(resultSet.next());
            while (resultSet.next()) {
                for (int i = 1; i <= columnCount; i++) {
                    System.out.print(resultSet.getString(i) + ", ");
                }
                System.out.print("\n");
            }
        }
//          resultSet.close();
//          statement.close();
//          connection.close();
    }

}
