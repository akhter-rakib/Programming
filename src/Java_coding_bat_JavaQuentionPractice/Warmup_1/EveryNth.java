package Java_coding_bat_JavaQuentionPractice.Warmup_1;

/*Given a non-empty string and an int N, return the string made starting with char 0,
        and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ...
        and so on. N is 1 or more.
        everyNth("Miracle", 2) → "Mrce"
        everyNth("abcdefg", 2) → "aceg"
        everyNth("abcdefg", 3) → "adg"*/
public class EveryNth {
    public String everyNth(String str, int n) {
        String SelectedValue = "";
        for (int i = 0; i < str.length(); i += n) {
            SelectedValue += String.valueOf(str.charAt(i));
        }
        return SelectedValue;
    }

    public static void main(String[] args) {
        String SelectedValues = new EveryNth().everyNth("Miracle", 2);
        System.out.println("Selected Values ->" + SelectedValues);
    }
}
