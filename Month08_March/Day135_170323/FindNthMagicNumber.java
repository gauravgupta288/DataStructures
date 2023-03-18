package Month08_March.Day135_170323;

public class FindNthMagicNumber {
    public static void main(String[] args) {
        System.out.println(solve(10));
    }

    static int solve(int A){
        long ans = 0;
        int pow = 5;

        for(int i = 0; i < A; i+=2){
            ans = pow + 5;
            pow *= 5;
        }

        return (int)ans;
    }
}
