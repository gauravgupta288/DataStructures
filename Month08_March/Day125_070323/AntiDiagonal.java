package Month08_March.Day125_070323;

public class AntiDiagonal {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1, 2}, {3,4}}));
    }

    static int[][] solve(int A[][]) {
        int n = A.length;
        int ans[][] = new int[2 * n - 1][n];

        for (int c = 0; c < n; c++) {
            int i = 0;
            int j = c;
            while (i < n && j >= 0) {
                ans[c][i] = A[i][j];
                i++;j--;
            }
        }

        int m = n;
        for (int c = 1; c < n; c++) {
            int i = c;
            int j = n - 1;
            int k = 0;

            while (i < n && j >= 0) {
                ans[m][k++] = A[i][j];
                i++;j--;
            }
            m++;
        }


        return ans;
    }
}
