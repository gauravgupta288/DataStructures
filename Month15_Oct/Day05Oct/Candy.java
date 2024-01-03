package Month15_Oct.Day05Oct;

import java.util.Arrays;

public class Candy {
    public static void main(String[] args) {
        System.out.println(coinChange(new int[]{186,419,83,408}, 6249));
    }

    public static int coinChange(int[] coins, int amount) {

        Arrays.sort(coins);

        if(amount == 0){
            return 0;
        }
        int sum = 0;

        for(int i = coins.length - 1; i >=0; i--){

            if(amount < coins[i]){
                continue;
            }
            sum += amount / coins[i];


            amount = amount % coins[i];

            if(amount == 0){
                break;
            }

        }

        return (sum == 0 || amount > 0) ? -1 : sum;
    }
}
