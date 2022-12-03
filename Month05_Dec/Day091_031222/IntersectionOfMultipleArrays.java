package Month05_Dec.Day091_031222;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfMultipleArrays {
    public static void main(String[] args) {


    }

    static List<Integer> intersecation(int[][] nums){
        int arr[] = new int[1001];
        List<Integer> ans = new ArrayList<>();
        int len = nums.length;
        for(int i = 0;i<len;i++){
            for(int j = 0;j<nums[i].length;j++){
                arr[nums[i][j]]++;
            }
        }
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>=len){
                ans.add(i);
            }
        }

        return ans;
    }
}
