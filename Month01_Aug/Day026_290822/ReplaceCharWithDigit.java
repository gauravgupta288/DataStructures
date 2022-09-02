package gg.Month01_Aug.Day026_290822;

public class ReplaceCharWithDigit {

    public static void main(String[] args) {
        System.out.println(replaceAll("a1b1c1"));
    }

    static String replaceAll(String s) {
        char ch[] = s.toCharArray();

        for (int i = 0; i < ch.length; i++) {
            if (Character.isDigit(ch[i])) {
                ch[i] = ((char)((ch[i-1]) + (ch[i] - '0')));
            }
        }
        return String.valueOf(ch);
    }
}
