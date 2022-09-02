package gg.Month01_Aug.Day024_270822;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatedInArray {
    public static void main(String[] args) {
        findDuplicates(new int[]{4,3,2,7,8,2,3,1});
    }

    static List<Integer> findDuplicates(int[] nums){
        final List<Integer> duplicates = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            final int n = Math.abs(nums[i]);
            if(nums[n - 1] < 0) {
                duplicates.add(n);
            } else {
                nums[n - 1] *= -1;
            }
        }
        return duplicates;
    }
}
