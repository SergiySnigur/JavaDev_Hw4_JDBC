package jdbc_database.query_utils;

public class ProjectPrices {
    private String name;
    private long price;

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(long prices) {
        this.price = prices;
    }

    @Override
    public String toString() {
        return "ProjectPrices{" +
                "name = " + name +
                ", prices = " + price +
                '}';
    }
}
