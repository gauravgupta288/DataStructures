package gg;

import java.util.Locale;

public class ValidPalindrome {
    public static void main(String s[]) {
System.out.println(validPalin("0P"));
    }

    static boolean validPalin(String s) {
        if(s.length()==2){
            if(s.charAt(0)!=s.charAt(1))return false;
        }
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {

            if (s.charAt(start) == ' ' || !((s.charAt(start)>=65&& s.charAt(start)<=90||(s.charAt(start)>=97&& s.charAt(start)<=122))) ) {
                start++;
                continue;
            } else if (s.charAt(end) == ' ' || !((s.charAt(end)>=65&& s.charAt(end)<=90||(s.charAt(end)>=97&& s.charAt(end)<=122)))) {
                end--;
                continue;
            } else if ((s.toLowerCase().charAt(start) != s.toLowerCase().charAt(end))) {
                return false;
            }else {
                start++;
                end--;
            }
        }
        return true;
    }
}
