package Month15_Oct.Day05Oct;

public class Candie {

    public static void main(String[] args) {
        System.out.println(solve(9));
    }

    public static int solve(int A) {

        double possibleAns = 1;

        for(int i = 1; i < 100; i++){
            double x = Math.pow(5, i);

            if(x <= A){
                possibleAns = x;
            }
        }
        int sum = 0;
        while(A > 0){
            sum += A / possibleAns;

            A %= possibleAns;
            possibleAns /= 5;
        }

        return sum;
    }
}
