package gg.Month01_Aug.Day005_080822;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheString {
    public static void main(String[] args) {
        System.out.println(decodeString("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    static String decodeString(String key, String message) {
        Map<Character, Character> keys = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for (char ch : key.toCharArray()) {
            if (ch == ' ' || keys.containsKey(ch)) continue;
            keys.put(ch, (char) (97 + i++));
                if(i==26)break;
        }

        keys.put(' ', ' ');
        for(char ch:message.toCharArray()){
                sb.append(keys.get(ch));
        }
        return sb.toString();
    }

}
