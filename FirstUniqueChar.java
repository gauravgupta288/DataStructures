package gg;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FirstUniqueChar {
    public static void main(String s[]) {
        System.out.println(firstChar("aadadaadf"));
    }

    static int firstUniqueChar(String s) {

        List<Character> set = new ArrayList<>();
        Set<Character> set1 = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!set1.contains(s.charAt(i)) && !set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
            } else {
                set1.add(s.charAt(i));
                set.remove((Character) s.charAt(i));
            }
        }
        if (set.isEmpty()) return -1;
        return s.indexOf(set.get(0));
    }

    static int firstChar(String s) {
        Set<Character> ch = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            if (!ch.contains(s.charAt(i)) && s.substring(i + 1).indexOf(s.charAt(i)) == -1) {
                return i;
            } else {
                ch.add(s.charAt(i));
            }
        }
        return -1;
    }
}
