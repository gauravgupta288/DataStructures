package Month04_Nov.Day087_291122;

import java.util.Arrays;

public class CountingWordsWithAGivenPrefix {
    public static void main(String[] args) {
        System.out.println(prefixCount(new String[]{"pay","attention","practice","attend"}, "at"));
    }

    static public int prefixCount(String[] words, String pref) {
        int count = 0;


        count = (int) Arrays.stream(words).filter(x -> x.startsWith(pref)).count();
        return count;
    }
}
