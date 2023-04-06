package Month09_April.Day149_020423.Day151_040423;

public class Recursion {
    public static void main(String[] args) {
        System.out.println(fun(2,10));
        int ans =1;
        for(int i = 0; i < 1613142835; i++){
            ans = 3 * ans;
        }

        System.out.println(ans);

    }

    static int fun(int x, int n){
        if(n == 0){
            return 1;
        }else if(n % 2 == 0){
            return fun(x * x, n / 2);
        }else{
            return x * fun(x * x, (n - 1) / 2);
        }
    }

    static void solve(int A) {
        if(A > 0){
            solve(A - 1);
            System.out.print(A + " ");
        }
    }
}
