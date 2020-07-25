package basic.Enum;

/*ou can add fields to a Java enum. Thus, each constant enum value gets these fields.
The field values must be supplied to the constructor of the enum when defining the constants. Here is an example:*/
public enum EnumConstructor {
    HIGH(3),  //calls constructor with value 3
    MEDIUM(2),  //calls constructor with value 2
    LOW(1)   //calls constructor with value 1
    ; // semicolon needed when fields / methods follow


    private final int levelCode;

    EnumConstructor(int levelCode) {
        this.levelCode = levelCode;
    }

    public int getLevelCode() {
        return this.levelCode;
    }
}
