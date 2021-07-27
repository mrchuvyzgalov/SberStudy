package ru.sbrf;

import java.sql.*;

public class Main {
    private static final String URL = "jdbc:h2:mem:h2db";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) throws SQLException {
        Driver driver = new org.h2.Driver();
        DriverManager.registerDriver(driver);

        try (Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD); Statement statement = connection.createStatement()) {
            statement.executeUpdate("CREATE TABLE species ( "
                    + "id INTEGER PRIMARY KEY, "
                    + "name VARCHAR(255), "
                    + "num_acres DECIMAL)");
            statement.executeUpdate("CREATE TABLE animal ( "
                    + "id INTEGER PRIMARY KEY, "
                    + "species_id integer, "
                    + "name VARCHAR(255), "
                    + "date_born TIMESTAMP)");
            statement.executeUpdate("INSERT INTO species VALUES (1, 'African Elephant', 7.5)");
            statement.executeUpdate("INSERT INTO species VALUES (2, 'Zebra', 1.2)");
            statement.executeUpdate("INSERT INTO animal VALUES (1, 1, 'Elsa', '2001-05-06T02:15')");
            statement.executeUpdate("INSERT INTO animal VALUES (2, 2, 'Zelda', '2002-08-15T09:12')");
            statement.executeUpdate("INSERT INTO animal VALUES (3, 1, 'Ester', '2002-09-09T10:36')");
            statement.executeUpdate("INSERT INTO animal VALUES (4, 1, 'Eddie', '2010-06-08T01:24')");
            statement.executeUpdate("INSERT INTO animal VALUES (5, 2, 'Zoe', '2005-11-12T03:44')");

            try (PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM species WHERE id=?")) {
                preparedStatement.setInt(1,1);
                print(preparedStatement.executeQuery());

                preparedStatement.setInt(1, 2);
                print(preparedStatement.executeQuery());
            }

            ResultSet rs = statement.executeQuery("SELECT id, name FROM species");
            while (rs.next()) {
                Object idObj = rs.getObject("id");
                Integer id = null;
                if (idObj instanceof Integer) {
                    id = (Integer)idObj;
                }

                Object nameObj = rs.getObject("name");
                String name = null;
                if (nameObj instanceof String) {
                    name = (String) nameObj;
                }

                System.out.println(id + " " + name);
            }
        }
    }

    private static void print(ResultSet rs) throws SQLException {
        while (rs.next()) {
            System.out.println(rs.getInt(1) + ": " + rs.getString(2) + " " + rs.getDouble(3));
        }
    }
}
