package Month08_March.Day119_010323;

public class MaximumSubarrayEasy {
    public static void main(String[] args) {
        System.out.println(solve(5, 12, new int[]{2,1,3,4,5}));
    }

    static int solve(int A, int B, int[] C) {

        for (int i = 1; i < A; i++) {
            C[i] += C[i - 1];
        }
        int max = C[0];
        for (int i = 0; i < A; i++) {
            for (int j = i; j < A; j++) {
                if (C[j] <= B && i == 0) {
                    max = Math.max(max, C[j]);
                } else if(i != 0){
                    if(C[j] - C[i - 1] <= B){
                        max = Math.max(max, C[j] - C[i - 1] );
                    }

                }
            }
        }


        return max;
    }
}
