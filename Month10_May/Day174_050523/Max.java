package Month10_May.Day174_050523;

import java.util.ArrayList;
import java.util.List;

public class Max {
    public static void main(String[] args) {
        solve(new int[][]{{6,4,14,5}, {12,18,13,19},{3,1,11,20}, {8,17,7,9}});
    }

    public static int[] solve(int[][] A) {


        List<Integer> list = new ArrayList<>();

        for(int i = 0; i < A.length; i++){
            int min = A[i][0];
            int minIndex = 0;
            for(int j = 0; j < A[0].length; j++){
                if(min > A[i][j]){
                    min = A[i][j];
                    minIndex = j;
                }
            }
            if(max(A, minIndex, min)){
                list.add(min);
            }
        }

        int ans[] = new int[list.size()];

        for(int i = 0;i<ans.length; i++){
            ans[i] = list.get(i);
        }

        return ans;

    }

    static boolean  max(int[][] matrix, int index, int value){
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < matrix.length; i++){
            if(matrix[i][index] > max){
                max = matrix[i][index];
            }
        }
        return max == value ? true : false;
    }
}
