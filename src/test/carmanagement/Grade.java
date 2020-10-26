package test.carmanagement;

public class Grade {
    private String name;

    Grade(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                '}';
    }
}
