package Month08_March.Day122_040323;

public class TransposeMatrix {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1,2}, {1,2}, {1,2}}));
    }

    static int[][] solve(int[][] A){
        int m = A[0].length;
        int n = A.length;
        int ans[][] = new int[m][n];
        int max = Math.max(A.length, A[0].length);

        int result[][] = new int[max][max];

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                result[i][j] = A[i][j];
            }
        }

        for(int i = 0; i < max; i++){
            for(int j = 0; j < max; j++){
                if(i < j){
                    int temp = result[i][j];
                    result[i][j] = result[j][i];
                    result[j][i] = temp;
                }
            }
        }

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                ans[i][j] = result[i][j];
            }
        }

        return ans;
    }
}
