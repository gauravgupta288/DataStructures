package gg.Day020_230822;

public class SticklerThief {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{5,5,10,100,10,5}, 6));
    }

    //TODO - in progress
    static int maxProfit(int arr[], int n) {

        if(n==1) return arr[0];
        int profit1 = 0;
        int profit2 = 0;

        for (int i = 0; i < n; i = i + 2) {
            profit1 += arr[i];
        }
        for (int i = 1; i < n; i = i + 2) {
            profit2 += arr[i];
        }
        return  Math.max(profit1, profit2);
    }
}
