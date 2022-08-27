package gg.Day023_260822;

import java.util.HashMap;

public class CountCommonWordsWithOneOccurrence {
    public static void main(String[] args) {
        System.out.println(countCommonWords(new String[]{"b","bb","bbb"}, new String[]{"amazing","leetcode","is"}));
    }

    static int countCommonWords(String[] words1, String[] words2) {
        int count = 0;
        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String word : words1) {
            map1.put(word, map1.getOrDefault(word, 0) + 1);
        }

        for (String word : words2) {
            map2.put(word, map2.getOrDefault(word, 0) + 1);
        }

        for (String str : map1.keySet()) {
            if(map1.get(str) == 1){
                if(map2.containsKey(str) && map2.get(str) == 1){
                    count++;
                }
            }
        }

        return count;
    }
}
