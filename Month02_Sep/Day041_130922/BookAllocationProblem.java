package gg.Month02_Sep.Day041_130922;

public class BookAllocationProblem {
    public static void main(String[] args) {
        System.out.println(bookAllocation(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5));
    }

    static int bookAllocation(int[] weights, int days) {
        int s = 0;
        int e = weights.length - 1;
        int minCount = 0;
        int sum = 0;

        for (int i : weights) {
            sum += i;
        }
        while (s <= sum) {
            int mid = s + (e - s) / 2;
            if (isPossibleSol(weights, days, mid)) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return minCount;
    }

    static boolean isPossibleSol(int[] weights, int days, int mid) {
        int ans = 0;
        int dayCount = 0;
        for (int i : weights) {
            ans += i;

            if (ans >= mid) {
                dayCount++;
            } else {
                if(dayCount>days){
                    return false;
                }
            }
        }
        return true;
    }
}
