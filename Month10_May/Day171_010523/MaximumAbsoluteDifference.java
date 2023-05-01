package Month10_May.Day171_010523;

public class MaximumAbsoluteDifference {
    public static void main(String[] args) {
        System.out.println(maxSUm(new int[]{1,3,-1}));
    }

    static int maxArray(int[] A){
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < A.length; i++){

            for(int j = i + 1; j < A.length; j++){
                int sum = 0;
                sum += Math.abs(A[i] - A[j]) + Math.abs(i - j);
                ans = Math.max(ans, sum);
            }
        }

        return ans;
    }

    static int maxSUm(int []A){

        int xMax = Integer.MIN_VALUE;
        int yMax = Integer.MIN_VALUE;
        int xMin = Integer.MAX_VALUE;
        int yMin = Integer.MAX_VALUE;
        int ans = Integer.MIN_VALUE;

        for(int i = 0; i < A.length; i++){
            if(xMax < A[i] + i){
                xMax = A[i] + i;
            }  if (xMin > A[i] + i) {
                xMin = A[i] + i;
            } if (yMax < A[i] - i) {
                yMax = A[i] - i;
            } if (yMin > A[i] - i) {
                yMin = A[i] - i;
            }
            ans = Math.max((xMax - xMin), (yMax - yMin));
        }

        return ans;

    }
}
