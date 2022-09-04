package gg.Month02_Sep.Day032_040922;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TwoSumToZero {
    public static void main(String[] args) {
        twoSum(new int[]{0,0,0,0,0});
    }

    static List<List<Integer>> twoSum(int arr[]) {

        Set<Integer> set = new HashSet<>();
        List<List<Integer>> list = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            List<Integer> innerList = new ArrayList<>();
            if (set.contains(-(arr[i]))) {
                innerList.add(-arr[i]);
                innerList.add(arr[i]);
            } else {
                set.add(arr[i]);
            }
            if (!innerList.isEmpty() && !list.contains(innerList)) {
                list.add(innerList);
            }
        }

        return list;
    }
}
