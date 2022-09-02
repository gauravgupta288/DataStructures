package gg.Month01_Aug.Day023_260822;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class KthDistinctString {
    public static void main(String[] args) {
        System.out.println(kthDistinctString(new String[]{"d","b","c","b","c","a"}, 2));
        ;
    }

    static String kthDistinctString(String[] arr, int k) {
        HashMap<String, Integer> set = new LinkedHashMap<>();

        for (int i = 0; i < arr.length; i++) {
            set.put(arr[i], set.getOrDefault(arr[i], 0) + 1);
        }

        int i = 0;
        for (String word : set.keySet()) {
            if (set.get(word) == 1){
                if(k==i+1){
                    return word;
                }else{
                    i++;
                }
            }
        }
        return "";
    }
}
