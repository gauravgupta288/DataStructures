package Backtracking;

public class MinSizeSubarraySum {
    public static void main(String[] args) {
        System.out.println(solve(4, new int[]{1,4,4}));
    }

    static int solve(int target, int[] nums){
        int ans = Integer.MAX_VALUE;

        int s = 0;
        int n = 1;
        int sum = nums[s] + nums[n];;
        while(s < nums.length && n < nums.length){

            if(sum == target)
            {
                ans = Math.min(ans, n - s + 1);
                sum -= nums[s];
                s++;

            } else if (sum > target) {
                ans = Math.min(ans, n - s + 1);
                sum -= nums[s];
                s++;
            }else if (sum < target) {
                n++;
                if(n >= nums.length){
                    break;
                }
                sum += nums[n];
            }
        }


        return ans == Integer.MAX_VALUE ? (sum == target ? 1 : 0) : ans;
    }
}
