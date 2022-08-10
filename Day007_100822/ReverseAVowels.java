package gg.Day007_100822;

import java.util.HashSet;
import java.util.Set;

public class ReverseAVowels {
    public static void main(String[] args) {
        System.out.println(reverse("leetcode"));
    }

    static String reverse(String s) {
        StringBuilder sb = new StringBuilder(s);
        String vowels = "aeiouAEIOU";
        int i = 0;
        int e = s.length() - 1;

        while (i < e) {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(e);

            if (vowels.indexOf(ch1) != -1 && vowels.indexOf(ch2) != -1) {
                sb.setCharAt(i++, ch2);
                sb.setCharAt(e--, ch1);
            }
            if (vowels.indexOf(ch1) == -1) {
                i++;
            }
            if (vowels.indexOf(ch2) == -1) {
                e--;
            }
        }
        return sb.toString();
    }
}
