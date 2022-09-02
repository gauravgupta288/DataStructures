package gg.Month01_Aug.Day015_180822;

import java.util.HashMap;

public class NumberOfGoodPairs {
    public static void main(String[] args) {
        System.out.print(goodPairs(new int[]{1, 2, 3, 1, 1, 3}));
    }

    static   int goodPairs(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int pair = 0;
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for (int key : map.keySet()) {
            pair += sum(map.get(key) - 1);
        }
        return pair;
    }

    static int sum(int n) {
        return (n * (n + 1)) / 2;
    }
}

