
package jdbc_database;

import jdbc_database.db_service.DatabaseQueryService;
import jdbc_database.query_utils.*;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class App {
    public static void main(String[] args) throws SQLException, IOException {
        List<LongestProject> longestProjects = new DatabaseQueryService().findLongestProject();
        System.out.println("longestProjects = " + longestProjects);

        List<MaxSalaryWorker> maxSalaryWorkers = new DatabaseQueryService().findMaxSalaryWorker();
        System.out.println("maxSalaryWorkers = " + maxSalaryWorkers);

        List<MaxProjectClient> maxProjectClients = new DatabaseQueryService().findMaxProjectClient();
        System.out.println("maxProjectClients = " + maxProjectClients);

        List<ProjectPrices> projectPrices = new DatabaseQueryService().printProjectPrices();
        System.out.println("projectPrices = " + projectPrices);

        List<YoungestEldestWorkers> youngestEldestWorkers = new DatabaseQueryService().findYoungestEldestWorkers();
        System.out.println("youngestEldestWorkers = " + youngestEldestWorkers);
    }
}
