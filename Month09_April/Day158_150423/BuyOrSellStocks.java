package Month09_April.Day158_150423;

public class BuyOrSellStocks {
    public static void main(String[] args) {
        System.out.println(maxProfit(new int[]{1, 2}));
    }

    static int maxProfit(int A[]){
        if(A.length == 0 || A.length == 1){
            return 0;
        }

        int max = A[A.length - 1];

        int profit = 0;

        for(int i = A.length - 2; i >= 0; i--){
            if(A[i] > max){
                max = A[i];
            }

            profit = Math.max(profit, max - A[i]);
        }

        return profit;
    }
}
