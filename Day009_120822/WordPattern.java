package gg.Day009_120822;

import java.util.HashMap;
import java.util.Objects;

public class WordPattern {
    public static void main(String[] args) {
        System.out.print(wordPattern("abc", "dog dog fish"));
    }

    static boolean wordPattern(String pattern, String s) {
        String list[] = s.split(" ");
        if (list.length != pattern.length()) return false;

        HashMap map1 = new HashMap<>();
        for (int i = 0; i < pattern.length(); i++) {
            if (!Objects.equals(map1.put(pattern.charAt(i), i), map1.put(list[i], i)))
                return false;
        }
        return true;
    }
}
