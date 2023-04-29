package Month09_April.Day170_290423;

public class RainWaterTrapped {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{ 0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
    }

    static int solve(int A[]){
        int lmax[] = new int[A.length];
        int rmax[] = new int[A.length];
        int ans = 0;

        lmax[0] = A[0];

        for(int i = 1; i < A.length; i++){
            lmax[i] = Math.max(lmax[i -1 ], A[i]);
        }

        rmax[0] = A[A.length - 1];
        for(int i = A.length - 2; i >=0; i--){
            rmax[i] = Math.max(rmax[i + 1], A[i]);
        }

        for(int i = 1; i < A.length - 1; i++){
            ans += Math.abs(Math.min(lmax[i], rmax[i])) - A[i];
        }

        return ans;
    }
}
