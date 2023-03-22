package Month08_March.Day140_220323;

public class JosephusProblem {
    public static void main(String[] args) {
        System.out.println(solve(6, 5));
    }

    static int solve(int n, int k){
        return (((n - powerOfTwo(n))*k) + 1);
    }

    static int powerOfTwo(int n){
        int ans = 1;
        int k = ans;

        while(ans < n){
            k = ans;
            ans *= 2;
        }

        return k;
    }
}
