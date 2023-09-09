package Month14_Sep.Day228_080923;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1, 2, 3,4}, {5, 6, 7, 8}, {9,10,11,12}, {13,14,15,16}}));
    }

    public static List<Integer> solve(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        List<Integer> ans = new ArrayList<>();

        int start = 0;
        int i = 0;
        int j = 0;
        int total = row * col;
        while (i < row && j < col) {
            while (j < col && start < total) {
                ans.add(matrix[i][j++]);start++;
            }
            j--;
            i++;
            while (i < row && start < total ) {
                ans.add(matrix[i++][j]);start++;
            }
            i--;
            j--;
            while (j >= 0 && start < total) {
                ans.add(matrix[i][j--]);start++;
            }
            j++;
            i--;
            while (i > 0 && start < total) {
                ans.add(matrix[i--][j]);start++;
            }
            i++;j++;
            row--;
            col--;
        }

        return ans;
    }
}
