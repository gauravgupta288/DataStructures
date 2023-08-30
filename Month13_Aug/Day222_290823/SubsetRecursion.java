package Month13_Aug.Day222_290823;

import java.util.ArrayList;
import java.util.List;

public class SubsetRecursion {
    public static void main(String[] args) {
        int [] nums = new int[]{1,2,3};

        subsets(nums);

        System.out.println();
    }

    static public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();

        List<Integer> list = new ArrayList<>();

        helper(nums, ans, list, 0);

        return ans;

    }

    static public void helper(int nums[], List<List<Integer>> ans, List<Integer> list, int i)
    {
        if(i == nums.length){
            ans.add(new ArrayList<>(list));
            return;
        }



        list.add(nums[i]);
        helper(nums, ans, list, i + 1);

        list.remove(list.size() - 1);
        helper(nums, ans, list, i + 1);

        return ;
    }
}
