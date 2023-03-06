package Month08_March.Day123_050323;

public class SubarrayWithGivenSumAndLength {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 2, 2, 5, 1}, 4, 6));
    }

    static int solve(int[] A, int B, int C ){
        int sum = 0;

        int i = 0;
        for(; i < B; i++){
            sum += A[i];
        }
        if(sum == C){
            return 1;
        }
        int k = i;
        for(i = 0; i < A.length - B; i++){
            sum = sum + A[k++] - A[i];
            if(sum == C){
                return 1;
            }
        }

        return 0;
    }
}
