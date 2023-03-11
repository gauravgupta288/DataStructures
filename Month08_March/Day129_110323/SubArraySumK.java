package Month08_March.Day129_110323;

import java.util.HashMap;
import java.util.Map;

public class SubArraySumK {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,1,1}, 2));
    }

    static int solve(int[] A, int k) {
        int count = 0;
        int sum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            if(sum - k == 0){
                count++;
            }
            map.put(sum, (map.getOrDefault(sum, 0) + 1));
        }
        return count;
    }
}
