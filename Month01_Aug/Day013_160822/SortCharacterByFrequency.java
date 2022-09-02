package gg.Month01_Aug.Day013_160822;

import java.util.HashMap;

public class SortCharacterByFrequency {
    public static void main(String[] args) {
        System.out.print(sortChar("cccaaa"));
    }

    static String sortChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char ch1 = '0';
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        while (!map.isEmpty()) {
            int max = 0;
            for (char ch : map.keySet()) {
                if (max < map.get(ch)) {
                    max = map.get(ch);
                    ch1 = ch;
                }
            }
            add(sb, ch1, max);
            map.remove(ch1);
        }
        return sb.toString();
    }

    static StringBuilder add(StringBuilder sb, char ch, int frequency) {
        for (int i = 0; i < frequency; i++) {
            sb.append(ch);
        }
        return sb;
    }
}
