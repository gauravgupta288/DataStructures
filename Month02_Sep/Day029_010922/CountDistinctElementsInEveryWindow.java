package gg.Month02_Sep.Day029_010922;

import java.util.ArrayList;
import java.util.HashMap;

public class CountDistinctElementsInEveryWindow {
    public static void main(String[] args) {
        distinctElement(new int[]{1, 2, 1, 3, 4, 2, 3}, 7, 4);
    }

    static ArrayList<Integer> distinctElement(int arr[], int n, int k) {
        ArrayList<Integer> ans = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int i;
        for (i = 0; i < k; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        ans.add(map.size());
        for (; i < n; i++) {
            if (map.get(arr[i - k ]) == 1) {
                map.remove(arr[i - k]);
            } else {
                map.put(arr[i - k], map.get(arr[i - k]) - 1);
            }
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
            ans.add(map.size());
        }
        return ans;
    }
}
