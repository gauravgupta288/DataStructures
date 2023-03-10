package Month08_March.Day128_100323;

public class BuetifulNumber {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{11, 12, 17, 20, 13}, new int[][]{{1,1}, {4,3}, {5,5}}));
    }

    static int[] solve(int[] A, int[][]B ){
        A[0] = isPrime(A[0]) ? 1 : 0;
        int ans[] = new int[B.length];
        for(int i = 1; i < A.length; i++){
            if(isPrime(A[i])){
                A[i] = 1 + A[i - 1];
            }else{
                A[i] = A[i - 1];
            }
        }

        for(int i = 0; i < B.length; i++){

            if(B[i][0] == 1){
                ans[i] = A[B[i][1] - 1];
            }else{
                ans[i] = A[B[i][1] - 1] - A[B[i][0] - 1 - 1];
            }
        }

        return ans;
    }

    public static boolean isPrime(int n){

        if(n == 1){
            return false;
        }

        for(int i = 2; i * i <= n; i++ ){
            if(n % i == 0){
                return false;
            }
        }

        return true;
    }
}
