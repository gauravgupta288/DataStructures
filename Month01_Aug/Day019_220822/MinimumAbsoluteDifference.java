package gg.Month01_Aug.Day019_220822;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumAbsoluteDifference {
    public static void main(String[] args) {
        minDifference(new int[]{1,3,6,10,15});
    }

    static List<List<Integer>> minDifference(int arr[]) {
        if (arr.length < 2) return null;
        List<List<Integer>> list = new ArrayList<>();
        Arrays.sort(arr);
        int minDiff = arr[1] - arr[0];

        for (int i = 1; i < arr.length - 1; i++) {
            minDiff = Math.min(minDiff, arr[i + 1] - arr[i]);
        }

        for (int i = 0; i < arr.length-1; i++) {
            if (minDiff == arr[i + 1] - arr[i]) {
                list.add(List.of(arr[i], arr[i + 1]));
            }
        }
        return list;
    }
}
