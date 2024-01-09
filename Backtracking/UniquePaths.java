package Backtracking;

public class UniquePaths {
    static int ans = 0;
    public static void main(String[] args) {
        System.out.println(uniquePathsIII(new int[][]{{1,0,0,0}, {0,0,0,0}, {0,0,0,2}}));
    }
    public static int uniquePathsIII(int[][] A) {
        int zeroCount = 0;
        int n = 0;

        int startPointR = 0;
        int startPointC = 0;
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length; j++){
                if(A[i][j] == 0){
                    zeroCount++;
                }

                if(A[i][j] == 1){
                    startPointR = i;
                    startPointC = j;
                }
            }
        }
        solve(A, startPointR , startPointC, zeroCount, 0);
        return ans;
    }

    public static void solve(int[][] A, int row, int col, int zc, int n ){

        if (A[row][col] == 2) {
            if (n == zc) {
                ans += 1;
            }
            return;
        }

        if (A[row][col] == -1 || A[row][col] == 3) {
            return;
        }

        if (A[row][col] == 1) {
            A[row][col] = 3;  // Mark the starting cell
        } else {
            A[row][col] = -1;
        }

        if(row < A.length - 1){
            solve(A, row + 1, col, zc, n + 1);
        }

        if(col < A[0].length - 1 ){
            solve(A, row, col + 1, zc, n + 1);
        }

        if(row > 0 ){
            solve(A, row - 1, col, zc, n + 1);
        }

        if(col > 0 ){
            solve(A, row, col - 1, zc, n + 1);
        }
        A[row][col] = 0;
    }
}
