package Month09_April.Day170_290423;

public class RainWaterTrapped {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{ 56, 6, 52, 43, 23, 47, 48, 38, 96, 46, 30, 66, 80, 15, 62, 71, 61, 12, 98, 9, 28, 81, 70, 59, 95, 34, 9, 60, 70, 81, 71, 67, 58, 20, 22, 3, 95, 85, 20, 24, 74, 5, 23, 33, 75, 50, 38, 75, 68, 26, 46, 30, 75, 18, 4, 42, 51, 59, 8, 77}));
    }

    static int solve(int A[]){
        int lmax[] = new int[A.length];
        int rmax[] = new int[A.length];
        int ans = 0;

        lmax[0] = A[0];
        for(int i = 1; i < A.length; i++){
            lmax[i] = Math.max(lmax[i -1 ], A[i]);
        }

        rmax[A.length - 1] = A[A.length - 1];
        for(int i = A.length - 2; i >=0; i--){
            rmax[i] = Math.max(rmax[i + 1], A[i]);
        }

        for(int i = 1; i < A.length - 1; i++){
            ans += Math.abs(Math.min(lmax[i], rmax[i])) - A[i];
        }

        return ans;
    }
}
