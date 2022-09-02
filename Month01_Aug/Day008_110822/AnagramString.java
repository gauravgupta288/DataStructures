package gg.Month01_Aug.Day008_110822;

import java.util.HashMap;
import java.util.Map;

public class AnagramString {
    public static void main(String[] args) {
        System.out.println(anagramStringSol2("abb", "bba"));
    }

    static boolean anagram(String s, String t) {
        int ch1[] = new int[26];

        for (int i = 0; i < s.length(); i++) {
            ch1[s.charAt(i) - 'a']++;
            ch1[t.charAt(i) - 'a']--;
        }
        for (int i : ch1) if (i != 0) return false;
        return true;
    }

    static boolean anagramStringSol2(String s, String t) {

        if (s.length() != t.length()) return false;
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
            map.put(t.charAt(i), map.getOrDefault(t.charAt(i), 0) - 1);
        }
        for (int i : map.values()) if (i != 0) return false;

        return true;
    }
}
