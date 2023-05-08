package Month10_May.Day172_030523;

public class VeryLargePower {
    public static void main(String[] args) {
        int B = fact(27);
        System.out.println(B);
        System.out.println(solve(2, B, 1000000007));
    }

    static long solve(int A, int B, int m) {
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

        int f = 1;
        int i = 1;
        int mod = 1000000007;
        while(i <= B){
            f = (f * i) % mod;
            i++;
        }
        return f;
    }
}
