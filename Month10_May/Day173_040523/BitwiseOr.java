package Month10_May.Day173_040523;

public class BitwiseOr {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1,2,3,4,5}));
    }

    static int solve(int A[]){
        int ans = 0;
        int mod = 1000000007;

        for(int i = 0; i < A.length; i++){
            int temp = A[i] * ((i + 1) * (A.length - i)) % mod;
            ans = (ans ^ temp) % mod;
        }

        return ans;
    }
}
