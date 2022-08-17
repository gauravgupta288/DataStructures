package gg.Day014_170822;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.print(removeDupSol1("zvvo"));
    }

    static String removeDupSol0(String s) {
        HashMap<Character, Integer> map = new LinkedHashMap<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for (char ch : map.keySet()) {
            sb.append(ch);
        }

        return sb.toString();
    }static String removeDupSol1(String s) {
        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();
        for (char ch : s.toCharArray()) {
            set.add(ch);
        }

        for (char ch : set) {
            sb.append(ch);
        }

        return sb.toString();
    }
}
