package jdbc_database.query_utils;

public class MaxProjectClient {
    private String name;
    private long project_count;


    public void setName(String name) {
        this.name = name;
    }

    public void setProject_count(long project_count) {
        this.project_count = project_count;
    }

    @Override
    public String toString() {
        return "MaxProjectClient{" +
                "name = '" + name + '\'' +
                ", project_count = " + project_count +
                '}';
    }
}
