package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
    static List<List<String>>  ans = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println(solveNQueens(4));
    }
    public static List<List<String>> solveNQueens(int n) {
        int[] col = new int[n];

        for(int i = 0; i < n; i++){
            col[i] = -1;
        }
        solve(n, 0, col);

        for(List<String> list : ans){
            for(String s : list){
            }
        }
        return ans;
    }

    public static void solve(int n, int row, int col[]){
        if(row == n){

            StringBuilder sb = new StringBuilder();

            for(int i = 0; i < n; i++){
                sb.append('.');
            }
            List<String> temp = new ArrayList<>();

            for(int i =0; i < col.length; i++){

                sb.setCharAt(col[i], 'Q');
                temp.add(sb.toString());
                sb.setCharAt(col[i], '.');
            }
            ans.add(temp);
            return;
        }
        int count = 0;
        for(int c = 0; c < n; c++){
            if(isValid(col, row, c)){
                col[row] = c;
                solve(n, row + 1, col);
                col[row] = -1;
            }
        }

        return;
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
