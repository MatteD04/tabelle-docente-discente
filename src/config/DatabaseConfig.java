package config;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DatabaseConfig {

    private static final String PROPERTIES_PATH = "src/resources/db.properties";

    public static Connection getConnection() {
        Properties props = new Properties();

        try (FileInputStream fis = new FileInputStream(PROPERTIES_PATH)) {
            props.load(fis);

            String url = props.getProperty("db.url");
            String user = props.getProperty("db.username");
            String password = props.getProperty("db.password");

            return DriverManager.getConnection(url, user, password);

        } catch (IOException | SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
