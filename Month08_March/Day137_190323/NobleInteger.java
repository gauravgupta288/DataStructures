package Month08_March.Day137_190323;

import java.util.Arrays;

public class NobleInteger {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{-4, -2, 0, -1, -6}));
    }

    static int solve(int[] A){
        int count = 0;

        Arrays.sort(A);

        if(A[A.length - 1] == 0){
            return 1;
        }

        for(int i = A.length - 2; i >= 0 ;i--){
            if(A[i] != A[i + 1]){
                count = A.length - i - 1;
            }
            if(A[i] == count){
                return 1;
            }

        }
        return -1;
    }
}
