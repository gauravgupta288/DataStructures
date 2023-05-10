package Month10_May.Day177_100523;

import java.util.ArrayList;
import java.util.List;

public class LuckyNumbers {
    public static void main(String[] args) {
        System.out.println(luckyNumber(8));
    }

    static int luckyNumber(int A) {

        int ans = 0;

        for (int i = 2; i <= A; i++) {
            int count = 0;
            List<Integer> fact = factor(i);
            for(int k : fact){
                if(isPrime(k)){
                    count++;
                }
            }
            if(count == 2){
                ans++;
            }
        }
        return ans;
    }

    static boolean isPrime(int A) {

        if(A == 1){
            return false;
        }
        for (int i = 2; i * i <= A; i++) {
            if (A % i == 0) {
                return false;
            }
        }
        return true;
    }

    static List<Integer> factor(int A) {
        List<Integer> factors = new ArrayList<>();

        for (int i = 1; i * i <= A; i++) {
            if (A % i == 0) {
                if(A/i == i){
                    factors.add(i);
                }else{
                    factors.add(i);
                    factors.add(A / i);
                }
            }
        }
        return factors;
    }
}
