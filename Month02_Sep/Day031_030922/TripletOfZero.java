package gg.Month02_Sep.Day031_030922;

import java.util.*;

public class TripletOfZero {
    public static void main(String[] args) {
        triplet(new int[]{0, 0, 0, 0, 0});
    }

    static List<List<Integer>> triplet(int nums[]) {
        List<List<Integer>> list = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            List<Integer> innerList = new ArrayList<>();
            for (int j = i + 1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (set.contains(-sum)) {
                    innerList.add(-sum);
                    innerList.add(nums[i]);
                    innerList.add(nums[j] );
                }
            }
            set.add(nums[i]);
            if (!innerList.isEmpty()) {
                list.add(innerList);
            }
        }

        return list;
    }
}
