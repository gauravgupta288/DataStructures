package gg.Day006_090822;

public class TwoSum {
    public static void main(String[] args) {

    }

    static int[] twoSum(int a[], int target) {

        for (int i = 0, j = a.length - 1; i <= j; j--, i++) {
            if (target == a[i] + a[j]) return new int[]{i, j};
        }

        return null;
    }
}
