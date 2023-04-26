package Month09_April.Day168_250423;

public class MaxOneInRow {
    public static void main(String[] args) {

    }

    static int solve(int[][] A){
        int max = 0;
        int index = 0;
        int col = A[0].length;
        for(int i = 0; i < A.length; i++){
            for(int j = 1; j < col; j++){
                A[i][j] += A[i][j - 1];
            }
        }

        for(int i = 0 ; i < A.length; i++){
            if(max < A[i][col - 1]){
                index = i;
                max = A[i][col - 1];
            }
        }

        return index;
    }
}
