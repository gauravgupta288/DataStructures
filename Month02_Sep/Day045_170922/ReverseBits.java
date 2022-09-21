package gg.Month02_Sep.Day045_170922;

public class ReverseBits {
    public static void main(String[] args) {
        System.out.println(reverse(00000010100101000001111010011100));
    }

    static int reverse(int n){
        int res = 0;

        while(n!=0){
            int mod = n % 10;
            res = res * 10 + mod;
            n /= 10;
        }
        return res;
    }
}
