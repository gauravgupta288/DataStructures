package Month05_Dec.Day093_071222;

import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
    public static void main(String[] args) {
        System.out.println(countCharacters(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }

    static int countCharacters(String[] words, String chars) {
        int count = 0;
        int a[] = new int[26];


        for (char ch : chars.toCharArray()) {
            a[ch - 'a']++;
        }

        for (String word : words) {
            Map<Character, Integer> map = new HashMap<>();
            int wordCount = 0;
            for (char ch : word.toCharArray()) {
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }

            for(char ch : map.keySet() ){
                if(map.get(ch) <= a[ch - 'a']){
                    wordCount++;
                }
            }
            if(wordCount == map.size()){
                count += word.length();
            }

        }


        return count;
    }

}
