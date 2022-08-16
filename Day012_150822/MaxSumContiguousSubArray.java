package gg.Day012_150822;

public class MaxSumContiguousSubArray {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{1, 2, 3, 4, -10}));
    }

    static int maxSum(int A[]) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            int sum = 0;
            for (int j = i; j < A.length; j++) {
                sum += A[j];
            }
            if (sum > maxSum) {
                maxSum = sum;
            }
        }

        return maxSum;
    }
}
