package Month09_April.Day167_250423;

public class MaxSum {
    public static void main(String[] args) {
        System.out.println(maxSum(new int[]{-1, 2,-4,-14}));
    }

    static int maxSum(int A[]){
        int csum = A[0];
        int ans = A[0];

        for(int i  = 1; i < A.length; i++){
            csum = Math.max(csum + A[i], A[i]);
            ans = Math.max(ans, csum);

        }
        return ans;
    }
}
