package gg.Month01_Aug.Day016_190822;

import java.util.HashMap;

public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.print(longestPalin("abccccdd"));
    }

    static int longestPalin(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int count = 0;
        boolean flag = false;
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (int i : map.values()) {
            if (i % 2 != 0) {
                count += i - 1;
                flag = true;
            } else {
                count += i;
            }
        }
        return flag ? count + 1 : count;
    }
}
