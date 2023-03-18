package Month08_March.Day135_170323;

public class HelpFromSam {
    public static void main(String[] args) {
        System.out.println(solve(7));
    }

    static int solve(int A){
        int ans = 0;
        while(A > 0){
            ans += 1 & A;
            A /= 2;
        }

        return ans;
    }
}
