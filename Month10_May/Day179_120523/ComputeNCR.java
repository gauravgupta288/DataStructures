package Month10_May.Day179_120523;

public class ComputeNCR {
    public static void main(String[] args) {
        //System.out.println((int)Math.pow(2, 11) % 13);
        //System.out.println((3 * 11 * 7) % 13);
        System.out.println(solve(3, 2, 33));
    }

    static int solve(int A, int B, int C) {

        int x = factorial(A, C) % C;
        int y = factorial((A-B), C) % C;
        int z = factorial(B, C) % C;

        return ((x) * fastPower(y, C-2, C) % C * fastPower(z, C-2, C) % C ) % C;
    }

    static int fastPower(int A, int B, int C) {
        if(B == 0 ){
            return 1;
        }
        if((B & 1) == 1){
            return ((A  * fastPower((A * A) % C, B/2, C) % C) % C);
        }else{
            return (fastPower((A * A) % C, B/2, C) % C);
        }
    }


    static int factorial(int A, int mod) {
        int result = 1;
        for (int i = 1; i <= A; i++) {
            result = (result * i) % mod;
        }
        return result;
    }
}
