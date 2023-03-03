package Month08_March.Day121_030323;

public class AntiDiagonals {
    public static void main(String[] args) {
        System.out.println(antiDiagonals(new int[][]{{1,2,3,10}, {4,5,6,11},{7,8,9,12}}));
    }

    static int[][] antiDiagonals(int[][] A){
        int n = A.length;
        int ans[][] = new int[2 * n -1][n];

        for(int c = 0; c < n; c++){
            int i = 0; int j = c;

            while(i < n && j >= 0){
                ans[c][i] = A[i][j];
                j--;i++;
            }
        }

        int m = A[0].length;
        for(int c = 0; c < n; c++){
            int i = c; int j =  m - 1;

            while(i < n && j >= 0){
                ans[j][c] = A[i][j];
                j--;i++;
            }
        }

        return ans;
    }
}
