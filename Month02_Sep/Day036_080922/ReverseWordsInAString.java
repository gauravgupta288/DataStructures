package gg.Month02_Sep.Day036_080922;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        System.out.println(reverseWord("Let's take LeetCode contest"));
    }

    static String reverseWord(String s) {

        StringBuilder sb = new StringBuilder();
        String str[] = s.split(" ");

        for (int i = 0; i < str.length; i++) {
            str[i] = reverse(str[i]);
        }
        return String.join(" ", str);
    }

    static String reverse(String str) {
        char chArr[] = str.toCharArray();
        int s = 0;
        int e = chArr.length - 1;

        while (s < e) {
            char ch = chArr[s];
            chArr[s] = chArr[e];
            chArr[e] = ch;
            s++;
            e--;
            ;
        }
        return String.valueOf(chArr);
    }
}
