package Month10_May.Day186_210523;

import java.util.Arrays;

public class UniqueElements {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{2,4,3,4,5,3}));
    }

    static int solve(int A[]) {
        Arrays.sort(A);
        int count = 0;

        for (int i = 1; i < A.length; i++) {

            if(A[i-1] >= A[i]){
                count += (A[i-1]) - A[i] + 1;
                A[i] = A[i-1] + 1;

            }
        }
        return count;
    }
}
