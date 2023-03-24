package Month08_March.Day141_230323;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        System.out.println(threeSum(new int[]{0,0,0}));
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new LinkedList<>();

        int n = nums.length;
        for(int i = 0; i < n; i++){

            for(int j = i + 1; j < n; j++){
                for(int k = j + 1; k < n; k++){
                    List<Integer> temp = new LinkedList<>();
                    if(nums[i] + nums[j] + nums[k] == 0){
                        temp.add(nums[i]);
                        temp.add(nums[j]);
                        temp.add(nums[k]);
                        Collections.sort(temp);
                        if(!ans.contains(temp)){

                            ans.add(temp);
                        }
                    }
                }
            }
        }

        return ans;
    }
}
