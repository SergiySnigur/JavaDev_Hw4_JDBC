package jdbc_database.query_utils;

public class MaxSalaryWorker {
    private String name;
    private long salary;

    public void setName(String name) {
        this.name = name;
    }

    public void setSalary(long salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "MaxSalaryWorker{" +
                "name = '" + name + '\'' +
                ", salary = " + salary +
                '}';
    }
}
