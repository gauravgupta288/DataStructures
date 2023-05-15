package Month10_May.Day181_150523;

public class FactorialUsingDp {
    public static void main(String[] args) {
        System.out.println(factorial(5, 2, 13));
    }

    public static int factorial(int A, int B, int C) {
        int dp[][] = new int[A+1][B+1];

        for(int i = 0; i <= A; i++){
            for(int j = 0; j <= Math.min(A, B); j++){
                if(i == j || j==0 || i == 0){
                    dp[i][j] = 1;

                }else{
                    dp[i][j] = (dp[i - 1][j - 1] % C + dp[i - 1][j] % C) % C;
                }
            }
        }

        return dp[A][B]%C;
    }
}
