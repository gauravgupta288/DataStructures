package Month13_Aug.Day221_280823;

public class Power {
    public static void main(String[] args) {
        System.out.println(solve(34.00515, -3));
        System.out.println(Math.pow(34.00515, 3));
    }
    static double solve(double A, int B){
        if(B == 0){
            return 1;
        }
        if(B==1){
            return A;
        }else if(B < 0){
            A= 1/A;
            B = -B;
        }
        double half = solve(A,B/2);

        if(B%2==0){
            return half * half;
        }


        return half*half *A;
    }
}
