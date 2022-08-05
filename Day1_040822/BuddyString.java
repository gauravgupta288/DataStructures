package gg.Day1_040822;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class BuddyString {
    public static void main(String[] args) {
        System.out.println(buddyStringSol2("ab", "ba"));
    }

    static boolean buddyStringSol1(String s, String goal) {
        if (s.length() != goal.length()) return false;
        int count = 0;
        int f1 = 0;
        boolean flag = false;
        int f2 = 0;
        Set<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != goal.charAt(i)) {
                if (count == 0) {
                    f1 = i;
                }
                else if (count == 1) {
                    f2 = i;
                }else {
                    return false;
                }
                count++;
            }
            if (set.contains(s.charAt(i))) {
                flag = true;
            }
            set.add(s.charAt(i));
        }
        if (count == 0 && !flag) {
            return false;
        }

        if (s.length() == 2) {
            if(s.charAt(0)==goal.charAt(1) && s.charAt(1)==goal.charAt(0)) return true;
            else return false;
        }
        if(s.charAt(f1)==goal.charAt(f2) && s.charAt(f2)==goal.charAt(f1))  return true;
        else return false;
    }

    static Boolean buddyStringSol2(String s, String goal) {
        if (s.length() != goal.length()) return false;
        ArrayList<Integer> rep = new ArrayList<>();
        Set<Character> set = new HashSet<>();
        if (s.equals(goal)) {
            for (char ch : s.toCharArray()) {
                if(set.contains(ch)){
                    return true;
                }else{
                    set.add(ch);
                }
            }
            return set.size() < goal.length();
        }
        for (int i = 0, j = s.length() - 1; i <= j; i++, j--) {
            if (s.charAt(i) != goal.charAt(i)){
                rep.add(i);
            } if(s.charAt(j) != goal.charAt(j)){
                rep.add(j);
            }

            if(rep.size()>2)return false;
        }

        return rep.size()==2 && s.charAt(rep.get(0)) == goal.charAt(rep.get(1)) && s.charAt(rep.get(1)) == goal.charAt(rep.get(0));
    }
}

