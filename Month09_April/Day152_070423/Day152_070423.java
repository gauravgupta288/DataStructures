package Month09_April.Day152_070423;

public class Day152_070423 {
    public static void main(String[] args) {

    }

    static int pow(int A, int B, int C){
        if(A == 0){
            return 0;
        }
        if(B <= 0){
            return 1;
        }


        long p = pow(A, B/2, C) % C;

        p = (p * p) % C;

        if(B % 2 == 1){
            p = ((p % C) * (A % C)) % C;
        }

        p = (p + C) % C;

        return (int)p;
    }
}
