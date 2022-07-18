package gg;

public class HappyNumber {
    public static void main(String s[]) {
        System.out.println(happyNumber(4));
    }

    static boolean happyNumber(int n) {
        long sum = 0;
        if(n==1)return true;
        else if (n==0 || n==2 || n==3) {
            return false;
        }
        while (n != 0){
            int m = n % 10;
            sum += Math.pow(m, 2);
            n = n / 10;
        }
        if (sum == 1) return true;
        else if (sum>3) {
            return happyNumber((int)sum);
        }
        return false;
    }
}
