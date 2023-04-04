package Month09_April.Day151_040423;

public class Recursion {
    public static void main(String[] args) {
        solve(9);
        System.out.println();
    }

    static void solve(int A) {
        if(A > 0){
            solve(A - 1);
            System.out.print(A + " ");
        }
    }
}
