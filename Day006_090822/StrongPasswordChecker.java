package gg.Day006_090822;

public class StrongPasswordChecker {
    public static void main(String[] args) {
System.out.println(passwordChecker("11A!A!Aa"));
    }

    static boolean passwordChecker(String s) {

        if (s.length() < 8) return false;
        boolean smallLtr = false;
        boolean upper = false;
        boolean digit = false;
        boolean specialChar = false;

        for (int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(i>0 &&  c == s.charAt(i-1)){
return false;
            }
            if(Character.isLowerCase(c)) smallLtr = true;
            else if(Character.isUpperCase(c)) upper = true;
            else if(Character.isDigit(c)) digit = true;
            else if(!Character.isAlphabetic(c) && !Character.isDigit(c)) specialChar = true;
        }

        return smallLtr && upper && digit && specialChar ;
    }
}
