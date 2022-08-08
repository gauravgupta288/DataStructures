package gg.Day003_060822;

import java.util.HashSet;
import java.util.Set;

public class SetMismatch {
    public static void main(String[] args) {
        System.out.println(setMismatch(new int[]{2,3,2}));
    }

    static int[] setMismatch(int nums[]) {
        int arr[] = new int[2];
        int sum = 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0;  i < nums.length; i++) {
            if(set.contains(nums[i])) arr[0] = nums[i];
            else set.add(nums[i]);
            sum += nums[i];
        }
        arr[1] = ((nums.length)* (nums.length+1))/2 - (sum - arr[0]);
        return arr;
    }
}
