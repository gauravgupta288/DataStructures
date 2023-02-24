package Month07_Feb.Day114_240223;

public class PrefixSum {
    public static void main(String[] args) {
        int[] A = {2, 2, 2};
        int[][] B = {{0,0},{1,2}};

        rangeSum(A, B);
    }

    public static long[] rangeSum(int[] A, int[][] B) {
        long ans[] = new long[B.length];
        long newArray[] = new long[A.length];

        newArray[0] = A[0];
        for(int i = 1; i < A.length; i++){
            newArray[i] = newArray[i - 1] + A[i];
        }

        for(int i = 0; i < B.length; i++){
            if(B[i][0] == 0){
                ans[i] = newArray[B[i][1]];
            }else{
                ans[i] = newArray[B[i][1]] - newArray[B[i][0] - 1];
            }
        }
        return ans;
    }
}
