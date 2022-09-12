package gg.Month02_Sep.Day039_110922;

import java.util.HashMap;
import java.util.Map;

public class MostFrequentEvenElement {
    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[]{4,4,4,9,2,4}));
    }

    static int mostFrequentEven(int[] nums) {
        int first = Integer.MIN_VALUE;
        int key = Integer.MAX_VALUE;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            if ((nums[i] & 1) == 0) {
                map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
            }
        }
        for (int i : map.keySet()) {
            if (first < map.get(i)) {
                key = i;
                first = map.get(i);
            }
            else if(first == map.get(i)){
                key = Math.min(key, i);
            }
        }
        if(map.size()==0)return -1;

        return key;
    }
}
