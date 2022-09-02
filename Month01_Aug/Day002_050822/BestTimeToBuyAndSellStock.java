package gg.Month01_Aug.Day002_050822;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        System.out.println(bestTime(new int[]{7, 2, 5, 3, 6, 4,1,10}));
    }

    static int bestTime(int prices[]) {
        int buy=Integer.MAX_VALUE,sell=0;
        for(int i=0;i<prices.length;i++){
            buy=Math.min(buy,prices[i]);
            sell=Math.max(sell,prices[i]-buy);
        }
        return sell;

    }
}
