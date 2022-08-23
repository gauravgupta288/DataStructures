package gg.Day016_190822;

public class MaxSumSubArray {
    public static void main(String[] args) {
System.out.print(maxSum(new int[]{1,2,3,-2,5}));
    }

    static int maxSum(int[] arr) {
        int maxSum = arr[0];
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];
            maxSum = Math.max(curSum, maxSum);
            curSum = Math.max(0, curSum);
        }
        return maxSum;
    }
}
