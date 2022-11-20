package jdbc_database.query_utils;

import java.time.LocalDate;

public class YoungestEldestWorkers {
    private Object type;
    private String name;
    private LocalDate birthday_date;

    public void setType(Object type) {
        this.type = type;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthday(LocalDate birthday_date) {
        this.birthday_date = birthday_date;
    }

    @Override
    public String toString() {
        return "YoungestEldestWorkers{" +
                "type = " + type +
                ", name = '" + name + '\'' +
                ", birthday = " + birthday_date +
                '}';
    }
}
