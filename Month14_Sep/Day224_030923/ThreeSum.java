package Month14_Sep.Day224_030923;

import java.util.*;

public class ThreeSum {
    public static void main(String[] args) {
        solve(new int[]{1,2,-2,-1});
    }

    public static List<List<Integer>> solve(int nums[]) {
        List<List<Integer>> ans = new ArrayList<>();
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> map = new HashMap();

        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            map.put(nums[i], map.get(nums[i]) - 1);
            for (int j = i + 1; j < nums.length - 1; j++) {
                List<Integer> li = new ArrayList<>();
                li.add(nums[i]);

                map.put(nums[j], map.get(nums[j]) - 1);
                int temp = nums[i] + nums[j];
                if (map.containsKey(-temp) && map.get(-temp) > 0) {
                    li.add(nums[j]);
                    li.add(-temp);
                    Collections.sort(li);
                    set.add(li);
                }
                map.put(nums[j], map.get(nums[j]) + 1);
            }
        }

        for(List<Integer> tmp : set){
            ans.add(tmp);
        }
        return ans;
    }
}
