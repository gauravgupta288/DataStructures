package Month10_May.Day175_070523;

public class DeleteOne {
    public static void main(String[] args) {
        System.out.println(gcd(2, 5));
        int nums[] = {7, 21};

        System.out.println(solve(nums));
    }

    static int solve(int A[]){
        int len = A.length;
        int pgcd[] = new int[len];
        int sgcd[] = new int[len];

        if(len == 2){
            return Math.max(A[0], A[1]);
        }
        pgcd[0] = A[0];
        sgcd[len - 1] = A[len - 1];

        for(int i = 1; i < len; i++){
            pgcd[i] = gcd(pgcd[i- 1], A[i]);
        }

        for(int i = len - 2; i >= 0; i--){
            sgcd[i] = gcd(sgcd[i + 1], A[i]);
        }
        long max = Integer.MIN_VALUE;

        for(int i = 1; i < len - 1; i++){
            max = Math.max(max, gcd(pgcd[i - 1], sgcd[i + 1]));
        }

        return (int)max;
    }

    static int gcd(int A, int B){
        if(A == 0){
            return B;
        }

        return gcd(B % A, A);
    }
}
