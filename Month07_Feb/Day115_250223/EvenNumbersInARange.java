package Month07_Feb.Day115_250223;

public class EvenNumbersInARange {
    public static void main(String[] args) {
        solve(new int[]{2, 1, 8, 3, 9, 6}, new int[][]{{0, 3}, {3, 5}, {1, 3}, {2,4}});
    }

    public static int[] solve(int[] A, int[][] B){
        int ans[] = new int[B.length];

        for(int i = 0; i < A.length; i++){
            A[i] = A[i] % 2 == 0 ? 1 : 0 ;
        }
        for(int i = 1; i < A.length; i++){
            A[i] += A[i - 1];
        }

        for(int i = 0; i < B.length; i++){
            if(B[i][0] == 0){
                ans[i] = A[B[i][1]];
            }else{
                ans[i] = A[B[i][1]] - A[B[i][0] - 1];
            }
        }

        return ans;
    }
}
