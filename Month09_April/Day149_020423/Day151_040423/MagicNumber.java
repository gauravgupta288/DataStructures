package Month09_April.Day149_020423.Day151_040423;

public class MagicNumber {
    public static void main(String[] args) {
        System.out.println(solve(83557, 0));
    }

    public static int solve(int A, int sum) {
        if(A > 9 || sum > 9){
            sum += solve(A/10, sum) + (A % 10);
        }else if(sum==1){
            return 1;
        }else{
            return 0;
        }
        return sum;
    }
}
