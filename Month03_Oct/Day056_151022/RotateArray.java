package gg.Month03_Oct.Day056_151022;

public class RotateArray {
    public static void main(String[] args) {
        rotateArray(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }

    static void rotateArray(int[] nums, int k) {

        while (k > 0) {
            int temp = nums[nums.length - 1];

            for (int i = nums.length - 1; i > 0; i--) {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
            k--;
        }
    }
}
