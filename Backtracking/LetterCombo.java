package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombo {
    static List<String> ans = new ArrayList<>();
    static List<String> list = new ArrayList<>();
    String digits = "2345";

    static Map<Character, String> map;

    public static void main(String[] args) {
        map = new HashMap<>();

        map.put('2', "abc");
        map.put('3', "def");
        map.put('4', "ghi");
        map.put('5', "jkl");
        map.put('6', "mno");
        map.put('7', "pqrs");
        map.put('8', "tuv");
        map.put('9', "wxyz");

        solve("23", 0, "");
        System.out.println(ans);
    }

    public static void solve(String digits, int index, String s){
        if(s.length() >= digits.length()){
            ans.add(s);
            return;
        }
        for(int i =0;i < map.get(digits.charAt(index)).length(); i++){
            char c = map.get(digits.charAt(index)).charAt(i);
            solve(digits, index + 1, s + c);
        }

        return;
    }
}
