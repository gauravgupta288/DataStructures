package Month05_Dec.Day092_061222;

import java.util.HashMap;
import java.util.Map;

public class SortArrayByOccurences {
    public static void main(String[] args) {
        sortArray(new int[]{2,3,1,3,2});
    }

    static int[] sortArray(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        Map<Integer, Integer> map1 = new HashMap<>();
        int[] res = new int[nums.length];
        int x = 0;

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        while (map.size() != 0) {
            map1 = getLowest(map);

            for (int i : map1.keySet()) {
                for (int k = 0; k < map1.get(i); k++) {
                    res[x++] = i;
                }
                map.remove(i);
            }
        }
        return res;
    }

    static Map<Integer, Integer> getLowest(Map<Integer, Integer> map) {
        Map<Integer, Integer> result = new HashMap<>();
        int minValue = Integer.MAX_VALUE;
        int mapKey = 0;
        for (Integer entry : map.keySet()) {
            if (map.get(entry) < minValue) {
                mapKey = entry;
                minValue = map.get(entry);
            } else if (map.get(entry) == minValue) {
                if (entry > mapKey) {
                    mapKey = entry;
                    minValue = map.get(entry);
                }
            }
        }
        result.put(mapKey, minValue);
        return result;
    }
}
