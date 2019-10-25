package basic.hashCode;

public class HashCodeDemo {
    private int id;
    private String name;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static void main(String[] args) {
        HashCodeDemo demo2 = new HashCodeDemo();
        HashCodeDemo demo1 = new HashCodeDemo();

        System.out.println( demo2.hashCode());
        System.out.println( demo1.hashCode());
    }
}
