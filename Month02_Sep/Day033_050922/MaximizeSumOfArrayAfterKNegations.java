package gg.Month02_Sep.Day033_050922;

import java.util.Arrays;

public class MaximizeSumOfArrayAfterKNegations {

    public static void main(String[] args) {
        System.out.println(maximize(new int[]{3, -1, 0, 2}, 3));
    }

    //TODO - incomplete
    static int maximize(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int sum = 0;
        int i;
        for (i = 0; i < nums.length - 1 && k > 0; i++) {
            if (Math.abs(nums[i]) < nums[i + 1]) {
                sum += -nums[i];
                k--;
            } else if (Math.abs(nums[i]) > nums[i + 1]) {
                sum += -nums[i];

            }

        }
        while (i < nums.length) {
            sum += nums[i++];
        }
        return sum;
    }
}
