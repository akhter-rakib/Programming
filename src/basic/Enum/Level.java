package basic.Enum;

public enum Level {
    BLUE, GREAN;

    public static void main(String[] args) {
        Level l = Level.BLUE;
        switch (l) {
            case GREAN:
                System.out.println("Hello This is Grean");
                break;
            case BLUE:
                System.out.println("THis is Blue");
                break;
            default:
                System.out.println("What is this");
        }
        System.out.println(l);
    }
}
