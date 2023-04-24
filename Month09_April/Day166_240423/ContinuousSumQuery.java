package Month09_April.Day166_240423;

public class ContinuousSumQuery {
    public static void main(String[] args) {
        System.out.println(solve(5, new int[][]{{1,2,10}, {2,3,20}, {2,5,25}}));
    }

    static int[] solve(int A, int[][] B){

        int res[] = new int[A];

        for(int i = 0; i < B.length; i++){
            int left = B[i][0];
            int right = B[i][1];
            int money = B[i][2];

            res[left - 1] += money;

            if(right != A){
                res[right] -= money;
            }
        }

        for(int i = 1; i < res.length; i++){
            res[i] += res[i - 1];
        }

        return res;
    }
}
