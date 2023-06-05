package Month11_June.Day193_030623;

public class SubMatrixSumQueries {
    public static void main(String[] args) {
        solve(new int[][]{{1, 2, 3},{4, 5, 6}, {7, 8, 9}}, new int[]{1,2}, new int[]{1,2}, new int[]{2,3},new int[]{2,3});
    }

    static int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E){
        int mod = 1000000007;
        int n = A.length;
        int m = A[0].length;
        long[][] newArr =  new long[n][m];
        long ans[] = new long[B.length];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(i == 0 && j == 0){
                    newArr[i][j] = A[i][j];
                }else if(i == 0 || j == 0){
                    if(i == 0){
                        newArr[i][j] = (A[i][j] + newArr[i][j - 1]) % mod;
                    }else{
                        newArr[i][j] = (A[i][j] + newArr[i - 1][j]) % mod;
                    }
                }else{
                    newArr[i][j] = (A[i][j] + newArr[i - 1][j]) % mod + (newArr[i][j - 1] - newArr[i - 1][j - 1]) % mod;
                }
            }
        }

        for(int i = 0; i < B.length; i++){
            int topL = B[i] - 1;
            int topR = C[i] - 1;
            int btmL = D[i] - 1;
            int btmR = E[i] - 1;

            if(topL == 0 && topR == 0){
                ans[i] = newArr[btmL][btmR];
            }else{

                if(topL == 0 ){

                    ans[i] = newArr[btmL][btmR] - 0 - newArr[btmL][topR -1]  - 0 ;
                }
                else if(topR == 0){
                    ans[i] = newArr[btmL][btmR] - newArr[topL - 1][btmR]  ;
                }else{
                    ans[i] = ((newArr[btmL][btmR] - newArr[topL - 1][btmR] - newArr[btmL][topR -1]) % mod  + newArr[topL-1][topR - 1]) % mod ;
                }
            }
        }
        int k = 0;
        int a[] = new int[ans.length];
        for(long i : ans){
            a[k++] = (int)(i%mod + mod)%mod;
        }
        return a;
    }
}
