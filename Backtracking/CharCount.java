package Backtracking;

import java.util.HashMap;
import java.util.Map;

public class CharCount {
    public static void main(String[] args) {
        String s = "abcdeabcz";

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : s.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1 );
        }

//        for(char ch : map.keySet()){
//            System.out.println(ch + " comes " + map.get(ch) + " times");
//        }

        int arr[] = new int[26];

        for(char ch : s.toCharArray()){
            arr[ch - 'a']++;
        }

        for(int i = 0; i < 26; i++){
            if(arr[i] > 0){
                System.out.println((char)('a' + i) + " comes " + arr[i] + " times");
            }
        }
    }
}
