package Month07_Feb.Day118_280223;

public class LeftAndRightSumDifferences {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{10,4,8,3}));
    }

    static int[] solve(int nums[]){
        int ans[] = new int[nums.length];
        int pre[] = new int[nums.length];
        int post[] = new int[nums.length];

        for(int i = 1; i < nums.length; i++){
            pre[i] = pre[i - 1] + nums[i - 1];
        }

        for(int i = nums.length - 2; i >= 0; i--){
            post[i] = post[i + 1] + nums[i + 1];
        }

        for(int i = 0; i < nums.length; i++){
            ans[i] = Math.abs(pre[i] - post[i]);
        }

        return ans;
    }
}
