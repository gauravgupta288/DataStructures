package gg.Day005_080822;

import java.util.HashMap;
import java.util.Map;

public class DecodeTheString {
    public static void main(String[] args) {
        System.out.println(decodeString("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
    }

    static String decodeString(String key, String message) {
        Map<Character, String> keys = new HashMap<>();
        StringBuilder sb = new StringBuilder();

        int i = 0;
        for (char ch : key.toCharArray()) {
            if (ch == ' ' || keys.containsKey(ch)) continue;
            keys.put(ch, String.valueOf((char) (97 + i++)));
                if(i==26)break;
        }

        for(char ch:message.toCharArray()){
            if(ch == ' '){
                sb.append(" ");
            }else{
                sb.append(keys.get(ch));
            }
        }
        return sb.toString();
    }

}
