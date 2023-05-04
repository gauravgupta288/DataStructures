package Month10_May.Day172_030523;

public class VeryLargePower {
    public static void main(String[] args) {
        int B = fact(27);

        long ans = solve(2, B, 1000000007);
        System.out.println(ans);
    }

    static long solve(long A, int B, int m) {
        if(B == 0){
            return 1;
        }
        int num = B & 1;

        if( num == 0){
            return solve((A * A) % m, B/2, m) % m;
        }else{
            return (A * (solve((A * A) % m, B/2, m) % m) % m) % m;
        }
    }

    static int fact(int B){
        if(B == 1){
            return 1;
        }
        return (B * fact(B - 1)) % 1000000007;
    }
}
