package Month08_March.Day128_100323;

public class SpecialIndex {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,1,6,4}));
    }

    static int solve(int[] A){
        int evenSum[] = new int[A.length];
        int oddSum[] = new int[A.length];
        int ans = 0;

        evenSum[0] = A[0];
        oddSum[0] = 0;

        for(int i = 1; i < A.length; i++){
            if(i % 2 == 0){
                evenSum[i] = A[i] +  evenSum[i - 1];
                oddSum[i] = oddSum[i - 1];
            }else{
                evenSum[i] =  evenSum[i - 1];
                oddSum[i] = A[i] + oddSum[i - 1];
            }
        }

        for(int i = 0; i < A.length; i++){

        }

        return ans;
    }
}
