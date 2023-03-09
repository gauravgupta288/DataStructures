package Month08_March.Day127_090323;

import java.util.ArrayList;

public class RowToColumnZero {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{51, 21, 90, 38, 57, 12, 11, 1, 68, 60}, {89, 61, 7, 10, 0, 85, 29, 40, 13, 0}, {85, 63, 66, 43, 56, 67, 99, 0, 67, 66}}));
    }

    static int[][] solve(int[][] A) {
        ArrayList<Integer> rows = new ArrayList<>();
        ArrayList<Integer> cols = new ArrayList<>();

        for (int i = 0; i < A.length; i++) {
            ArrayList<Integer> inner = new ArrayList<>();
            for (int j = 0; j < A[0].length; j++) {
                if (A[i][j] == 0) {
                    rows.add(i);
                    cols.add(j);
                }
            }
        }

        //update row to zero
        for (int j = 0; j < rows.size(); j++) {
            int m = rows.get(j);
            for (int i = 0; i < A[0].length; i++) {
                A[m][i] = 0;
            }
        }

        //update column to zero
        for (int j = 0; j < cols.size(); j++) {
            int m = cols.get(j);
            for (int i = 0; i < A.length; i++) {
                A[i][m] = 0;
            }
        }
        return A;
    }
}
