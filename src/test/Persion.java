package test;

public class Persion {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.length() < 3) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name;
    }
}
