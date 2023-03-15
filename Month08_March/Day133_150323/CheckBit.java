package Month08_March.Day133_150323;

public class CheckBit {
    public static void main(String[] args) {
        System.out.println(solve(49, 0));
    }

    static int solve(int A, int B){
        return (A ^ (1 << B)) == A - B ? 1 : 0 ;
    }
}
