package gg.Archived;

import java.util.HashSet;
import java.util.Set;

public class FirstLetterApearTwice {
    public static void main(String s[]) {
        System.out.println(findFirst("eesll"));
    }

    static char apearTwice(String s) {
        char ch = '0';
        int min = s.length();
        Set<Character> set = new HashSet<>();
        int k = 0;
        for (int i = 0; i < s.length(); i++) {
            char cc = s.charAt(i);
            int n = s.substring(i + 1).indexOf(cc);
            if (!set.contains(cc) && n != -1) {
                if (k == 0) {
                    min = n + i + 1;
                    k++;
                }
                n = n + i + 1;
                if (n <= min) {
                    min = n;
                    ch = cc;
                }
            }
            set.add(cc);
        }
        return ch;
    }

    static char findFirst(String s) {
        Set<Character> map = new HashSet<>();
        char ch = '0';
        for (int i = 0; i < s.length(); i++) {

            if (map.contains(s.charAt(i))) {
                ch = s.charAt(i);
                break;
            } else {
                map.add(s.charAt(i));
            }
        }

        return ch;
    }
}
