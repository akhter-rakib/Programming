package basic.Enum;

public enum Operation {
    PLUS,
    MiNUS,
    DIVIDE,
    MULTIPLE,
    ADMIN,
    USER;

    boolean isAdmin(String UserStatus){
        switch (this) {
            case ADMIN:
                return true;
            case USER:
                return false;
            default:
                throw new AssertionError("Unknown operations " + this);
        }
    }
    double calculation(double a, double b) {
        switch (this) {
            case PLUS:
                return a + b;
            case MiNUS:
                return a - b;
            case MULTIPLE:
                return a * b;
            case DIVIDE:
                return a / b;
            default:
                throw new AssertionError("Unknown operations " + this);
        }

    }
}


