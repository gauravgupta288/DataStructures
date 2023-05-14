package Month10_May.Day180_140523;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(0,15));
    }

    static int gcd(int A, int B){
        if(A == 0){
            return B;
        }

        return gcd(B % A, A);
    }
}
