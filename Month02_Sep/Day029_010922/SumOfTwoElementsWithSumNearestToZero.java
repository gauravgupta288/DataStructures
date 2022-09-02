package gg.Month02_Sep.Day029_010922;

import java.util.Arrays;

public class SumOfTwoElementsWithSumNearestToZero {
    public static void main(String[] args) {
        System.out.println(sumOfTwo(new int[]{-21, -67, -37, -18, 4, -65}, 6));
    }

    static int sumOfTwo(int arr[], int n) {
        if (n < 2) return 0;
        Arrays.sort(arr);
        if (arr[0] >= 0) {
            return arr[1] + arr[0];
        } else if (arr[n - 1] < 0) {
            return (arr[n - 1] + arr[n - 2]);
        }
        int l = 0;
        int r = 0;
        int maxSum = Integer.MAX_VALUE;
        int curSum = 0;
        for (int i = 0; i < n; i++) {
            curSum = arr[l] + arr[r];

        }
        return maxSum;
    }
}
