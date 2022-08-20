package gg.Day016_190822;

public class MaxSumSubArray {
    public static void main(String[] args) {
System.out.print(maxSum(new int[]{5,4,-1,7,8}));
    }

    static int maxSum(int[] arr) {
        int maxSum = 0;
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            curSum += arr[i];

            if(curSum > maxSum){
                maxSum = curSum;
            }

            if(curSum<0){
                curSum = 0;
            }
        }
        return maxSum;
    }
}
