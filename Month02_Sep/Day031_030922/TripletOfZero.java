package gg.Month02_Sep.Day031_030922;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TripletOfZero {
    public static void main(String[] args) {
        triplet(new int[]{-1,0,1,2,-1,-4});
    }

    static List<List<Integer>> triplet(int nums[]) {
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (set.contains(-sum)) {
                    innerList.add(nums[i]);
                    innerList.add(nums[j]);
                    innerList.add(-sum);
                }
            }
            set.add(nums[i]);
            if(!innerList.isEmpty() && !list.contains(innerList)){
                list.add(innerList);
            }
        }

        return list;
    }
}
