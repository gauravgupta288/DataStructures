package Month06_Jan.Day109_190123;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class WordsFormed {
    public static void main(String[] args) {
        System.out.println(countWords(new String[]{"hello","world","leetcode"}, "welldonehoneyr"));
    }

    static int countWords(String[] words, String chars){
        int count = 0;

        Map<Character, Integer> map = new HashMap<>();
        for(char ch : chars.toCharArray()){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }

        for(String s : words){
            Stack<Character> stack = new Stack<>();

            stack.eq
            Map<Character, Integer> imap = new HashMap<>();
            boolean flag = false;
            for(char ch : s.toCharArray()){
                imap.put(ch, imap.getOrDefault(ch, 0) + 1);
            }

            for(char ch : imap.keySet()){
                if(!map.containsKey(ch)){
                    flag = true;
                    break;
                }else {
                    if(map.get(ch) < imap.get(ch)){
                        flag = true;
                        break;
                    }
                }

            }
            if(!flag){
                count += s.length();
            }

        }
        return count;
    }
}
