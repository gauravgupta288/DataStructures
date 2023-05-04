package Month10_May.Day173_040523;

public class PrimeModuloInverse {
    public static void main(String[] args) {
        System.out.println(solve(2, 3));
    }

    static int solve(int A, int B){
        return mod(A, B- 2, B);
    }

    static int mod(int x, int y, int p  ){
        int res = 1;
        x = x % p;
        while (y > 0) {
            if (y % 2 == 1) {
                res = (res * x) % p;
            }
            y >>= 1;
            x = (x * x) % p;
        }
        return res;
    }
}
