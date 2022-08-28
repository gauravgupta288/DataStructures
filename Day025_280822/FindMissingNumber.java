package gg.Day025_280822;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class FindMissingNumber {

    public static void main(String[] args) {
        missingNumberSol2(new int[]{4, 3, 2, 8, 7,2, 3, 1});
    }

    static List<Integer> missingNumberSol1(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();

        for (int i : nums) {
            set.add(i);
        }

        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    static List<Integer> missingNumberSol2(int nums[]) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            int k = Math.abs(nums[i]);
            if (nums[k-1] > 0) {
                nums[k-1] *= -1;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if(nums[i] >0){
                list.add(i+1);
            }
        }
        return list;
    }
}
