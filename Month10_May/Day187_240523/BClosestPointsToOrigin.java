package Month10_May.Day187_240523;

public class BClosestPointsToOrigin {
    public static void main(String[] args) {
        System.out.println(solve(new int[][]{{1,-1},{2,-2}}, 1));
    }

    static int[][] solve(int A[][], int B) {
        int minDistanceIndex = -1;


        int x = (int) Math.pow(A[0][0], 2) + (int) Math.pow(A[1][0], 2);
        int y = (int) Math.pow(A[0][1], 2) + (int) Math.pow(A[1][1], 2);

        int k = B - (int)Math.sqrt(x);
        int j = B - (int)Math.sqrt(y);

        if(k < j){
            return new int[][]{A[0]};
        }else{
            return new int[][]{A[1]};
        }
    }
}
