package gg.Month01_Aug.Day009_120822;

import java.util.ArrayList;

public class IsSubsequence {
    public static void main(String[] args) {
        System.out.print(isSubsequence("abc", "aahhbsdc"));
    }

    static boolean isSubsequence(String s, String t) {
        if(s.equals("")) return true;
        int index = 0;
        int i = 0;
        while (i<s.length() && index < t.length()){
            if(s.charAt(i)==t.charAt(index)){
                index++;
                i++;
            }else{
                index++;
            }
        }
        if(i!=s.length())return false;
        return true;
    }
}
