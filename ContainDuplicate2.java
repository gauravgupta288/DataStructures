package gg;

import java.util.HashMap;
import java.util.Map;

public class ContainDuplicate2 {
    public static void main(String s[]) {
        System.out.println(containDup(new int[]{1, 2, 3, 2,0,10, 3}, 1));
    }

    static boolean containDup(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && (i - map.get(nums[i])) <= k) {
                return true;
            } else {
                map.put(nums[i], i);
            }
        }
        return false;
    }
}
