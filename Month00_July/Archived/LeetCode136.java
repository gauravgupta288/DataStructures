package gg.Month00_July.Archived;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LeetCode136 {
    public static void main(String s[]){

        int a[] = {2,2,1,1,3,4,4};
        System.out.println(findOneSol2(a));
    }
    static int findOneSol1(int []arr){
        if(arr.length==1) return arr[0];
        HashMap<Integer, Integer> hm = new HashMap<>();

        int start = 0, end = arr.length-1;

        while (start<=end){
            if(hm.containsKey(arr[start])){
                hm.remove(arr[start]);
            }else {
                hm.put(arr[start],1);
            }
            start++;
        }

        Set<Integer> s = hm.keySet();

        for(int i:s){
            return i;
        }
        return 0;
    }
    static int findOneSol2(int nums[]){

        if (nums.length==0) return nums[0];
        Set<Integer> s= new HashSet<>();
        int sum=0;
        for(int i=0;i< nums.length;i++){
            s.add(nums[i]);
            sum += nums[i];

        }
        int sum1=0;
        for (int i:s){
            sum1 += i+i;
        }
        return sum1-sum;
    }


}
