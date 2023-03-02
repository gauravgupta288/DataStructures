package Month08_March.Day120_020323;

public class CountingSubArrays {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{3, 12, 11, 11, 11, 15}, 12));
    }

    static int solve(int[] A, int B) {
        int count = 0;

        for (int i = 1; i < A.length; i++) {
            A[i] += A[i - 1];
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                if (i == 0 && A[j] <= B) {
                    count++;
                } else if(i > 0) {
                    if (A[j] - A[i - 1] < B) {
                        count++;
                    }
                }
            }

        }

        return count;
    }
}
