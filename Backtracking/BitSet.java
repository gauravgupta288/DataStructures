package Backtracking;

public class BitSet {
    public static void main(String[] args) {
        System.out.println(solve(45));
    }

    static  int solve(int n){
        int ans = 0;

        for(int i = 0; i < 32; i++){
            int k = (n & (1 << i));

            if(k >= 1){
                ans++;
            }
        }

        return ans;
    }
}
