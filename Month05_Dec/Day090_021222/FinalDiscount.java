package Month05_Dec.Day090_021222;

public class FinalDiscount {
    public static void main(String[] args) {
        System.out.println(finalDiscount(new int[]{10,1,1,6}));
    }

    static int[] finalDiscount(int[] prices) {

        for (int i = 0; i<prices.length; i++) {
            int j = i + 1;
            int min = 0;

            while (j < prices.length){
                if(prices[i] >= prices[j]){
                    min = prices[j];
                    break;
                }
                j++;
            }
            prices[i] -= min;
        }

        return prices;
    }
}
