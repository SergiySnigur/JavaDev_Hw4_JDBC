package jdbc_database.db_service;

import jdbc_database.settings.Database;
import jdbc_database.settings.Prefs;
import jdbc_database.query_utils.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class DatabaseQueryService {

    public List<MaxSalaryWorker> findMaxSalaryWorker() throws IOException {
        List<MaxSalaryWorker> maxSalaryWorkers = new ArrayList<>();
        String maxSalaryWorkerFileName = new Prefs().getPref(Prefs.FIND_MAX_SALARY_WORKER_PATH_FILE);
        String selectSqlFile = Files.readString(Paths.get(maxSalaryWorkerFileName));

        Database database = Database.getInstance();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(selectSqlFile)) {
                while (rs.next()) {
                    MaxSalaryWorker maxSalaryWorker = new MaxSalaryWorker();
                    String name = rs.getString("name");
                    Long salary = rs.getLong("salary");
                    maxSalaryWorker.setName(name);
                    maxSalaryWorker.setSalary(salary);
                    maxSalaryWorkers.add(maxSalaryWorker);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return maxSalaryWorkers;
    }

    public List<LongestProject> findLongestProject() throws IOException {
        List<LongestProject> longestProjects = new ArrayList<>();
        String longestProjectFileName = new Prefs().getPref(Prefs.FIND_LONGEST_PROJECT_PATH_FILE);
        String selectSqlFile = Files.readString(Paths.get(longestProjectFileName));

        Database database = Database.getInstance();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(selectSqlFile)) {
                while (rs.next()) {
                    LongestProject longestProject = new LongestProject();
                    Long name = rs.getLong("name");
                    Integer month_count = rs.getInt("month_count");
                    longestProject.setName(name);
                    longestProject.setMonth_count(month_count);
                    longestProjects.add(longestProject);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return longestProjects;
    }

    public List<MaxProjectClient> findMaxProjectClient() throws IOException {
        List<MaxProjectClient> maxProjectClients = new ArrayList<>();
        String longestProjectFileName = new Prefs().getPref(Prefs.FIND_MAX_PROJECT_CLIENT_PATH_FILE);
        String selectSqlFile = Files.readString(Paths.get(longestProjectFileName));

        Database database = Database.getInstance();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(selectSqlFile)) {
                while (rs.next()) {
                    MaxProjectClient maxProjectClient = new MaxProjectClient();
                    String name = rs.getString("name");
                    long project_count = rs.getLong("project_count");
                    maxProjectClient.setName(name);
                    maxProjectClient.setProject_count(project_count);
                    maxProjectClients.add(maxProjectClient);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return maxProjectClients;
    }

    public List<ProjectPrices> printProjectPrices() throws IOException {
        List<ProjectPrices> projectPrices = new ArrayList<>();
        String longestProjectFileName = new Prefs().getPref(Prefs.PRINT_PROJECT_PRICES_PATH_FILE);
        String selectSqlFile = Files.readString(Paths.get(longestProjectFileName));

        Database database = Database.getInstance();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(selectSqlFile)) {
                while (rs.next()) {
                    ProjectPrices projectPrice = new ProjectPrices();
                    String id = rs.getString("name");
                    long prices = rs.getLong("price");
                    projectPrice.setName(id);
                    projectPrice.setPrice(prices);
                    projectPrices.add(projectPrice);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return projectPrices;
    }

    public List<YoungestEldestWorkers> findYoungestEldestWorkers() throws IOException {
        List<YoungestEldestWorkers> youngestEldestWorkers = new ArrayList<>();
        String longestProjectFileName = new Prefs().getPref(Prefs.FIND_YOUNGEST_ELDEST_WORKERS_PATH_FILE);
        String selectSqlFile = Files.readString(Paths.get(longestProjectFileName));

        Database database = Database.getInstance();

        try (Statement st = database.getConnection().createStatement()) {
            try (ResultSet rs = st.executeQuery(selectSqlFile)) {
                while (rs.next()) {
                    YoungestEldestWorkers youngestEldestWorker = new YoungestEldestWorkers();
                    Object type = rs.getString("type");
                    String name = rs.getString("name");
                    LocalDate birthday_date = LocalDate.parse(rs.getString("birthday_date"));
                    youngestEldestWorker.setType(type);
                    youngestEldestWorker.setName(name);
                    youngestEldestWorker.setBirthday(birthday_date);
                    youngestEldestWorkers.add(youngestEldestWorker);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return youngestEldestWorkers;
    }
}
