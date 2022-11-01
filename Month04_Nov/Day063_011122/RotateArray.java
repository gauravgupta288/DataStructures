package Month04_Nov.Day063_011122;

import java.util.Arrays;

public class RotateArray {
    public static void main(String[] args) {
        rotate(new int[]{1,2,3,4,5,6,7}, 3);
    }

    static void rotate(int nums[], int k) {
        int temp[] = new int[nums.length];

        for(int i = 0; i < nums.length; i++){
            temp[(i+k)% nums.length] = nums[i];
        }

        nums = Arrays.copyOf(temp, temp.length);
    }
}
