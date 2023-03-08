package Month08_March.Day125_070323;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix2 {
    public static void main(String[] args) {
        System.out.println(spiralOrder(new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}}));
    }

    static List<Integer> spiralOrder(int[][] A) {
        int n = A.length;
        int m = A[0].length;

        List<Integer> ans = new ArrayList<>();

        int i = 0;
        int j = 0;
        while(n > 1){
            for(int k = 0; k < m - 1; k++){
                ans.add(A[i][j]);
                j++;
            }

            for(int k = 0; k < n - 1; k++){
                ans.add(A[i][j]);
                i++;
            }

            for(int k = 0; k < m - 1; k++){
                ans.add(A[i][j]);
                j--;
            }

            for(int k = 0; k < n - 1; k++){
                ans.add(A[i][j]);
                i--;
            }
            i++;j++;n = n - 2;
        }
        if(n == 1){
            ans.add(A[i][j]);
        }
        return ans;
    }
}
