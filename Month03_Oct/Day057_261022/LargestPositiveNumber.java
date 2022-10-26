package gg.Month03_Oct.Day057_261022;

import java.util.HashSet;
import java.util.Set;

public class LargestPositiveNumber {
    public static void main(String[] args) {
        System.out.println(largestPositiveNumber(new int[]{-1,10,6,7,-7,1}));
    }

    static int largestPositiveNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int largest = -1;

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for(int i = 0; i < nums.length; i++){
            if((nums[i]<0 && set.contains(Math.abs(nums[i]))) || (nums[i] > 0 && set.contains(-(nums[i])))){
                if(Math.abs(nums[i])>largest){
                    largest = Math.abs(nums[i]);
                }
            }
        }

        return largest;
    }
}
