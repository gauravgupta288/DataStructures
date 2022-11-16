package Month04_Nov.Day076_161122;

public class LargestSubarrayWith0Sum {
    public static void main(String[] args) {
        System.out.println(largestSum(new int[]{15,-2,2,-8,1,7,10,23}, 8));
    }

    static int largestSum(int arr[], int n) {
        int max = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            int sum = 0;
            while (j < n) {
                sum += arr[j++];
                if (sum == 0) {
                    max = Math.max(j - i, max);
                }
            }
        }

        return max;
    }
}
