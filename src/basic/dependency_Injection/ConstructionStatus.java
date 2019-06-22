package basic.dependency_Injection;

public class ConstructionStatus {
    public ConstructionStatus() {
        System.out.println("What is this");
    }

    public static void main(String[] args) {
        new ConstructionStatus();
    }
}
