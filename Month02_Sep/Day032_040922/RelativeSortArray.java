package gg.Month02_Sep.Day032_040922;

import java.util.Map;
import java.util.TreeMap;

public class RelativeSortArray {
    public static void main(String[] args) {
        sortArray(new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19}, new int[]{2, 1, 4, 3, 9, 6});
    }

    static int[] sortArray(int[] arr1, int[] arr2) {
        Map<Integer, Integer> map = new TreeMap<>();
        int res[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            map.put(arr1[i], map.getOrDefault(arr1[i], 0) + 1);
        }
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            int count = map.get(arr2[i]);
            int k = 0;
            while (k < count) {
                res[j++] = arr2[i];
                k++;
            }
            map.remove(arr2[i]);
        }
        for (int i : map.keySet()) {
            int k = 0;
            int count = map.get(i);
            while (k < count) {
                res[j++] = i;
                k++;
            }
        }
        return res;
    }
}
