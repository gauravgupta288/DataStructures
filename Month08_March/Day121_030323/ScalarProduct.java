package Month08_March.Day121_030323;

public class ScalarProduct {
    public static void main(String[] args) {

    }

    static int[][] solve(int [][]A, int B){
        int m = A[0].length;
        int n = A.length;

        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                A[i][j] = B * A[i][j];
            }
        }

        return A;
    }
}
