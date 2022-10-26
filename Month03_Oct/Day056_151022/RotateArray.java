package gg.Month03_Oct.Day056_151022;

public class RotateArray {
    public static void main(String[] args) {
        rotateArraySol2(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    static void rotateArray(int[] nums, int k) {

        while (k > 0) {
            int temp = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
            k--;
        }
    }

    static void rotateArraySol2(int[] nums, int k) {
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    static void reverse(int num[], int start, int end) {
        while (start < end) {
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;
            start++;
            end--;
        }
    }
}
