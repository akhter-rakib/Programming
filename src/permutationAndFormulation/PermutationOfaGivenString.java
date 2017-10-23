package permutationAndFormulation;

/*A permutation, also called an “arrangement number” or “order,” is a rearrangement
        of the elements of an ordered list S into a one-to-one correspondence with
        S itself. A string of length n has n! permutation*/
/*http://www.geeksforgeeks.org/write-a-c-program-to-print-all-permutations-of-a-given-string/*/
public class PermutationOfaGivenString {
    private void permute(String str, Integer l, Integer r) {
        if (l == r)
            System.out.println(str);
        else {
            for (int i = l; i <= r; i++) {
                str = swap(str, l, r);
                permute(str, l + 1, r);
                str = swap(str, l, i);
            }
        }
    }

    public String swap(String a, int i, int j) {
        char temp;
        char[] charArray = a.toCharArray();
        temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }


    public static void main(String[] args) {
        String str = "ABC";
        Integer n = str.length();
        new PermutationOfaGivenString().permute(str, 0, n - 1);
    }
}
