package gg.Month02_Sep.Day038_100922;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        System.out.println(countNumbers("abc", new String[]{"a","b","c","ab","ac","bc","abc"}));
    }

    static int countNumbers(String allowed, String[] words) {
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            int j = 0;
            boolean flag = true;
            while (j < words[i].length()) {
                if (allowed.indexOf(words[i].charAt(j)) == -1) {
                    flag = false;
                    break;
                }
                j++;
            }
            if (flag) {
                count++;
            }
        }

        return count;
    }
}
