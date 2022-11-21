package Month04_Nov.Day081_211122;

import java.util.HashMap;
import java.util.Map;

public class ArrayPairSumDivisibilityProblem {
    public static void main(String[] args) {
        System.out.println(arrayPair(new int[]{14,2,10,2}, 2));
    }

    static boolean arrayPair(int[] nums, int k) {
        if (nums.length % 2 != 0) return false;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i] % k, map.getOrDefault(nums[i] % k, 0) + 1);
        }

        for (int i : map.keySet()) {
            int x = k - i;
            if(i==0 && map.get(i) %2 != 0) {
                return false;
            }else{
                if(!map.containsKey(x)){
                    return false;
                }else{
                    \
A                }
            }

        }


    }
}
