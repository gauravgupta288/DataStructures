package Month08_March.Day135_170323;

public class DivisibleBy8 {
    public static void main(String[] args) {
        System.out.println(solve("4321609"));
    }

    static int solve(String A){
        int n = A.length();
        int temp = 0;
        if (n > 2){
             temp = Integer.parseInt(A.substring(n - 3, n));
        }else{
             temp = Integer.parseInt(A);
        }

        return temp % 8 == 0 ? 1 : 0;
    }
}
