package Month08_March.Day134_160323;

public class SetBit {
    public static void main(String[] args) {
        System.out.println(solve(8, 5));
    }

    static int solve(int A, int B){
        int ans = 1 << A;

        System.out.println(53 >> 5);
        return A == B ? ans : ans + (1 << B);
    }
}
