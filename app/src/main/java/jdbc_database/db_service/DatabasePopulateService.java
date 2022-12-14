package jdbc_database.db_service;

import jdbc_database.settings.Database;
import jdbc_database.settings.Prefs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabasePopulateService {
    public static void main(String[] args) throws IOException, SQLException {
        String initDbFileName = new Prefs().getPref(Prefs.INSERT_DATABASE);
        String sql = Files.readString(Paths.get(initDbFileName));

        Database database = Database.getInstance();

        Connection connection = database.getConnection();
        Statement st = connection.createStatement();
        st.executeUpdate(sql);
    }
}
