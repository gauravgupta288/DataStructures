package gg.Archived;

import java.util.HashSet;
import java.util.Set;

public class MakeArrayZero {
    public static void main(String[] args) {
System.out.println(makeArrayZero(new int[]{0}));
    }

    static int makeArrayZero(int[] nums) {

        Set<Integer> set = new HashSet<>();
        for(int i=0;i< nums.length;i++){

            if(nums[i] != 0){
                set.add(nums[i]);
            }
        }
        return set.size();
    }
}
