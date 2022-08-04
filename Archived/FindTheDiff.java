package gg.Archived;


import java.util.ArrayList;
import java.util.Collections;

public class FindTheDiff {
    public static void main(String s[]) {
        System.out.print(findDifferenceSol3("abcde", "cdefab"));
    }

    static char findDiff(String s, String t) {
        char ch=0;
        ArrayList<Character> sList = new ArrayList<>();
        ArrayList<Character> tList = new ArrayList<>();

        for (int i = 0; i < s.length() ; i++) {
            sList.add(s.charAt(i));
        }
        for (int i = 0; i < t.length() ; i++) {
            tList.add(t.charAt(i));
        }
        Collections.sort(sList);
        Collections.sort(tList);

        int sLen = sList.size() - 1;
        int tLen = tList.size() - 1;

        int i = 0;

        while (i <= sLen && i <= tLen) {
            if (sList.get(i).equals(tList.get(i))) {
                if (sList.get(sLen).equals(tList.get(tLen))) {
                    i++;
                    sLen--;
                    tLen--;
                } else {
                    ch = tList.get(tLen);
                    break;
                }
            } else {
                ch = tList.get(i);
                break;
            }
        }
        return ch;
    }

    /**
     * Solve solution with xor operator which cancels the value if both are same
     * @param s first string
     * @param t second string
     */
    static char findDifference(String s, String t){
        char ch = 0;

        for(char c:s.toCharArray()){
            ch ^= c;
        }
        for(char c:t.toCharArray()){
            ch ^= c;
        }
        return ch;
    }
    static char findDifferenceSol3(String s, String t){
        char ch = 0;

        int sum1 = 0;
        int sum2 = 0;

        for(int i=0;i<s.length();i++){
            sum1 += s.charAt(i);
        }
        for(int j=0;j<t.length();j++){
            sum2 += t.charAt(j);
        }

        return (char)(sum2-sum1);

    }
}
