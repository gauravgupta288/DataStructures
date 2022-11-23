package Month04_Nov.Day081_211122;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ArrayPairSumDivisibilityProblem {

    public static void main(String[] args) {
        System.out.println(arrayPair(new int[]{14, 2, 10, 2}, 2));
    }

    static boolean arrayPair(int[] nums, int k) {
        Queue<Integer> queue = new LinkedList<>();

        if (nums.length % 2 != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();

        int x = 0;
        for (int i = 0; i < nums.length; i++) {
            x = nums[i] % k;
            if (x < 0) {
                x += k;
            }
            map.put(x, map.getOrDefault(x, 0) + 1);
        }


        for (int e : map.keySet()) {
            x = k - e;

            if (e == 0) {
                if (map.get(e) % 2 != 0) {
                    return false;
                }
            } else {
                if (!map.containsKey(x)) {
                    return false;
                } else {
                    int z = map.get(x);
                    int m = map.get(e);

                    if (z != m) {
                        return false;
                    }
                }
            }


        }
        return true;

    }
}
