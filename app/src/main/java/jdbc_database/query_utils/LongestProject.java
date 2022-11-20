package jdbc_database.query_utils;

public class LongestProject {
    private long name;
    private int month_count;


    public void setName(Long name) {
        this.name = name;
    }

    public void setMonth_count(Integer month_count) {
        this.month_count = month_count;
    }

    @Override
    public String toString() {
        return "LongestProject{" +
                "name = " + name +
                ", month_count = " + month_count +
                '}';
    }
}
