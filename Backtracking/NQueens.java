package Backtracking;

public class NQueens {

    public static void main(String[] args) {
        System.out.println(totalNQueens(5));
    }
    public static int totalNQueens(int n) {
        int[] col = new int[n];

        for(int i = 0; i < n; i++){
            col[i] = -1;
        }
        int count = 0;
        count += solve(n, 0, col);
        return count;
    }

    public static int solve(int n, int row, int col[]){
        if(row == n){
            return 1;
        }
        int count = 0;
        for(int c = 0; c < n; c++){
            if(isValid(col, row, c)){
                col[row] = c;
                count += solve(n, row + 1, col);
                col[row] = -1;
            }
        }
        return count;
    }

    static boolean isValid(int[] col, int r, int c){

        for(int i = 0; i < col.length; i++){
            int j = col[i];

            if(j == -1) continue;

            if(i == r || j == c || (r + c) == (i + j) || (c - r) == (j - i) ){
                return false;
            }
        }
        return true;
    }
}
