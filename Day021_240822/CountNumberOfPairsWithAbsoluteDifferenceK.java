package gg.Day021_240822;

import java.util.HashMap;

public class CountNumberOfPairsWithAbsoluteDifferenceK {
    public static void main(String[] args) {
        System.out.println(countDiff(new int[]{3,2,1,5,4}, 2));
    }

    static int countDiff(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for (int i : map.values()) {
            if(map.containsKey(i-k)){
                count += map.get(i) * map.get(i-k);
                map.remove(i);
            }else if(map.containsKey(k-i)){
                count += map.get(i) * map.get(k-i);
                map.remove(i);
            }
        }
        return count;
    }
}
