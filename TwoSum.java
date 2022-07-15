package gg;

import java.util.HashMap;

public class TwoSum {
    public static void main(String str[]){
        int arr[] = {3,3};
        int arr1[] = {1,2,3,4,5,6,7,8,9,10,10};
        int []res = twoSumSol2(arr, 6);
        int []res1 = twoSumSol2(arr1, 20);
        print(res);
        print(res1);
    }
    static void print(int []arr){
        for(int i:arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static int[] twoSumSol1(int nums[], int target){
        int []res = new int[2];
        for(int i=0;i<nums.length;i++){
            for(int j=1;j<nums.length;j++){
                if(i != j && target == nums[i] + nums[j]){
                    res[0] = i;res[1] = j;
                    return res;
                }
            }
        }
        return null;
    }
    static int[] twoSumSol2(int []arr, int target){
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            Integer val = (target - arr[i]);
            if(hMap.containsKey(val)){
                int []a = {hMap.get(val), i};
                return a;
            }
            hMap.put(arr[i], i);
        }
        return null;
    }
}
