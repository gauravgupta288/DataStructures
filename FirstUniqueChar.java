package gg;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueChar {
    public static void main(String s[]) {
        System.out.println(firstUniqueChar("leettccooddee"));
    }

    static int firstUniqueChar(String s) {

        char ch=0;
        for(int i=0;i<s.length();i++){
            ch ^= s.charAt(i);
        }

        return s.indexOf(ch);
    }
}
