package Month09_April.Day161_180423;

public class KthSymbolHard {
    public static void main(String[] args) {
        System.out.println(solve(4,4));
    }

    static int solve(int A, long B){
        if(A == 1){
            return 0;
        }

        int parent = solve(A- 1, B/2);

        int ans[] = new int[2];
        if (parent == 0){
            ans[0] = 0;
            ans[1] = 1;
        }else{
            ans[0] = 1;
            ans[1] = 0;
        }

        return (B & 1) == 0 ? ans[0] : ans[1];
    }
}
