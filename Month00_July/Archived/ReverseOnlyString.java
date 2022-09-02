package gg.Month00_July.Archived;

public class ReverseOnlyString {
    public static void main(String[] args) {
        System.out.println(reverseStringSol2("a-bC-dEf-ghIj"));
    }

    static String reverse(String s) {
        int len = s.length();

        Character ch[] = new Character[len];
        String s1 = "";
        for (int i = 0; i < len; i++) {
            if (!Character.isLetter(s.charAt(i))) {
                ch[i] = s.charAt(i);
            } else {
                s1 += s.charAt(i);
            }
        }

        int m = s1.length() - 1;
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == null) {
                ch[i] = s1.charAt(m--);
            }
        }
        String str = "";
        for (int i = 0; i < ch.length; i++) {
            str += ch[i];
        }
        return str;
    }

    static String reverseStringSol2(String str) {
        int s = 0;
        int e = str.length() - 1;
        StringBuilder sb = new StringBuilder(str);
        while (s <= e) {
            char ch1 = str.charAt(s);
            char ch2 = str.charAt(e);
            if (Character.isLetter(ch1) && Character.isLetter(ch2)) {
                sb.setCharAt(s++, ch2);
                sb.setCharAt(e--, ch1);
            } else if (!Character.isLetter(ch1)) {
                s++;
            } else if (!Character.isLetter(ch2)) {
                e--;
            }
        }
        return sb.toString();
    }
}
