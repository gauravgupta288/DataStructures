package gg.Day028_310822;

public class MaximumAverageSubarrayI {
    public static void main(String[] args) {
        System.out.printf("%.2f", maxAverage(new int[]{4,0,4,3,3}, 5));
    }

    static double maxAverage(int nums[], int k) {
        double average = 0;
        int sum = 0;
        int i;
        for (i = 0; i < k; i++) {
            sum += nums[i];
        }


        for (; i < nums.length; i++) {
            sum -= nums[i-k];
            sum += nums[i];

            average = Math.max(average, sum);
        }
        return average/(float)k;
    }
}
