package Month14_Sep.Day223_020923;

import java.util.ArrayList;
import java.util.List;

public class PowerSet2 {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

        powerset(ans, new int[]{1,1,2,2}, 0);

        for(List<Integer> i : ans){
            System.out.println(i);
        }
    }

    public static void powerset(List<List<Integer>> ans, int nums[], int index){
        if(index >= nums.length){
            List<Integer> list = new ArrayList<>();
            for(int i = 0; i < nums.length; i++){
                list.add(nums[i]);
            }
            ans.add(list);
            return;
        }

        for(int i = index; i< nums.length; i++){

            if(i == index || nums[i] != nums[index]){
                swap(nums, i, index);
                powerset(ans, nums, index+1);
                swap(nums, i, index);
            }
        }

        return;
    }

    public static void swap(int nums[], int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
