package basic.Enum;

import java.util.EnumSet;

public enum BasicEnum {
    BLUE, GREEN, RED;

    BasicEnum() {

    }

    /*In the backend it converts to ----
        public static final BasicEnum GREEN = new BasicEnum();*/
    public static void main(String[] args) {
        BasicEnum value = BasicEnum.BLUE;
        //System.out.println(value);
        /*Enum iteration*/
        BasicEnum.values();
        for (BasicEnum color : BasicEnum.values()) {
            System.out.println(color);
        }
        /*Iterate Using forEach(): The forEach() method works on list or set. For using forEach() method,
         convert enum into list or set*/
        EnumSet.allOf(BasicEnum.class).forEach(
                color -> {
                    System.out.println("Fixed Color " + color);
                }
        );
    }
}
