package Month08_March.Day130_120323;

public class SubarraysWithBitwiseOR1 {
    public static void main(String[] args) {
        System.out.println(solve(2, new int[]{1, 0}));
    }

    static long solve(int A, int[] B) {
        long ans = 0;

        for (int i = A - 1; i >= 0; i--) {
            if (B[i] == 1) {
                ans += A - i;
            } else {
                ans += A - i - 1;
            }
        }

        return ans;
    }
}
