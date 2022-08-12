package gg.Day009_120822;

import java.util.HashMap;

public class WordPattern {
    public static void main(String[] args) {
        System.out.print(wordPattern("abc", "dog d fish"));
    }

    static boolean wordPattern(String pattern, String s) {
        String list[] = s.split(" ");
        if (list.length != pattern.length()) return false;

        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {
            if (map1.containsKey(pattern.charAt(i))) {
                if (map2.containsKey(list[i])) {
                    int a = map2.get(list[i]);
                    int b = map1.get(pattern.charAt(i));
                    if (a != b) {
                        return false;
                    }
                }else{
                    return false;
                }

            } else {
                if(map2.containsKey(list[i])){
                    return false;
                }
                map1.put(pattern.charAt(i), i);
                map2.put(list[i], i);
            }
        }
        return true;
    }
}
