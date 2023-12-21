package Month15_Oct.Day05Oct;

import java.util.ArrayList;
import java.util.List;

public class MajorityElement {
    public static void main(String[] args) {
        majorityElement(new int[]{1,2});
    }

    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        int e1 = 0;
        int e2 = 0;
        int c1 = 0;
        int c2 = 0;

        for(int i : nums){

            if(e1 == i){
                c1++;
            }else if(e2 == i){
                c2++;
            }else if(c1 == 0){
                e2 = i;
                c1 = 1;
            }else if(c2 == 0){
                e1 = i;c2 = 1;
            }else{
                c1--;
                c2--;
            }
        }
        c1 = 0;
        c2 = 0;
        for(int i : nums){
            if(e1 == i){
                c1++;
            }
            else if(e2 == i){
                c2++;
            }
        }

        if(c1 > (nums.length / 3)){
            ans.add(e1);
        }

        if(c2 > (nums.length / 3)){
            ans.add(e2);
        }

        return ans;
    }
}
