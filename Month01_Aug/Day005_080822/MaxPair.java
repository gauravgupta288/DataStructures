package gg.Month01_Aug.Day005_080822;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MaxPair {
    public static void main(String[] args) {
        maxPairSol3(new int[]{1, 3, 2, 1, 3, 2, 2});
    }

    static int[] maxPair(int[] arr) {
        int res[] = new int[2];
        int pair = 0;
        int lo = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : arr) {
            if (map.containsKey(i)) {

            }
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int key : map.keySet()) {
            int temp = map.get(key);
            if (temp > 1) {
                pair += temp / 2;
            }
            lo += temp % 2;
        }
        res[0] = pair;
        res[1] = lo;

        return res;
    }

    static int[] maxPairSol2(int arr[]) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int i : arr) {
            if (set.contains(i)) {
                count++;
                set.remove(i);
            } else set.add(i);
        }

        return new int[]{count, set.size()};
    }

    static int[] maxPairSol3(int arr[]) {
        int num[] = new int[101];
        int pair = 0;
        int count = 0;
        for (int i : arr) {
            num[i]++;
        }

        for (int i : num) {
            if (i != 0) {
                pair += i / 2;
                count += i % 2;
            }
        }

        return new int[]{pair, count};
    }
}
