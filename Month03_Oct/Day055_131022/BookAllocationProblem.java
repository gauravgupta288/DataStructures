package gg.Month03_Oct.Day055_131022;

public class BookAllocationProblem {
    public static void main(String[] args) {
        System.out.println(bookAllocationProblem(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));
    }

    static int bookAllocationProblem(int[] weights, int days) {
        int start = 0;
        int sum = 0;
        int ans = -1;

        for (int i : weights) {
            sum += i;
        }

        int end = sum;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (isPossibleSolution(weights, mid, days)) {
                end = mid - 1;
                ans = mid;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossibleSolution(int[] weights, int mid, int days) {
        int count = 1;
        int sum = 0;

        for (int i = 0; i < weights.length; i++) {
            if(sum + weights[i] <= mid){
                sum += weights[i];

            } else  {
                count++;
                if(count>days || weights[i] > mid){
                    return false;
                }

            }
        }
        return true;
    }
}
