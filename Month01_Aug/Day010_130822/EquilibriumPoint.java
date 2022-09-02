package gg.Month01_Aug.Day010_130822;

public class EquilibriumPoint {
    public static void main(String[] args) {
        System.out.print(equiPoint(new long[]{1, 3, 5, 2, 2}, 5));
    }

    static int equiPoint(long arr[], int n) {
        if (n == 1) return 1;
        long leftSum = 0;
        long rightSum = 0;
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (leftSum + arr[left] > rightSum + arr[right]) {
                rightSum += arr[right--];
            } else {
                leftSum += arr[left++];
            }
        }
        if (leftSum == rightSum) return left + 1;
        return -1;
    }
}
