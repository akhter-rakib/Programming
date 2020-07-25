package basic;

import java.util.*;

public class AmazonExam {


    List<String> retrieveMostFrequentlyUsedWords(String helpText, List<String> wordsToExclude) {
        List<String> list = Arrays.asList(helpText.split(" "));
        Set<String> uniqueWords = new HashSet<String>(list);
        List<String> mostSearch = new ArrayList<>();

        for (String word : uniqueWords) {
            //System.out.println(word + "" + Collections.frequency(list, word));
            if (Collections.frequency(list, word) > 1) {
                // System.out.println("Getter than Onw == " + word);
                if (!wordsToExclude.contains(word)) {
                    mostSearch.add(word);
                }
            }
        }
        return mostSearch;
    }

    public static void main(String[] args) {
        String test = "Rose is a flower red rose are flower";
        List<String> ext = new ArrayList<>();
        ext.add("is");
        ext.add("are");
        ext.add("a");
        List<String> result = new AmazonExam().retrieveMostFrequentlyUsedWords(test, ext);
        System.out.println(result);

    }
}
