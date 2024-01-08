package Backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Subsets {
    public static void main(String[] args) {
        List<List<Integer>> ans = new ArrayList<>();

        int []nums = new int[]{1,2,3};
        Arrays.sort(nums);
        List<Integer> list = new ArrayList<>();

        helper(nums, ans, list, 0);

        System.out.println(ans);
    }

    public static void helper(int nums[], List<List<Integer>> ans, List<Integer> list, int n)
    {
        ans.add(new ArrayList<>(list));


        for(int i = n; i < nums.length; i++){

            list.add(nums[i]);

            helper(nums, ans, list, i + 1);

            list.remove(list.size() - 1);
        }

        return ;
    }
}
