package Month08_March.Day138_200323;

import java.util.Arrays;

public class ArithmeticProgression {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2, 4, 1}));
    }

    static int solve(int A[]) {
        Arrays.sort(A);
        int diff = A[1] - A[0];

        for(int i = 1; i < A.length; i++){
            if(A[i] - A[i - 1] != diff){
                return 0;
            }
        }
        return 1;
    }
}
