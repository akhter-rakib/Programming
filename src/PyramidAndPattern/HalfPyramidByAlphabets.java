package PyramidAndPattern;

/*https://www.programiz.com/java-programming/examples/pyramid-pattern*/
public class HalfPyramidByAlphabets {
    public void halfPyramidByAlphabets(char alphabet, char lastChar) {
        for (int i = 0; i < lastChar - 'A' + 1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(alphabet + " ");
            }
            alphabet++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramidByAlphabets().halfPyramidByAlphabets('A', 'E');
    }
}
