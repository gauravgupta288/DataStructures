package gg.Month02_Sep.Day038_100922;

public class CountTheNumberOfConsistentStrings {
    public static void main(String[] args) {
        System.out.println(countDistinctNumbersSol2("abc", new String[]{"a", "b", "c", "ab", "ac", "bc", "abc"}));
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

    static int countDistinctNumbersSol2(String allowed, String[] words) {
        int count = words.length;
        int arr[] = new int[26];
        for (int i = 0; i < allowed.length(); i++) {
            arr[allowed.charAt(i) - 'a']++;
        }

        for (int i = 0; i < words.length; i++) {
            int j = 0;
            while ( j < words[i].length()){
                if(arr[words[i].charAt(j)-'a'] == 0){
                    count--;
                    break;
                }
                j++;
            }
        }
        return count;
    }
}
