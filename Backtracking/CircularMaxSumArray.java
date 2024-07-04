package Backtracking;

public class CircularMaxSumArray {
    public static void main(String[] args) {
        System.out.println(maxSubarraySumCircular(new int[]{5,-3,5}));
    }
    public static int maxSubarraySumCircular(int[] nums) {

        int ms = nums[0];
        int cs = 0;

        int c = 0;

        for(int i = 0; i < nums.length; i++){
            cs = Math.max(cs + nums[i], nums[i]);
            ms = Math.max(cs, ms);


            if(i == nums.length - 1 ){
                i = 0;
                if(c == 1){
                    break;
                }
                c++;
            }
        }

        return ms;
    }
}
