package gg.Month01_Aug.Day011_140822;

import java.util.Arrays;

public class LongestPrefixInStringArray {
    public static void main(String[] args) {
        System.out.print(longestPrefix(new String[]{"geeksforgeeks", "geeks", "geek", "hgeezer"}, 4));
    }

    static String longestPrefix(String arr[], int n) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(arr);
        for (int i = 0; i < arr[0].length() && i< arr[n-1].length(); i++) {
            if(arr[0].charAt(i) != arr[n-1].charAt(i)){
                break;
            }else{
                sb.append(arr[0].charAt(i));
            }

        }
        return "".equals(sb.toString()) ? "-1" : sb.toString();
    }
}
