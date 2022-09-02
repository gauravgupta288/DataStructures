package gg.Month00_July.Archived;

import java.util.*;

public class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(new int[]{4,14,2,2,4,6,1,0,1,14,20,20,}));
    }
    static int hammingDistance(int x, int y){
        int xArr[] = changeToBinary(x);
        int yArr[] = changeToBinary(y);

        int changeCount = 0;

        for(int i = xArr.length-1;i>=0;i--){
            if(xArr[i] != yArr[i]){
                changeCount++;
            }
        }
        return changeCount;
    }

    static int[] changeToBinary(int n){
        int arr[] = new int[32];
        int len = 31;
        while(n!=0){
            arr[len--] = n%2;
            n/=2;
        }
        return arr;
    }

    static int hammingDistance(int []nums){
        ArrayList<Integer> numss = new ArrayList<>();
        Arrays.sort(nums);

        for(int i=0;i<nums.length;i++){
            if(!numss.contains(nums[i])){
                numss.add(nums[i]);
            }
        }

        return numss.get(numss.size()-3);
    }
}
