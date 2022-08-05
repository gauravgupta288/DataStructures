package gg.Day2_050822;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean buddyStrings(String s, String goal) {
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
}
