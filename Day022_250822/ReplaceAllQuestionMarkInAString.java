package gg.Day022_250822;

import java.util.ArrayList;

public class ReplaceAllQuestionMarkInAString {
    public static void main(String[] args) {
        System.out.println(replaceQuestionMarkChar("????"));
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
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '?') {
                if(s.charAt(i+1) == '?'){
                    if ((s.charAt(i) - 1) == 'a') {
                        sb.insert(0, 'b');
                    } else {
                        sb.insert(0, 'a');
                    }
                }
                else if (i == 0) {
                    if ((s.charAt(i) + 1) == 'a') {
                        sb.insert(0, 'b');
                    } else {
                        sb.insert(0, 'a');
                    }
                }else if(i==s.length()-1){
                    if ((s.charAt(i) - 1) == 'a') {
                        sb.insert(i, 'b');
                    } else {
                        sb.insert(i, 'a');
                    }
                }else {
                    if ((s.charAt(i) - 1) != 'a' || (s.charAt(i) + 1) != 'a'  ) {
                        sb.insert(i, 'a');
                    }else if ((s.charAt(i) - 1) != 'b' || (s.charAt(i) + 1) != 'b'  ) {
                        sb.insert(i, 'b');
                    }else if ((s.charAt(i) - 1) != 'c' || (s.charAt(i) + 1) != 'c'  ) {
                        sb.insert(i, 'c');
                    }
                }

            }  else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }
}
