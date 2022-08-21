package gg.Day018_210822;

public class LargestRowSumIn2DArray {
    public static void main(String[] args) {
        System.out.println(largestSum(new int[][]{{1,2,3}, {4,5,6}, {7,8,9}}));
    }

    static int largestSum(int arr[][]) {
        int max = Integer.MIN_VALUE;
        int curSum = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                curSum += arr[i][j];
            }
            if(curSum>max){
                max = curSum;
            }
            curSum = 0;
        }

        return max;
    }
}
