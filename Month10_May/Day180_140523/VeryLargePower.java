package Month10_May.Day180_140523;

public class VeryLargePower {
    public static void main(String[] args) {
        long a = 6227020800l;
        System.out.println(6227020800l % 1000000007);
        System.out.println(solve(2,27));
    }

    static int solve(int A, int B) {
        int mod = 1000000007;
        long x = factorial(B, mod);

        return fastPower(A, x, mod);
    }

    static int fastPower(long A, long B, long C) {
        if(B == 0 ){
            return 1;
        }
        if((B & 1) == 1){
            return (int)((A  * fastPower((A * A) % C, B/2, C) % C) % C);
        }else{
            return (int)(fastPower((A * A) % C, B/2, C) % C);
        }
    }

    static  long factorial(int A, int mod) {
        long result = 1;
        for (int i = 1; i <= A; i++) {
            result = (result * i);
        }
        return result;
    }
}
