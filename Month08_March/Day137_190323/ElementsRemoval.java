package Month08_March.Day137_190323;

import java.util.Arrays;

public class ElementsRemoval {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{5}));
    }

    static int solve(int[] A){
        Arrays.sort(A);

        int sum = 0;
        int n = A.length;
        for(int i = 0; i < n; i++){
            sum += A[i] * (n - i);
        }

        return sum;

    }
}
