package gg.Month03_Oct.Day058_271022;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BuddyString {
    public static void main(String[] args) {
        System.out.println(buddyString("abcd", "cbad"));
    }
    static boolean buddyString(String s, String goal){
        if(s.length() != goal.length()) return false;
        Set<Character> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        if(s.equals(goal)){
            for(char ch:s.toCharArray()){
                if(set.contains(ch)){
                    return true;
                }else{
                    set.add(ch);
                }
            }
        }
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) != goal.charAt(i)){
                list.add(i);
            }
            if(list.size()>2){
                return false;
            }
        }

        if(list.size()==2 && s.charAt(list.get(0)) == goal.charAt(list.get(1))  && s.charAt(list.get(1)) == goal.charAt(list.get(0))){
            return true;
        }
        return false;
    }
}
