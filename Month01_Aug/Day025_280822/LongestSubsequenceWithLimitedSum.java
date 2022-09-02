package gg.Month01_Aug.Day025_280822;

import java.util.Arrays;

public class LongestSubsequenceWithLimitedSum {
    public static void main(String[] args) {
        System.out.println(longestSum(new int[]{4, 5, 2, 1}, new int[]{3, 10, 21}));
    }

    static int[] longestSum(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int sum = 0;
        int count = 0;
        int res[] = new int[queries.length];
        int k = 0;

        for (int i : queries) {
            for (int j : nums) {
                sum += j;

                if (sum > i) {
                    break;
                } else {
                    count++;
                }
            }
            res[k++] = count;
            count = 0;
            sum = 0;
        }

        return res;
    }
}
