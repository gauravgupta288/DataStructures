package Month10_May.Day174_050523;

public class ChefAndCooking {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 1, 6,11,14,14,17, 18,18,1}));
    }

    static long solve(int A[]) {
        long sum = A[0];
        int curSum = A[0];

        for (int i = 1; i < A.length; i++) {
            if(A[i] > A[i - 1]){
                curSum += A[i];
            }else{
                curSum = A[i];
            }
            sum = Math.max(curSum, sum);
        }

        return sum;
    }
}
