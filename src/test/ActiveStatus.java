package test;

public enum ActiveStatus {
    ACTIVE(4),
    DELETE(5),
    RETIRED(8);
    private int value;

    ActiveStatus(int value) {
        this.value = value;
    }

    public int getActiveStatus() {
        return this.value;
    }

    public static void main(String[] args) {

        int count = 16;
        while (count > 15) {
            System.out.println("THis");
            count--;
        }
    }
}
