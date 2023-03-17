package Month08_March.Day135_170323;

public class ModArray {
    public static void main(String[] args) {
        System.out.println(solve(new int[]{4, 3, 5, 3, 5, 3, 2, 1}, 47));
    }

    static int solve(int[] A, int B){
        long res = 0;
        int pow = 1;


        for(int i = A.length - 1; i >= 0; i--){
            res = (res + A[i] * pow) % B;
            pow = (pow * 10) % B;
        }

        return (int)res % B;
    }
}
