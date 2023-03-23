package Month08_March.Day141_230323;

public class MultipleLeftRotationsOfTheArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4, 5}, new int[]{2,3}));
    }

    static int[][] solve(int[] A, int[] B) {
        int ans[][] = new int[B.length][A.length];

        for (int i = 0; i < B.length; i++) {
            int temp[] = new int[A.length];
            for (int j = 0; j < A.length; j++) {
                temp[(((A.length - 1) * B[i]) + j) % A.length] = A[j];
            }
            ans[i] = temp;
        }

        return ans;
    }
}
