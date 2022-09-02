package gg.Month01_Aug.Day022_250822;

import java.util.ArrayList;

public class ReplaceAllQuestionMarkInAString {
    public static void main(String[] args) {
        System.out.println(replaceQuestionMarkChar("cd?a?"));
    }

    static String replace(String s) {
        int arr[] = new int[26];
        StringBuilder sb = new StringBuilder();
        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '?') {
                arr[s.charAt(i) - 'a']++;
                sb.append(s.charAt(i));
            } else {
                list.add(i);
            }
        }
        int i = 0;
        int m = 0;
        while (i < arr.length && m < list.size()) {
            if (arr[i] == 0) {
                int index = list.get(m);
                sb.insert(index, (char) (97 + i));
                m++;
            }
            i++;
            if (i == 25) i = 0;
        }
        return sb.toString();
    }

    static String replaceQuestionMarkChar(String s) {
        char ch[] = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == '?') {
                for (int j = 0; j < 3; j++) {
                    if (i > 0 && ch[i - 1] - 'a' == j) continue;
                    if (i + 1 < s.length() && ch[i + 1] - 'a' == j) continue;
                    ch[i] = (char)('a' + j);
                    break;
                }
            }
        }

        return String.valueOf(ch);
    }
}
