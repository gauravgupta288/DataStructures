package gg.Month02_Sep.Day038_100922;

import java.util.ArrayList;
import java.util.List;

public class PrintWordsVertically {
    public static void main(String[] args) {
        printWordsVertically("TO BE OR NOT TO BE");
    }

    static List<String> printWordsVertically(String s) {
        List<String> list = new ArrayList<>();
        String str[] = s.split(" ");
        int k = 0;
        int maxLen = str[0].length();
        for (int i = 0; i < maxLen; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < str.length; j++) {
                maxLen = Math.max(maxLen, str[j].length());
                sb.append(k < str[j].length() ? str[j].charAt(k) : " ");
            }
            int len = sb.length() - 1;
            while (sb.charAt(sb.length() - 1) == ' ') {
                sb.deleteCharAt(len--);
            }
            k++;
            list.add(sb.toString());
        }
        return list;
    }
}
