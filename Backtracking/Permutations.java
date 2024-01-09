package Backtracking;

import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1); l.add(2); l.add(3);
        solve(ans, l, 0);

        System.out.println(ans);
    }

    public static void solve(ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> nums, int index){

        if(index >= nums.size()){
            ArrayList<Integer> t = new ArrayList<>();

            for(int i = 0; i < nums.size(); i++){
                t.add(nums.get(i));
            }
            ans.add(t);
        }

        for(int i = index; i < nums.size(); i++){
            int t = nums.get(i);
            nums.set(i, nums.get(index));
            nums.set(index, t);

            solve(ans,nums, index + 1);
            t = nums.get(i);
            nums.set(i, nums.get(index));
            nums.set(index, t);

        }

        return;

    }
}
