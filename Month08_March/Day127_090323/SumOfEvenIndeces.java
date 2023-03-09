package Month08_March.Day127_090323;

public class SumOfEvenIndeces {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{1, 2, 3, 4, 5}, new int[][]{{0,2}, {1, 4}}));
    }

    static int[] solve(int[] A, int[][] B) {
        int ans[] = new int[B.length];


        for (int i = 1; i < A.length; i++) {
            if (i % 2 == 0) {
                A[i] += A[i - 1];
            } else {
                A[i] = A[i - 1];
            }
        }

        for (int i = 0; i < B.length; i++) {
            if (B[i][0] == 0) {
                ans[i] = A[B[i][1]];
            } else {
                ans[i] = A[B[i][1]] - A[B[i][0] - 1];
            }
        }
        return ans;
    }
}
