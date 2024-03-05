package Backtracking;

import java.util.HashSet;
import java.util.Set;

public class longestConsecutive {
    public static void main(String[] args) {
        System.out.println(longestConsecutive(new int[]{0,3,7,2,5,8,4,6,0,1}));
    }

    public static int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }
        int ans = 0;

        for(int num : nums){

            int seq = 1;
            int preSeq = num - 1;
            int nextS = num + 1;

            while(set.remove(preSeq--)){
                seq++;
            }

            while(set.remove(nextS++)){
                seq++;
            }

            ans = Math.max(ans, seq);
        }

        return ans;
    }
}
