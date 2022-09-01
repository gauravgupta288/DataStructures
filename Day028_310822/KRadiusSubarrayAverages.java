package gg.Day028_310822;

public class KRadiusSubarrayAverages {
    public static void main(String[] args) {
        System.out.println(kRadiusSubArray(new int[]{7,4,3,9,1,8,5,2,6}, 3));
    }

    static int[] kRadiusSubArray(int[] nums, int k) {
        int n = nums.length;

        if(k>= nums.length)return new int[]{-1};
        int sum = 0;
        int res[] = new int[n];
        int i;
        for (i = 0; i < k * 2 + 1; i++) {
            sum += nums[i];
        }
        res[i - k - 1] = sum / i;
        for (int j = 0; i < n; i++, j++) {
            if(j<=k+1){
                res[j] = -1;
            }if(i>n-k-1){
                res[i] = -1;
            }
            sum -= nums[i-k*2-1];
            sum += nums[i];
            res[i - k] = sum / i;
        }
        return res;
    }
}
