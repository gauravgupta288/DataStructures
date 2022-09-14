package gg.Month02_Sep.Day041_130922;

public class BookAllocationProblem {
    public static void main(String[] args) {
        System.out.println(bookAllocation(new int[]{1,2,3,1,1}, 4));
    }

    static int bookAllocation(int[] weights, int days) {
        int s = 1;
        int sum = 0;
        int ans = -1;

        for (int i : weights) {
            sum += i;
        }
        while (s < sum) {
            int mid = s + (sum - s) / 2;
            if (isPossibleSol(weights, days, mid)) {
                ans = mid;
                sum = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return ans;
    }

    static boolean isPossibleSol(int[] weights, int days, int mid) {
        int ans = 0;
        int dayCount = 1;
        for (int i : weights) {
            if (ans + i <= mid) {
                ans += i;
            } else {
                dayCount++;
                if (dayCount > days || i > mid) {
                    return false;
                }
                ans = i;
            }
        }
        return true;
    }
}
