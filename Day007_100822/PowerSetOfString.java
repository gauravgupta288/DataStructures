package gg.Day007_100822;

public class PowerSetOfString {
    public static void main(String[] args) {
int n = 8;
        while(n>1){
            n =n/2;
        }
        powerSet("abc");
    }
    static void powerSet(String s) {
        String ch = "";
        powerSetRecursion(s, 0, ch);

    }
    static void powerSetRecursion(String s, int i, String ch) {
        if (i == s.length()) {
            System.out.print(" " + ch);
            return;
        }
        powerSetRecursion(s, i + 1, ch + s.charAt(i));
        powerSetRecursion(s, i + 1, ch);
    }

}
