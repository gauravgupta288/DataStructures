package gg.Day005_080822;

public class CheckPalindromeUsingRecursion {
    public static void main(String[] args) {
        System.out.println(palindrome("1100110011", 0));
    }

    static boolean palindrome(String str, int i) {

        if(i>str.length()/2) return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;

        return palindrome(str, i+1);
    }
}
