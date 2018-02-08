package basic;

public class ConvartNumberInWord {
    public static void main(String[] args) {
        int number;
        number = 1234;
        int[] array = new int[4];

        for (int i = 0; number > 0; i++) {
            array[i] = (number % 10);
            number = (number / 10);
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("  " + array[i]);
        }

       /* Integer p = 123;
        String value = p.toString();
        System.out.println(value.length());
        for (int j = 0; j < value.length(); j++) {
            System.out.println(value.charAt(j));
        }*/

    }
}
