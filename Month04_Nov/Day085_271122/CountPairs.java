package Month04_Nov.Day085_271122;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountPairs {
    public static void main(String[] args) {
        System.out.println(countPairsSol1(new int[]{1,2,2,1}, 1));
    }

    static int countPairs(int[] nums, int k){

        int count = 0;

        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                int z = Math.abs(nums[i] - nums[j]);
                if(z == k){
                    count++;
                }
            }
        }

        return count;
    }

    static int countPairsSol1(int arr[], int k){
        int count = 0;
        Map<Integer, Integer> map = new LinkedHashMap<>();
        for(int i = 0 ; i < arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        int x = 0;
        for(int i  : map.keySet()){
            int z =  Math.abs(k - i);
            if(map.containsKey(z) && x++ != i){
                count += map.get(i) * map.get(z);
            }
        }
        return count;
    }
}
